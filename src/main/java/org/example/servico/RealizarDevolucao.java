package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Emprestimo;
import org.example.dominios.Livro;
import org.example.repository.EmprestimoRepository;
import org.example.repository.LivroRepository;
import org.example.telas.ProcurarAluno;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class RealizarDevolucao {

    public void devolver(Livro livro, Aluno aluno) {

        // Percorrer repositorio de emprestimos apartir do aluno

        for (Emprestimo emprestimo : EmprestimoRepository.getInstance().getEmprestimosCadastrados()) {
            if (emprestimo.getAluno().equals(aluno)) {
                if (emprestimo.getLivro().equals(livro)) {
                    if (emprestimo.isFoiDevolvido().equals("Sim")) {
                        System.out.println("Livro já foi devolvido");
                    } else {
                        emprestimo.setFoiDevolvido();
                        emprestimo.setDataDevolucaoReal(LocalDate.now());
                        livro.setTotalCopias(1);
                        VerificarExistenciaDeMulta verificarExistenciaDeMulta = new VerificarExistenciaDeMulta();
                        if(verificarExistenciaDeMulta.verificar(emprestimo)){
                            CalcularMulta calcularMulta = new CalcularMulta();
                            BigDecimal multa = calcularMulta.calcular(emprestimo);
                            emprestimo.setMulta(multa);
                        }

                    }
                }
            }
        }



            // utilizar booleano pra ver se livro esta emprestado ou nao
            // verificar o booleano LivroEmprestado e setar false
            // setar setDataDevolucaoReal com LocalDate.now();
            // chamar classe calcular multa



    }
}

