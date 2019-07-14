/*
 * To change this license header, choose License Headers in Project PropiedadesSistema.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcz.serviceBackEnd.model;

import com.rcz.serviceBackEnd.configuration.Auditable;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 * @author Renzo
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "PROPERTIES")
@EntityListeners(AuditingEntityListener.class)
public class PropiedadesSistema extends Auditable<String> implements Serializable {

    @Id
    @Column(name = "PROP_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPropertie;

    @Column(name = "PROP_DESC")
    private String descripcion;

    @Column(name = "PROP_KEY")
    private String key;

    @Column(name = "PROP_VALUE")
    private String value;

}
