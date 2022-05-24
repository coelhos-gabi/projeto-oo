package org.example.dominios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;

public class Aluno {
    private final String nome;
    private final String matricula;
    private ArrayList<Livro> livrosEmprestados;
    private final TipoAluno tipoAluno;
    private ArrayList<LocalDate> dataEmprestimo = new ArrayList<LocalDate>();

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

    public String getLivrosEmprestados() {
        String nomeLivros = "";
        for (Livro livrosEmprestado : livrosEmprestados) {
            nomeLivros += livrosEmprestado.getTitulo() + " ";
        }
        return nomeLivros;
    }
    public boolean alunoJaPossuiLivro(String isbn){
        for (Livro livrosEmprestado : livrosEmprestados){
            if (livrosEmprestado.getIsbn().equals(isbn)) {
                return true;
            }
        }
        return false;
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

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo.add(dataEmprestimo);
    }

    public String getDataEmprestimo() {
        String datas = "";
        for (LocalDate localDate : dataEmprestimo) {
            datas += localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " ";
        }
        return datas;
    }
}
