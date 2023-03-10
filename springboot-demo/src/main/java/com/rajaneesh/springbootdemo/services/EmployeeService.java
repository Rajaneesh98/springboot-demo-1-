package com.rajaneesh.springbootdemo.services;

import com.rajaneesh.springbootdemo.entities.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getEmployees();

    public Employee getEmployee(Integer id);

    public Employee addEmployee(Employee employee);
}
