package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Livro;

import java.util.List;


public class VerificarSeAlunoPodeEmprestar {

    private List<IRegraEmprestimo> verificacoes;

    public VerificarSeAlunoPodeEmprestar() {
        this.verificacoes = ListaDeVerificacoes.executar();
    }
    public boolean executar(Aluno aluno, Livro livro) {
        try {
            verificacoes.forEach(v -> v.executar(aluno, livro));
        } catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

}
