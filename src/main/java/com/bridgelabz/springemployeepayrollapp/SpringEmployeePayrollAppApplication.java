package com.bridgelabz.springemployeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringEmployeePayrollAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringEmployeePayrollAppApplication.class, args);
        System.out.println("Welcome To The Employee Payroll App");
        log.info("\n Logger Activate:");
    }

}
