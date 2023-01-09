package com.bridgelabz.employeepayrollspringapp.Repository;

import com.bridgelabz.employeepayrollspringapp.Model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PayrollRepository extends JpaRepository<EmployeePayrollData,Integer> {

    @Query(value = "select *from Employee_Payroll_Service , employees_department where employee_id = id and department = :department" , nativeQuery = true)
    List<EmployeePayrollData> findEmployeesByDepartment(String department);
}
