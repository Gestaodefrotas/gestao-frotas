package com.ProjetoIntegrador.SistFrotas.entities;

import jakarta.persistence.*;

@Entity
public class Controle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "carro_id")
    private Carro carro;
    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;
    private Integer kmInicial;
    private Integer kmFinal;
    private Integer kmTotal;
    private String observacao;

    public Controle() {
    }

    public Controle(Integer id, Carro carro, Funcionario funcionario, Integer kmInicial, Integer kmFinal, Integer kmTotal, String observacao) {
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

    public void setKmInicial(Integer kmInicial) {
        this.kmInicial = kmInicial;
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

    public Integer getKmInicial() {
        return kmInicial;
    }

    public Integer getKmFinal() {
        return kmFinal;
    }

    public void setKmTotal(Integer kmInicial, Integer kmFinal) {
        this.kmTotal = kmFinal - kmInicial;
    }

}
