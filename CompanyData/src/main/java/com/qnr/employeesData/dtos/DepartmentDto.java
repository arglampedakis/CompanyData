/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qnr.employeesData.dtos;

/**
 *
 * @author RG
 */
public class DepartmentDto {
    
    private Short deptid;
    private String dname;
    private Short locid;

    public DepartmentDto() {
    }

    public Short getDeptid() {
        return deptid;
    }

    public void setDeptid(Short deptid) {
        this.deptid = deptid;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Short getLocid() {
        return locid;
    }

    public void setLocid(Short locid) {
        this.locid = locid;
    }
    
    
}
