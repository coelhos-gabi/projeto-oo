package org.example.dominios;

import java.time.LocalDate;

public class Devolucao {
    private LocalDate dataDevolucao;

    public void realizarDevolucao(Livro livro, Aluno aluno){
        aluno.removerLivro(livro);
    }

    // método para cálculo de multa por intervalo de data
}
