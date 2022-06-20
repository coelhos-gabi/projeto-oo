package org.example.telas;

import org.example.dominios.Aluno;
import org.example.dominios.Bibliotecario;
import org.example.dominios.User;
import org.example.repository.UserRepository;
import org.example.servico.AutenticarUsuario;

import java.util.Scanner;

public class TelaLogin {

    public static void executar(Scanner scanner) {
        System.out.println("Insira seu login:");
        String id = scanner.next();
        User user = UserRepository.getInstance().read(id);
        System.out.println("Insira sua senha: ");
        String senha = scanner.next();

        if (user != null) {

            if (!AutenticarUsuario.executar(senha, user)) {
                System.out.println("Senha inválida");
                return;
            }
            if (user instanceof Aluno) {
                TelaAluno.executar((Aluno)user, scanner);
            }else if(user instanceof Bibliotecario){
                TelaBibliotecario.executar((Bibliotecario)user, scanner);
            }

        } else {
            System.out.println("Usuário não encontrado");
        }
    }
}