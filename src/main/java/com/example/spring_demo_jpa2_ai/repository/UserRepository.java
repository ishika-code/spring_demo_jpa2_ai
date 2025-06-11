package com.example.spring_demo_jpa2_ai.repository;

import com.example.spring_demo_jpa2_ai.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByActiveTrue();
}