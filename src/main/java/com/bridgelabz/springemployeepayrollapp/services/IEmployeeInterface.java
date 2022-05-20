package com.bridgelabz.springemployeepayrollapp.services;

import com.bridgelabz.springemployeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.springemployeepayrollapp.module.Employee;

import java.util.List;

public interface IEmployeeInterface {
    String removeById(int id);

    String editById(int id, EmployeeDTO employee);

    List<Employee> searchAll();

    Employee searchById(int id);

    Employee addEmployee(Employee employee);
}
