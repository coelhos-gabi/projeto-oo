package org.example.servico;


public class ListaDeVerificaçoes {


    public static void executar(){

        IRegraEmprestimo verificarSeAlunoPossuiMulta = new VerificarSeAlunoPossuiMulta();
        IRegraEmprestimo verificarSeAlunoPossuiLivro = new VerificarSeAlunoPossuiLivro();
        IRegraEmprestimo verificarSeAlunoExcedeuLimiteEmprestimoRecebe = new VerificarSeAlunoExcedeuLimiteEmprestimoRecebe();
        IRegraEmprestimo verificarDisponibilidadeDoLivro = new VerificarDisponibilidadeDoLivro();


        VerificarSeAlunoPodeEmprestar.setVerificacoes(verificarSeAlunoPossuiMulta);
        VerificarSeAlunoPodeEmprestar.setVerificacoes(verificarSeAlunoPossuiLivro);
        VerificarSeAlunoPodeEmprestar.setVerificacoes(verificarSeAlunoExcedeuLimiteEmprestimoRecebe);
        VerificarSeAlunoPodeEmprestar.setVerificacoes(verificarDisponibilidadeDoLivro);
    }

}
