package com.ProjetoIntegrador.SistFrotas.repositories;

import com.ProjetoIntegrador.SistFrotas.entities.Carro;
import com.ProjetoIntegrador.SistFrotas.entities.Controle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer> {
    Carro findByPlacaIgnoreCase(String placa);

}
