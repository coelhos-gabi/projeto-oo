package org.example.dominios;

import org.example.repository.AlunosRepository;
import org.example.repository.LivroRepository;

import java.time.LocalDate;
import java.util.Scanner;


public class Emprestimo {

    private Emprestimo(){
    }
    public static void executar(Scanner scanner){
        System.out.println("Insira o isbn:");
        String isbn = scanner.next();
        System.out.println("Insira a matricula:");
        String matricula = scanner.next();
        try{
            Livro livro = LivroRepository.getLivros(isbn);
            Aluno aluno = AlunosRepository.retornarAluno(matricula);
            emprestar(livro, aluno);
        }catch(Exception e){
            System.out.println("Dados inválidos");
            executar(scanner);
        }
    }
    public static void emprestar(Livro livro, Aluno aluno){

        if (!(LivroRepository.getCopiasDisponiveis(livro) > 0)){
            System.out.println("Livro indisponível");
        }else if(!(aluno.getQuantidadeLivrosEmprestados() < aluno.getTipoAluno().getMAXLIVROS())){
            System.out.println("Aluno não pode mais emprestar livros");
        } else if (aluno.alunoJaPossuiLivro(livro.getIsbn())){
            System.out.println("Aluno já emprestou esse livro");
        }else {
            // verificar multa existente
            realizarEmprestimo(livro, aluno);
            LivroRepository.retirarDaEstante(livro);
            System.out.println(livro.getTitulo() + " emprestado para " + aluno.getNome());
            System.out.println("Livros emprestado para " + aluno.getNome() + " " + aluno.getLivrosEmprestados());
            System.out.println("Data(s) de emprestimo: " + aluno.getDataEmprestimo());
        }
    }

    private static void realizarEmprestimo(Livro livro, Aluno aluno){
        aluno.adicionarLivro(livro);
        aluno.setDataEmprestimo(LocalDate.now());
    }
}
