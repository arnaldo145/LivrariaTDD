/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.lages.ccp.esw.model;

import java.util.ArrayList;

/**
 *
 * @author Arnaldo
 */
public class Venda {

    private int codigo;
    private double desconto;
    private double valorTotal;
    private ArrayList<ItemVenda> produtos;

    public Venda() {
        this.produtos = new ArrayList<>();
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the desconto
     */
    public double getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    /**
     * @return the valorTotal
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the produtos
     */
    public ArrayList<ItemVenda> getProdutos() {
        return produtos;
    }

    /**
     * @param produtos the produtos to set
     */
    public void setProdutos(ArrayList<ItemVenda> produtos) {
        this.produtos = produtos;
    }

    public boolean adicionarProduto(ProdutoAbstract produto, int quantidade) {
        boolean resultado = true;

        for (ItemVenda item : this.produtos) {
            if (item.getProduto().equals(produto)) {
                resultado = false;

            }
        }

        if (resultado == true) {
            this.produtos.add(new ItemVenda(quantidade, produto));
        }

        return resultado;
    }

    public double calcularTotal() {
        double total = 0.0;

        for (ItemVenda item : produtos) {
            total += (item.getQuantidade() * item.getProduto().getPreco());
        }

        this.valorTotal = total;

        if (this.desconto > 0.0) {
            double porcentagem = this.desconto / 100.0;
            this.valorTotal -= this.valorTotal * porcentagem;
        }
        
        return valorTotal;
    }

}
