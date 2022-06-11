package org.example.dominios;

public class Aluno extends User implements IUsuarioAutenticacao {

    private final TipoAluno tipoAluno;

    public Aluno(String nome, String id, TipoAluno tipoAluno, String senha) {
        super(nome, id, senha);
        this.tipoAluno = tipoAluno;
    }

    public TipoAluno getTipoAluno() {
        return tipoAluno;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String id, String senha) {
        return true;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nMatricula: " + id +
                "\nTipo Aluno: " + tipoAluno.getDescricao() +
                "\nSenha: " + senha;
    }
}























    /*
    private final TipoAluno tipoAluno;
    private ArrayList<Livro> livrosEmprestados = new ArrayList<>();
    private ArrayList<LocalDate> dataEmprestimo = new ArrayList<>();
    private boolean possuiMulta;

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
            nomeLivros.append(livros.getTitulo()).append("\n");
        }
        return nomeLivros;
    }

    public int alunoPossuiLivro(String isbn) {
        for (Livro livros : livrosEmprestados) {
            if (livros.getId().equals(isbn)) {
                return livrosEmprestados.indexOf(livros);
            }
        }
        return -1;
    }

    public int getQuantidadeLivrosEmprestados() {
        return this.livrosEmprestados.size();
    }

    public void adicionarLivro(Livro livro) {
        this.livrosEmprestados.add(livro);
        this.dataEmprestimo.add(LocalDate.now());
    }

    public void removerLivro(int posicao) {
        this.livrosEmprestados.remove(posicao);
        this.dataEmprestimo.remove(posicao);
    }

    public LocalDate getDataEmprestimo(int indice) {
        return dataEmprestimo.get(indice);
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nMatricula: " + id +
                "\nTipo Aluno: " + tipoAluno.getDescricao() +
                "\nLivros emprestados: \n" + " " + getTituloDosLivrosEmprestados();
    }
}*/