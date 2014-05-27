/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.cateringapplication.services.impl;

import com.bongani.cateringapplication.services.TotalLineService;
import org.springframework.beans.factory.annotation.Autowired;
import com.Bongani.cateringapplication.domain.OrderLine;
import com.bongani.cateringapplication.repository.OrderLineRepository;

import java.util.List;

/**
 *
 * @author bongani
 */
public class TotalLineServiceImpl implements TotalLineService {

     @Autowired
    private OrderLineRepository OrderLineRepository;

     public double getTotalLine(double total) {
         return total;

    }

    @Override
    public Object find(Object id) {
         return OrderLineRepository.findOne(id);
    }

    @Override
    public Object persist(Object entity) {
        return OrderLineRepository.save(entity);
    }


    @Override
    public List findAll() {
         return OrderLineRepository.findAll();
        
    }

       
}
