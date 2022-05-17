package com.bridgelabz.springemployeepayrollapp.repository;

import com.bridgelabz.springemployeepayrollapp.module.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
