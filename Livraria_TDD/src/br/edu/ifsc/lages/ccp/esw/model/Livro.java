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
public class Livro extends ProdutoAbstract {

    private String isbn;

    public Livro(int codigo, String descricao, double preco, int quantidadeEstoque, String isbn) {
        super(codigo, descricao, preco, quantidadeEstoque);
        this.isbn = isbn;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
