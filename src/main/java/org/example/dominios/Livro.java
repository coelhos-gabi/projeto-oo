package org.example.dominios;

import org.example.repository.LivroRepository;

public class Livro {
    protected String titulo;
    private String autor;
    private String id;
    private int totalCopias = 0;

    public Livro(String titulo, String autor, String id, int copias) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        setTotalCopias(copias);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getId() {
        return this.id;
    }

    public int getTotalCopias() {
        return totalCopias;
    }

    public void setTotalCopias(int copias) {
        if (LivroRepository.getInstance().procurarLivroISBN(this.id) != null) {
            if (LivroRepository.getInstance().procurarLivroISBN(this.id).getId().equals(this.getId())) {
                this.totalCopias += copias;
            }
        } else {
            this.totalCopias = copias;
        }
    }
}
