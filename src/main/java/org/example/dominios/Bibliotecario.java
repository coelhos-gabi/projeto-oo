package org.example.dominios;

public class Bibliotecario extends User {

    private String senha;

    public Bibliotecario(String nome, String id, String senha) {
        super(nome, id, senha);
        setSenha(senha);
    }

}
