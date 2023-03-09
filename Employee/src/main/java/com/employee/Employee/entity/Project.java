package com.employee.Employee.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Project {

    @Id
 //   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int project_id;
    private String project_name;
    private String project_report;

//    @OneToMany(targetEntity = Employee.class,cascade = CascadeType.ALL)
//    @JoinColumn(name = "e_id",referencedColumnName = "project_id")
//    private List<Employee> employees;


}
