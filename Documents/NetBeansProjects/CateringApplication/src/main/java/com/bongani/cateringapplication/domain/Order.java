package com.Bongani.cateringapplication.domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author bongani
 */
@Entity
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String discription;
    
        private Order(Builder builder) {
       id = builder.id;
       name= builder.name;
       discription = builder.discription;
    }

    private Order() {
    }
    
    public static class Builder{
        private Long id;
        private String name;
        private String discription;

        public Builder(String name) {
            this.name = name;
        }
        
        public Builder id(Long value){
            this. id = value;
            return this;
        }
        
        public Builder discription(String value){
            this. discription = value;
            return this;
        }
        
        public Order build(){
            return new Order(this);
        }
        
    }
    
    public String getName() {
        return name;
    }

    public String getDiscription() {
        return discription;
    }

    public Long getId() {
        return id;
    }

     @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Order)) {
            return false;
        }
        Order other = (Order) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Com.Bongani.MyApp.domain.Order[ id=" + id + " ]";
    }
    
}
