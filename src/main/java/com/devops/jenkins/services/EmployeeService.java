package com.devops.jenkins.services;

import com.devops.jenkins.entities.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee user);

    List<Employee> getAllUsers();

    Employee getUser(String userId);
}
