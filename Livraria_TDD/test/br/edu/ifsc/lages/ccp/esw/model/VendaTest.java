/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.lages.ccp.esw.model;

import br.edu.ifsc.lages.ccp.esw.dao.ProdutoDAO;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arnaldo
 */
public class VendaTest {

    public VendaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void deveAdicionarProduto() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.adicionar(new CD(1, "Thriller - Michael Jackson", 15.00, 100, 14));
        Venda venda = new Venda();

        assertTrue(venda.adicionarProduto(produtoDAO.getProdutos().get(0), 5));
    }

    @Test
    public void naoDeveAdicionarProduto() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.adicionar(new CD(1, "Thriller - Michael Jackson", 15.00, 100, 14));
        Venda venda = new Venda();
        venda.adicionarProduto(produtoDAO.getProdutos().get(0), 5);

        assertFalse(venda.adicionarProduto(produtoDAO.getProdutos().get(0), 2));
    }

    @Test
    public void verificaCalculoTotal() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.adicionar(new CD(1, "Thriller - Michael Jackson", 15.00, 100, 14));
        produtoDAO.adicionar(new Livro(2, "Deuses Americanos", 40.00, 200, "122-323"));
        Venda venda = new Venda();
        venda.adicionarProduto(produtoDAO.getProdutos().get(0), 2);
        venda.adicionarProduto(produtoDAO.getProdutos().get(1), 1);
        
        assertEquals(70.00, venda.calcularTotal(), 0.00);
    }

}
