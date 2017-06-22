/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.lages.ccp.esw.dao;

import br.edu.ifsc.lages.ccp.esw.model.ProdutoAbstract;
import java.util.ArrayList;

/**
 *
 * @author Arnaldo
 */
public class ProdutoDAO {
    
    private ArrayList<ProdutoAbstract> produtos;

    public ProdutoDAO() {
        this.produtos = new ArrayList<>();
    }

    public ArrayList<ProdutoAbstract> getProdutos() {
        return produtos;
    }
    
    public void adicionar(ProdutoAbstract produto){
        this.produtos.add(produto);
    }
    
}
