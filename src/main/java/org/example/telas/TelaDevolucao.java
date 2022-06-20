package org.example.telas;

import org.example.dominios.Aluno;
import org.example.dominios.Livro;
import org.example.repository.AlunosRepository;
import org.example.repository.LivroRepository;
import org.example.servico.RealizarDevolucao;

import java.util.Scanner;

public class TelaDevolucao {

    public static void executar(Scanner scanner) {

        try {
            Aluno aluno = ProcurarAluno.executar(scanner);
            if(aluno == null){
                throw new Exception();
            }
            System.out.println("Insira o ISBN do livro");
            String idLivro = scanner.next();
            Livro livro = LivroRepository.getInstance().procurarLivroISBN(idLivro);
            if(livro == null){
                throw new Exception();
            }
            RealizarDevolucao devolucao = new RealizarDevolucao();
            devolucao.devolver(livro, aluno);
        }catch (Exception exception){
            System.out.println("Algo deu errado");
        }
    }
}
