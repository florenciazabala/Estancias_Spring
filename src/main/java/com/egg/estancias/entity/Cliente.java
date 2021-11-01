package com.egg.estancias.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String idCliente;
    private String nombre;
    private String apellido;
    @Email
    private String email;

    @ManyToOne
    private Direccion dirección;
    @OneToOne
    private Usuario usuario;

}
