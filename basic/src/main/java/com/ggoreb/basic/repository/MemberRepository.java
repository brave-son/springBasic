package com.ggoreb.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ggoreb.basic.model.Member;
 
// DDD - Domain Driven Development
public interface MemberRepository 
    extends JpaRepository<Member, Integer>{

	public Member findByNumAndName(int num, String name);
}





