package com.ust.Employeeinfo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    private long ccode;
    private String name;
    private String department;
    private String designation;
    private List<String> skills;
    private String address;
    private String email;
    private  String phone;
    private  String city;
    private  String state;
    private String doj;
    private int exp;
}
