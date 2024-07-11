package com.example.casaDragon.helpers;

public enum MensajeServicios {

    DRAGON_NO_ENCONTRADO("El dragon no se encuentra en la base de datos"),
    JINETE_NO_ENCONTRADO("El jinete no se encuentra en la base de datos"),
    ALIADO_NO_ENCONTRADO("El aliado no se encuentra en la base de datos")
    ;

    private  String mensaje;

    MensajeServicios() {
    }

    MensajeServicios(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje(){
        return mensaje;
    }
}



