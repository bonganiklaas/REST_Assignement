/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.cateringapplication.presentation.rest;
import com.bongani.cateringapplication.services.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author bongani
 */
@Controller  // Annotation to make this class be detectable by the config as a controller
@RequestMapping(value = "api/club")
public class CustomerRestConroller {
    
    @Autowired
    private CustomerService customerService;
    

    @RequestMapping(value = "create",method = RequestMethod.POST) // This the uri e.g http://localhost:8084/askweb/api/club/create
    @ResponseBody //Converts output or response to JSON String
    public String create(@RequestBody Customer club) { // @RequestBody for converting incoming JSON call to Object
        customerService.persist(club);
        
        System.out.println(" Create the Called ");
        return " customer Created";
    }

    @RequestMapping(value = "update",method = RequestMethod.PUT) //This the uri e.g http://localhost:8084/askweb/api/club/update
    @ResponseBody
    public String update(@RequestBody Customer club) {
        customerService.merge(club);
        System.out.println(" Update Called ");
        return "Customer Update";
    }

    @RequestMapping(value = "id/{id}",method = RequestMethod.GET) //http://localhost:8084/askweb/api/club/1234
    @ResponseBody
    public Customer getCustomer(@PathVariable Long id) { //@PathVariable used to bind the id value
        
        System.out.println(" ID called ");
        return customerService.find(id);
    }

    @RequestMapping(value = "clubs",method = RequestMethod.GET) // Always Put HTTP Method
    @ResponseBody
    public List<Customer> getCustomers() {
        System.out.println("The  customers");
        return customerService.findAll();
    }

    @RequestMapping(value = "name/{name}",method = RequestMethod.GET) //http://localhost:8084/askweb/api/club/football
    @ResponseBody
    public Customer getCustomerByName(@PathVariable String name) {
        Customer club = customerService.getCustomerByName(name); // Call the Service;
        if(club!=null){
            return club;
        }
        return null;
    }

    
}
