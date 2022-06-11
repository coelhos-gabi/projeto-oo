package org.example.telas;

import org.example.dominios.Aluno;
import org.example.repository.AlunosRepository;

import java.util.Scanner;

public class ProcurarAluno {

    public static Aluno executar(Scanner scanner) {
        System.out.println("Insira o número da matricula");
        String id = scanner.next();

        return AlunosRepository.getInstance().read(id);

    }

}
