package com.rsl.event.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rsl.event.entity.User;

// Repository interface for User entity
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // Method to find a user by email and password
    User findByEmailAndPassword(String email, String password);
}
