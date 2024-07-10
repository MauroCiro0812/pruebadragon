package com.example.casaDragon.models;


import jakarta.persistence.*;

@Entity
@Table(name = "tabla_aliado")
public class Aliado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombres_aliado",nullable = true,length = 50)
    private String nombres;

    @Column(name = "ubicacion_aliado")
    private String ubicacion;

    @Column(name = "nombres_aliado")
    private Double aporte;

    public Aliado() {
    }

    public Aliado(Integer id, String nombres, String ubicacion, Double aporte) {
        this.id = id;
        this.nombres = nombres;
        this.ubicacion = ubicacion;
        this.aporte = aporte;
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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Double getAporte() {
        return aporte;
    }

    public void setAporte(Double aporte) {
        this.aporte = aporte;
    }
}
