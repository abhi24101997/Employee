package com.employee.Employee.repository;

import com.employee.Employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmplyeeRepository extends JpaRepository<Employee,Integer> {
}
