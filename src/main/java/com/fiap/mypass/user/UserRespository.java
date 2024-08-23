package com.fiap.mypass.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRespository extends JpaRepository<User,Long> {
    Optional<User> findByName(String name);
}
