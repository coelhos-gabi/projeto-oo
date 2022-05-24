package org.example;

import org.example.repository.AlunosRepository;
import org.example.repository.LivroRepository;
import org.example.telas.CadastrarAluno;
import org.example.telas.CadastrarLivro;
import org.example.telas.ProcurarAluno;

import java.util.Scanner;

public class BibliotecaMain {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("----------- Biblioteca Livrão -----------");
            System.out.println("O que deseja faze?");
            System.out.println("1 - Cadastrar um livro");
            System.out.println("2 - Cadastar aluno");
            System.out.println("3 - Realizar empréstimo");
            System.out.println("4 - Realizar devolução");
            System.out.println("5 - Procurar livro");
            System.out.println("0 - Sair");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    LivroRepository.cadastrarLivro(CadastrarLivro.executar(sc));
                    break;
                case 2:
                    AlunosRepository.cadastrarAluno(CadastrarAluno.executar(sc));
                    break;
                case 3:
                    AlunosRepository.existeAluno(ProcurarAluno.executar(sc));
                    break;
                case 4:

            }
        }while(option != 0);
    }
}
