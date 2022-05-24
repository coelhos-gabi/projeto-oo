package org.example;


import org.example.dominios.Aluno;
import org.example.dominios.Emprestimo;
import org.example.dominios.Livro;
import org.example.dominios.TipoAluno;
import org.example.repository.AlunosRepository;
import org.example.repository.LivroRepository;

import java.util.Scanner;

public class App{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        Livro livro1 = new Livro("Livro1", "autor1", "001");
        Livro livro2 = new Livro("Livro2", "autor2", "002");
        Livro livro3 = new Livro("Livro3", "autor3", "003");
        Livro livro4 = new Livro("Livro4", "autor4", "004");
        Livro livro5 = new Livro("Livro5", "autor5", "005");
        Livro livro6 = new Livro("Livro6", "autor6", "006");
        Livro livro7 = new Livro("Livro7", "autor7", "007");
        LivroRepository.cadastrarLivro(livro1);
        LivroRepository.cadastrarLivro(livro2);
        LivroRepository.cadastrarLivro(livro3);
        LivroRepository.cadastrarLivro(livro4);
        LivroRepository.cadastrarLivro(livro5);
        LivroRepository.cadastrarLivro(livro6);
        LivroRepository.cadastrarLivro(livro7);


        Aluno aluno1 = new Aluno("aluno1","12345", TipoAluno.GR);
        Aluno aluno2 = new Aluno("aluno2","23456", TipoAluno.MS);
        Aluno aluno3 = new Aluno("aluno3","34567", TipoAluno.DT);
        AlunosRepository.cadastrarAluno(aluno1);
        AlunosRepository.cadastrarAluno(aluno2);
        AlunosRepository.cadastrarAluno(aluno3);

        Emprestimo.emprestar(livro1, aluno1);
        Emprestimo.emprestar(livro2, aluno1);
        Emprestimo.emprestar(livro3, aluno1);
        Emprestimo.emprestar(livro4, aluno1);
        Emprestimo.emprestar(livro5, aluno1);


    }

}
