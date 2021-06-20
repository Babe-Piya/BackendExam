package com.example.demo.employee.repository;

import com.example.demo.config.DataSourceConfiguration;
import com.example.demo.employee.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeRepositoryTest {

    private final EmployeeRepository employeeRepository;

    public EmployeeRepositoryTest() {
        JdbcTemplate jdbcTemplate = DataSourceConfiguration.jdbcTemplate;
        this.employeeRepository = new EmployeeRepository(jdbcTemplate);
    }


    @Test
    void findAllEmployeeWhenSuccess() {
        List<Employee> employees = employeeRepository.findAllEmployee();
        Employee employee = employees.get(0);
        assertEquals(1, employee.getId());
        assertEquals("Jason UU", employee.getName());
        assertEquals("CEO", employee.getPositionJob());
        assertEquals("jason@gmail.com", employee.getEmail());
        assertEquals(100000.0, employee.getSalary());

    }

    @Test
    void findEmployeeByIdWhenSuccess() {
        Employee employee = employeeRepository.findEmployeeById(1);
        assertEquals(1, employee.getId());
        assertEquals("Jason UU", employee.getName());
        assertEquals("CEO", employee.getPositionJob());
        assertEquals("jason@gmail.com", employee.getEmail());
        assertEquals(100000.0, employee.getSalary());
    }

    @Test
    void findEmailWhenSuccess() {
        int employee = employeeRepository.findEmail("jason@gmail.com");
        assertEquals(1, employee);
    }

    @Test
    void addEmployeeWhenSuccess() {
        Employee employee = new Employee();

        employee.setName("JJ Okacha");
        employee.setEmail("jjOkay@hahamail.com");
        employee.setPositionJob("ST");
        employee.setSalary(5000.00F);

        try {
            employeeRepository.addEmployee(employee);
        } catch (Exception ex) {
            fail(ex.getMessage());
        }

    }

    @Test
    void deleteEmployeeWhenSuccess() {
        int employee = employeeRepository.deleteEmployee(1);
        assertEquals(1,employee);
    }

    @Test
    void updateEmployeeWhenSuccess() {
        Employee employee = new Employee();

        employee.setName("Harry Kane");
        employee.setEmail("kany@hahamail.com");
        employee.setPositionJob("ST");
        employee.setSalary(50000.00F);

        int employeeUpdate = employeeRepository.updateEmployee(2,employee);
        assertEquals(1,employeeUpdate);
    }
}