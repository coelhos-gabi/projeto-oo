package org.example.dominios;

import org.example.repository.AlunosRepository;
import org.example.repository.LivroRepository;
import org.example.repository.UserRepository;

public class Init {
    public static void executar() {
        Livro livro1 = new Livro("Livro1", "autor1", "001", 4);
        Livro livro2 = new Livro("Livro2", "autor2", "002", 1);
        Livro livro3 = new Livro("Livro3", "autor3", "003", 1);
        Livro livro4 = new Livro("Livro4", "autor4", "004", 1);
        Livro livro5 = new Livro("Livro5", "autor5", "005", 1);
        Livro livro6 = new Livro("Livro6", "autor6", "006", 1);
        Livro livro7 = new Livro("Livro7", "autor7", "007", 1);
        Livro livro8 = new Livro("Livro8", "autor8", "008", 1);
        Livro livro9 = new Livro("Livro9", "autor9", "009", 1);
        Livro livro10 = new Livro("Livro10", "autor10", "010", 1);
        Livro livro11 = new Livro("Livro11", "autor11", "011", 1);
        LivroRepository.getInstance().save(livro1);
        LivroRepository.getInstance().save(livro2);
        LivroRepository.getInstance().save(livro3);
        LivroRepository.getInstance().save(livro4);
        LivroRepository.getInstance().save(livro5);
        LivroRepository.getInstance().save(livro6);
        LivroRepository.getInstance().save(livro7);
        LivroRepository.getInstance().save(livro8);
        LivroRepository.getInstance().save(livro9);
        LivroRepository.getInstance().save(livro10);
        LivroRepository.getInstance().save(livro11);

        User aluno1 = new Aluno("aluno1", "12345", TipoAluno.GR, "123");
        User aluno2 = new Aluno("aluno2", "23456", TipoAluno.MS, "123");
        User aluno3 = new Aluno("aluno3", "34567", TipoAluno.DT, "123");

        User bibliotecario1 = new Bibliotecario("biblio1", "1", "123");
        User bibliotecario2 = new Bibliotecario("biblio2", "2", "123");
        User bibliotecario3 = new Bibliotecario("biblio3", "3", "123");

        AlunosRepository.getInstance().save((Aluno) aluno1);
        AlunosRepository.getInstance().save((Aluno) aluno2);
        AlunosRepository.getInstance().save((Aluno) aluno3);

        UserRepository.getInstance().save(aluno1);
        UserRepository.getInstance().save(aluno2);
        UserRepository.getInstance().save(aluno3);
        UserRepository.getInstance().save(bibliotecario1);
        UserRepository.getInstance().save(bibliotecario2);
        UserRepository.getInstance().save(bibliotecario3);
    }
}
