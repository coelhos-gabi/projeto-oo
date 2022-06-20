package org.example.telas;

import org.example.dominios.Livro;
import org.example.servico.CadastrarLivro;

import java.util.Scanner;

public class InputDadosLivro {

    public static void executar(Scanner scanner){

        try {
            System.out.println("Insira o título do livro:");
            String titulo = scanner.next();
            System.out.println("Insira o autor");
            String autor = scanner.next();
            System.out.println("Insira o isbn");
            String isbn = scanner.next();
            System.out.println("Insira o total de copias:");
            int copias = scanner.nextInt();

            Livro livro = new Livro(titulo, autor, isbn, copias);
            CadastrarLivro.cadastrar(livro);
        }catch (Exception exception){
            System.out.println("Algo deu errado");
        }




    }
}
