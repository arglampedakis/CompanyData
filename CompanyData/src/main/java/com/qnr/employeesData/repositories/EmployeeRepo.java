/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qnr.employeesData.repositories;

import com.qnr.employeesData.models.Department;
import com.qnr.employeesData.models.Employee;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RG
 */
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Short> {

    List<Employee> findByDeptid(Department dept);

    List<Employee> findByLastnameStartingWithIgnoreCase(String lastname);

    List<Employee> findByFirstnameAndLastnameAllIgnoreCase(String firstname, String lastname);
}
