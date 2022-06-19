package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Livro;
import org.example.exception.VerificacaoException;

public class VerificarDisponibilidadeDoLivro implements IRegraEmprestimo {


    public void executar(Aluno aluno, Livro livro) {
        if(livro.getTotalCopias() < 1) {
            throw new VerificacaoException("Todos os exemplares do livro " + livro.getTitulo() + " já estao emprestados");
        }
    }

}

