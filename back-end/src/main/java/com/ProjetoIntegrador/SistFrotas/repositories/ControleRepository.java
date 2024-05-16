package com.ProjetoIntegrador.SistFrotas.repositories;

import com.ProjetoIntegrador.SistFrotas.entities.Controle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControleRepository extends JpaRepository<Controle, Integer> {
}
