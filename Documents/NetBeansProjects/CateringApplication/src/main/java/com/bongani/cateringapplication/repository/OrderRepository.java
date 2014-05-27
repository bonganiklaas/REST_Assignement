/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.cateringapplication.repository;
import com.Bongani.cateringapplication.domain.Order;
import com.Bongani.cateringapplication.domain.OrderLine;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bongani
 */
public interface OrderRepository extends JpaRepository<OrderLine, Long>
{

    public List<Order> findAll();

    public void delete(Order entity);

    public Order save(Order entity);

    public Order findOne(Long id);
    
}
