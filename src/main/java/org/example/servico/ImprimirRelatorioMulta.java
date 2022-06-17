package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Emprestimo;
import org.example.repository.EmprestimoRepository;
import org.example.telas.ProcurarAluno;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class ImprimirRelatorioMulta {

    public static void executar(Scanner scanner) {
        Aluno aluno = ProcurarAluno.executar(scanner);


        BigDecimal totalMulta = BigDecimal.valueOf(0);
        List<Emprestimo> relatorio = EmprestimoRepository.getInstance().getEmprestimosCadastrados();
        VerificarExistenciaDeMulta verificarExistenciaDeMulta = new VerificarExistenciaDeMulta();

        System.out.println("----------------------------------------");
        System.out.println("RELATÓRIO DE PENDÊNCIAS COM A BIBLIOTECA");
        System.out.println("----------------------------------------");
        for (Emprestimo emprestimo : relatorio) {
            if (emprestimo.getAluno().equals(aluno)) {
                if (verificarExistenciaDeMulta.verificar(emprestimo))
                    System.out.println("O aluno "+aluno.getNome()+" está com pendencia de entrega do livro "
                            + emprestimo.getLivro().getTitulo() + ". Com " +
                            "multa no valor de R$" + emprestimo.getMulta());
                totalMulta = totalMulta.add(emprestimo.getMulta());
            }
        }

        if(totalMulta.intValue() != 0){
            System.out.println("");
            System.out.println("O valor total a ser pago é de: R$"+totalMulta);
        }

    }
}
