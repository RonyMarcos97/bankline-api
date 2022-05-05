package com.rony.santander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rony.santander.bankline.api.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer>{
	

}
