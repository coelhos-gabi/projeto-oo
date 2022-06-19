package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Emprestimo;
import org.example.dominios.Livro;
import org.example.exception.VerificacaoException;
import org.example.repository.EmprestimoRepository;



public class VerificarSeRecebeAlunoPossuiMulta implements IRegraEmprestimo {

    public void executar(Aluno aluno, Livro livro) {

        for (Emprestimo emprestimoPorAluno : EmprestimoRepository.getInstance().getEmprestimosPorAluno(aluno)) {
            if(VerificarExistenciaDeMulta.verificar(emprestimoPorAluno)){
                throw new VerificacaoException("Aluno possui pendências com a biblioteca");
            }
        }
    }
}
