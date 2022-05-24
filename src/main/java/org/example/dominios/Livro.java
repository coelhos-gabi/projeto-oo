package org.example.dominios;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int totalCopias = 0;

    public Livro(String titulo, String autor, String isbn, int copias) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        setTotalCopias(copias);
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getTotalCopias() {
        return totalCopias;
    }

    public void setTotalCopias(int copias) {
        this.totalCopias = copias;
    }
}
