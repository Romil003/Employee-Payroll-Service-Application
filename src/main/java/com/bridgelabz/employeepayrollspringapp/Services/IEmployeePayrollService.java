package com.bridgelabz.employeepayrollspringapp.Services;

import com.bridgelabz.employeepayrollspringapp.Model.EmployeePayrollData;
import com.bridgelabz.employeepayrollspringapp.dto.EmployeePayrollDTO;

import java.util.List;

public interface IEmployeePayrollService {

    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empId);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int empId,EmployeePayrollDTO empPayrollDTO);

    void deleteEmployeePayrollData(int empId);

    List<EmployeePayrollData> getEmployeesByDepartment(String department);


}
