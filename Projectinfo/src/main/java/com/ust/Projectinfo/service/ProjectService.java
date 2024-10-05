package com.ust.Projectinfo.service;

import com.ust.Projectinfo.dto.Projectdto;
import com.ust.Projectinfo.model.Project;
import com.ust.Projectinfo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project addProject(Projectdto project) {
        Project project1=new Project();
        project1.setProjectId(project.getProjectId());
        project1.setProjectName(project.getProjectName());
        project1.setProjectManager(project.getProjectManager());
        project1.setTeamMembers(project.getTeamMembers());
        project1.setProjectDescription(project.getProjectDescription());
        project1.setCcode(project.getCcode());
        return projectRepository.save(project1);
    }

    public List<Project> getProjectByCcode(Long ccode) {
        return projectRepository.findByCcode(ccode);
    }
}
