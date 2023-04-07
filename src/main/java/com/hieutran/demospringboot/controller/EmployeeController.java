package com.hieutran.demospringboot.controller;

import com.hieutran.demospringboot.model.Employee;
import com.hieutran.demospringboot.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    //Test
    @GetMapping("/")
    public String test(){
        return "hello";
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
    return employeeService.addEmployee(employee);
    }
}
