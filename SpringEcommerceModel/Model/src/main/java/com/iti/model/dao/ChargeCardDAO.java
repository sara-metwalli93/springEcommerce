/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iti.model.dao;

import com.iti.model.entity.ChargeCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Samir
 */
@Repository
public interface ChargeCardDAO extends CrudRepository<ChargeCard, Integer>{
    
}
