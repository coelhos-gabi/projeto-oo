package org.example.servico;

import org.example.dominios.Emprestimo;
import org.example.repository.EmprestimoRepository;

import java.util.Collections;
import java.util.List;

public class ImprimirRelatorioEmprestimo {

    public static void executar() {

        List<Emprestimo> relatorio = EmprestimoRepository.getInstance().getEmprestimosCadastrados();
        Collections.sort(relatorio);

        for (Emprestimo emprestimo : relatorio) {
            System.out.println(emprestimo);

        }
    }


}
