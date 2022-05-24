package org.example;


import org.example.dominios.Aluno;
import org.example.dominios.Livro;
import org.example.dominios.TipoAluno;
import org.example.repository.AlunosRepository;
import org.example.repository.LivroRepository;


public class App{
    public static void main( String[] args ){

        Livro livro1 = new Livro("Livro1", "autor1", "001",1);
        Livro livro2 = new Livro("Livro2", "autor2", "002",1);
        Livro livro3 = new Livro("Livro3", "autor3", "003",1);
        Livro livro4 = new Livro("Livro4", "autor4", "004",1);
        Livro livro5 = new Livro("Livro5", "autor5", "005",1);
        Livro livro6 = new Livro("Livro6", "autor6", "006",1);
        Livro livro7 = new Livro("Livro7", "autor7", "007",1);
        LivroRepository.gravarLivroRepositorio(livro1);
        LivroRepository.gravarLivroRepositorio(livro2);
        LivroRepository.gravarLivroRepositorio(livro3);
        LivroRepository.gravarLivroRepositorio(livro4);
        LivroRepository.gravarLivroRepositorio(livro5);
        LivroRepository.gravarLivroRepositorio(livro6);
        LivroRepository.gravarLivroRepositorio(livro7);


        Aluno aluno1 = new Aluno("aluno1","12345", TipoAluno.GR);
        Aluno aluno2 = new Aluno("aluno2","23456", TipoAluno.MS);
        Aluno aluno3 = new Aluno("aluno3","34567", TipoAluno.DT);
        AlunosRepository.gravarAlunoRepositorio(aluno1);
        AlunosRepository.gravarAlunoRepositorio(aluno2);
        AlunosRepository.gravarAlunoRepositorio(aluno3);

//        Emprestimo.emprestar(livro1, aluno1);
//        Emprestimo.emprestar(livro2, aluno1);
//        Emprestimo.emprestar(livro3, aluno1);
//        Emprestimo.emprestar(livro4, aluno1);
//        Emprestimo.emprestar(livro5, aluno1);


    }

}
