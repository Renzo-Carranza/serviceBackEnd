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
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
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
        List<PropiedadesSistema> aa = propiedadesSistemaRepository.findAll();
        Map<String, PropiedadesSistema> result = aa.stream().collect(Collectors.toMap(PropiedadesSistema::getKey, Function.identity()));
        return aa;
    }

    @Override
    public PropiedadesSistema obtenerPropiedadSistema(Long idPropiedadSistema) {
        Optional<PropiedadesSistema> propiedadSistema = propiedadesSistemaRepository.findById(idPropiedadSistema);
        return propiedadSistema.get();
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
