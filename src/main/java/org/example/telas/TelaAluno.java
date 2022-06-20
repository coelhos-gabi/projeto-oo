package org.example.telas;

import org.example.dominios.Aluno;
import org.example.servico.ImprimirRelatorioEmprestimoPorAluno;
import org.example.servico.ImprimirRelatorioMulta;

import java.util.Scanner;

public class TelaAluno {
    public static void executar(Aluno aluno, Scanner scanner) {
        int option = 99;
        do {
            System.out.println("-------------------------------------");
            System.out.printf("            Bem-vindo %s %n", aluno.getNome());
            System.out.println("   O que deseja fazer?");
            System.out.println("   1 - Procurar livro");
            System.out.println("   2 - Verificar seus dados");
            System.out.println("   3 - Status empréstimos");
            System.out.println("   4 - Imprimir relatório de pendencias");
            System.out.println("   0 - Sair");
            System.out.println("-------------------------------------");

            try {
                String stringOption = scanner.next();
                option = Integer.parseInt(stringOption);


                switch (option) {
                    case 1:
                        ProcurarLivro.executar(scanner);
                        break;
                    case 2:
                        System.out.println(aluno);
                        break;
                    case 3:
                        ImprimirRelatorioEmprestimoPorAluno.executar(scanner, aluno);
                        break;
                    case 4:
                        ImprimirRelatorioMulta.executar(scanner, aluno);
                        break;
                }
            }catch (Exception exception) {
                System.out.println("Entrada inválida, tente novamente");
            }
        } while (option != 0);
    }
}
