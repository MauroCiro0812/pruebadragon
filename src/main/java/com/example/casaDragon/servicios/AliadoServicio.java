package com.example.casaDragon.servicios;


import com.example.casaDragon.models.Aliado;
import com.example.casaDragon.models.Dragon;
import com.example.casaDragon.models.Jinete;
import com.example.casaDragon.repositorios.AliadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AliadoServicio {

    @Autowired
    AliadoRepositorio aliadoRepositorio;

    //Agregar un aliado
    public Aliado agregarAliado (Aliado datosAliado) throws Exception {

        //Llamar a las validaciones
        try {

            return aliadoRepositorio.save(datosAliado);

        }catch (Exception error){

            throw  new Exception(error.getMessage());
        }

    }

    //BuscarAliado
    public List<Aliado> buscarAliados() throws Exception {
        try {
            return aliadoRepositorio.findAll();

        }catch (Exception error){
            throw  new Exception(error.getMessage());
        }
    }
    
}
