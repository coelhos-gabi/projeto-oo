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
        //System.out.println(livro.getTitulo() + " cadastrado com sucesso");
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
