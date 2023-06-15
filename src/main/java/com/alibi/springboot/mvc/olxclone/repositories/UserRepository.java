package com.alibi.springboot.mvc.olxclone.repositories;

import com.alibi.springboot.mvc.olxclone.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
