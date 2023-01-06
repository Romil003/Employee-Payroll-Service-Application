package com.bridgelabz.employeepayrollspringapp.Model;

import com.bridgelabz.employeepayrollspringapp.dto.EmployeePayrollDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EmployeePayrollTable")
public class EmployeePayrollData {

    @Id
    @GeneratedValue
    private int employeeId;
    private String name;
    private long salary;

    public EmployeePayrollData() {}

    public EmployeePayrollData(EmployeePayrollDTO employeePayrollDTO){
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
    }

    public EmployeePayrollData(int empId,EmployeePayrollDTO employeePayrollDTO){
        this.employeeId = empId;
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
