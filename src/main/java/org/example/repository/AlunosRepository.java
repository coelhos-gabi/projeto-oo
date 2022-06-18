package org.example.repository;

import org.example.dominios.Aluno;

import java.util.ArrayList;
import java.util.Comparator;

// USO DE SINGLETON


public class AlunosRepository extends AbstractListRepository<Aluno> implements IRepository<Aluno>, Comparator<Aluno> {

    private static AlunosRepository alunosRepository;
    private ArrayList<Aluno> alunosCadastrados;

    private AlunosRepository() {
        super();
        alunosCadastrados = new ArrayList<>();
    }

    public static AlunosRepository getInstance() {
        if (alunosRepository == null) {
            alunosRepository = new AlunosRepository();
        }
        return alunosRepository;
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

    public ArrayList<Aluno> getAlunosCadastrados() {
        return alunosCadastrados;
    }
}




