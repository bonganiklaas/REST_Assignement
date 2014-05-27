/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.cateringapplication.presentation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author hashcode
 */
@Controller
public class CustomerController {

    @Autowired
    private PeopleAgeService customerService;

    @Autowired
    private PersonService customerServices;

    @RequestMapping(value = "customer")
    @ResponseBody
    public Person getPerson() {
        Person p = null;
        List<Person> customers = customerService.findAll();

        System.out.println(" THE COllection Size" + customers.size());

        if (customers.size() > 0) {
            p = customers.get(0);

        }

        return p;
    }

    @RequestMapping(value = "customers")
    @ResponseBody
    public List<Person> getCustomers() {
        return customerService.findAll();

    }
}
