package com.example.demo.employee.controller;

import com.example.demo.employee.model.Employee;
import com.example.demo.employee.model.ReturnList;
import com.example.demo.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/list")
    public ReturnList getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping
    public Employee getEmployeeById(
            @RequestParam(name = "id") int id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }
}
