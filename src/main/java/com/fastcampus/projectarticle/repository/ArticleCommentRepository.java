package com.fastcampus.projectarticle.repository;

import com.fastcampus.projectarticle.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}