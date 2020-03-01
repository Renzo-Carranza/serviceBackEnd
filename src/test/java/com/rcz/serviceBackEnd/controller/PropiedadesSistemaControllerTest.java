/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcz.serviceBackEnd.controller;

import com.rcz.serviceBackEnd.beans.PropiedadesSistemaBean;
import com.rcz.serviceBackEnd.dao.PropiedadesSistemaDAO;
import com.rcz.serviceBackEnd.model.PropiedadesSistema;
import com.rcz.serviceBackEnd.service.PropiedadesServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 *
 * @author Renzo
 */
public class PropiedadesSistemaControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private PropiedadesSistemaController propiedadesSistemaController;

    @Mock
    private PropiedadesServiceImpl service;

    @Mock
    PropiedadesSistemaDAO propiedadesSistemaDAO;

    @Before
    public void startServer() throws Exception {
        MockitoAnnotations.initMocks(this);

        this.mockMvc = MockMvcBuilders.standaloneSetup(propiedadesSistemaController).build();

        reset(service);
    }

    /**
     * Test of getAllPropiedadesSistema method, of class
     * PropiedadesSistemaController.
     */
    @Test
    public void getAllPropiedadesSistemaTest() {
        List<PropiedadesSistema> list = new ArrayList<>();

        PropiedadesSistema pro1 = new PropiedadesSistema();
        pro1.setIdPropertie(new Long("1"));
        pro1.setDescripcion("Des");
        pro1.setKey("key");
        pro1.setValue("value");

        PropiedadesSistema pro2 = new PropiedadesSistema();
        pro2.setIdPropertie(new Long("2"));
        pro2.setDescripcion("Des2");
        pro2.setKey("key2");
        pro2.setValue("value2");

        list.add(pro1);
        list.add(pro2);

        when(propiedadesSistemaController.getAllPropiedadesSistema()).thenReturn(list);

        reset(service);
    }

    /**
     * Test of createPropiedadesSistema method, of class
     * PropiedadesSistemaController.
     */
    @Test
    public void createPropiedadesSistemaTest() {
        PropiedadesSistemaBean propiedadesSistemaBean = new PropiedadesSistemaBean();
        propiedadesSistemaBean.setIdPropertie(new Long("1"));
        propiedadesSistemaBean.setDescripcion("Des");
        propiedadesSistemaBean.setKey("key");
        propiedadesSistemaBean.setValue("value");

        PropiedadesSistema pro1 = new PropiedadesSistema();
        pro1.setIdPropertie(new Long("1"));
        pro1.setDescripcion("Des");
        pro1.setKey("key");
        pro1.setValue("value");

        when(propiedadesSistemaController.createPropiedadesSistema(propiedadesSistemaBean)).thenReturn(pro1);

        reset(service);

    }
//
//    /**
//     * Test of getPropiedadesSistemaById method, of class
//     * PropiedadesSistemaController.
//     */

    @Test
    public void getPropiedadesSistemaByIdTest() {
        PropiedadesSistema pro1 = new PropiedadesSistema();
        pro1.setIdPropertie(new Long("1"));
        pro1.setDescripcion("Des");
        pro1.setKey("key");
        pro1.setValue("value");

        when(service.obtenerPropiedadSistema(new Long("1"))).thenReturn(pro1);
        when(propiedadesSistemaController.getPropiedadesSistemaById(new Long("1"))).thenReturn(pro1);

        reset(service);
    }
//
//    /**
//     * Test of updatePropiedadesSistema method, of class
//     * PropiedadesSistemaController.
//     */
//    @Test
//    public void testUpdatePropiedadesSistema() {
//        System.out.println("updatePropiedadesSistema");
//        Long propiedadesSistemaRepositoryId = null;
//        PropiedadesSistema propiedadesSistemaRequest = null;
//        PropiedadesSistemaController instance = new PropiedadesSistemaController();
//        PropiedadesSistema expResult = null;
//        PropiedadesSistema result = instance.updatePropiedadesSistema(propiedadesSistemaRepositoryId, propiedadesSistemaRequest);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deletePropiedadesSistema method, of class
//     * PropiedadesSistemaController.
//     */
//    @Test
//    public void testDeletePropiedadesSistema() {
//        System.out.println("deletePropiedadesSistema");
//        Long propiedadesSistemaRepositoryId = null;
//        PropiedadesSistemaController instance = new PropiedadesSistemaController();
//        ResponseEntity expResult = null;
//        ResponseEntity result = instance.deletePropiedadesSistema(propiedadesSistemaRepositoryId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
