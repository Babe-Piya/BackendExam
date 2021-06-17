package com.example.demo.employee.model;

public class Employee {
    private int id;
    private String name;
    private String positionJob;
    private String email;
    private float salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPositionJob() {
        return positionJob;
    }

    public void setPositionJob(String positionJob) {
        this.positionJob = positionJob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
