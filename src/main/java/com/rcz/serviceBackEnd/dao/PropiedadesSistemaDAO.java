/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcz.serviceBackEnd.dao;

import com.rcz.serviceBackEnd.model.PropiedadesSistema;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Renzo
 */
public interface PropiedadesSistemaDAO extends JpaRepository<PropiedadesSistema, Long> {
    
}
