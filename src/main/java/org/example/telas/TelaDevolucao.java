package org.example.telas;

import org.example.dominios.Aluno;
import org.example.dominios.Livro;
import org.example.repository.AlunosRepository;
import org.example.repository.LivroRepository;

import java.util.Scanner;

public class TelaDevolucao {

    public static void executar(Scanner scanner) {

        System.out.println("Insira a matricula do aluno:");
        String idAluno = scanner.next();
        Aluno aluno = AlunosRepository.getInstance().read(idAluno);
        System.out.println("Insira o isbn do livro");
        String idLivro = scanner.next();
        Livro livro = LivroRepository.getInstance().procurarLivroISBN(idLivro);

    }
}
