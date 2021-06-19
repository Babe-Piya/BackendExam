package com.example.demo.employee.security.repository;

import com.example.demo.employee.security.mapper.UserRowMapper;
import com.example.demo.employee.security.model.AuthenticationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public AuthenticationRequest getUsernamePass(String username) {
        String sql = "select username, password from user where username = ?";
        Object[] args = new Object[]{username};
        try {
            return jdbcTemplate.queryForObject(sql, new UserRowMapper(), args);
        } catch (Exception ex) {
            throw ex;
        }
    }
}
