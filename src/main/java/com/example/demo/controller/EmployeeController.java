package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmpRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;


@RestController
@RequestMapping("/employee")
@Api(value = "Employe Service", description = "Employee data Services")
public class EmployeeController {

    @Autowired
    private EmpRepository emp;

    /*@PostMapping("/saveEmployee")
    @ApiOperation(value = "Store Employess API")
    public String saveEmployee(@RequestBody Employee employee){
        repository.save(employee);
        return "Employee saved.....";

    }*/

   /* @GetMapping("/getAllEmployees")
    @ApiOperation(value = "Get All Employees API")
    public Flux<Employee> getAll(){
        Flux<Employee> all = emp.findAll();
        return all;

    }*/

    /*@GetMapping("/getEmp/{dept}")
    @ApiOperation(value = "Get Employee By Dept")
    public List<Employee> getEmployeeByDept(@PathVariable String dept){
       return repository.findByDept(dept);

    }

    @GetMapping("/getEmployee/{id}")
    @ApiOperation(value = "Get Employee By Id")
    public Optional<Employee> getEmployeeById(@PathVariable String id){
        return repository.findById(id);
    }*/
}
