package com.example.casaDragon.DTO;

public class DragonDTO {

    private String nombres;

    private Integer edad;

    public DragonDTO() {
    }

    public DragonDTO(String nombres, Integer edad) {
        this.nombres = nombres;
        this.edad = edad;
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
}
