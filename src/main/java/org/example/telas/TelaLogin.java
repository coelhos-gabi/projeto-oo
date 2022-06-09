package org.example.telas;

import org.example.dominios.Aluno;
import org.example.dominios.Bibliotecario;
import org.example.dominios.User;
import org.example.repository.UserRepository;

import java.util.Scanner;

public class TelaLogin {

    public static void executar(Scanner scanner) {
        System.out.println("Insira seu login:");
        String id = scanner.next();
        User user = UserRepository.getInstance().read(id);
        System.out.println("Insira sua senha: ");
        String senha = scanner.next();
        if (user != null) {
            if (user instanceof Aluno) {
                Aluno aluno = (Aluno) user;
                if (!(aluno.autenticar(id, senha))) {
                    System.out.println("Dados inválidos");
                    return;
                }
                TelaAluno.executar((Aluno) user, scanner);
            }
            if (user instanceof Bibliotecario) {
                Bibliotecario bibliotecario = (Bibliotecario) user;
                if (!(bibliotecario.autenticar(id, senha))) {
                    System.out.println("Dados inválidos");
                    return;
                }
                TelaBibliotecario.executar(bibliotecario, scanner);
            }
        } else {
            System.out.println("Usuário não encontrado");
        }
    }
}