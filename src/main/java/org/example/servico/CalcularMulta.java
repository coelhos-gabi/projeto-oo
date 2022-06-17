package org.example.servico;

import org.example.dominios.Emprestimo;
import java.math.BigDecimal;


import java.time.temporal.ChronoUnit;

public class CalcularMulta {

    public BigDecimal calcular(Emprestimo emprestimo) {
        final double multaDiaria = 0.5;
        long totalDiasDeAtraso = 0;
        totalDiasDeAtraso = ChronoUnit.DAYS.between(emprestimo.getDataPrevista(),emprestimo.getDataDevolucaoReal());
        return BigDecimal.valueOf(multaDiaria * (totalDiasDeAtraso));
    }


}
