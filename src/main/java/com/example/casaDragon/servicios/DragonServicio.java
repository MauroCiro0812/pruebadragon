package com.example.casaDragon.servicios;

import com.example.casaDragon.models.Dragon;
import com.example.casaDragon.repositorios.DragonRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DragonServicio {

    @Autowired
    DragonRepositorio dragonRepositorio;

    //AgregarUnDragon
    public Dragon agregarDragon(Dragon datosDragon) throws Exception{
        //Llamar a las validaciones
        try {
            return dragonRepositorio.save(datosDragon);

        }catch(Exception error){
            throw  new Exception(error.getMessage());
        }
    }
    //BuscarTodosDragones
    public List<Dragon> buscarDragones() throws Exception {
        try {
            return dragonRepositorio.findAll();

        }catch (Exception error){
            throw  new Exception(error.getMessage());
        }
    }

    //BuscarUnDragonLlavePrimaria
    //EditarInformacionDargon
    //EliminarDragon
}
