package com.egg.estancias.entity;

import com.egg.estancias.util.TipoViviendas;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "casas")
public class Casa {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private Integer idCasa;
    @OneToOne
    private Direccion direccion;
    @Column(name = "fecha_desde")
    private LocalDate fechaDesde;
    @Column(name = "fecha_hasta")
    private LocalDate fechaHasta;
    @Column(name = "tiempo_minimo")
    private Integer tiempoMinimo;
    @Column(name = "tiempo_maximo")
    private Integer tiempoMaximo;
    @Column(name = "precio_habitacion")
    private BigDecimal precioHabitacion;
    @Column(name = "tipo_vivienda")
    private TipoViviendas tipoVivienda;

    @OneToMany(mappedBy = "casa",fetch = FetchType.LAZY)
    List<Comentario> comentarios;
}
