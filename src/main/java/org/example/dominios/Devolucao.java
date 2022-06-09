package org.example.dominios;

import java.time.LocalDate;
import java.time.Period;

public class Devolucao {

    public static void executar(Livro livro, Aluno aluno){
        verificarMulta(aluno, livro);
        realizarDevolucao(aluno,livro);
    }
    private static void verificarMulta(Aluno aluno, Livro livro){
        LocalDate dataDevolucao = LocalDate.now().plusDays(8);
        //LocalDate dataDevolucao = LocalDate.now();
        int posicao = aluno.alunoPossuiLivro(livro.getId());
        LocalDate dataEmprestimo = aluno.getDataEmprestimo(posicao);

        Period period = Period.between(dataEmprestimo, dataDevolucao);

        if (period.getDays() > 7) {
        //calculo multa (R$ 0,50 por dia por livro)
            int diasAtraso = period.getDays() - 7;
            double multa = diasAtraso * 0.5;
            aluno.setPossuiMulta();
            System.out.printf("Livro '%s' entregue com %d dia(s) de atraso %n", livro.getTitulo(), diasAtraso);
            System.out.printf("Valor da multa: R$ %.2f %n", multa);
        }
    }
    private static void realizarDevolucao(Aluno aluno, Livro livro){
        int posicao = aluno.alunoPossuiLivro(livro.getId());
        aluno.removerLivro(posicao);
        System.out.println(livro.getTitulo() + " devolvido pelo aluno " + aluno.getNome());
    }
}
