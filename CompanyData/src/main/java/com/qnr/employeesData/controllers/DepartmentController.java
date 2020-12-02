/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qnr.employeesData.controllers;

import com.qnr.employeesData.exceptions.DepartmentNotFoundException;
import com.qnr.employeesData.exceptions.LocationNotFoundException;
import com.qnr.employeesData.mappers.DtoMapper;
import com.qnr.employeesData.services.DepartmentService;
import com.qnr.employeesData.services.DeptLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author RG
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {

    private static final DtoMapper util = new DtoMapper();

    @Autowired
    DepartmentService departmentService;

    @Autowired
    DeptLocationService deptLocationService;

    @GetMapping(value = "/locid/{locid}", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity showDepartmentsByLocid(@PathVariable(value = "locid") Short locid) {

        try {
            return ResponseEntity.ok(
                    util.mapToDepartmentDtoList(
                            departmentService.getDepartmentsByDeptLocation(
                                    deptLocationService.getDeptLocationByLocid(locid))));

        } catch (DepartmentNotFoundException | LocationNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping(value = "/all", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity showAllDepartments() {

        try {
            return ResponseEntity.ok(
                    util.mapToDepartmentDtoList(
                            departmentService.getAllDepartments()));

        } catch (DepartmentNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
}
