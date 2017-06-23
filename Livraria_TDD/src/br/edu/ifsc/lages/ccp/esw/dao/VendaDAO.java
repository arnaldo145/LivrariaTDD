/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.lages.ccp.esw.dao;

import br.edu.ifsc.lages.ccp.esw.model.Venda;
import java.util.ArrayList;

/**
 *
 * @author Arnaldo
 */
public class VendaDAO {

    private ArrayList<Venda> vendas;

    public VendaDAO() {
        this.vendas = new ArrayList<>();
    }

    /**
     * @return the vendas
     */
    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    /**
     * @param vendas the vendas to set
     */
    public void setVendas(ArrayList<Venda> vendas) {
        this.vendas = vendas;
    }

    public void adicionarVenda(Venda venda) {
        this.vendas.add(venda);
    }

}
