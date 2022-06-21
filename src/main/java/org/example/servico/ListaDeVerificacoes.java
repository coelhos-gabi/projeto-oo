package org.example.servico;


import java.util.ArrayList;

public class ListaDeVerificacoes {

    public static ArrayList<IRegraEmprestimo> executar(){

        ArrayList<IRegraEmprestimo> list = new ArrayList<>();

        list.add(new VerificarSeAlunoPossuiMulta());
        list.add(new VerificarSeAlunoPossuiLivro());
        list.add(new VerificarSeAlunoExcedeuLimiteEmprestimoRecebe());
        list.add(new VerificarDisponibilidadeDoLivro());

        return list;
    }

}
