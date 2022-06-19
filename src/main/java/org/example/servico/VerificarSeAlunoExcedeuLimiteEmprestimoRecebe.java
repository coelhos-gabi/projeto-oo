package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Emprestimo;
import org.example.dominios.Livro;
import org.example.exception.VerificacaoException;
import org.example.repository.EmprestimoRepository;

import java.util.List;

public class VerificarSeAlunoExcedeuLimiteEmprestimoRecebe implements IRegraEmprestimo {

    public void executar(Aluno aluno, Livro livro) {
        List<Emprestimo> emprestimosPorAluno = EmprestimoRepository.getInstance().getEmprestimosPorAluno(aluno);

        if(emprestimosPorAluno.size() >= aluno.getTipoAluno().getMaxLivros()) {
            throw new VerificacaoException("Aluno excedeu o limite de livros");
        }
    }
}
