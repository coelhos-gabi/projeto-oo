package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Livro;


public class VerificarSeAlunoPodeEmprestar {
    public static boolean executar(Aluno aluno, Livro livro) {

        //VERIFICAR IMPEDIMENTOS

        //Numero de livros por aluno
        if(VerificarNumeroDeLivrosEmprestadosPorAluno.executar(aluno) >= aluno.getTipoAluno().getMaxLivros()){
            System.out.println("Aluno excedeu o limite de livros");
            return false;
        //Aluno possui multa
        }else if(VerificarSeAlunoPossuiMulta.executar(aluno)){
            System.out.println("Aluno possui pendencias com a biblioteca");
            return false;
        //Aluno ja emprestou o livro
        }else if(VerificarSeAlunoPossuiLivro.executar(aluno, livro)){
            System.out.println("Aluno já possui o livro "+livro.getTitulo());
            return false;
        //Numero de livros na estante
        }else if(livro.getTotalCopias() < 1){
            System.out.println("Todos os exemplares do livro "+livro.getTitulo()+" já estao emprestados");
            return false;
        }else {
            return true;
        }
    }
}
