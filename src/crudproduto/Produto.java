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
public class Produto {
    
    private String codigo;
    private String nome;
    private float preco;

    public Produto(String codigo, String nome, float preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + '}';
    }
     
}
