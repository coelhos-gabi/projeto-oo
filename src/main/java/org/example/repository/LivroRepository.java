package org.example.repository;

import org.example.dominios.Livro;

import java.util.ArrayList;
import java.util.Objects;

public class LivroRepository {

    private static ArrayList<Livro> livrosCadastrados;

    private LivroRepository() {
    }
    public static void cadastrarLivro(Livro livro) {
        if(Objects.isNull(livrosCadastrados)) {
            livrosCadastrados = new ArrayList<>();
        }
        livrosCadastrados.add(livro);
        System.out.println(livro.getTitulo() + " cadastrado com sucesso");
    }

    public static void getLivrosCadastrados() {
        for (Livro livrosCadastrado : livrosCadastrados) {
            System.out.println(livrosCadastrado.getTitulo());
        }
    }
}
