package org.example.dominios;


public class Emprestimo {

    private Emprestimo(){

    }
    public static void emprestar(Livro livro, Aluno aluno){
        if (aluno.getQuantidadeLivrosEmprestados() == aluno.getTipoAluno().getMAXLIVROS()){
            System.out.println("Limite de empréstimo do aluno atingido");
            return;
        }

        aluno.adicionarLivro(livro);
        System.out.println("Livro " + livro.getTitulo() + " emprestado");
    }
}
