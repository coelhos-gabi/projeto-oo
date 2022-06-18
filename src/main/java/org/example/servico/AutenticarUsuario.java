package org.example.servico;

import org.example.dominios.Aluno;
import org.example.dominios.Bibliotecario;
import org.example.dominios.User;
import org.example.repository.AlunosRepository;
import java.util.ArrayList;


public class AutenticarUsuario {
    public static boolean executar(String senha, User user) {

        Aluno aluno;
        Bibliotecario bibliotecario;

        if (user instanceof Aluno) {
            aluno = (Aluno) user;
            ArrayList<Aluno> alunosCadastrados = AlunosRepository.getInstance().getAlunosCadastrados();
            for (Aluno alunoCadastrado : alunosCadastrados) {
                if (alunoCadastrado.equals(aluno)) {
                    if (alunoCadastrado.getSenha().equals(senha)){
                        return true;
                    }
                }
            }
        }
//        if (user instanceof Bibliotecario) {
//            bibliotecario = (Bibliotecario) user;
//            ArrayList<Bibliotecario> bibliotecariosCadastrados = Bibliotecario.getInstance().getAlunosCadastrados();
//            for (Aluno alunoCadastrado : alunosCadastrados) {
//                if (alunoCadastrado.equals(aluno)) {
//                    if (alunoCadastrado.getSenha().equals(senha)){
//                        return true;
//                    }
//                }
//            }
//        }
            return false;
    }
}
