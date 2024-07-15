package com.example.casaDragon.servicios;

import com.example.casaDragon.DTO.DragonDTO;
import com.example.casaDragon.helpers.MensajeServicios;
import com.example.casaDragon.mapas.IMapaDragon;
import com.example.casaDragon.models.Dragon;
import com.example.casaDragon.repositorios.DragonRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DragonServicio {

    @Autowired
    DragonRepositorio dragonRepositorio;

    @Autowired
    IMapaDragon iMapaDragon;

    //AgregarUnDragon
    public DragonDTO agregarDragon(Dragon datosDragon) throws Exception{
        //Llamar a las validaciones
        try {
            return iMapaDragon.mapearDragon(dragonRepositorio.save(datosDragon));

        }catch(Exception error){
            throw  new Exception(error.getMessage());
        }
    }
    //BuscarTodosDragones
    public List<DragonDTO> buscarDragones() throws Exception {
        try {
            return iMapaDragon.mapearListaDragones(dragonRepositorio.findAll());

        }catch (Exception error){
            throw  new Exception(error.getMessage());
        }
    }

    //BuscarUnDragonLlavePrimaria
    public DragonDTO buscarDragonPorId(Integer idDragon) throws  Exception{

        try {

            Optional<Dragon>dragonEncontrado =  dragonRepositorio.findById(idDragon);
            if(dragonEncontrado.isPresent()){
                return iMapaDragon.mapearDragon(dragonEncontrado.get());
            }else {
                throw  new Exception(MensajeServicios.DRAGON_NO_ENCONTRADO.getMensaje());
            }

        }catch (Exception error){
            throw  new Exception(error.getMessage());
        }

    }


    //EditarInformacionDargon
    public DragonDTO modificarDragon(Integer idDragon, Dragon datosNuevosDragon) throws  Exception{
        try {
            //Buscar el dragon que voy a editar
            Optional<Dragon>dragonEncontrado = dragonRepositorio.findById(idDragon);
            if (dragonEncontrado.isPresent()){
                //Traer los datos del dragon que estan en Bd
                Dragon dragon = dragonEncontrado.get();

                //Guardo los datos nuevos del dragon utilizando el mismo objeto
                dragon.setEdad(datosNuevosDragon.getEdad());

                return iMapaDragon.mapearDragon(dragonRepositorio.save(dragon));

            }else {
                throw  new Exception(MensajeServicios.DRAGON_NO_ENCONTRADO.getMensaje());
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }

    //EliminarDragon
    public boolean eliminarDragon(Integer id)throws Exception{
        try {
            Optional<Dragon>dragonEncontrado = dragonRepositorio.findById(id);
            if (dragonEncontrado.isPresent()){
                dragonRepositorio.deleteById(id);
                return true;

            }else {
                throw  new Exception(MensajeServicios.DRAGON_NO_ENCONTRADO.getMensaje());
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //buscarUnDragonNombre
}
