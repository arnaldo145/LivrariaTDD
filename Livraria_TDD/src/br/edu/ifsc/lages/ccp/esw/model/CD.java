/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.lages.ccp.esw.model;

/**
 *
 * @author Aluno
 */
public class CD extends ProdutoAbstract {

    private int quantidadeFaixas;

    public CD(int codigo, String descricao, double preco, int quantidadeEstoque, int quantidadeFaixas) {
        super(codigo, descricao, preco, quantidadeEstoque);
        this.quantidadeFaixas = quantidadeFaixas;
    }
    
    

    /**
     * @return the quantidadeFaixas
     */
    public int getQuantidadeFaixas() {
        return quantidadeFaixas;
    }

    /**
     * @param quantidadeFaixas the quantidadeFaixas to set
     */
    public void setQuantidadeFaixas(int quantidadeFaixas) {
        this.quantidadeFaixas = quantidadeFaixas;
    }

    
}
