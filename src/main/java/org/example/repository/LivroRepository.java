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
        int numero = 0;
        while (numero < livro.getTotalCopias()) {
            livrosCadastrados.add(livro);
            numero++;
        }
        //System.out.println(livro.getTitulo() + " cadastrado com sucesso");
    }

    public static void retirarDaEstante(Livro livro){
        livrosCadastrados.remove(livro);
    }

    public static StringBuilder getTitulos(String tituloLivro) {
        StringBuilder titulo = new StringBuilder();

        for (Livro livro : livrosCadastrados) {
            if(livro.getTitulo().contains(tituloLivro) || livro.getTitulo().equalsIgnoreCase(tituloLivro)){
                titulo.append(livro.getTitulo());
            }
        }
        return titulo;
    }
    public static StringBuilder getAutores(String nomeAutor){
        StringBuilder autor = new StringBuilder();
        for (Livro livro : livrosCadastrados) {
            if (livro.getAutor().contains(nomeAutor) || livro.getAutor().equalsIgnoreCase(nomeAutor)){
                autor.append(livro.getAutor()).append("\n");
            }
        }
        return autor;
    }
    public static Livro procurarLivroISBN(String isbnBusca) {
        for (Livro livroBuscado : livrosCadastrados) {
            String isbn = livroBuscado.getIsbn();
            if(isbn.equals(isbnBusca)){
                return livroBuscado;
            }
        }
        return null;
    }
//    public static Livro getLivroIsbn(String isbn) {
//        for (Livro livro : livrosCadastrados) {
//            if (livro.getIsbn().equals(isbn)) {
//                return livro;
//            }
//        }
//        return null;
//    }
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
