package org.example.dominios;

import org.example.repository.AlunosRepository;
import org.example.repository.LivroRepository;

import java.time.Duration;
import java.time.LocalDate;

public class Devolucao {

    public static void executar(Livro livro, Aluno aluno){
        //verificarMulta(aluno, livro);
        realizarDevolucao(aluno,livro);
    }
//    private static void verificarMulta(Aluno aluno, Livro livro){
//        LocalDate dataDevolucao = LocalDate.now();
//        int posicao = aluno.alunoPossuiLivro(livro.getIsbn());
//        LocalDate dataEmprestimo = aluno.getDataEmprestimo(posicao);
//
//        Duration duration = Duration.between(dataDevolucao, dataEmprestimo);
//        long intervalo = Math.abs(duration.toDays());
//        if (intervalo > 7) {
//        //calculo multa (R$ 0,50 por dia por livro)
//            int diasAtraso = (int) intervalo - 7;
//            double multa = diasAtraso * 0.5;
//            aluno.setPossuiMulta();
//            System.out.printf("Livro %s entregue com %d dias atrasado", livro.getTitulo(), diasAtraso);
//            System.out.println("Valor da multa: " + multa);
//        }
//    }
    private static void realizarDevolucao(Aluno aluno, Livro livro){
        int posicao = aluno.alunoPossuiLivro(livro.getIsbn());
        aluno.removerLivro(posicao);
        System.out.println(livro.getTitulo() + " devolvido pelo aluno " + aluno.getNome());
    }
}
