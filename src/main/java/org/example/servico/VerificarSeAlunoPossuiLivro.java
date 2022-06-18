package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Emprestimo;
import org.example.dominios.Livro;
import org.example.repository.EmprestimoRepository;



public class VerificarSeAlunoPossuiLivro {

    public static boolean executar(Aluno aluno, Livro livro) {

        for (Emprestimo emprestimoPorAluno : EmprestimoRepository.getInstance().getEmprestimosPorAluno(aluno)) {
            if(emprestimoPorAluno.getLivro().equals(livro) && (emprestimoPorAluno.isFoiDevolvido().equals("Não"))){
                return true;
            }
        }
        return false;//
    }
}
