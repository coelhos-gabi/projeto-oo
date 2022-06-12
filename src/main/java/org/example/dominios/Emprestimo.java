package org.example.dominios;

import java.time.LocalDate;

public class Emprestimo implements Comparable<Emprestimo> {
    private Aluno aluno;
    private Livro livroEmprestado;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoReal = null;
    private String id;

    public Emprestimo(Aluno aluno, Livro livroEmprestado) {
        this.aluno = aluno;
        this.livroEmprestado = livroEmprestado;
        this.dataEmprestimo = LocalDate.now();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Livro getLivro() {
        return livroEmprestado;
    }


    public LocalDate getDataDevolucaoReal() {
        return dataDevolucaoReal;
    }

    public void setDataDevolucaoReal(LocalDate dataDevolucaoReal) {
        this.dataDevolucaoReal = dataDevolucaoReal;
    }

    public LocalDate calcularDataDevolucao() {
        LocalDate dataPrevista = this.dataEmprestimo.plusDays(7);
        return dataPrevista;
    }

    public String getId() {
        return id;
    }


    @Override
    public String toString() {
        return ("Aluno = " + aluno.getNome() + "\n" +
                " | Livro = " + livroEmprestado.getTitulo() + "\n" +
                " | Data do empréstimo = " + dataEmprestimo + "\n" +
                " | Data prevista de devolução = " + calcularDataDevolucao() + "\n" +
                " | Data em que foi devolvido = " + dataDevolucaoReal + "\n");

    }

//    @Override
//    public int compare(Emprestimo emprestimo1, Emprestimo emprestimo2) {
//        return emprestimo1.getAluno().getNome().compareTo(emprestimo2.getAluno().getNome());
//    }

    @Override
    public int compareTo(Emprestimo emprestimo) {
        return this.getAluno().getNome().compareTo(emprestimo.getAluno().getNome());
    }


//    @Override
//    public String toString() {
//        if (dataDevolucaoReal != null) {
//            return ("Aluno = " + aluno.getNome() +
//                    " | livro = " + livrosEmprestados.getTitulo() +
//                    " | data do empréstimo = " + dataEmprestimo +
//                    " | data prevista de devolução = " + calcularDataDevolucao() +
//                    " | data em que foi devolvido = " + dataDevolucaoReal);
//        } else {
//            return ("Aluno = " + aluno.getNome() +
//                    " | livro = " + livrosEmprestados.getTitulo() +
//                    " | data do empréstimo = " + dataEmprestimo +
//                    " | data prevista de devolução = " + calcularDataDevolucao() +
//                    " | não foi devolvido até o momento");
//        }

}