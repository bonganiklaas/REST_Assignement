/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.cateringapplication.presentation.rest;
import com.Bongani.cateringapplication.domain.Order;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author bongani
 */
@Controller
@RequestMapping(value = "api/order")
public class OrderRestController {
    
     @RequestMapping(value = "create")
    @ResponseBody
    public String create(@RequestBody Order order) {
        System.out.println(" Create the Called ");
        return "";
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public String update(@RequestBody Order order) {
        System.out.println(" Update Called ");
        return "";
    }

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "club/{id}")
    @ResponseBody
    public Order getOrder(@PathVariable String id) {
        System.out.println(" ID called ");
        return null;
    }

    @RequestMapping(value = "clubs")
    @ResponseBody
    public List<Order> getOrder() {
        System.out.println("The CLUBS");
        return null;
    }

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "club/{name}")
    @ResponseBody
    public Order getOrderName(@PathVariable String id) {
        System.out.println("The Club name");
        return null;
    }
    
}
