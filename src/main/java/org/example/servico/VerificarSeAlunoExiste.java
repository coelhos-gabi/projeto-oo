package org.example.servico;

import org.example.dominios.Aluno;
import org.example.repository.AlunosRepository;

public class VerificarSeAlunoExiste {

    public static boolean verificarSeAlunoExiste(String idAluno) {
        Aluno aluno = null;

        aluno = AlunosRepository.getInstance().read(idAluno);

        if (aluno == null) {
            System.out.println("Dados inválidos");
            System.out.println("Verifique a matrícula do aluno");
            return false;
        }
        return true;

    }

}
