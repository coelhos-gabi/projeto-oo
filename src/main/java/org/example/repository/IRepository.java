package org.example.repository;

import org.example.dominios.Aluno;

public interface IRepository<T> {
    void save(T object);
    boolean isSaved(T object);
    T read(String id);

}
