package org.example.dominios;

import java.time.LocalDate;
import java.util.ArrayList;

public class Emprestimo {
    private Aluno aluno;
    private ArrayList<Livro> livrosEmprestados;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoReal = null;
    private String id;

    public Emprestimo(Aluno aluno, ArrayList<Livro> livros) {
        this.aluno = aluno;
        this.livrosEmprestados = livros;
        this.dataEmprestimo = LocalDate.now();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public ArrayList<Livro> getLivro() {
        return livrosEmprestados;
    }

    public void setLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public LocalDate getDataDevolucaoReal() {
        return dataDevolucaoReal;
    }

    public void setDataDevolucaoReal(LocalDate dataDevolucaoReal) {
        this.dataDevolucaoReal = dataDevolucaoReal;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getId() {
        return id;
    }

//    @Override
//    public String toString() {
//        if (dataDevolucaoReal != null) {
//            return ("Aluno = " + aluno.getNome() +
//                    " | livro = " + livro.getTitulo() +
//                    " | data do empréstimo = " + dataEmprestimo +
//                    " | data prevista de devolução = " + calcularDataDevolucao() +
//                    " | data em que foi devolvido = " + dataDevolucaoReal);
//        } else {
//            return ("Aluno = " + aluno.getNome() +
//                    " | livro = " + livro.getTitulo() +
//                    " | data do empréstimo = " + dataEmprestimo +
//                    " | data prevista de devolução = " + calcularDataDevolucao() +
//                    " | não foi devolvido até o momento");
//        }
//
//    }
}