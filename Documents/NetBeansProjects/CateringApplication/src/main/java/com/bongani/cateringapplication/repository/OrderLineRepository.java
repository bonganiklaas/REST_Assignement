/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.cateringapplication.repository;
import com.Bongani.cateringapplication.domain.Order;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bongani
 */
public interface OrderLineRepository extends JpaRepository<Order, Long>
{

    public List findAll();

    public void delete(Object entity);

    public Object save(Object entity);

    public Object findOne(Object id);
    
}
