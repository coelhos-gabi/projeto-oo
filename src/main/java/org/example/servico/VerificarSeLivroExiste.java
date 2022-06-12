package org.example.servico;

import org.example.dominios.Livro;
import org.example.repository.LivroRepository;

public class VerificarSeLivroExiste {

    public static boolean verificarSeLivroExiste(String idLivro) {
        Livro livro = null;

        livro = LivroRepository.getInstance().read(idLivro);

        if (livro == null) {
            System.out.println("Dados inválidos");
            System.out.println("Verifique o ISBN do livro");
            return false;
        }
        return true;

    }

}

