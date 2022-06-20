package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Livro;
import java.util.ArrayList;
import java.util.List;


public class VerificarSeAlunoPodeEmprestar {

    private static List<IRegraEmprestimo> verificacoes = new ArrayList<>();

    public VerificarSeAlunoPodeEmprestar() {
        ListaDeVerificaçoes.executar();
    }
    public static boolean executar(Aluno aluno, Livro livro) {
        try {
            verificacoes.forEach(v -> v.executar(aluno, livro));
        } catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static void setVerificacoes(IRegraEmprestimo verificacao) {
        verificacoes.add(verificacao);
    }
}
