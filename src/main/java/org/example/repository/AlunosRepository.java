package org.example.repository;

import org.example.dominios.Aluno;

import java.util.ArrayList;

// USO DE SINGLETON


public class AlunosRepository extends AbstractListRepository<Aluno> {

    private static AlunosRepository alunosRepository;
    private ArrayList<Aluno> alunosCadastrados = super.list;

    private AlunosRepository() {
    }

    public static AlunosRepository getInstance() {
        if (alunosRepository == null) {
            alunosRepository = new AlunosRepository();
        }
        return alunosRepository;
    }

    @Override
    public boolean isSaved(Aluno alunoEntrada) {
        for (Aluno aluno : alunosCadastrados) {
            int comparador = aluno.getId().compareTo(alunoEntrada.getId());
            if (comparador != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void save(Aluno aluno) {
        alunosCadastrados.add(aluno);
    }

    @Override
    public Aluno read(String id) {
        for (Aluno alunoCadastrado : alunosCadastrados) {
            if (alunoCadastrado.getId().equals(id)) {
                return alunoCadastrado;
            }
        }
        return null;
    }

    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return aluno1.getId().compareTo(aluno2.getId());
    }
}




