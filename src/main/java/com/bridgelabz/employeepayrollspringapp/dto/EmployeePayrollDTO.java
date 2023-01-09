package com.bridgelabz.employeepayrollspringapp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@ToString
public class EmployeePayrollDTO {

    @Pattern(regexp="^[A-Z]{1}[a-zA-z\\s]{2,}$",message = "Employee name Invalid")
    @NotEmpty(message = "Employee name cannot be null")
    public String name;

    @Min(value = 500,message = "Minimum Wage should be more thn 500")
    public long salary;

    public String gender;

    public LocalDate startDate;

    public String note;

    public String profilePic;

    public List<String> departments;
}
