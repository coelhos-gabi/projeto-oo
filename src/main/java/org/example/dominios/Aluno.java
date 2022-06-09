package org.example.dominios;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aluno extends User implements IUsuarioAutenticacao {

    private ArrayList<Livro> livrosEmprestados = new ArrayList<>();
    private ArrayList<LocalDate> dataEmprestimo = new ArrayList<>();
    private final TipoAluno tipoAluno;
    private boolean possuiMulta;
    private String senha;

    public Aluno(String nome, String id, TipoAluno tipoAluno, String senha) {
        super(nome, id, senha);
        this.tipoAluno = tipoAluno;
    }


    public TipoAluno getTipoAluno() {
        return tipoAluno;
    }
    public boolean getPossuiMulta() {
        return possuiMulta;
    }
    public void setPossuiMulta() {
        this.possuiMulta = !this.possuiMulta;
    }

    public StringBuilder getTituloDosLivrosEmprestados() {
        StringBuilder nomeLivros = new StringBuilder();
        for (Livro livros : livrosEmprestados) {
            nomeLivros.append(livros.getTitulo()).append("\n") ;
        }
        return nomeLivros;
    }
    public int alunoPossuiLivro(String isbn){
        for (Livro livros : livrosEmprestados){
            if (livros.getId().equals(isbn)) {
                return livrosEmprestados.indexOf(livros);
            }
        }
        return -1;
    }

    public int getQuantidadeLivrosEmprestados() {
        return this.livrosEmprestados.size();
    }
    public void adicionarLivro(Livro livro){
        this.livrosEmprestados.add(livro);
        this.dataEmprestimo.add(LocalDate.now());
    }

    public void removerLivro(int posicao){
        this.livrosEmprestados.remove(posicao);
        this.dataEmprestimo.remove(posicao);
    }
    public LocalDate getDataEmprestimo(int indice){
        return dataEmprestimo.get(indice);
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nMatricula: " + id +
                "\nTipo Aluno: " + tipoAluno.getDescricao() +
                "\nLivros emprestados: \n" + " " + getTituloDosLivrosEmprestados();
    }
}
