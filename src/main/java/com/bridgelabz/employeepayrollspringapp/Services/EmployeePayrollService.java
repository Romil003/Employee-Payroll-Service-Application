package com.bridgelabz.employeepayrollspringapp.Services;

import com.bridgelabz.employeepayrollspringapp.Exceptions.EmployeePayrollException;
import com.bridgelabz.employeepayrollspringapp.Model.EmployeePayrollData;
import com.bridgelabz.employeepayrollspringapp.Repository.PayrollRepository;
import com.bridgelabz.employeepayrollspringapp.dto.EmployeePayrollDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EmployeePayrollService implements IEmployeePayrollService{

    @Autowired
    private PayrollRepository payrollRepository;
    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return payrollRepository.findAll();
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {

        return payrollRepository.findById(empId).orElseThrow(() -> new EmployeePayrollException("Employee Not Found"));
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData employeePayrollData = new EmployeePayrollData(empPayrollDTO);
        log.debug("Emp data: " + employeePayrollData.toString());
        payrollRepository.save(employeePayrollData);
        return employeePayrollData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId , EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empId);
        if(employeePayrollData != null){
            employeePayrollData.setName(empPayrollDTO.name);
            employeePayrollData.setSalary(empPayrollDTO.salary);
            payrollRepository.save(employeePayrollData);
            return employeePayrollData;
        }
        return null;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        payrollRepository.deleteById(empId);
    }
}
