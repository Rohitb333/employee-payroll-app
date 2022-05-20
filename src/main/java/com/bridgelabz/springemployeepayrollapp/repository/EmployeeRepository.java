package com.bridgelabz.springemployeepayrollapp.repository;

import com.bridgelabz.springemployeepayrollapp.module.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
