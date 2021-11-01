package com.egg.estancias.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String idUsuarios;
    private String alias;
    private String mail;
    private String clave;
    @Column(name = "fecha_alta")
    private LocalDate fechaAlta;
    @Column(name = "fecha_baja")
    private LocalDate fechaBaja;
}
