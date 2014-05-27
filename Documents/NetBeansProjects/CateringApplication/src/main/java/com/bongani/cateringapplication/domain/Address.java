package com.Bongani.cateringapplication.domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author bongani
 */
@Embeddable
public class Address implements Serializable{
    private String postalCode;
    private String physicalAddress;
    private String postalAddress;

    public String getPostalCode() {
        return postalCode;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }
    
}
