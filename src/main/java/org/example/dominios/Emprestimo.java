package org.example.dominios;

import java.time.LocalDate;

public class Emprestimo {
    private Aluno aluno;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoReal = null;
    private String id;

    public Emprestimo(Aluno aluno, Livro livro) {
        this.aluno = aluno;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
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

    public

    @Override
    public String toString() {
        if (dataDevolucaoReal != null) {
            return ("Aluno = " + aluno.getNome() +
                    " | livro = " + livro.getTitulo() +
                    " | data do empréstimo = " + dataEmprestimo +
                    " | data prevista de devolução = " + calcularDataDevolucao() +
                    " | data em que foi devolvido = " + dataDevolucaoReal);
        } else {
            return ("Aluno = " + aluno.getNome() +
                    " | livro = " + livro.getTitulo() +
                    " | data do empréstimo = " + dataEmprestimo +
                    " | data prevista de devolução = " + calcularDataDevolucao() +
                    " | não foi devolvido até o momento");
        }

    }
}