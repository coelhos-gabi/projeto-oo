package org.example.dominios;


import org.example.repository.AlunosRepository;

public class Emprestimo {

    private Emprestimo(){

    }
    public static void emprestar(Livro livro, String matricula){
        // disponibilidade livro

        // limite aluno
        // verificar multa existente



        Aluno aluno = AlunosRepository.retornarAluno(matricula);
        if (aluno == null){
            System.out.println("Aluno não cadastrado");
            return;
        }
        if (aluno.getQuantidadeLivrosEmprestados() == aluno.getTipoAluno().getMAXLIVROS()){
            System.out.println("Limite de empréstimo do aluno atingido");
            return;
        }

        aluno.adicionarLivro(livro);
        System.out.println("Livro " + livro.getTitulo() + " emprestado");
    }
}
