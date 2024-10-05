package com.ust.Employeeinfo.service;

import com.ust.Employeeinfo.client.FullResponse;
import com.ust.Employeeinfo.client.Project;
import com.ust.Employeeinfo.feign.Projectclient;
import com.ust.Employeeinfo.model.Employee;
import com.ust.Employeeinfo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;
    @Autowired
    private Projectclient client;
    public Employee saveEmployee(Employee employee) {

        return repo.save(employee);
    }

    public FullResponse getEmployeesByProjectCcode(Long ccode) {
        Employee employee =repo.findByCcode(ccode).orElse(null);
        List<Project> list=client.findProjectsByCcode(ccode);
        FullResponse response = new FullResponse();
        response.setName(employee != null ? employee.getName() : null);
        response.setDepartment(employee != null ? employee.getDepartment() : null);
        response.setDesignation(employee != null ? employee.getDesignation() : null);
        response.setCcode(employee != null ? employee.getCcode() : 0);
        response.setEmail(employee != null ? employee.getEmail() : null);
        response.setPhone(employee != null ? employee.getPhone() : null);
        response.setAddress(employee != null ? employee.getAddress() : null);
        response.setCity(employee != null ? employee.getCity() : null);
        response.setState(employee != null ? employee.getState() : null);
        response.setExp(employee != null ? employee.getExp() : 0);
        response.setDoj(employee != null ? employee.getDoj() : null);
        response.setSkills(employee != null ? employee.getSkills() : null);
        response.setProjects(list);
        return response;
    }
}
