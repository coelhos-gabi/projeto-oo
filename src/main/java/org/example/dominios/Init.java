package org.example.dominios;

import org.example.repository.AlunosRepository;
import org.example.repository.LivroRepository;

public class Init {
    public static void executar(){
        Livro livro1 = new Livro("Livro1", "autor1", "001",4);
        Livro livro2 = new Livro("Livro2", "autor2", "002",1);
        Livro livro3 = new Livro("Livro3", "autor3", "003",1);
        Livro livro4 = new Livro("Livro4", "autor4", "004",1);
        Livro livro5 = new Livro("Livro5", "autor5", "005",1);
        Livro livro6 = new Livro("Livro6", "autor6", "006",1);
        Livro livro7 = new Livro("Livro7", "autor7", "007",1);
        Livro livro8 = new Livro("Livro8", "autor8", "008",1);
        Livro livro9 = new Livro("Livro9", "autor9", "009",1);
        Livro livro10 = new Livro("Livro10", "autor10", "010",1);
        Livro livro11 = new Livro("Livro11", "autor11", "011",1);
        LivroRepository.gravarLivroRepositorio(livro1);
        LivroRepository.gravarLivroRepositorio(livro2);
        LivroRepository.gravarLivroRepositorio(livro3);
        LivroRepository.gravarLivroRepositorio(livro4);
        LivroRepository.gravarLivroRepositorio(livro5);
        LivroRepository.gravarLivroRepositorio(livro6);
        LivroRepository.gravarLivroRepositorio(livro7);
        LivroRepository.gravarLivroRepositorio(livro8);
        LivroRepository.gravarLivroRepositorio(livro9);
        LivroRepository.gravarLivroRepositorio(livro10);
        LivroRepository.gravarLivroRepositorio(livro11);


//        for (Livro livrosCadastrado : LivroRepository.livrosCadastrados) {
//            System.out.println(livrosCadastrado.getTitulo());
//        }

        Aluno aluno1 = new Aluno("aluno1","12345", TipoAluno.GR);
        Aluno aluno2 = new Aluno("aluno2","23456", TipoAluno.MS);
        Aluno aluno3 = new Aluno("aluno3","34567", TipoAluno.DT);
        AlunosRepository.gravarAlunoRepositorio(aluno1);
        AlunosRepository.gravarAlunoRepositorio(aluno2);
        AlunosRepository.gravarAlunoRepositorio(aluno3);
    }
}
