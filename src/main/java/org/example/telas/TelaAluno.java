package org.example.telas;

import org.example.dominios.Aluno;

import java.util.Scanner;

public class TelaAluno {
    public static void executar(Aluno aluno, Scanner scanner) {
        int option;
        do {
            System.out.println("-------------------------------------");
            System.out.printf("            Bem-vindo %s %n", aluno.getNome());
            System.out.println("   O que deseja fazer?");
            System.out.println("   1 - Procurar livro");
            System.out.println("   2 - Verificar seus dados");
            System.out.println("   3 - Realizar pagamento de multas");
            System.out.println("   0 - Sair");
            System.out.println("-------------------------------------");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    ProcurarLivro.executar(scanner);
                    break;
                case 2:
                    System.out.println(aluno);
                    break;
                case 3:
                    //Pagamento.executar();
                    break;
            }
        } while (option != 0);
    }
}
