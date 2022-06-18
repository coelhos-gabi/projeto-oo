package org.example.servico;

import org.example.dominios.Emprestimo;
import java.math.BigDecimal;


import java.time.temporal.ChronoUnit;

public class CalcularMulta {


    public BigDecimal calcular(Emprestimo emprestimo) {
        long totalDiasDeAtraso = 0;
        final double multaDiaria = 0.5;
        totalDiasDeAtraso = ChronoUnit.DAYS.between(emprestimo.getDataPrevista(),emprestimo.getDataDevolucaoReal());
        return BigDecimal.valueOf(multaDiaria * (totalDiasDeAtraso));
    }

    public static long getDiasDeAtraso(Emprestimo emprestimo) {
        return ChronoUnit.DAYS.between(emprestimo.getDataPrevista(),emprestimo.getDataDevolucaoReal());
    }
}
