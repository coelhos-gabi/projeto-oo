package org.example.telas;

import org.example.dominios.Aluno;
import org.example.dominios.Emprestimo;
import org.example.dominios.Livro;
import org.example.repository.AlunosRepository;
import org.example.repository.LivroRepository;

import java.util.Scanner;

public class TelaEmprestimo {

    public static void executar(Scanner scanner){
        System.out.println("Insira o ISBN:");
        String isbn = scanner.next();
        System.out.println("Insira a matricula:");
        String matricula = scanner.next();
        Livro livro = null;
        Aluno aluno = null;
        try{
            livro = LivroRepository.procurarLivroISBN(isbn);
            aluno = AlunosRepository.retornarAluno(matricula);
            Emprestimo.emprestar(livro, aluno);
        }catch(Exception e){
            System.out.println("Dados inválidos");
            if(livro == null){
                System.out.println("Verifique o ISBN do livro");
            }
            if(aluno == null){
                System.out.println("Verifique a matrícula do aluno");
            }
            executar(scanner);
        }
    }
}
