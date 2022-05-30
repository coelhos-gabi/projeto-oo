package org.example.telas;

import org.example.dominios.Aluno;
import org.example.dominios.Emprestimo;
import org.example.dominios.Livro;
import org.example.repository.AlunosRepository;
import org.example.repository.LivroRepository;

import java.util.Scanner;

public class TelaEmprestimo {

    public static void executar(Scanner scanner){
        System.out.println("Insira o isbn:");
        String isbn = scanner.next();
        System.out.println("Insira a matricula:");
        String matricula = scanner.next();
        try{
            Livro livro = LivroRepository.getLivros(isbn);
            Aluno aluno = AlunosRepository.retornarAluno(matricula);
            Emprestimo.emprestar(livro, aluno);
        }catch(Exception e){
            System.out.println("Dados inválidos");
            executar(scanner);
        }
    }
}
