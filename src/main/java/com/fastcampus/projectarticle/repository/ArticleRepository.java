package com.fastcampus.projectarticle.repository;

import com.fastcampus.projectarticle.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface ArticleRepository extends JpaRepository<Article, Long> {
}