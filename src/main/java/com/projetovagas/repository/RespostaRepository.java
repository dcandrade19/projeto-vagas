package com.projetovagas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetovagas.entity.Resposta;

@Repository
public interface RespostaRepository extends JpaRepository<Resposta, String>{

}