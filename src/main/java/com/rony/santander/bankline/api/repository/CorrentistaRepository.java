package com.rony.santander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.rony.santander.bankline.api.model.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {

}
