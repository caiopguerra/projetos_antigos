package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.teams;

public interface temasRepository extends JpaRepository<teams, Long>{
    
    teams findbyName(String name);
     
}
