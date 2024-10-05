package com.ust.Employeeinfo.client;

import java.util.List;


public class FullResponse {
    private Long ccode;
    private  String name;
    private String department;
    private  String designation;
    private List<String> skills;
    private String address;
    private String email;
    private  String phone;
    private  String city;
    private  String state;
    private String doj;
    private int exp;
    public List<Project> projects;

    public FullResponse() {
    }

    public FullResponse(Long ccode, String name, String department, String designation, List<String> skills, String address, String email, String phone, String city, String state, String doj, int exp, List<Project> projects) {
        this.ccode = ccode;
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.skills = skills;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.state = state;
        this.doj = doj;
        this.exp = exp;
        this.projects = projects;
    }

    public Long getCcode() {
        return ccode;
    }

    public void setCcode(Long ccode) {
        this.ccode = ccode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
