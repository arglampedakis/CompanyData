/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qnr.employeesData.services;

import com.qnr.employeesData.exceptions.DepartmentNotFoundException;
import com.qnr.employeesData.models.Department;
import com.qnr.employeesData.models.DeptLocation;
import java.util.List;

/**
 *
 * @author RG
 */
public interface DepartmentService {
    
    public Department getDepartmentByDeptid(Short deptid) throws DepartmentNotFoundException;
   
    public List<Department> getDepartmentsByDeptLocation(DeptLocation deptLocation) throws DepartmentNotFoundException;
    
    public List<Department> getAllDepartments()throws DepartmentNotFoundException;
        
}
