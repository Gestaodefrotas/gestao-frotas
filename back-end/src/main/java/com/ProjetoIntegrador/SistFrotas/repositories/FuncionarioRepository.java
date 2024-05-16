package com.ProjetoIntegrador.SistFrotas.repositories;

import com.ProjetoIntegrador.SistFrotas.entities.Carro;
import com.ProjetoIntegrador.SistFrotas.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

    Funcionario findByNome(String placa);
}
