package com.example.demo.repository;

import com.example.demo.employee.mapper.EmployeeRowMapper;
import com.example.demo.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Employee> findAllEmployee() {
        String sql = "select id, name, email, position_job, salary from employee";

        try {
            return jdbcTemplate.query(sql, new EmployeeRowMapper());

        } catch (Exception ex) {
            throw ex;
        }
    }

    public Employee findEmployeeById(int id) {
        String sql = "select id, name, email, position_job, salary from employee where id = ?";
        Object[] args = new Object[]{id};
        try {
            return jdbcTemplate.queryForObject(sql, args, new EmployeeRowMapper());
        } catch (Exception ex) {
            throw ex;
        }
    }

    public int findEmail(String email) {
        String sql = "select count(*) from employee where email = ?";
        Object[] args = new Object[]{
                email
        };
        try {
            return jdbcTemplate.queryForObject(sql, args, Integer.class);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public int addEmployee(Employee employee) {
        String sql = "insert into employee(name , email, position_job, salary) values (?, ?, ?, ?)";
        Object[] args = new Object[]{
                employee.getName(),
                employee.getEmail(),
                employee.getPositionJob(),
                employee.getSalary()
        };
        try {
            return jdbcTemplate.update(sql, args);
        } catch (Exception ex) {
            throw ex;
        }
    }
}
