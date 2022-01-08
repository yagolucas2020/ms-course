package com.trabalhador.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trabalhador.hrworker.entities.worker;


public interface WorkerRepository extends JpaRepository<worker, Long> {

}
