package com.devops.jenkins.impl;
import com.devops.jenkins.entities.Employee;
import com.devops.jenkins.repositories.EmployeeRepository;
import com.devops.jenkins.services.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    private Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllUsers() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getUser(String userId) {
        return null;
    }
}
