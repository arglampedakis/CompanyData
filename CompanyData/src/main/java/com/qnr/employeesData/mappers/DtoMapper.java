/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qnr.employeesData.mappers;

import com.qnr.employeesData.dtos.DepartmentDto;
import com.qnr.employeesData.dtos.DeptLocationDto;
import com.qnr.employeesData.dtos.EmployeeDto;
import com.qnr.employeesData.models.Department;
import com.qnr.employeesData.models.DeptLocation;
import com.qnr.employeesData.models.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RG
 */
public class DtoMapper {

    /*
        DeptLocationDto Mapper
    */
    public DeptLocationDto mapToDeptLocationDto(DeptLocation deptLocation) {

        DeptLocationDto dto = new DeptLocationDto();
        dto.setLocid(deptLocation.getLocid());
        dto.setLocname(deptLocation.getLocname());

        return dto;
    }

    public List<DeptLocationDto> mapToDeptLocationDtoList(List<DeptLocation> locations) {

        List<DeptLocationDto> dtos = new ArrayList<>();

        for (DeptLocation deptLocation : locations) {
            dtos.add(mapToDeptLocationDto(deptLocation));
        }
        
        return dtos;
    }
    
    
    /*
        DepartmentDto Mapper
    */
    
    public DepartmentDto mapToDepartmentDto (Department dept) {

        DepartmentDto dto = new DepartmentDto();
        
        dto.setDeptid(dept.getDeptid());
        dto.setDname(dept.getDname());
        dto.setLocid(dept.getLocid().getLocid());
        
        return dto;
    }
    
    public List<DepartmentDto> mapToDepartmentDtoList(List<Department> deptList) {

        List<DepartmentDto> dtos = new ArrayList<>();

        for (Department dept : deptList) {
            dtos.add(mapToDepartmentDto(dept));
        }
        
        return dtos;
    }
    
    /*
        EmployeeDto Mapper
    */
    
    public EmployeeDto mapToEmployeeDto (Employee emp) {

        EmployeeDto dto = new EmployeeDto();
        
        dto.setEmpid(emp.getEmpid());
        dto.setFirstname(emp.getFirstname());
        dto.setLastname(emp.getLastname());
        dto.setJob(emp.getJob());
        dto.setHiredate(emp.getHiredate());
        dto.setSalary(emp.getSalary());
        dto.setComm(emp.getComm());
        dto.setDeptid(emp.getDeptid().getDeptid());
        dto.setMngid(emp.getMngid().getEmpid());
        
        return dto;
    }
    
    public List<EmployeeDto> mapToEmployeeDtoList(List<Employee> empList) {

        List<EmployeeDto> dtos = new ArrayList<>();

        for (Employee emp : empList) {
            dtos.add(mapToEmployeeDto(emp));
        }
        
        return dtos;
    }
}
