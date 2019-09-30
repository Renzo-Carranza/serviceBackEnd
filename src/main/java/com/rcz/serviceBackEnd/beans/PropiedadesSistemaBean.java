/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcz.serviceBackEnd.beans;

import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Renzo
 */
@Getter
@Setter
@NoArgsConstructor
public class PropiedadesSistemaBean implements Serializable {

    private Long idPropertie;

    private String descripcion;

    private String key;

    private String value;
 
}
