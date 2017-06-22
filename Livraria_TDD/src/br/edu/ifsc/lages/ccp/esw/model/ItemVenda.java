/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.lages.ccp.esw.model;

/**
 *
 * @author Arnaldo
 */
public class ItemVenda {
    private int quantidade;
    private ProdutoAbstract produto;

    public ItemVenda(int quantidade, ProdutoAbstract produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }
    

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the produto
     */
    public ProdutoAbstract getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(ProdutoAbstract produto) {
        this.produto = produto;
    }
}
