package com.ggoreb.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ggoreb.basic.model.Tree;

// DDD - Domain Driven Development
public interface TreeRepository extends JpaRepository<Tree, Long>{

}
