package com.example.demo.employee.service;

import com.example.demo.employee.model.Employee;
import com.example.demo.employee.model.ReturnList;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public ReturnList getAllEmployee() {
        ReturnList returnList = new ReturnList();
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Osward e. sdfsadf");
        employee.setEmail("e@gmail.com");
        employee.setPositionJob("CEO");
        employee.setSalary(2000);

        returnList.setData(employee);
        return returnList;
    }
}
