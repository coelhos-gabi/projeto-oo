package org.example.telas;

import org.example.dominios.Livro;

import java.util.Scanner;

public class InputDadosLivro {

    public static Livro executar(Scanner scanner){

        System.out.println("Insira o título do livro:");
        String titulo = scanner.next();
        System.out.println("Insira o autor");
        String autor = scanner.next();
        System.out.println("Insira o isbn");
        String isbn = scanner.next();
        System.out.println("Insira o total de copias:");
        int copias = scanner.nextInt();

        return new Livro(titulo, autor, isbn, copias);
    }
}
