package org.example;

import org.example.dominios.Aluno;
import org.example.dominios.Emprestimo;
import org.example.dominios.Init;
import org.example.dominios.Livro;
import org.example.repository.AlunosRepository;
import org.example.repository.LivroRepository;
import org.example.telas.InputDadosAluno;
import org.example.telas.InputDadosLivro;
import org.example.telas.ProcurarAluno;
import org.example.telas.ProcurarLivro;
import java.util.Scanner;

public class BibliotecaMain {
    public static void main( String[] args ){
        Init.executar();
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("----------- Biblioteca Livrão -----------");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Cadastrar um livro");
            System.out.println("2 - Cadastar aluno");
            System.out.println("3 - Realizar empréstimo");
            System.out.println("4 - Realizar devolução");
            System.out.println("5 - Procurar livro");
            System.out.println("6 - Procurar aluno");
            System.out.println("0 - Sair");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    Livro livro = InputDadosLivro.executar(sc);
                    LivroRepository.gravarLivroRepositorio(livro);
                    break;
                case 2:
                    Aluno aluno = InputDadosAluno.executar(sc);
                    AlunosRepository.gravarAlunoRepositorio(aluno);
                    break;
                case 3:
                    Emprestimo.executar(sc);
                    break;
                case 4:
                    //devolucao
                    break;
                case 5:
                    ProcurarLivro.executar();
                    break;
                case 6:
                    aluno = ProcurarAluno.executar(sc);
                    System.out.println(aluno.getNome());
                    break;
            }
        }while(option != 0);
    }
}
