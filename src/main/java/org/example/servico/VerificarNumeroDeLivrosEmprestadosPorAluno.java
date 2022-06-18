package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Emprestimo;
import org.example.repository.EmprestimoRepository;

import java.util.List;

public class VerificarNumeroDeLivrosEmprestadosPorAluno {

    public static int executar(Aluno aluno) {

        List<Emprestimo> emprestimosPorAluno = EmprestimoRepository.getInstance().getEmprestimosPorAluno(aluno);
        return emprestimosPorAluno.size();
    }
}
