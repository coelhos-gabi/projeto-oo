package org.example.dominios;

import org.example.repository.LivroRepository;

public class Emprestimo {
    private Emprestimo(){
    }
    public static void emprestar(Livro livro, Aluno aluno){

        if (!(LivroRepository.getCopiasDisponiveis(livro) > 0)){
            System.out.println("Livro indisponível");
            return;
        }else if(!(aluno.getQuantidadeLivrosEmprestados() < aluno.getTipoAluno().getMaxLivros())){
            System.out.println("Aluno não pode mais emprestar livros");
            return;
        } else if (aluno.alunoPossuiLivro(livro.getId()) != -1) {
            System.out.println("Aluno já emprestou esse livro");
            return;

        }else if (aluno.getPossuiMulta()) {
            System.out.println("Aluno possui multa");
            System.out.println("Emprestimo somente após o pagamento da multa");
            return;
        }
        else{
            aluno.adicionarLivro(livro);
            LivroRepository.getInstance().retirarDaEstante(livro);
            System.out.println(livro.getTitulo() + " emprestado para " + aluno.getNome());
//            System.out.println("Livros emprestado para " + aluno.getNome() + ": " + aluno.getTituloDosLivrosEmprestados());
//            System.out.println("Data(s) de emprestimo: " + aluno.getDataEmprestimo());
        }
    }

}
