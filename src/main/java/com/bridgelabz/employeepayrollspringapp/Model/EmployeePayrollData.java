package com.bridgelabz.employeepayrollspringapp.Model;

import com.bridgelabz.employeepayrollspringapp.dto.EmployeePayrollDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Employee_Payroll_Service")
public @Data class EmployeePayrollData {

    @Id
    @GeneratedValue
    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "name")
    private String name;
    private long salary;
    private String gender;
    private LocalDate startDate;
    private String note;
    private String profilePic;

    @ElementCollection
    @CollectionTable(name = "employees_department",joinColumns = @JoinColumn(name = "id"))
    @Column(name = "department")
    private List<String> departments;

    public EmployeePayrollData() {}

    public EmployeePayrollData(EmployeePayrollDTO employeePayrollDTO){
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
        this.gender = employeePayrollDTO.gender;
        this.note = employeePayrollDTO.note;
        this.startDate = employeePayrollDTO.startDate;
        this.profilePic = employeePayrollDTO.profilePic;
        this.departments = employeePayrollDTO.departments;
    }

    public EmployeePayrollData(int empId,EmployeePayrollDTO employeePayrollDTO){
        this.employeeId = empId;
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
        this.gender = employeePayrollDTO.gender;
        this.note = employeePayrollDTO.note;
        this.startDate = employeePayrollDTO.startDate;
        this.profilePic = employeePayrollDTO.profilePic;
        this.departments = employeePayrollDTO.departments;
    }

}
