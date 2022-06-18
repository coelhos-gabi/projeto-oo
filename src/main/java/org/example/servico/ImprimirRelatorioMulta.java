package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Emprestimo;
import org.example.repository.EmprestimoRepository;
import org.example.telas.ProcurarAluno;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class ImprimirRelatorioMulta {

    public static void executar(Scanner scanner, Aluno aluno) {

        if(aluno == null){
             aluno = ProcurarAluno.executar(scanner);
        }

        BigDecimal totalMulta = BigDecimal.valueOf(0);
        List<Emprestimo> relatorio = EmprestimoRepository.getInstance().getEmprestimosCadastrados();
        VerificarExistenciaDeMulta verificarExistenciaDeMulta = new VerificarExistenciaDeMulta();

        System.out.println("----------------------------------------");
        System.out.println("RELATÓRIO DE PENDÊNCIAS COM A BIBLIOTECA");
        System.out.println("----------------------------------------");
        for (Emprestimo emprestimo : relatorio) {
            if (emprestimo.getAluno().equals(aluno)) {
                if (verificarExistenciaDeMulta.verificar(emprestimo)) {

                    System.out.print("O aluno " + aluno.getNome() + " está com pendencia de entrega do livro "
                            + emprestimo.getLivro().getTitulo() + ". Com " +
                            emprestimo.getDiasDeAtraso() + " dia(s) de atraso e ");
                    System.out.printf("multa no valor de R$%.2f", emprestimo.getMulta());
                    totalMulta = totalMulta.add(emprestimo.getMulta());
                    System.out.println("");
                }
            }
        }

        if(totalMulta.intValue() != 0){
            System.out.println("");
            System.out.println("");
            System.out.printf("O valor total a ser pago é de: R$%.2f", totalMulta);
            System.out.println("");
        }

    }
}
