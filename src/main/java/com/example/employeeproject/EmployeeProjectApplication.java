package com.example.employeeproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class EmployeeProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(EmployeeProjectApplication.class, args);
        System.out.println("Hello");
    }
}
