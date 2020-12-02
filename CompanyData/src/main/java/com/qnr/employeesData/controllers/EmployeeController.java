/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qnr.employeesData.controllers;

import com.qnr.employeesData.mappers.DtoMapper;
import com.qnr.employeesData.exceptions.DepartmentNotFoundException;
import com.qnr.employeesData.exceptions.EmployeeNotFoundException;
import com.qnr.employeesData.services.DepartmentService;
import com.qnr.employeesData.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author RG
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final DtoMapper util = new DtoMapper();

    @Autowired
    EmployeeService employeeService;

    @Autowired
    DepartmentService departmentService;

    @GetMapping(value = "/all", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity showAllEmployees() {

        try {
            return ResponseEntity.ok(
                    util.mapToEmployeeDtoList(
                            employeeService.getAllEmployees()));

        } catch (EmployeeNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping(value = "/deptid/{deptid}", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity showEmployeesByDeptid(@PathVariable(value = "deptid") Short deptid) {

        try {
            return ResponseEntity.ok(
                    util.mapToEmployeeDtoList(
                            employeeService.getEmployeesByDepartment(
                                    departmentService.getDepartmentByDeptid(deptid))));

        } catch (EmployeeNotFoundException | DepartmentNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping(value = "/empid/{empid}", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity showEmployee(@PathVariable(value = "empid") Short empid
    ) {

        try {
            return ResponseEntity.ok(
                    util.mapToEmployeeDto(
                            employeeService.getEmployeeByEmpid(empid)));

        } catch (EmployeeNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping(value = "/search/{firstname}/{lastname}", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity searchEmployee(
            @PathVariable(value = "firstname") String firstname,
            @PathVariable(value = "lastname") String lastname) throws EmployeeNotFoundException {

        try {
            return ResponseEntity.ok(
                    util.mapToEmployeeDtoList(
                            employeeService.getEmployeeByFirstnameAndLastname(firstname, lastname)));

        } catch (EmployeeNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
}
