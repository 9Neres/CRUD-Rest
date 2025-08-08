package com.neres.projetodio.handlers;

public class CampoObrigatorioException extends BusinessException{

    public CampoObrigatorioException(String Campo){
        super("Campo obrigatório: ", Campo);
    }
}
