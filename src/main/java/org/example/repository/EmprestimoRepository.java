package org.example.repository;


import org.example.dominios.Emprestimo;

import java.util.ArrayList;
import java.util.List;

// USO DE SINGLETON


public class EmprestimoRepository extends AbstractListRepository<Emprestimo> {
    private static EmprestimoRepository emprestimoRepository;
    private ArrayList<Emprestimo> emprestimosCadastrados = super.list;

    private EmprestimoRepository() {
    }

    public static EmprestimoRepository getInstance() {
        if (emprestimoRepository == null) {
            emprestimoRepository = new EmprestimoRepository();
        }
        return emprestimoRepository;
    }

    @Override
    public boolean isSaved(Emprestimo emprestimoEntrada) {
        for (Emprestimo emprestimo : emprestimosCadastrados) {
            int comparador = emprestimo.getId().compareTo(emprestimoEntrada.getId());
            if (comparador != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void save(Emprestimo emprestimo) {
        emprestimosCadastrados.add(emprestimo);
    }

    @Override
    public Emprestimo read(String id) {
        for (Emprestimo emprestimoCadastrado : emprestimosCadastrados) {
            if (emprestimoCadastrado.getId().equals(id)) {
                return emprestimoCadastrado;
            }
        }
        return null;
    }

    public List<Emprestimo> getEmprestimosCadastrados() {
        return emprestimosCadastrados;
    }

    @Override
    public int compare(Emprestimo emprestimo1, Emprestimo emprestimo2) {
        return 0;
    }





}
