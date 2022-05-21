package org.example;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String id;
    private ArrayList<Livro> livros;
    private TipoAluno tipoAluno;

    public Aluno(String nome, String id, ArrayList<Livro> livros, TipoAluno tipoAluno) {
        this.nome = nome;
        this.id = id;
        this.livros = livros;
        this.tipoAluno = tipoAluno;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public TipoAluno getTipoAluno() {
        return tipoAluno;
    }
}
