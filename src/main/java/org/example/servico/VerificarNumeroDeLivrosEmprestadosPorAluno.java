package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Emprestimo;
import org.example.repository.EmprestimoRepository;

import java.util.List;

public class VerificarNumeroDeLivrosEmprestadosPorAluno {

    public static int executar(Aluno aluno){
        int numeroDeLivrosEmprestados = 0;


        List<Emprestimo> emprestimosCadastrados = EmprestimoRepository.getInstance().getEmprestimosCadastrados();
        for (Emprestimo emprestimoCadastrado : emprestimosCadastrados) {
            if(emprestimoCadastrado.getAluno().equals(aluno)){
                numeroDeLivrosEmprestados += 1;
            }

        }
        return numeroDeLivrosEmprestados;
    }


}
