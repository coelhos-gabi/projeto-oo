package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Emprestimo;
import org.example.dominios.Livro;
import org.example.repository.EmprestimoRepository;

import java.util.List;

public class VerificarSeAlunoPossuiLivro {

    public static boolean executar(Aluno aluno, Livro livro) {

        List<Emprestimo> emprestimosCadastrados = EmprestimoRepository.getInstance().getEmprestimosCadastrados();
        for (Emprestimo emprestimoCadastrado : emprestimosCadastrados) {
            if (emprestimoCadastrado.getAluno().equals(aluno)) {
                if(emprestimoCadastrado.getLivro().getId().equals(livro.getId())){
                    return true;
                }
            }
        }
        return false;
    }
}
