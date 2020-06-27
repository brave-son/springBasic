package com.ggoreb.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ggoreb.basic.model.Dept;
 
public interface DeptRepository 
    extends JpaRepository<Dept, Integer>{

}
