package com.ProjetoIntegrador.SistFrotas.dto;

public class CriarControleDTO {

    private String placa;
    private String nomeFuncionario;
    private Integer kmInicial;
    private Integer kmFinal;
    private String observacao;

    public CriarControleDTO() {
    }

    public CriarControleDTO(String placa, String nomeFuncionario, Integer kmInicial, Integer kmFinal, String observacao) {
        this.placa = placa;
        this.nomeFuncionario = nomeFuncionario;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.observacao = observacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Integer getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(Integer kmInicial) {
        this.kmInicial = kmInicial;
    }

    public Integer getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(Integer kmFinal) {
        this.kmFinal = kmFinal;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
