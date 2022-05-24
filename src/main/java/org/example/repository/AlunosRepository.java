package org.example.repository;

import org.example.dominios.Aluno;

import java.util.ArrayList;

public class AlunosRepository {

    private static ArrayList<Aluno> alunosCadastrados = new ArrayList<>();

    private AlunosRepository() {
    }
    public static void gravarAlunoRepositorio(Aluno aluno) {
//        if(Objects.isNull(alunosCadastrados)) {
//            alunosCadastrados = new ArrayList<>();
//        }
        alunosCadastrados.add(aluno);
        System.out.println(aluno.getNome() + " cadastrado com sucesso");
        System.out.println("-----------------------------------------");
    }
    public static Aluno retornarAluno(String matricula){
        for (Aluno alunosCadastrado : alunosCadastrados) {
            if(alunosCadastrado.getMatricula().equals(matricula)){
                return alunosCadastrado;
            }
        }
        return null;
    }
}
