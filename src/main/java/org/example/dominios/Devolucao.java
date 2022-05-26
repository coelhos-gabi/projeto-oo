package org.example.dominios;

import org.example.repository.AlunosRepository;
import org.example.repository.LivroRepository;

import java.time.Duration;
import java.time.LocalDate;

public class Devolucao {

    public static void realizarDevolucao(Livro livro, Aluno aluno){
        aluno.removerLivro(livro);
    }

    public static void verificarMulta(String matricula, String isbn, LocalDate dataDevolucao){
        Aluno aluno = AlunosRepository.retornarAluno(matricula);
        Livro livro = LivroRepository.getLivros(isbn);
        int posicao = aluno.alunoJaPossuiLivro(isbn);
        LocalDate dataEmprestimo = aluno.getDataEmprestimo(posicao);

        // intervalo de datas
        Duration duration = Duration.between(dataDevolucao, dataEmprestimo);
        long intervalo = Math.abs(duration.toDays());
        if(intervalo > 7){
            //calculo multa (R$ 0,50 por dia por livro)
            int diasAtraso = (int) intervalo - 7;
            double multa = diasAtraso * 0.5;
            System.out.println("Valor da multa: " + multa);
        }
        realizarDevolucao(livro, aluno);



    }

    // método para cálculo de multa por intervalo de data
}
