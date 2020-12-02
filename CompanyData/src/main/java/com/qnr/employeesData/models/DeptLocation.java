/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qnr.employeesData.models;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author RG
 */
@Entity
@Table(name = "dept_locations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DeptLocation.findAll", query = "SELECT d FROM DeptLocation d"),
    @NamedQuery(name = "DeptLocation.findByLocid", query = "SELECT d FROM DeptLocation d WHERE d.locid = :locid"),
    @NamedQuery(name = "DeptLocation.findByLocname", query = "SELECT d FROM DeptLocation d WHERE d.locname = :locname")})
public class DeptLocation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LOCID")
    private Short locid;
    @Column(name = "LOCNAME")
    private String locname;
    @OneToMany(mappedBy = "locid")
    private Collection<Department> departmentsCollection;

    public DeptLocation() {
    }

    public DeptLocation(Short locid) {
        this.locid = locid;
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

    @XmlTransient
    public Collection<Department> getDepartmentsCollection() {
        return departmentsCollection;
    }

    public void setDepartmentsCollection(Collection<Department> departmentsCollection) {
        this.departmentsCollection = departmentsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locid != null ? locid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DeptLocation)) {
            return false;
        }
        DeptLocation other = (DeptLocation) object;
        if ((this.locid == null && other.locid != null) || (this.locid != null && !this.locid.equals(other.locid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.qnr.employeesData.models.DeptLocation[ locid=" + locid + " ]";
    }
    
}
