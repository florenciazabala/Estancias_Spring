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
@Table(name = "estancias")
public class Estancia {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String idEstancia;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Casa casa;
    private String nombreHuesped;
    @Column(name = "fecha_desde")
    private LocalDate fechaDesde;
    @Column(name = "fecha_hasta")
    private LocalDate fechaHasta;
}
