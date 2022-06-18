package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Emprestimo;
import org.example.repository.EmprestimoRepository;
import org.example.telas.ProcurarAluno;
import java.util.Scanner;

public class ImprimirRelatorioEmprestimoPorAluno {
    public static void executar(Scanner scanner, Aluno aluno) {
        boolean alunoNaoPossuiLivro = true;
        if(aluno == null) {
            aluno = ProcurarAluno.executar(scanner);
        }

        // Collections.sort(relatorio); //TENTAR ORGANIZAR POR DATA DE EMPRÉSTIMO (?)
        System.out.println("Relatório de empréstimos do aluno "+aluno.getNome());
        for (Emprestimo emprestimo : EmprestimoRepository.getInstance().getEmprestimosPorAluno(aluno)) {
            System.out.println(emprestimo);
            alunoNaoPossuiLivro = false;
        }

        if(alunoNaoPossuiLivro){
            System.out.println("Aluno nao possui nenhum empréstimo");
        }
    }
}

