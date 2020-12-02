/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qnr.employeesData.services;

import com.qnr.employeesData.exceptions.LocationNotFoundException;
import com.qnr.employeesData.models.DeptLocation;
import com.qnr.employeesData.repositories.DeptLocationRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author RG
 */
@Service
public class DeptLocationServiceImpl implements DeptLocationService {

    @Autowired
    DeptLocationRepo deptLocationRepo;

    @Override
    public List<DeptLocation> getAllDeptLocations() throws LocationNotFoundException {

        List<DeptLocation> temp = deptLocationRepo.findAll();

        if (temp.isEmpty()) {
            throw new LocationNotFoundException("No DeptLocations found!");
        }
        return temp;
    }

    @Override
    public DeptLocation getDeptLocationByLocid(Short id) throws LocationNotFoundException {

        Optional<DeptLocation> temp = deptLocationRepo.findById(id);

        if (!temp.isPresent()) {
            throw new LocationNotFoundException("DeptLocation not found. Id does not exist!");
        }
        return temp.get();
    }

}
