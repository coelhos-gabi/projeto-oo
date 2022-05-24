package org.example;

import org.example.dominios.Aluno;
import org.example.dominios.Init;
import org.example.repository.AlunosRepository;
import org.example.repository.LivroRepository;
import org.example.telas.CadastrarAluno;
import org.example.telas.CadastrarLivro;
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
                    LivroRepository.cadastrarLivro(CadastrarLivro.executar(sc));
                    break;
                case 2:
                    AlunosRepository.cadastrarAluno(CadastrarAluno.executar(sc));
                    break;
                case 3:
                    //Emprestimo.emprestar(livro, matricula);
                    break;
                case 4:
                    //devolucao
                    break;
                case 5:
                    ProcurarLivro.executar();
                    break;
                case 6:
                    Aluno aluno = ProcurarAluno.executar(sc);
                    System.out.println(aluno.getNome());
                    break;
            }
        }while(option != 0);
    }
}
