package com.example.demo.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class DataSourceConfiguration {
    private static final HikariConfig config = new HikariConfig();

    public static final JdbcTemplate jdbcTemplate = new JdbcTemplate(mysqlDataSource());

    private static DataSource mysqlDataSource() {
        config.setJdbcUrl("jdbc:mysql://localhost:3306/employee");
        config.setUsername("root");
        config.setPassword("example");
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return new HikariDataSource(config);
    }
}
