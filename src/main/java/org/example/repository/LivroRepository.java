package org.example.repository;

import org.example.dominios.Livro;

import java.util.ArrayList;

public class LivroRepository {


    private LivroRepository() {
    }

    // HERANÇA?
    private static ArrayList<Livro> livrosCadastrados = new ArrayList<>();

    public static void gravarLivroRepositorio(Livro livro) {
//        if(Objects.isNull(livrosCadastrados)) {
//            livrosCadastrados = new ArrayList<>();
//        }
        livrosCadastrados.add(livro);
        System.out.println(livro.getTitulo() + " cadastrado com sucesso");
        for (Livro livrosCadastrado : livrosCadastrados) {
            System.out.println(livrosCadastrado.getTitulo());
        }
    }

    public static Livro getLivros(String dado) {
        for (Livro livrosCadastrado : livrosCadastrados) {
            if(livrosCadastrado.getTitulo().equals(dado)){
                return livrosCadastrado;
            }
            if (livrosCadastrado.getAutor().equals(dado)){
                return livrosCadastrado;
            }
            if (livrosCadastrado.getIsbn().equals(dado)){
                return livrosCadastrado;
            }
        }
        return null;
    }
}
