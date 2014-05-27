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
public class OrderLine implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double quantity;

    private OrderLine() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

     private OrderLine(Builder builder) {
       id = builder.id;
       quantity= builder.quantity;
   
    }

    public static class Builder{
        private Long id;
        private double quantity;
   

        public Builder(double value) {
            this.quantity = value;
        }
        
        public Builder id(Long value){
            this. id = value;
            return this;
        }
                
        public OrderLine build(){
            return new OrderLine(this);
        }
        
    }
    
    public double getQuantity() {
        return quantity;
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
        if (!(object instanceof OrderLine)) {
            return false;
        }
        OrderLine other = (OrderLine) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Com.Bongani.MyApp.domain.OrderLine[ id=" + id + " ]";
    }
    
}
