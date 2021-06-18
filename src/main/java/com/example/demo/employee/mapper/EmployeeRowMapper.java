package com.example.demo.employee.mapper;

import com.example.demo.employee.model.Employee;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import static org.springframework.util.StringUtils.trimTrailingWhitespace;

public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();

        employee.setId(rs.getInt("id"));
        employee.setName(trimTrailingWhitespace(rs.getString("name")));
        employee.setEmail(trimTrailingWhitespace(rs.getString("email")));
        employee.setPositionJob(trimTrailingWhitespace(rs.getString("position_job")));
        employee.setSalary(rs.getFloat("salary"));

        return employee;
    }
}
