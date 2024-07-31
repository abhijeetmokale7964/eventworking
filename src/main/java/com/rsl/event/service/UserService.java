package com.rsl.event.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsl.event.dao.UserRepository;
import com.rsl.event.entity.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    // Get all users
    public List<User> getAllUserList() {
        logger.trace("Entering getAllUserList method.");
        List<User> list = userRepository.findAll();
        logger.info("Found {} users.", list.size());
        return list;
    }

    // Get user by email and password
    public User getUserByEmailAndPassword(String email, String password) {
        logger.trace("Entering getUserByEmailAndPassword method with email: {}", email);
        User user = null;
        try {
            user = userRepository.findByEmailAndPassword(email, password);
            if (user != null) {
                logger.info("User found with email: {}", email);
            } else {
                logger.warn("User not found with email: {}", email);
            }
        } catch (Exception e) {
            logger.error("Error finding user with email: {}: {}", email, e.getMessage(), e);
        }
        return user;
    }

    // Add a new user
    public User addUser(User user) {
        logger.trace("Entering addUser method with user: {}", user);
        User savedUser = userRepository.save(user);
        logger.info("User added successfully...");
        return savedUser;
    }

    // Delete user by id
    public void deleteUser(int id) {
        logger.trace("Entering deleteUser method with ID: {}", id);
        userRepository.deleteById(id);
        logger.info("User deleted successfully with ID: {}", id);
    }

    // Update user by id
    public void updateUser(User user, int id) {
        logger.trace("Entering updateUser method with ID: {}", id);
        user.setId(id);
        userRepository.save(user);
        logger.info("User updated successfully with ID: {}", id);
    }
}
