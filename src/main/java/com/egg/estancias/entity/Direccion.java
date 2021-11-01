package com.egg.estancias.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "direcciones")
public class Direccion {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String idDireccion;
    private String calle;
    private Integer numero;
    @Column(name = "codigo_postal")
    private String codigoPostal;
    private String ciudad;
    private String pais;

}
