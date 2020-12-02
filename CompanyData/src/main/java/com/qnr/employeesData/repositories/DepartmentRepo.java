/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qnr.employeesData.repositories;

import com.qnr.employeesData.models.Department;
import com.qnr.employeesData.models.DeptLocation;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RG
 */
@Repository
public interface DepartmentRepo extends JpaRepository<Department, Short>{
    
    List<Department> findByLocid(DeptLocation deptLocation);
}
