package org.example;

public enum TipoAluno {
    GR("Graduação", 4),
    MS("Mestrado", 6),
    DT("Doutorado", 9);

    final String DESCRICAO;
    final int MAXLIVROS;

    TipoAluno(String descricao, int maxLivros) {
        this.DESCRICAO = descricao;
        this.MAXLIVROS = maxLivros;
    }
}
