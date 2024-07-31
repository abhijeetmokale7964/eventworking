//package com.rsl.event.controller;
//
//import com.rsl.event.util.JwtUtil;
//
//import jakarta.servlet.http.HttpServletResponse;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//
//
//@RestController
//@RequestMapping("/auth")
//public class AuthController {
//
//    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
//
//    @Autowired
//    private JwtUtil jwtUtil;
//
//    @PostMapping("/login")
//    public void login(@RequestParam String username, @RequestParam String password, HttpServletResponse response) {
//        logger.trace("Attempting to authenticate user with username: {}", username);
//        // Authenticate user (authentication logic to be implemented)
//        // For now, assume successful authentication
//        String token = jwtUtil.generateToken(username);
//        response.setHeader("Authorization", "Bearer " + token);
//        logger.info("JWT token generated for user: {}", username);
//    }
//}
