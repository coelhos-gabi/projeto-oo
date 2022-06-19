package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Emprestimo;
import org.example.dominios.Livro;
import org.example.repository.EmprestimoRepository;

import java.util.Arrays;
import java.util.List;

public class RealizarEmprestimo {

    public static void executar(Aluno aluno, Livro livroEmprestado) {

        VerificarSeAlunoPodeEmprestar validacoes = new VerificarSeAlunoPodeEmprestar();
        if(validacoes.executar(aluno, livroEmprestado)){
            Emprestimo emprestimo = new Emprestimo(aluno, livroEmprestado);
            EmprestimoRepository.getInstance().save(emprestimo);
            livroEmprestado.setTotalCopias(-1);
        }else{
            System.out.println("Empréstimo não pode ser realizado");
        }
    }
}
