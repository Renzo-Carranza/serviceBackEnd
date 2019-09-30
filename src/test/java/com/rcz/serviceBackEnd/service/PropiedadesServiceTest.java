/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcz.serviceBackEnd.service;

import com.rcz.serviceBackEnd.model.PropiedadesSistema;
import com.rcz.serviceBackEnd.repository.PropiedadesSistemaRepository;
import java.util.ArrayList;
import java.util.List;
import javafx.beans.binding.When;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author Renzo
 */
public class PropiedadesServiceTest {

    @InjectMocks
    private PropiedadesServiceImpl service;

    @Mock
    PropiedadesSistemaRepository propiedadesSistemaRepository;

    @Before
    public void startServer() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void obtenerListadoPropiedadesSistema() {
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
        //assertEquals(list, service.obtenerListadoPropiedadesSistema());

        when(service.obtenerListadoPropiedadesSistema()).thenReturn(list);

    }

}
