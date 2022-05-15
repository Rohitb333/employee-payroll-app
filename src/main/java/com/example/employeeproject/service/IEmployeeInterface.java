package com.example.employeeproject.service;

import com.example.employeeproject.module.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeInterface extends JpaRepository<Employee,Integer> {
}
