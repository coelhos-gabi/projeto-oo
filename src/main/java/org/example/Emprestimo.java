package org.example;


import java.time.LocalDateTime;

public class Emprestimo {

    private LocalDateTime dataEmprestimo;
    private Livro livro;
    private Aluno aluno;

    public Emprestimo(LocalDateTime dataEmprestimo, Livro livro, Aluno aluno) {
        this.dataEmprestimo = dataEmprestimo;
        this.livro = livro;
        this.aluno = aluno;
    }

}
