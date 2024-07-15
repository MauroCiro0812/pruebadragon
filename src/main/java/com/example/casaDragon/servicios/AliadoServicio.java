package com.example.casaDragon.servicios;


import com.example.casaDragon.DTO.AliadoDto;
import com.example.casaDragon.helpers.MensajeServicios;
import com.example.casaDragon.mapas.IMapaAliado;
import com.example.casaDragon.models.Aliado;
import com.example.casaDragon.models.Dragon;
import com.example.casaDragon.models.Jinete;
import com.example.casaDragon.repositorios.AliadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AliadoServicio {

    @Autowired
    AliadoRepositorio aliadoRepositorio;

    @Autowired
    IMapaAliado iMapaAliado;

    //Agregar un aliado
    public AliadoDto agregarAliado (Aliado datosAliado) throws Exception {

        //Llamar a las validaciones
        try {
            return iMapaAliado.mapearAliado(aliadoRepositorio.save(datosAliado));

        }catch (Exception error){

            throw  new Exception(error.getMessage());
        }

    }

    //BuscarAliado
    public List<AliadoDto> buscarAliados() throws Exception {
        try {
            return iMapaAliado.mapearListaAliados(aliadoRepositorio.findAll());

        }catch (Exception error){
            throw  new Exception(error.getMessage());
        }
    }

    //BuscarUnaAliadoLlavePrimaria
    public AliadoDto buscarAliadoPorId(Integer idAliado) throws  Exception{

        try {

            Optional<Aliado> aliadoEncontrado =  aliadoRepositorio.findById(idAliado);
            if(aliadoEncontrado.isPresent()){
                return iMapaAliado.mapearAliado(aliadoEncontrado.get());
            }else {
                throw  new Exception(MensajeServicios.ALIADO_NO_ENCONTRADO.getMensaje());
            }

        }catch (Exception error){
            throw  new Exception(error.getMessage());
        }

    }


    //EditarInformacionAliado
    public AliadoDto modificarAliado(Integer idAliado, Aliado datosNuevosAliado) throws  Exception{
        try {
            //Buscar el aliado que voy a editar
            Optional<Aliado>aliadoEncontrado = aliadoRepositorio.findById(idAliado);
            if (aliadoEncontrado.isPresent()){
                //Traer los datos del aliado que estan en Bd
                Aliado aliado = aliadoEncontrado.get();

                //Guardo los datos nuevos del aliado utilizando el mismo objeto
                aliado.setNombres(datosNuevosAliado.getNombres());

                return iMapaAliado.mapearAliado(aliadoRepositorio.save(aliado));

            }else {
                throw  new Exception(MensajeServicios.DRAGON_NO_ENCONTRADO.getMensaje());
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }
    //EliminarAliado
    public boolean eliminarAliado(Integer id)throws Exception{
        try {
            Optional<Aliado>aliadoEncontrado = aliadoRepositorio.findById(id);
            if (aliadoEncontrado.isPresent()){
                aliadoRepositorio.deleteById(id);
                return true;

            }else {
                throw  new Exception(MensajeServicios.DRAGON_NO_ENCONTRADO.getMensaje());
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

}


