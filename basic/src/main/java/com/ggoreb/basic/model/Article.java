package com.ggoreb.basic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "article")
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;       
	String title;
	String content;
	String owner;
	int hit;
	String creDate; // cre_date
	
	@Column(name = "s_file_name", length = 1000)
	String sFileName; // s_file_name
	String oFileName;
}













