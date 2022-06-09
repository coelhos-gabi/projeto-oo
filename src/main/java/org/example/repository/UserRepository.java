package org.example.repository;

import org.example.dominios.User;

import java.util.ArrayList;

public class UserRepository extends AbstractListRepository<User> implements IRepository<User> {

    private static UserRepository userRepository;
    private ArrayList<User> usuariosCadastrados = new ArrayList<>();

    private UserRepository() {
    }

    public static UserRepository getInstance() {
        if (userRepository == null) {
            userRepository = new UserRepository();
        }
        return userRepository;
    }

    @Override
    public int compare(User usuario1, User usuario2) {
        return usuario1.getId().compareTo(usuario2.getId());
    }


    @Override
    public User read(String id) {
        for (User usuarioCadastrado : usuariosCadastrados) {
            if (usuarioCadastrado.getId().equals(id)) {
                return usuarioCadastrado;
            }
        }
        return null;
    }

    @Override
    public void save(User usuario) {
        usuariosCadastrados.add(usuario);
    }

    @Override
    public boolean isSaved(User usuarioEntrada) {
        for (User usuarioCadastrado : usuariosCadastrados) {
            int comparador = usuarioCadastrado.getId().compareTo(usuarioEntrada.getId());
            if (comparador != 0) {
                return true;
            }
        }
        return false;
    }
}
