package org.example.telas;

import org.example.dominios.Livro;
import org.example.repository.LivroRepository;
import java.util.Scanner;

public class ProcurarLivro {

    public static void executar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Como deseja procurar o livro?");
        System.out.println("1 - Por título do livro ");
        System.out.println("2 - Por autor");
        System.out.println("3 - Por isbn do livro");
        String entrada = scanner.next();

        procurarLivro(scanner, entrada);
    }
    private static void procurarLivro(Scanner scanner, String entrada) {
        String dado;
        Livro livro = null;
        if (entrada.equals("1")) {
            System.out.println("Insira o titulo do livro");
            dado = scanner.next();
            livro = LivroRepository.getLivros(dado);
        }

        if (entrada.equals("2")) {
            System.out.println("Insira o autor");
            dado = scanner.next();
            livro = LivroRepository.getLivros(dado);
        }

        if (entrada.equals("3")) {
            System.out.println("Insira o ISBN do livro");
            dado = scanner.next();
            livro = LivroRepository.getLivros(dado);
        }
        System.out.println("------ RESULTADO DA BUSCA ------");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("ISBN: " + livro.getIsbn());

    }
}
