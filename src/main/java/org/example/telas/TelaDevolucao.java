package org.example.telas;

import org.example.dominios.Devolucao;

import java.time.LocalDate;
import java.util.Scanner;

public class TelaDevolucao {

    public void executar(Scanner scanner){

        System.out.println("Insira a matricula do aluno:");
        String matricula = scanner.next();
        System.out.println("Insira o isbn do livro");
        String isbn = scanner.next();
        LocalDate dataDevolucao = LocalDate.now();

        Devolucao.verificarMulta(matricula,isbn, dataDevolucao);
    }
}
