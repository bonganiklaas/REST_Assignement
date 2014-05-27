/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.cateringapplication.repository;

import com.Bongani.cateringapplication.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bongani
 */
public class EmployeeRepository extends JpaRepository<Employee, Long>
{
    
}
