package com.fastcampus.projectarticle.repository;

import com.fastcampus.projectarticle.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}