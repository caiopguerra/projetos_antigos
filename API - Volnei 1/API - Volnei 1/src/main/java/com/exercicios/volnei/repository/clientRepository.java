package com.exercicios.volnei.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicios.volnei.model.Client;



public interface clientRepository extends JpaRepository<Client, Long>{

}



