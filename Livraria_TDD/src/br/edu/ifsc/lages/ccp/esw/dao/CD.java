/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.lages.ccp.esw.dao;

/**
 *
 * @author Aluno
 */
public class CD extends ProdutoAbstract {

    private int quantidadeFaixas;

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
