/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcz.serviceBackEnd.controller;

import com.rcz.serviceBackEnd.beans.PropiedadesSistemaBean;
import com.rcz.serviceBackEnd.exception.ResourceNotFoundException;
import com.rcz.serviceBackEnd.model.PropiedadesSistema;
import com.rcz.serviceBackEnd.repository.PropiedadesSistemaRepository;
import com.rcz.serviceBackEnd.service.PropiedadesService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Renzo
 */
@RestController
@RequestMapping("/serviceBackEnd")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public class PropiedadesSistemaController {

    @Autowired
    PropiedadesSistemaRepository propiedadesSistemaRepository;

    @Autowired
    private PropiedadesService propiedadesService;

    @GetMapping("/propiedadesSistema")
    public List<PropiedadesSistema> getAllPropiedadesSistema() {
        return propiedadesService.obtenerListadoPropiedadesSistema();
    }

    @PostMapping("/propiedadesSistema")
    public PropiedadesSistema createPropiedadesSistema(@Valid @RequestBody PropiedadesSistemaBean propiedadesSistemaBean) {
        return propiedadesService.crearPropiedadesSistema(propiedadesSistemaBean);
    }

    @GetMapping("/propiedadesSistema/{id}")
    public PropiedadesSistema getPropiedadesSistemaById(@PathVariable(value = "id") Long propiedadesSistemaRepositoryId) {
        return propiedadesService.obtenerPropiedadSistema(propiedadesSistemaRepositoryId);
    }

    @PutMapping("/propiedadesSistema/{id}")
    public PropiedadesSistema updatePropiedadesSistema(@PathVariable(value = "id") Long propiedadesSistemaRepositoryId,
            @Valid @RequestBody PropiedadesSistema propiedadesSistemaRequest) {

        PropiedadesSistema propiedadesSistema = propiedadesSistemaRepository.findById(propiedadesSistemaRepositoryId)
                .orElseThrow(() -> new ResourceNotFoundException("PropiedadesSistema", "id", propiedadesSistemaRepositoryId));

        propiedadesSistema.setDescripcion(propiedadesSistemaRequest.getDescripcion());
        propiedadesSistema.setKey(propiedadesSistemaRequest.getKey());
        propiedadesSistema.setValue(propiedadesSistemaRequest.getValue());

        PropiedadesSistema updatedNote = propiedadesSistemaRepository.save(propiedadesSistema);
        return updatedNote;
    }

    @DeleteMapping("/propiedadesSistema/{id}")
    public ResponseEntity<?> deletePropiedadesSistema(@PathVariable(value = "id") Long propiedadesSistemaRepositoryId) {
        PropiedadesSistema note = propiedadesSistemaRepository.findById(propiedadesSistemaRepositoryId)
                .orElseThrow(() -> new ResourceNotFoundException("PropiedadesSistema", "id", propiedadesSistemaRepositoryId));

        propiedadesSistemaRepository.delete(note);

        return ResponseEntity.ok().build();
    }
}
