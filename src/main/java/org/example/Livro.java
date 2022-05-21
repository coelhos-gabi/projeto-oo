package org.example;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private String sinopse;
    private int copias;

    public Livro(String titulo, String autor, String isbn, String sinopse, int copias) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.sinopse = sinopse;
        this.copias = copias;
    }
}
