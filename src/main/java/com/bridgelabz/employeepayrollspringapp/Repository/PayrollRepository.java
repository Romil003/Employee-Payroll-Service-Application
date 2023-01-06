package com.bridgelabz.employeepayrollspringapp.Repository;

import com.bridgelabz.employeepayrollspringapp.Model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayrollRepository extends JpaRepository<EmployeePayrollData,Integer> {
}
