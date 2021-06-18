package com.example.demo.employee.service;

import com.example.demo.employee.model.Employee;
import com.example.demo.employee.model.ReturnList;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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

    public Employee getEmployeeById(int id){
        Employee employee = employeeRepository.findEmployeeById(id);
        return employee;
    }

    public void addEmployee(Employee employee) {
        if (employeeRepository.findEmail(employee.getEmail()) > 0) {
            throw new IllegalStateException("Email used");
        }
        employeeRepository.addEmployee(employee);
    }
}
