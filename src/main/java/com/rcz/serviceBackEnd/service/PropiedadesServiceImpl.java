/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcz.serviceBackEnd.service;

import com.rcz.serviceBackEnd.beans.PropiedadesSistemaBean;
import com.rcz.serviceBackEnd.dao.PropiedadesSistemaDAO;
import com.rcz.serviceBackEnd.model.PropiedadesSistema;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Renzo
 */
@Service
public class PropiedadesServiceImpl implements PropiedadesService {

    @Autowired
    PropiedadesSistemaDAO propiedadesSistemaRepository;

    @Override
    public List<PropiedadesSistema> obtenerListadoPropiedadesSistema() {
        return propiedadesSistemaRepository.findAll();
    }

    @Override
    public Optional<PropiedadesSistema> obtenerPropiedadSistema(Long idPropiedadSistema) {
        return propiedadesSistemaRepository.findById(idPropiedadSistema);
    }

    @Override
    public PropiedadesSistema crearPropiedadesSistema(PropiedadesSistemaBean propiedadesSistemaBean) {
        PropiedadesSistema propiedadesSistema = new PropiedadesSistema();
        propiedadesSistema.setDescripcion(propiedadesSistemaBean.getDescripcion());
        propiedadesSistema.setKey(propiedadesSistemaBean.getKey());
        propiedadesSistema.setValue(propiedadesSistemaBean.getValue());
        return propiedadesSistemaRepository.save(propiedadesSistema);
    }

}
