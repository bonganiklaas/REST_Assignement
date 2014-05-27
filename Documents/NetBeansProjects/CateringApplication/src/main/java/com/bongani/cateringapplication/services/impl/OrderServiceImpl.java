/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.cateringapplication.services.impl;
import com.Bongani.cateringapplication.domain.Order;
import com.bongani.cateringapplication.repository.OrderRepository;
import com.bongani.cateringapplication.services.OrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author bongani
 */
public class OrderServiceImpl implements OrderService{
    
    @Autowired
    private OrderRepository OrderRepository;
   
     @Override
    public Order find(Long id) {
        return OrderRepository.findOne(id);
    }

    @Override
    public Order persist(Order entity) {
        return OrderRepository.save(entity);
    }

    @Override
    public Order merge(Order entity) {
        if (entity.getId() != null) {
            return OrderRepository.save(entity);
        }
        return null;
    }

    public void remove(Order entity) {
        OrderRepository.delete(entity); 
    }

    public List<Order> findAll() {
         return OrderRepository.findAll();
    }
   
    
}
