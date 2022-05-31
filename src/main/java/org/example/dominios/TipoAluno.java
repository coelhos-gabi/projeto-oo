package org.example.dominios;

public enum TipoAluno {
    GR("Graduação", 4, 1),
    MS("Mestrado", 6, 2),
    DT("Doutorado", 9, 3);
    //mudar atributos
    private final String descricao;
    private final int maxLivros;
    private final int code;

    TipoAluno(String descricao, int maxLivros, int code) {
        this.descricao = descricao;
        this.maxLivros = maxLivros;
        this.code = code;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCode() {
        return code;
    }

    public static TipoAluno valueOfCode(int opcao) {
        for(TipoAluno tipoAluno : TipoAluno.values()){
            if(tipoAluno.getCode() == opcao){
                return tipoAluno;
            }
        }
        return null;
    }

    public int getMaxLivros() {
        return maxLivros;
    }
}
