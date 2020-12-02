/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qnr.employeesData.services;

import com.qnr.employeesData.exceptions.EmployeeNotFoundException;
import com.qnr.employeesData.models.Department;
import com.qnr.employeesData.models.Employee;
import java.util.List;

/**
 *
 * @author RG
 */
public interface EmployeeService {
    
    public List<Employee> getAllEmployees() throws EmployeeNotFoundException;
    
    public List<Employee> getEmployeesByDepartment(Department dept) throws EmployeeNotFoundException;
    
    //TODO change to List<Employee>. There might be more than one Emp with the same first&last name
    public List<Employee> getEmployeeByFirstnameAndLastname(String firstname, String lastname) throws EmployeeNotFoundException;
    
    public Employee getEmployeeByEmpid(Short empid) throws EmployeeNotFoundException;
    
}
