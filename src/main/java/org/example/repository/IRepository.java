package org.example.repository;

public interface IRepository<T> {

    void save(T object);

    boolean isSaved(T object);

    T read(String id);

}
