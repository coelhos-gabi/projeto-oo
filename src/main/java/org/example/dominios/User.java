package org.example.dominios;

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

}
