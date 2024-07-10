package com.example.casaDragon.models;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "tabla_jinete")
public class Jinete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombres_jinete",nullable = true,length = 50)
    private String nombres;

    @Column(name = "edad_jinete")
    private Integer edad;

    @Column(name = "fecha_montura")
    private LocalDate fechaMontura;

    @ManyToOne
    Dragon dragon;

    public Jinete() {
    }

    public Jinete(Integer id, String nombres, Integer edad, LocalDate fechaMontura) {
        this.id = id;
        this.nombres = nombres;
        this.edad = edad;
        this.fechaMontura = fechaMontura;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public LocalDate getFechaMontura() {
        return fechaMontura;
    }

    public void setFechaMontura(LocalDate fechaMontura) {
        this.fechaMontura = fechaMontura;
    }
}


