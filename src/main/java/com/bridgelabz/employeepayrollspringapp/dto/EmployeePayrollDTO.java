package com.bridgelabz.employeepayrollspringapp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.NonNull;
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

    @Pattern(regexp = "male|female",message = "Gender needs to be male or female")
    public String gender;

    @JsonFormat(pattern = "dd MMM yyyy")
    @NotNull(message = "startDate should not be empty")
    @PastOrPresent(message = "startDate should be past or today's date")
    public LocalDate startDate;

    @NotBlank(message = "Note cannot be empty")
    public String note;

    @NotBlank(message = "profilePic cannot be empty")
    public String profilePic;

    @NotNull(message = "department should not be empty")
    public List<String> departments;
}
