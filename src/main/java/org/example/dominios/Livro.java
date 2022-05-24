package org.example.dominios;

import org.example.repository.LivroRepository;

public class Livro {
    protected String titulo;
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
        if(LivroRepository.getLivros(this.isbn) != null) {
            if (LivroRepository.getLivros(this.isbn).getIsbn().equals(this.getIsbn())) {
                this.totalCopias += copias;
            }
        }
        else {
            this.totalCopias = copias;
        }
    }
}
