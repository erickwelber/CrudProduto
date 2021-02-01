/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudproduto;

/**
 *
 * @author Erick
 */
public class Teste {
    public static void main(String[] args) {
        
        Crud produtos = new Crud();
        
        Produto produto1 = new Produto("1", "Farinha", 5.00f);
        produtos.inserir(produto1);
        
        Produto produto2 = new Produto("2", "Café", 5.00f);
        produtos.inserir(produto2);
        
        System.out.println("\nPRODUTOS ADICIONADOS");
        produtos.imprimir();
        
        System.out.println("\nBUSCOU O PRODUTO DE CÓDIGO 1");
        produtos.buscar("1");
        
        System.out.println("\nREMOVEU A FARINHA");
        produtos.remover(produto1);
        
        produtos.buscar("1");
        produtos.buscar("2");
        
        System.out.println("\nATUALIZOU O CAFÉ POR ARROZ");
        Produto atualizacao = new Produto("2", "Arroz", 8.00f);
        produtos.atualizar(atualizacao);
        
        produtos.buscar("1");
        produtos.buscar("2");
        
        
    }
}
