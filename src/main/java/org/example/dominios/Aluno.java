package org.example.dominios;

import java.util.ArrayList;
import java.util.Objects;

public class Aluno {
    private final String nome;
    private final String matricula;
    private ArrayList<Livro> livrosEmprestados;
    private final TipoAluno tipoAluno;

    public Aluno(String nome, String matricula, TipoAluno tipoAluno) {
        this.nome = nome;
        this.matricula = matricula;
        this.tipoAluno = tipoAluno;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public TipoAluno getTipoAluno() {
        return tipoAluno;
    }

    public int getQuantidadeLivrosEmprestados() {
        if(Objects.isNull(livrosEmprestados)){
            return 0;
        }
        return this.livrosEmprestados.size();
    }
    public void adicionarLivro(Livro livro){
        if(Objects.isNull(livrosEmprestados)) {
            livrosEmprestados = new ArrayList<>();
        }
        this.livrosEmprestados.add(livro);
    }

    public void removerLivro(Livro livro){
        this.livrosEmprestados.remove(livro);
    }
}
