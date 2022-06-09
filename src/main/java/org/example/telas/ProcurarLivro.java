package org.example.telas;

import org.example.dominios.Livro;
import org.example.repository.LivroRepository;

import java.util.Scanner;

public class ProcurarLivro {

    public static void executar(Scanner scanner) {
//        System.out.println("Como deseja procurar o livro?");
//        System.out.println("1 - Por título do livro ");
//        System.out.println("2 - Por autor");
//        System.out.println("3 - Por isbn do livro");
//        String entrada = scanner.next();
        System.out.println("---- Buscando Livro ----");
        System.out.println("Insira o ISBN do livro");
        String isbn = scanner.next();
        Livro livro = LivroRepository.getInstance().procurarLivroISBN(isbn);

        System.out.println("------ RESULTADO DA BUSCA ------");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("ISBN: " + livro.getId());
//        procurarLivro(scanner, entrada);
    }

}


//    private static void procurarLivro(Scanner scanner, String entrada) {
//        String dado;
//        Livro livro = null;
//        if (entrada.equals("1")) {
//            System.out.println("Insira o titulo do livro");
//            dado = scanner.next();
//            System.out.println(LivroRepository.getTitulos(dado));
//        }
//
//        if (entrada.equals("2")) {
//            System.out.println("Insira o autor");
//            dado = scanner.next();
//            System.out.println(LivroRepository.getAutores(dado));
//        }
//
//        if (entrada.equals("3")) {
//            System.out.println("Insira o ISBN do livro");
//            dado = scanner.next();
//            livro = LivroRepository.procurarLivroISBN(dado);
//        }
//
//    }

