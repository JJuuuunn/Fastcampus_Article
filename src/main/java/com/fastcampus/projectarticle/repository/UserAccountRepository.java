package com.fastcampus.projectarticle.repository;

import com.fastcampus.projectarticle.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}
