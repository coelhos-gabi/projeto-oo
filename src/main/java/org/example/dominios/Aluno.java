package org.example.dominios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Aluno {
    private final String nome;
    private final String matricula;
    private ArrayList<Livro> livrosEmprestados = new ArrayList<>();
    private final TipoAluno tipoAluno;
    private ArrayList<LocalDate> dataEmprestimo = new ArrayList<>();

    public Aluno(String nome, String matricula, TipoAluno tipoAluno) {
        this.nome = nome;
        this.matricula = matricula;
        this.tipoAluno = tipoAluno;
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
        for (Livro livrosEmprestado : livrosEmprestados) {
            nomeLivros.append(livrosEmprestado.getTitulo()).append("\n") ;
        }
        return "\n" + nomeLivros;
    }
    public int alunoJaPossuiLivro(String isbn){
        for (Livro livrosEmprestado : livrosEmprestados){
            if (livrosEmprestado.getIsbn().equals(isbn)) {
                return livrosEmprestados.indexOf(livrosEmprestado);
            }
        }
        return -1;
    }

    public int getQuantidadeLivrosEmprestados() {
//        if(Objects.isNull(livrosEmprestados)){
//            return 0;
//        }
        return this.livrosEmprestados.size();
    }
    public void adicionarLivro(Livro livro){
        this.livrosEmprestados.add(livro);
        this.dataEmprestimo.add(LocalDate.now());
    }

    public void removerLivro(Livro livro){
        this.livrosEmprestados.remove(livro);
    }
//    public String getDataEmprestimo() {
//        StringBuilder datas = new StringBuilder();
//        for (LocalDate localDate : dataEmprestimo) {
//            datas.append(localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))).append("\n");
//        }
//        return "\n" + datas;
//    }
    public LocalDate getDataEmprestimo(int indice){
        return dataEmprestimo.get(indice);
    }


}
