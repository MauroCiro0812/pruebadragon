package com.example.casaDragon.DTO;

public class AliadoDto {

    private String nombres;

    private String ubicacion;

    public AliadoDto() {
    }

    public AliadoDto(String nombres, String ubicacion) {
        this.nombres = nombres;
        this.ubicacion = ubicacion;
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
}
