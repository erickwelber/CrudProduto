/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudproduto;

import java.util.ArrayList;

/**
 *
 * @author Erick
 */
public class Crud {
    
    ArrayList<Produto> produtos;

    public Crud() {
        produtos = new ArrayList<>();
    }
    
    public void inserir(Produto addProduto){
        produtos.add(addProduto);
    }
    
    public void remover(Produto remProduto){
        produtos.remove(remProduto);
    }
    
    public void atualizar(Produto attProduto){
        for(int i=0; i<produtos.size(); i++){
            if(attProduto.getCodigo().equals(produtos.get(i).getCodigo())){
                produtos.set(i, attProduto);
            }
        }
    }
    
    public void buscar(String codigo) {
        for(int i=0; i<produtos.size(); i++){
            if(produtos.get(i).getCodigo()!=null){
                if(codigo.equals(produtos.get(i).getCodigo())){
                    System.out.println(produtos.get(i));
                }
            }
        }
    }
    
    public void imprimir(){
        for(int i=0; i<produtos.size(); i++){
            System.out.println(produtos.get(i));
        }
    }
    
}
