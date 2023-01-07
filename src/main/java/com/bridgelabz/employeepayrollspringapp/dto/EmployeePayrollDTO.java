package com.bridgelabz.employeepayrollspringapp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class EmployeePayrollDTO {

    @Pattern(regexp="^[A-Z]{1}[a-zA-z\\s]{2,}$",message = "Employee name Invalid")
    @NotEmpty(message = "Employee name cannot be null")
    public String name;

    @Min(value = 500,message = "Minimum Wage should be more thn 500")
    public long salary;

    public EmployeePayrollDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayrollDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
