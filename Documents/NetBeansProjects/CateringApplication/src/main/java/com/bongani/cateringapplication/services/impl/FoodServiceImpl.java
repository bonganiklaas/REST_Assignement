/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.cateringapplication.services.impl;
import org.springframework.beans.factory.annotation.Autowired;
import com.Bongani.cateringapplication.domain.Food;
import com.bongani.cateringapplication.repository.FoodRepository;
import com.bongani.cateringapplication.services.FoodServices;
import java.util.List;

/**
 *
 * @author bongani
 */
public class FoodServiceImpl implements FoodServices{

    @Autowired
    private FoodRepository foodRepository;
   
    @Override
    public String getFoodService(String foodname) {
       return foodname;
    }

    @Override
    public Food find(Long id) {
        return foodRepository.findOne(id);
    }

    @Override
    public Food persist(Food entity) {
        return foodRepository.save(entity);
    }

    @Override
    public Food merge(Food entity) {
        if (entity.getId() != null) {
            return foodRepository.save(entity);
        }
        return null;
    }

    @Override
    public void remove(Food entity) {
        foodRepository.delete(entity); 
    }

    @Override
    public List<Food> findAll() {
         return foodRepository.findAll();
    }

    @Override
    public String getFoodService() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
