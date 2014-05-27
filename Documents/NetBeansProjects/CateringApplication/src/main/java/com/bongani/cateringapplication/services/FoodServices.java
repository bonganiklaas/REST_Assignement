/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.cateringapplication.services;

import com.Bongani.cateringapplication.domain.Food;

/**
 *
 * @author bongani
 */
public interface FoodServices extends Services <Food, Long>
{
    public String getFoodService();
    
}
