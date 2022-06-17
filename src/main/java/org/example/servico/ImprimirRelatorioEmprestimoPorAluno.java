package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Emprestimo;
import org.example.repository.EmprestimoRepository;
import org.example.telas.ProcurarAluno;


import java.util.List;
import java.util.Scanner;

public class ImprimirRelatorioEmprestimoPorAluno {
    public static void executar(Scanner scanner) {

        Aluno aluno = ProcurarAluno.executar(scanner);


        List<Emprestimo> relatorioAluno = EmprestimoRepository.getInstance().getEmprestimosCadastrados();
       // Collections.sort(relatorio); //TENTAR ORGANIZAR POR DATA DE EMPRÉSTIMO (?)

            for (Emprestimo emprestimo : relatorioAluno) {
                if(emprestimo.getAluno().equals(aluno))
                    System.out.println(emprestimo);
            }
        }
    }

