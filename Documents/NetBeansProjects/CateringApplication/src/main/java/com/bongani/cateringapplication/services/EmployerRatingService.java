/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.cateringapplication.services;

import com.Bongani.cateringapplication.domain.Employee;

/**
 *
 * @author bongani
 */
public interface EmployerRatingService extends Services <Employee, Long>
{
    public int EmployerRating();
    
}
