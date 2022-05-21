package com.dio.santander.bancklineapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bancklineapi.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer>{

	 public List<Movimentacao>findByIdConta(Integer idConta);
}
