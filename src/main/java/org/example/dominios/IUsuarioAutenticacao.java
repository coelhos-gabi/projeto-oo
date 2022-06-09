package org.example.dominios;

public interface IUsuarioAutenticacao {
    boolean autenticar(String id, String senha);
    void setSenha(String senha);

}
