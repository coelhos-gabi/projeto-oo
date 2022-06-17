package org.example.servico;

import org.example.dominios.Emprestimo;

public class VerificarExistenciaDeMulta {
    public boolean verificar(Emprestimo emprestimo) {
        if(emprestimo.isFoiDevolvido().equals("Sim")) {
            return (emprestimo.getDataPrevista().isBefore(emprestimo.getDataDevolucaoReal()) ||
                    emprestimo.getDataPrevista().equals(emprestimo.getDataDevolucaoReal()));
        }
    return false;
    }
}
