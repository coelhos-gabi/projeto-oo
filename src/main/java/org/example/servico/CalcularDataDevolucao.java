package org.example.servico;

import org.example.dominios.Emprestimo;

import java.time.LocalDate;

public class CalcularDataDevolucao {
    public LocalDate calcular(Emprestimo emprestimo) {
        return emprestimo.getDataEmprestimo().plusDays(7);
    }
}
