package org.example.telas;

import org.example.dominios.Aluno;
import org.example.dominios.Devolucao;
import org.example.dominios.Livro;
import org.example.repository.AlunosRepository;
import org.example.repository.LivroRepository;
import java.util.Scanner;

public class TelaDevolucao {

    public static void executar(Scanner scanner){

        System.out.println("Insira a matricula do aluno:");
        String matricula = scanner.next();
        Aluno aluno = AlunosRepository.retornarAluno(matricula);
        System.out.println("Insira o isbn do livro");
        String isbn = scanner.next();
        Livro livro = LivroRepository.procurarLivroISBN(isbn);

        Devolucao.executar(livro, aluno);
    }
}
