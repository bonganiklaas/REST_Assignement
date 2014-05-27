package com.Bongani.cateringapplication.domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package Com.Bongani.MyApp.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author bongani
 */
@Entity
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private int age;
    @Column(unique = true)
    private String email;
    private Contact contact;
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
     private Employee(Builder builder) {
       id = builder.id;
       name= builder.name;
       surname = builder.surname;
       age = builder.age;
       email= builder.email;
       contact = builder.contact;
             
    }

    private Employee() {
    }
    
    public static class Builder{
         private Long id;
         private String name;
         private String surname;
         private int age;
        @Column(unique = true)
        private String email;
        private Contact contact;

        
         public Builder id(Long value){
            this. id = value;
            return this;
        }
         
        public Builder(String name) {
            this.name = name;
        }
     public Builder email(String email) {
           this.email = email;
         return this;
        }

          public Builder surname(String value) {
            surname = value;
            return this;
        }

        public Builder age(int value) {
            age = value;
            return this;
        }

        public Builder contact(Contact value) {
            contact = value;
            return this;
        }
        
        public Employee build(){
            return new Employee(this);
        }
        
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
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Com.Bongani.MyApp.domain.Employee[ id=" + id + " ]";
    }
    
}
