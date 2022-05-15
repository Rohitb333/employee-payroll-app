package com.example.employeeproject.controller;

import com.example.employeeproject.module.Employee;
import com.example.employeeproject.service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServices employeeService;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Rohit";
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        Employee newEmployee = employeeService.addEmployee(employee);
        return newEmployee;
    }

    @GetMapping("/search/{id}")
    public Optional<Employee> searchById(@PathVariable int id) {
        Optional<Employee> response = employeeService.searchById(id);
        return response;
    }

    @GetMapping("/show")
    public List<Employee> searchAll() {
        List<Employee> response = employeeService.searchAll();
        return response;
    }

    @PutMapping("/edit/{id}")
    public Employee editById(@PathVariable int id, @RequestBody Employee employee) {
        Employee response = employeeService.editById(id, employee);
        return response;
    }

    @DeleteMapping("/remove/{id}")
    public String removeById(@PathVariable int id) {
        String response = employeeService.removeById(id);
        return response;
    }
}
