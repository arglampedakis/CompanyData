/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qnr.employeesData.services;

import com.qnr.employeesData.exceptions.EmployeeNotFoundException;
import com.qnr.employeesData.models.Department;
import com.qnr.employeesData.models.Employee;
import com.qnr.employeesData.repositories.EmployeeRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author RG
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getEmployeesByDepartment(Department dept) throws EmployeeNotFoundException {

        List<Employee> temp = employeeRepo.findByDeptid(dept);

        if (temp.isEmpty()) {
            throw new EmployeeNotFoundException("No Employees found!");
        }
        return temp;
    }

    @Override
    public List<Employee> getEmployeeByFirstnameAndLastname(String firstname, String lastname) throws EmployeeNotFoundException {

        List<Employee> temp = employeeRepo.findByFirstnameAndLastnameAllIgnoreCase(firstname, lastname);
        
        if (temp.isEmpty()) {
            throw new EmployeeNotFoundException("No Employees found!");
        }
        return temp;
    }

    @Override
    public Employee getEmployeeByEmpid(Short empid) throws EmployeeNotFoundException {

        Optional<Employee> temp = employeeRepo.findById(empid);

        if (!temp.isPresent()) {
            throw new EmployeeNotFoundException("Employee not found. Empid does not exist!");
        }
        return temp.get();
    }

    @Override
    public List<Employee> getAllEmployees() throws EmployeeNotFoundException {

        List<Employee> temp = employeeRepo.findAll();

        if (temp.isEmpty()) {
            throw new EmployeeNotFoundException("No Employees found!");
        }
        return temp;
    }

}
