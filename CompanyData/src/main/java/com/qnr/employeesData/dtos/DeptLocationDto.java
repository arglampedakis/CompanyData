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
public class DeptLocationDto {

    private Short locid;
    private String locname;

    public DeptLocationDto() {
    }

    public Short getLocid() {
        return locid;
    }

    public void setLocid(Short locid) {
        this.locid = locid;
    }

    public String getLocname() {
        return locname;
    }

    public void setLocname(String locname) {
        this.locname = locname;
    }

}
