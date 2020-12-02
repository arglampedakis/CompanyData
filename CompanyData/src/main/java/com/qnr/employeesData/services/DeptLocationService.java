/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qnr.employeesData.services;

import com.qnr.employeesData.exceptions.LocationNotFoundException;
import com.qnr.employeesData.models.DeptLocation;
import java.util.List;

/**
 *
 * @author RG
 */
public interface DeptLocationService {
    
    public List<DeptLocation> getAllDeptLocations() throws LocationNotFoundException;
    
    public DeptLocation getDeptLocationByLocid(Short id) throws LocationNotFoundException;
       
    
}
