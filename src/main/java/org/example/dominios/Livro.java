package org.example.dominios;

import org.example.repository.LivroRepository;

import java.util.Objects;

public class Livro {
    protected String titulo;
    private String autor;
    private String id;
    private int totalCopias = 0;

    public Livro(String titulo, String autor, String id, int copias) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        //setTotalCopias(copias);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return livro.getId().equals(this.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId());
    }
}
