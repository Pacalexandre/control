package br.com.control.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.control.api.entity.Abastecimento;

@Repository
public interface AbastecimentoRepo extends JpaRepository<Abastecimento, Integer> {

}
