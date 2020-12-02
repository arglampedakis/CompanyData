/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qnr.employeesData.services;

import com.qnr.employeesData.exceptions.DepartmentNotFoundException;
import com.qnr.employeesData.models.Department;
import com.qnr.employeesData.models.DeptLocation;
import com.qnr.employeesData.repositories.DepartmentRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author RG
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepo departmentRepo;

    @Override
    public List<Department> getDepartmentsByDeptLocation(DeptLocation deptLocation) throws DepartmentNotFoundException {

        List<Department> temp = departmentRepo.findByLocid(deptLocation);

        if (temp.isEmpty()) {
            throw new DepartmentNotFoundException("No Departments found!");
        }
        return temp;
    }

    @Override
    public List<Department> getAllDepartments() throws DepartmentNotFoundException {

        List<Department> temp = departmentRepo.findAll();

        if (temp.isEmpty()) {
            throw new DepartmentNotFoundException("No Departments found!");
        }
        return temp;
    }

    @Override
    public Department getDepartmentByDeptid(Short deptid) throws DepartmentNotFoundException {

        Optional<Department> temp = departmentRepo.findById(deptid);

        if (!temp.isPresent()) {
            throw new DepartmentNotFoundException("Department not found. Id does not exist!");
        }
        return temp.get();
    }

}
