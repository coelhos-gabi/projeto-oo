package org.example.telas;

import org.example.dominios.Aluno;
import org.example.dominios.TipoAluno;
import org.example.dominios.User;
import org.example.servico.CadastrarAluno;

import java.util.Scanner;

public class InputDadosAluno {
    public static void executar(Scanner scanner) {

        System.out.println("Insira o nome do aluno:");
        String nome = scanner.next();
        System.out.println("Insira a matrícula:");
        String matricula = scanner.next();
        System.out.println("Insira tipo de aluno");

        for (TipoAluno tipoAluno : TipoAluno.values()) {
            System.out.println(tipoAluno.getCode() + " - " + tipoAluno.getDescricao());
        }
        int option = scanner.nextInt();
        TipoAluno tipoAluno = TipoAluno.valueOfCode(option);

        System.out.println("Insira a senha");
        String senha = scanner.next();
        User aluno = new Aluno(nome, matricula, tipoAluno, senha);

        CadastrarAluno.cadastrar(aluno);
    }
}
