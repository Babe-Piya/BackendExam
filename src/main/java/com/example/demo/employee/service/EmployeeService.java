package com.example.demo.employee.service;

import com.example.demo.employee.model.Employee;
import com.example.demo.employee.model.ReturnList;
import com.example.demo.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public ReturnList getAllEmployee() {
        ReturnList returnList = new ReturnList();
        List<Employee> employee = employeeRepository.findAllEmployee();

        returnList.setSize(employee.size());
        returnList.setData(employee);
        return returnList;
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.findEmployeeById(id);
    }

    @Transactional
    public void addEmployee(Employee employee) {
        if (employeeRepository.findEmail(employee.getEmail()) > 0) {
            throw new IllegalStateException("Email used");
        }
        employeeRepository.addEmployee(employee);
    }

    public void deleteEmployeeById(int id) {
        if (employeeRepository.deleteEmployee(id) == 0) {
            throw new IllegalStateException("Can't delete because not found data of this Id");
        }
    }

    @Transactional
    public void updateEmployee(int id, Employee employee) {
        Employee employeeEmail = employeeRepository.findEmployeeById(id);
        if (!employeeEmail.getEmail().equals(employee.getEmail()) && employeeRepository.findEmail(employee.getEmail()) > 0) {
            throw new IllegalStateException("Email used");
        }
        if (employeeRepository.updateEmployee(id, employee) == 0) {
            throw new IllegalStateException("Can't update because not found data of this Id");
        }
    }
}
