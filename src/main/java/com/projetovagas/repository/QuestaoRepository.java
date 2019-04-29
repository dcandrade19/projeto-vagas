package com.projetovagas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetovagas.entity.Questao;

@Repository
public interface QuestaoRepository extends JpaRepository<Questao, String>{

}