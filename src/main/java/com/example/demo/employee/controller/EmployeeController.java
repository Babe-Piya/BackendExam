package com.example.demo.employee.controller;

import com.example.demo.employee.model.Employee;
import com.example.demo.employee.model.ReturnList;
import com.example.demo.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path = "/{id}")
    public Employee getEmployeeById(
            @PathVariable("id") int id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public void addEmployee(
            @RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delEmployeeById(
            @PathVariable("id") int id) {
        employeeService.deleteEmployeeById(id);
    }

    @PutMapping(path = "/update/{id}")
    public void updateEmployee(
            @PathVariable("id") int id,
            @RequestBody Employee employee) {
        employeeService.updateEmployee(id,employee);
    }
}
