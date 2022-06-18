package org.example.dominios;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emprestimo implements Comparable<Emprestimo> {
    private Aluno aluno;
    private Livro livroEmprestado;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoReal = null;
    private String id;
    private boolean foiDevolvido = false;
    private BigDecimal multa = BigDecimal.valueOf(0);
    private long diasDeAtraso = 0;

    public Emprestimo(Aluno aluno, Livro livroEmprestado) {
        this.aluno = aluno;
        this.livroEmprestado = livroEmprestado;
        this.dataEmprestimo = LocalDate.now();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Livro getLivro() {
        return livroEmprestado;
    }

    public LocalDate getDataDevolucaoReal() {
        if(isFoiDevolvido().equals("Sim")){
            setDataDevolucaoReal(dataDevolucaoReal.plusDays(10));
            return dataDevolucaoReal.plusDays(10);
        } //SOMENTE PARA TESTAR A MULTA
        else{
            return null;
        }
    }

    public void setDataDevolucaoReal(LocalDate dataDevolucaoReal) {
        this.dataDevolucaoReal = dataDevolucaoReal;
    }

    public LocalDate getDataPrevista() {
        return this.dataEmprestimo.plusDays(7);
    }

    public String getId() {
        return id;
    }


    @Override
    public String toString() {
        return ("Aluno = " + aluno.getNome() + "\n" +
                " | Livro = " + livroEmprestado.getTitulo() + "\n" +
                " | Data do empréstimo = " + stringDataEmprestimo() + "\n" +
                " | Data prevista de devolução = " + stringDataPrevistaDevolucao() + "\n" +
                " | Livro foi devolvido? = " + isFoiDevolvido() + "\n" +
                " | Data em que foi devolvido = " + stringDataDevolucao() + "\n");

    }



    @Override
    public int compareTo(Emprestimo emprestimo) {
        return this.getAluno().getNome().compareTo(emprestimo.getAluno().getNome());
    }

    public String isFoiDevolvido() {
        return foiDevolvido ? "Sim":"Não";
    }

    public void setFoiDevolvido() {
        this.foiDevolvido = !foiDevolvido; //SETAR O CONTRÁRIO
    }

    private String stringDataDevolucao(){
        return foiDevolvido ? LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                : "Aguardando devolução ";

    }

    private String stringDataPrevistaDevolucao(){
      return getDataPrevista().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    private String stringDataEmprestimo(){
      return dataEmprestimo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public void setMulta(BigDecimal multa) {
        this.multa = multa;
    }

    public BigDecimal getMulta() {
        return multa;
    }

    public long getDiasDeAtraso() {
        return diasDeAtraso;
    }

    public void setDiasDeAtraso(long diasDeAtraso) {
        this.diasDeAtraso = diasDeAtraso;
    }
}