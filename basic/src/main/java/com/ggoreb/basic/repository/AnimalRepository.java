package com.ggoreb.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ggoreb.basic.model.Animal;
 
// DDD - Domain Driven Development
public interface AnimalRepository 
    extends JpaRepository<Animal, Integer>{

}
