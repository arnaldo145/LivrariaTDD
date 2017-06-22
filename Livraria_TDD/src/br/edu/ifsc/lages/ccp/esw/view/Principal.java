/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.lages.ccp.esw.view;

import br.edu.ifsc.lages.ccp.esw.dao.ProdutoDAO;
import br.edu.ifsc.lages.ccp.esw.model.CD;
import br.edu.ifsc.lages.ccp.esw.model.Livro;
import br.edu.ifsc.lages.ccp.esw.model.ProdutoAbstract;
import java.util.Scanner;

/**
 *
 * @author Arnaldo
 */
public class Principal {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;

        ProdutoDAO produtoDAO = new ProdutoDAO();
        carregarProdutos(produtoDAO);

        do {
            System.out.println("===== MENU =====");
            String menu = "1 - Realizar Venda\n2 - Cadastrar Produto\n3 - Exibir Produtos\n0 - Encerrar";
            System.out.println(menu);

            System.out.println("Informe a opção desejada: ");
            opcao = Integer.parseInt(entrada.nextLine());

            switch (opcao) {
                case 1:
                    break;
                    
                case 2:
                    cadastrarProduto(produtoDAO);
                    break;

                case 3:
                    exibirProdutos(produtoDAO);
                    break;
                    
                case 0:
                    System.out.println("O programa está sendo encerrado!\nAté Logo!");
                    break;
                    
                default:
                    System.out.println("ATENÇÃO! Opção informada é inválida!");
                    break;
            }
        } while (opcao != 0);
    }

    public static void cadastrarProduto(ProdutoDAO produtoDAO) {
        ProdutoAbstract produto;

        System.out.println("Informe tipo do produto (1 - CD/ 2 - Livro");
        int tipo = Integer.parseInt(entrada.nextLine());

        System.out.println("Informe o código do produto: ");
        int codigo = Integer.parseInt(entrada.nextLine());

        System.out.println("Informe a descrição do produto: ");
        String descricao = entrada.nextLine();

        System.out.println("Informe a quantidade em estoque: ");
        int quantidade = Integer.parseInt(entrada.nextLine());

        System.out.println("Informe o preço do produto: ");
        double preco = Double.parseDouble(entrada.nextLine());

        if (tipo == 1) {
            System.out.println("Informe a quantidade de faixas: ");
            int numeroFaixas = Integer.parseInt(entrada.nextLine());

            produto = new CD(codigo, descricao, preco, quantidade, numeroFaixas);
        } else {
            System.out.println("Informe o ISBN: ");
            String isbn = entrada.nextLine();

            produto = new Livro(codigo, descricao, preco, quantidade, isbn);
        }

        produtoDAO.adicionar(produto);
        System.out.println("Produto foi adicionado!");
    }

    public static void exibirProdutos(ProdutoDAO produtoDAO) {
        for (ProdutoAbstract produto : produtoDAO.getProdutos()) {
            System.out.println(produto.getCodigo() + " - " + produto.getDescricao());
        }
    }

    public static void carregarProdutos(ProdutoDAO produtoDAO) {
        produtoDAO.getProdutos().add(new CD(1, "Thriller - Michael Jackson", 15.00, 100, 14));
        produtoDAO.getProdutos().add(new Livro(2, "Código da Vinci", 20.00, 100, "123-2"));
    }
}
