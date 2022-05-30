package org.example.dominios;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aluno {
    private final String nome;
    private final String matricula;
    private ArrayList<Livro> livrosEmprestados = new ArrayList<>();
    private final TipoAluno tipoAluno;
    private ArrayList<LocalDate> dataEmprestimo = new ArrayList<>();
    private boolean possuiMulta;

    public Aluno(String nome, String matricula, TipoAluno tipoAluno) {
        this.nome = nome;
        this.matricula = matricula;
        this.tipoAluno = tipoAluno;
        this.possuiMulta = false;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public TipoAluno getTipoAluno() {
        return tipoAluno;
    }

    public String getTituloDosLivrosEmprestados() {
        StringBuilder nomeLivros = new StringBuilder();
        for (Livro livros : livrosEmprestados) {
            nomeLivros.append(livros.getTitulo()).append("\n") ;
        }
        return "\n" + nomeLivros;
    }
    public int alunoPossuiLivro(String isbn){
        for (Livro livros : livrosEmprestados){
            if (livros.getIsbn().equals(isbn)) {
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
        return "Nome:'" + nome + '\'' +
                "\n Matricula:'" + matricula + '\'' +
                "\n tipoAluno:" + tipoAluno.getDESCRICAO() +
                "\n Livros emprestados: \n" + getTituloDosLivrosEmprestados() +
                '}';
    }

    public boolean getPossuiMulta() {
        return possuiMulta;
    }

    public void setPossuiMulta() {
        this.possuiMulta = !this.possuiMulta;
    }
}
