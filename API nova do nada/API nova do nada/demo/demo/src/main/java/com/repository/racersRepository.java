package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.racers;

public interface racersRepository extends JpaRepository<racers, String> {

    List<racers> findbyTeam(String team);

    void deleteByNumber(Long number);
}
