/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcz.serviceBackEnd.repository;

import com.rcz.serviceBackEnd.model.PropiedadesSistema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Renzo
 */
@Repository
public interface PropiedadesSistemaRepository extends JpaRepository<PropiedadesSistema, Long> {

}
