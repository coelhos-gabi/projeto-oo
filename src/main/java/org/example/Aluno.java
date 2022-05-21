package org.example;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String id;
    private ArrayList<Livro> livros;
    private int maximoLivros = 4;

    public Aluno(String nome, String id, ArrayList<Livro> livros, int maximoLivros) {
        this.nome = nome;
        this.id = id;
        this.livros = livros;
        this.maximoLivros = maximoLivros;
    }
}
