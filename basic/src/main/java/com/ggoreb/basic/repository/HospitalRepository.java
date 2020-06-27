package com.ggoreb.basic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ggoreb.basic.model.Hospital;
 
public interface HospitalRepository 
    extends JpaRepository<Hospital, Integer>{
	
	public Hospital findByName(String name);
	
	public List<Hospital> findAllByAddressContainingOrderByIdDesc(String address);
}









