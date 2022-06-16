package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Emprestimo;
import org.example.dominios.Livro;
import org.example.repository.EmprestimoRepository;
import org.example.telas.ProcurarAluno;

import java.time.LocalDate;
import java.util.Scanner;

public class RealizarDevolucao {

    public void devolver(Livro livro, Scanner scanner) {

        // Buscar aluno - por ID
        Aluno aluno = ProcurarAluno.executar(scanner);
        if(aluno == null){
            return;
        }
        // Percorrer repositorio de emprestimos apartir do aluno
        for (Emprestimo emprestimo : EmprestimoRepository.getInstance().getEmprestimosCadastrados()) {
            if(emprestimo.getAluno().equals(aluno) && emprestimo.getLivro().equals(livro)){
                // precisarei do booleano devolvido e data devolucao
                emprestimo.setDataDevolucaoReal(LocalDate.now());

            }
        }


        // utilizar booleano pra ver se livro esta emprestado ou nao
        // verificar o booleano LivroEmprestado e setar false
        // setar setDataDevolucaoReal com LocalDate.now();
        // chamar classe calcular multa




    }
}

