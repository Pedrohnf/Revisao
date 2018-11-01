package com.example.phnf2.revisaoprova.modelo;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "produto")
public class Produto {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nome;
    private double preco;
    private String descricao;
    private String fornecedor;
    private int arquivo;

    public Produto() {
    }

    public Produto(String nome, double preco, String descricao, String fornecedor, int arquivo) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.arquivo = arquivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getArquivo() {
        return arquivo;
    }

    public void setArquivo(int arquivo) {
        this.arquivo = arquivo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", fornecedor='" + fornecedor + '\'' +
                ", arquivo=" + arquivo +
                '}';
    }
}
