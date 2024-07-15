package com.example.casaDragon.servicios;

import com.example.casaDragon.DTO.JineteDTO;
import com.example.casaDragon.helpers.MensajeServicios;
import com.example.casaDragon.mapas.IMapaJinete;
import com.example.casaDragon.models.Dragon;
import com.example.casaDragon.models.Jinete;
import com.example.casaDragon.repositorios.JineteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JineteServicio {

    @Autowired
    JineteRepositorio jineteRepositorio;

    @Autowired
    IMapaJinete iMapaJinete;
    //Agregar un jinete
    public JineteDTO agregarJinete(Jinete datosJinete) throws Exception {

        //Llamar a las validaciones
        try {

            return iMapaJinete.mapearJinete(jineteRepositorio.save(datosJinete));

        }catch (Exception error){

            throw  new Exception(error.getMessage());
        }
    }

    //BuscarJinetes
    public List<JineteDTO> buscarJinetes() throws Exception {
        try {
            return iMapaJinete.mapearListaJinetes(jineteRepositorio.findAll());

        }catch (Exception error){
            throw  new Exception(error.getMessage());
        }
    }

    //BuscarUnJineteLlavePrimaria
    public JineteDTO buscarJinetePorId(Integer idJinete) throws  Exception{

        try {

            Optional<Jinete> jineteEncontrado =  jineteRepositorio.findById(idJinete);
            if(jineteEncontrado.isPresent()){
                return iMapaJinete.mapearJinete(jineteEncontrado.get());
            }else {
                throw  new Exception(MensajeServicios.JINETE_NO_ENCONTRADO.getMensaje());
            }

        }catch (Exception error){
            throw  new Exception(error.getMessage());
        }

    }


    //EditarInformacionJinete
    public JineteDTO modificarJinete(Integer idJinete, Jinete datosNuevosJinete) throws  Exception{
        try {
            //Buscar el jinete que voy a editar
            Optional<Jinete>jineteEncontrado = jineteRepositorio.findById(idJinete);
            if (jineteEncontrado.isPresent()){
                //Traer los datos del jinete que estan en Bd
                Jinete jinete = jineteEncontrado.get();

                //Guardo los datos nuevos del dragon utilizando el mismo objeto
                jinete.setEdad(datosNuevosJinete.getEdad());

                return iMapaJinete.mapearJinete(jineteRepositorio.save(jinete));

            }else {
                throw  new Exception(MensajeServicios.DRAGON_NO_ENCONTRADO.getMensaje());
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }
    //EliminarJinete
    public boolean eliminarJinete(Integer id)throws Exception{
        try {
            Optional<Jinete>jineteEncontrado = jineteRepositorio.findById(id);
            if (jineteEncontrado.isPresent()){
                jineteRepositorio.deleteById(id);
                return true;

            }else {
                throw  new Exception(MensajeServicios.DRAGON_NO_ENCONTRADO.getMensaje());
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

}


