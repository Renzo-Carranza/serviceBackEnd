/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcz.serviceBackEnd.service;

import com.rcz.serviceBackEnd.beans.PropiedadesSistemaBean;
import com.rcz.serviceBackEnd.model.PropiedadesSistema;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Renzo
 */
public interface PropiedadesService {

    public List<PropiedadesSistema> obtenerListadoPropiedadesSistema();

    public PropiedadesSistema obtenerPropiedadSistema(Long idPropiedadSistema);

    public PropiedadesSistema crearPropiedadesSistema(PropiedadesSistemaBean propiedadesSistemaBean);
}
