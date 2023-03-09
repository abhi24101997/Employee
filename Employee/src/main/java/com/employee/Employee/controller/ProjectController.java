package com.employee.Employee.controller;

import com.employee.Employee.entity.Project;
import com.employee.Employee.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("/create")
    public ResponseEntity<Project> newProject(@RequestBody Project project){
        Project newProject1 = projectService.createNewProject(project);
        return ResponseEntity.status(HttpStatus.CREATED).body(newProject1);
    }

    @GetMapping("/{project_id}")
    public ResponseEntity<Optional<Project>> getProjectById(@PathVariable int project_id){
        Optional<Project> projectById = projectService.getByIdProject(project_id);
        return ResponseEntity.status(HttpStatus.OK).body(projectById);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Project>> projectList(){

        List<Project> list =projectService.projectList();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @PutMapping("/update/{project_id}")
    public ResponseEntity<String> updateProjectById(@RequestBody Project project, @PathVariable int project_id){
       projectService.updateProject(project,project_id);
        return ResponseEntity.status(HttpStatus.OK).body("Project is updated");
    }
}
