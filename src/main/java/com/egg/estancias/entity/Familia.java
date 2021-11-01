package com.egg.estancias.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "familias")
public class Familia {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String idFamilia;
    @NotEmpty
    private String nombre;
    @Column(name = "edad_minima")
    private Integer edadMinima;
    @Column(name = "edad_maxima")
    private Integer edadMaxima;
    @Column(name = "num_hijos")
    private Integer numHijos;
    @Email
    private String email;

    @OneToOne
    private Casa casa;
    @OneToOne
    private Usuario usuario;
}
