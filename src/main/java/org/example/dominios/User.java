package org.example.dominios;

import java.util.Objects;

public class User implements IUsuarioAutenticacao {
    protected String nome;
    protected String id;
    protected String senha;

    public User(String nome, String id, String senha) {
        this.nome = nome;
        this.id = id;
        setSenha(senha);
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

//    public boolean autenticar(String id, String senha){ //SOMENTE PARA TESTAR, VERIFICAR MÉTODO
//        return this.senha.equals(senha);
//    }

    public String getSenha() {
        return senha;
    }


    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return user.getId().equals(this.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId());
    }
}
