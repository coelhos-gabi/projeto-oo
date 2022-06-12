package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.User;
import org.example.repository.AlunosRepository;
import org.example.repository.UserRepository;

public class CadastrarAluno {
    public static void cadastrar(User user) {

        AlunosRepository.getInstance().save((Aluno) user);
        UserRepository.getInstance().save(user);

    }
}
