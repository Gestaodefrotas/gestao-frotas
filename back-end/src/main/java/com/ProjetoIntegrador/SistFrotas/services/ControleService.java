package com.ProjetoIntegrador.SistFrotas.services;

import com.ProjetoIntegrador.SistFrotas.entities.Controle;
import com.ProjetoIntegrador.SistFrotas.repositories.CarroRepository;
import com.ProjetoIntegrador.SistFrotas.repositories.ControleRepository;
import com.ProjetoIntegrador.SistFrotas.repositories.FuncionarioRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ControleService {

    private final ControleRepository controleRepository;
    private final CarroRepository carroRepository;
    private final FuncionarioRepository funcionarioRepository;


    public ControleService(ControleRepository controleRepository, CarroRepository carroRepository, FuncionarioRepository funcionarioRepository) {
        this.controleRepository = controleRepository;
        this.carroRepository = carroRepository;
        this.funcionarioRepository = funcionarioRepository;
    }

    public Controle criarControle(String placa, String nomeFuncionario, Integer kmInicial, Integer kmFinal, String observacao) {
        Controle salvarControle = new Controle();

        salvarControle.setCarro(carroRepository.findByPlacaIgnoreCase(placa));
        salvarControle.setFuncionario(funcionarioRepository.findByNome(nomeFuncionario));

        salvarControle.setKmInicial(kmInicial);
        salvarControle.setKmFinal(kmFinal);
        salvarControle.setObservacao(observacao);
        salvarControle.setKmTotal(kmInicial, kmFinal);

        return controleRepository.save(salvarControle);

    }
}