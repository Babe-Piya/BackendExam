package com.example.demo.employee.security.mapper;

import com.example.demo.employee.security.model.AuthenticationRequest;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.springframework.util.StringUtils.trimTrailingWhitespace;

public class UserRowMapper implements RowMapper<AuthenticationRequest> {

    @Override
    public AuthenticationRequest mapRow(ResultSet rs, int rowNum) throws SQLException {
        AuthenticationRequest authenticationRequest = new AuthenticationRequest();

        authenticationRequest.setUsername(trimTrailingWhitespace(rs.getString("username")));
        authenticationRequest.setPassword(trimTrailingWhitespace(rs.getString("password")));

        return authenticationRequest;
    }
}
