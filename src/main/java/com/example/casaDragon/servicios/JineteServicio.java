package com.example.casaDragon.servicios;

import com.example.casaDragon.models.Dragon;
import com.example.casaDragon.models.Jinete;
import com.example.casaDragon.repositorios.JineteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JineteServicio {

    @Autowired
    JineteRepositorio jineteRepositorio;

    //Agregar un jinete
    public  Jinete agregarJinete(Jinete datosJinete) throws Exception {

        //Llamar a las validaciones
        try {

            return jineteRepositorio.save(datosJinete);

        }catch (Exception error){

            throw  new Exception(error.getMessage());
        }
    }

    //BuscarJinetes
    public List<Jinete> buscarJinetes() throws Exception {
        try {
            return jineteRepositorio.findAll();

        }catch (Exception error){
            throw  new Exception(error.getMessage());
        }
    }

}
