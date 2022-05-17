package com.bridgelabz.springemployeepayrollapp.controller;

import com.bridgelabz.springemployeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.springemployeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.springemployeepayrollapp.module.Employee;
import com.bridgelabz.springemployeepayrollapp.services.IEmployeeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    IEmployeeInterface iEmployeeInterface;

    @GetMapping("/hello")
    public String sayHello(){
        return "Welcome to employee payroll app";
    }

    @PostMapping("/add")
    public ResponseEntity<ResponseDTO> addEmployee(@RequestBody EmployeeDTO employeeDTO){
        Employee newEmployee = new Employee(employeeDTO);
        iEmployeeInterface.addEmployee(newEmployee);
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", iEmployeeInterface.addEmployee(newEmployee));
        return new ResponseEntity<>(responseDTO,HttpStatus.CREATED);
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<ResponseDTO> searchById(@PathVariable int id){

        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", iEmployeeInterface.searchById(id));
        return new ResponseEntity<>(responseDTO,HttpStatus.CREATED);
    }


    @GetMapping("/show")
    public ResponseEntity<ResponseDTO> searchAll(){
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", iEmployeeInterface.searchAll());
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }


    @PutMapping("/edit/{id}")
    public ResponseEntity<ResponseDTO> editById(@PathVariable int id, @RequestBody EmployeeDTO employeeDTO){
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", iEmployeeInterface.editById(id,employeeDTO));
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<ResponseDTO> removeById(@PathVariable int id) {
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", iEmployeeInterface.removeById(id));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}
