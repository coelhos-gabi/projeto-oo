package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.User;
import org.example.repository.AlunosRepository;
import org.example.repository.UserRepository;

public class CadastrarAluno {
    public static void cadastrar(User user) {
        Aluno aluno = (Aluno) user;
        if (AlunosRepository.getInstance().read(aluno.getId()) != null) {
            System.out.println("############################################");
            System.out.println();
            System.out.println("             Usuário já cadastrado");
            System.out.println();
            System.out.println("############################################");
        } else {
            AlunosRepository.getInstance().save((Aluno) user);
            UserRepository.getInstance().save(user);
            System.out.printf("Usuario %s cadastrado com sucesso! %n%n", user.getNome());
        }
    }
}
