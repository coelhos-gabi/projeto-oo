package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Emprestimo;
import org.example.repository.EmprestimoRepository;
import org.example.telas.ProcurarAluno;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ImprimirRelatorioGeralEmprestimo {

    public static void executar(Scanner scanner) {


        List<Emprestimo> relatorio = EmprestimoRepository.getInstance().getEmprestimosCadastrados();
        Collections.sort(relatorio);

        for (Emprestimo emprestimo : relatorio) {
            System.out.println(emprestimo);

        }
    }


}
