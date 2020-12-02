/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qnr.employeesData.dtos;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author RG
 */
public class EmployeeDto {
 
    private Short empid;
    private String lastname;
    private String firstname;
    private String job;
    private Date hiredate;
    private BigDecimal salary;
    private BigDecimal comm;
    private Short deptid;
    private Short mngid;

    public EmployeeDto() {
    }

    public Short getEmpid() {
        return empid;
    }

    public void setEmpid(Short empid) {
        this.empid = empid;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getComm() {
        return comm;
    }

    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    public Short getDeptid() {
        return deptid;
    }

    public void setDeptid(Short deptid) {
        this.deptid = deptid;
    }

    public Short getMngid() {
        return mngid;
    }

    public void setMngid(Short mngid) {
        this.mngid = mngid;
    }
    
    
}
