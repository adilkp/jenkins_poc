package com.devops.jenkins.controllers;

import com.devops.jenkins.entities.Employee;
import com.devops.jenkins.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping
    //creating a user
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee employee1 = employeeService.saveEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(employee1);
    }


//    @GetMapping("/{userId}")
//    public ResponseEntity<User> getSingleUser(@PathVariable String userId) {
//        User user = userService.getUser(userId);
//        return  ResponseEntity.ok(user);
//
//    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> allEmployees = employeeService.getAllUsers();
        return ResponseEntity.ok(allEmployees);
    }

}
