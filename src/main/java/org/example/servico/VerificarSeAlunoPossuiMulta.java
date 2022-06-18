package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Emprestimo;
import org.example.repository.EmprestimoRepository;



public class VerificarSeAlunoPossuiMulta {

    public static boolean executar(Aluno aluno) {

        for (Emprestimo emprestimoPorAluno : EmprestimoRepository.getInstance().getEmprestimosPorAluno(aluno)) {
            if(VerificarExistenciaDeMulta.verificar(emprestimoPorAluno)){
                return true;
            }
        }
        return false;


//        List<Emprestimo> emprestimosCadastrados = EmprestimoRepository.getInstance().getEmprestimosCadastrados();
//        for (Emprestimo emprestimoCadastrado : emprestimosCadastrados) {
//            if (emprestimoCadastrado.getAluno().equals(aluno)) {
//                boolean temMulta = VerificarExistenciaDeMulta.verificar(emprestimoCadastrado);
//                if (temMulta) {
//                    return true;  //VERIFICAR SE DE FATO ATRIBUI O VALOR A VARIAVEL
//                }
//            }
//        }
//        return false;
    }
}
