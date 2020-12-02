/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qnr.employeesData.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author RG
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Department Not Found")
public class DepartmentNotFoundException extends Exception {

    public DepartmentNotFoundException(String error) {
        super(error);
    }
}
