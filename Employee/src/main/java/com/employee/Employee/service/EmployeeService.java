package com.employee.Employee.service;

import com.employee.Employee.entity.Employee;
import com.employee.Employee.repository.EmplyeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmplyeeRepository emplyeeRepository;

    //create new emplyee by post
    public Employee createNewEmplyee(Employee employee){
        return emplyeeRepository.save(employee);
    }

    //get employee by id
    public Optional<Employee> employeeById(int id){
        return emplyeeRepository.findById(id);
    }

    //get all employee
    public List<Employee> allEmployee(){
        return emplyeeRepository.findAll();
    }

    //Updater an employee by Id
    public Employee updateEmployee(Employee employee, int id){
        employee.setEmp_id(id);
        return emplyeeRepository.save(employee);
    }

}
