package org.example.telas;

import org.example.servico.ImprimirRelatorioEmprestimoPorAluno;
import org.example.servico.ImprimirRelatorioGeralEmprestimo;
import org.example.servico.ImprimirRelatorioMulta;

import java.util.Scanner;

public class TelaRelatorios {

    public static void executar(Scanner scanner) {
        int option;
        do {
            System.out.println("-------------------------------------");
            System.out.println("   O que deseja fazer?");
            System.out.println("   1 - Imprimir relatório geral de livros emprestados");
            System.out.println("   2 - Imprimir relatório de livros emprestados por aluno");
            System.out.println("   3 - Imprimir relatório de multa por aluno");
            System.out.println("   0 - Sair");
            System.out.println("-------------------------------------");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    ImprimirRelatorioGeralEmprestimo.executar(scanner);
                    break;
                case 2:
                    ImprimirRelatorioEmprestimoPorAluno.executar(scanner);
                    break;
                case 3:
                    ImprimirRelatorioMulta.executar(scanner);
                    break;
            }
        } while (option != 0);
    }
}
