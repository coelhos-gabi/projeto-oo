package org.example.dominios;

import org.example.repository.AlunosRepository;
import org.example.repository.LivroRepository;

public class Init {
    public static void executar(){
        Livro livro1 = new Livro("Livro1", "autor1", "001");
        Livro livro2 = new Livro("Livro2", "autor2", "002");
        Livro livro3 = new Livro("Livro3", "autor3", "003");
        Livro livro4 = new Livro("Livro4", "autor4", "004");
        Livro livro5 = new Livro("Livro5", "autor5", "005");
        Livro livro6 = new Livro("Livro6", "autor6", "006");
        Livro livro7 = new Livro("Livro7", "autor7", "007");
        Livro livro8 = new Livro("Livro8", "autor8", "008");
        Livro livro9 = new Livro("Livro9", "autor9", "009");
        Livro livro10 = new Livro("Livro10", "autor10", "010");
        Livro livro11 = new Livro("Livro11", "autor11", "011");
        LivroRepository.cadastrarLivro(livro1);
        LivroRepository.cadastrarLivro(livro2);
        LivroRepository.cadastrarLivro(livro3);
        LivroRepository.cadastrarLivro(livro4);
        LivroRepository.cadastrarLivro(livro5);
        LivroRepository.cadastrarLivro(livro6);
        LivroRepository.cadastrarLivro(livro7);

        Aluno aluno1 = new Aluno("aluno1","12345", TipoAluno.GR);
        Aluno aluno2 = new Aluno("aluno2","23456", TipoAluno.MS);
        Aluno aluno3 = new Aluno("aluno3","34567", TipoAluno.DT);
        AlunosRepository.cadastrarAluno(aluno1);
        AlunosRepository.cadastrarAluno(aluno2);
        AlunosRepository.cadastrarAluno(aluno3);
    }
}
