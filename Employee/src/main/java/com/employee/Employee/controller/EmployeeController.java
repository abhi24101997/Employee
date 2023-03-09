package com.employee.Employee.controller;

import com.employee.Employee.entity.Employee;
import com.employee.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public ResponseEntity<?> createNewEmployee(@RequestBody Employee employee){
         employeeService.createNewEmplyee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body("Data inserted Successfull");
    }

    @GetMapping("/{emp_id}")
    public ResponseEntity<Optional<Employee>> employeeById(@PathVariable int emp_id){
        Optional<Employee> byIdEmployee =employeeService.employeeById(emp_id);
        return ResponseEntity.status(HttpStatus.OK).body(byIdEmployee);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Employee>> employeeList(){

        List<Employee> listOfEmployee =  employeeService.allEmployee();
        return ResponseEntity.status(HttpStatus.CREATED).body(listOfEmployee);
    }

    @PutMapping("/update/{emp_id}")
    public ResponseEntity<?> employeeUpdate(@PathVariable int emp_id,@RequestBody Employee employee){
        employeeService.updateEmployee(employee, emp_id);
        return ResponseEntity.status(HttpStatus.OK).body("Employee data updated successfull");
    }
}
