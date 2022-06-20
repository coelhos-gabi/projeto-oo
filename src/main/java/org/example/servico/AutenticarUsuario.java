package org.example.servico;

import org.example.dominios.User;
import org.example.repository.UserRepository;

import java.util.ArrayList;


public class AutenticarUsuario {
    public static boolean executar(String senha, User user) {


        ArrayList<User> usuariosCadastrados = UserRepository.getInstance().getUsuariosCadastrados();
        for (User usuarioCadastrado : usuariosCadastrados) {
            if (usuarioCadastrado.getId().equals(user.getId())) {
                if (usuarioCadastrado.getSenha().equals(senha)) {
                    return true;
                }
            }
        }
        return false;
    }
}
