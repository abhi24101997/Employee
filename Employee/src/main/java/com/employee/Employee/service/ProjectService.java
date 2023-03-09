package com.employee.Employee.service;

import com.employee.Employee.entity.Project;
import com.employee.Employee.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    //crete new project
    public Project createNewProject(Project project){
        return projectRepository.save(project);
    }

    //assign project by id
    public Optional<Project> getByIdProject(int id){
        return projectRepository.findById(id);
    }

    //get list of project
    public List<Project> projectList(){
        return projectRepository.findAll();
    }

    //update project
    public Project updateProject(Project project,int id){
        project.setProject_id(id);
        return projectRepository.save(project);
    }
}
