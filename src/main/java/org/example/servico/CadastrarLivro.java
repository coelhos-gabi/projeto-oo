package org.example.servico;

import org.example.dominios.Livro;
import org.example.repository.LivroRepository;


public class CadastrarLivro {

    public static void cadastrar(Livro livro) {
        if (LivroRepository.getInstance().read(livro.getId()) != null) {
            System.out.println("############################################");
            System.out.println();
            System.out.println("             Livro já cadastrado");
            System.out.println();
            System.out.println("############################################");
        } else {
            LivroRepository.getInstance().save(livro);
            System.out.printf("Livro %s cadastrado com sucesso! %n%n", livro.getTitulo());
        }
    }

}
