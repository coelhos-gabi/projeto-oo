package org.example.telas;

import org.example.dominios.Aluno;
import org.example.dominios.Livro;
import org.example.repository.AlunosRepository;
import org.example.repository.LivroRepository;
import org.example.servico.RealizarEmprestimo;
import org.example.servico.VerificarSeAlunoExiste;
import org.example.servico.VerificarSeLivroExiste;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaEmprestimo {

    public static void executar(Scanner scanner) {
        String idLivro;
        ArrayList<Livro> livrosEmprestados = new ArrayList<>();
        Livro livro = null;
        Aluno aluno = null;

        System.out.println("Insira a matricula:");
        String idAluno = scanner.next();

        if (!(VerificarSeAlunoExiste.verificarSeAlunoExiste(idAluno))) {
            executar(scanner);
        }

        aluno = AlunosRepository.getInstance().read(idAluno);

        do {
            System.out.println("Insira o ISBN:");
            System.out.println("Para terminar, digite FIM");
            idLivro = scanner.next();

            if (!(idLivro.equalsIgnoreCase("FIM"))) {

                if (VerificarSeLivroExiste.verificarSeLivroExiste(idLivro)) {
                    livro = LivroRepository.getInstance().procurarLivroISBN(idLivro);
                    RealizarEmprestimo.executar(aluno, livro);
                }
            }
        }
        while (!(idLivro.equalsIgnoreCase("FIM")));

    }
}