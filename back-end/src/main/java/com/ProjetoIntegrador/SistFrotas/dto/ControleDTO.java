package com.ProjetoIntegrador.SistFrotas.dto;

import com.ProjetoIntegrador.SistFrotas.entities.Carro;
import com.ProjetoIntegrador.SistFrotas.entities.Funcionario;

public class ControleDTO {

    private Integer id;
    private Carro carro;
    private Funcionario funcionario;
    private Integer kmInicial;
    private Integer kmFinal;
    private Integer kmTotal;
    private String observacao;

    public ControleDTO() {
    }

    public ControleDTO(Integer id, Carro carro, Funcionario funcionario, Integer kmInicial, Integer kmFinal, Integer kmTotal, String observacao) {
        this.id = id;
        this.carro = carro;
        this.funcionario = funcionario;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.kmTotal = kmTotal;
        this.observacao = observacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
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

    public Integer getKmTotal() {
        return kmTotal;
    }

    public void setKmTotal(Integer kmTotal) {
        this.kmTotal = kmTotal;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
