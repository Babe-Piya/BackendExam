package com.example.demo.employee.security.repository;

import com.example.demo.config.DataSourceConfiguration;
import com.example.demo.employee.security.model.AuthenticationRequest;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    private final UserRepository userRepository;

    public UserRepositoryTest() {
        JdbcTemplate jdbcTemplate = DataSourceConfiguration.jdbcTemplate;
        this.userRepository = new UserRepository(jdbcTemplate);
    }


    @Test
    void getUsernamePassWhenSuccess() {
        AuthenticationRequest authenticationRequest = userRepository.getUsernamePass("itzy");
        assertEquals("itzy", authenticationRequest.getUsername());
        assertEquals("notshy", authenticationRequest.getPassword());


    }
}