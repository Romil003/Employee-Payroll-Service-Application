package com.bridgelabz.employeepayrollspringapp.Controller;

import com.bridgelabz.employeepayrollspringapp.Model.EmployeePayrollData;
import com.bridgelabz.employeepayrollspringapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollspringapp.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
        EmployeePayrollData empData = new EmployeePayrollData(1,new EmployeePayrollDTO("PankyaBhai",3000));
        ResponseDTO respDTO = new ResponseDTO("Get call Success",empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId){
        EmployeePayrollData empData = new EmployeePayrollData(1,new EmployeePayrollDTO("PankyaBhai",3000));
        ResponseDTO respDTO = new ResponseDTO("Get call Success for id: "+empId,empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
        EmployeePayrollData empData = new EmployeePayrollData(1,employeePayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Created Employee Payroll Data", empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{empId}")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("empId") int empId, @RequestBody EmployeePayrollDTO employeePayrollDTO){
        EmployeePayrollData empData = new EmployeePayrollData(empId,employeePayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated Employee Payroll Data", empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @DeleteMapping ("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId){
        ResponseDTO respDTO = new ResponseDTO("Deleted Successfully","Deleted Id: " +empId);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }


}
