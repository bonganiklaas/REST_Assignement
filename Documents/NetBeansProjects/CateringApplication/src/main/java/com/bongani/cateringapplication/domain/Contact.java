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
public class Contact implements Serializable {
    private String phone;
    private String cell;
    private String email;

    public String getPhone() {
        return phone;
    }

    public String getCell() {
        return cell;
    }

    public String getEmail() {
        return email;
    }
       
}
