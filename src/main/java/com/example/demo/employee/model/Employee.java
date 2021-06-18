package com.example.demo.employee.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
    //    @JsonProperty("id")
    private int id;
    //    @JsonProperty("name")
    private String name;
    //    @JsonProperty("positionJob")
    private String positionJob;
    //    @JsonProperty("email")
    private String email;
    //    @JsonProperty("salary")
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
