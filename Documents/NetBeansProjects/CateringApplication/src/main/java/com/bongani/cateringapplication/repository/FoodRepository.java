/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.cateringapplication.repository;

import com.Bongani.cateringapplication.domain.Food;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bongani
 */
public interface FoodRepository extends JpaRepository<Food, Long>
{

    public Food findOne(Long id);

    public Food save(Food entity);

    public List<Food> findAll();

    public void delete(Food entity);
    
}
