package org.example.dominios;

public enum TipoAluno {
    GR("Graduação", 2, 1),
    MS("Mestrado", 6, 2),
    DT("Doutorado", 9, 3);

    private final String DESCRICAO;
    private final int MAXLIVROS;
    private final int CODE;

    TipoAluno(String descricao, int maxLivros, int code) {
        this.DESCRICAO = descricao;
        this.MAXLIVROS = maxLivros;
        this.CODE = code;
    }

    public String getDESCRICAO() {
        return DESCRICAO;
    }

    public int getCODE() {
        return CODE;
    }

    public static TipoAluno valueOfCode(int opcao) {
        for(TipoAluno tipoAluno : TipoAluno.values()){
            if(tipoAluno.getCODE() == opcao){
                return tipoAluno;
            }
        }
        return null;
    }

    public int getMAXLIVROS() {
        return MAXLIVROS;
    }
}
