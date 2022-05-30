package org.example.repository;

import org.example.dominios.Livro;

import java.util.ArrayList;

public class LivroRepository{

    private LivroRepository() {
    }

    private static ArrayList<Livro> livrosCadastrados = new ArrayList<>();

    public static ArrayList<Livro> getLivrosCadastrados() {
        return livrosCadastrados;
    }

    public static void gravarLivroRepositorio(Livro livro) {
//        if(Objects.isNull(livrosCadastrados)) {
//            livrosCadastrados = new ArrayList<>();
//        }
        int numero = 0;
        while (numero != livro.getTotalCopias()) {
            livrosCadastrados.add(livro);
            numero++;
        }
//        System.out.println(livro.getTitulo() + " cadastrado com sucesso");
//        for (Livro livrosCadastrado : livrosCadastrados) {
//            System.out.println(livrosCadastrado.getTitulo());
//        }
    }

    public static void retirarDaEstante(Livro livro){
        livrosCadastrados.remove(livro);
    }

    public static Livro getLivros(String dado) {
        for (Livro livro : livrosCadastrados) {
            if(livro.getTitulo().equals(dado)){
                return livro;
            }
            if (livro.getAutor().equals(dado)){
                return livro;
            }
            if (livro.getIsbn().equals(dado)){
                return livro;
            }
        }
        return null;
    }
    public static int getCopiasDisponiveis(Livro livro){
        int contaCopias = 0;
        for (Livro livrosCadastrado : livrosCadastrados) {
            if (livrosCadastrado.getIsbn().equals(livro.getIsbn())) {
                contaCopias += 1;
            }
        }
        return contaCopias;
    }
}
