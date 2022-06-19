package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Livro;

public interface IRegraEmprestimo {
   void executar(Aluno aluno, Livro livro);
}
