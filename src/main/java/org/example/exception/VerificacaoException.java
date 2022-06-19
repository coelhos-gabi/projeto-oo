package org.example.exception;

public class VerificacaoException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public VerificacaoException(String mensagem) {
        super(mensagem);
    }

}
