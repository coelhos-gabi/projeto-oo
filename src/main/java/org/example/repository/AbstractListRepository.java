package org.example.repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;


public abstract class AbstractListRepository<T> implements IRepository<T>, Comparator<T> {
    protected ArrayList<T> list;

    public AbstractListRepository() {
    }

    public void save(T object) {
        if (Objects.isNull(list)) {
            list = new ArrayList<>();
        }
        list.add(object);
    }

    public boolean isSaved(T object) {
        return list.contains(object);
    }
}
