package com.ggoreb.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ggoreb.basic.model.Article;
 
public interface ArticleRepository 
    extends JpaRepository<Article, Long>{

}
