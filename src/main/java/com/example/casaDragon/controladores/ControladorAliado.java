package com.example.casaDragon.controladores;

import com.example.casaDragon.servicios.AliadoServicio;
import com.example.casaDragon.servicios.DragonServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("casaaliadoapi/v1/dragon")
public class ControladorAliado {

    //Inyecta el servicio
    @Autowired
    AliadoServicio aliadoServicio;

    @PostMapping
    public ResponseEntity<?> guardarAliado(){
        return  null;
    }

    @GetMapping
    public ResponseEntity<?> buscarAliados(){
        return  null;
    }

    @GetMapping
    public ResponseEntity<?> buscarAliado(){
        return  null;
    }

    @PutMapping
    public ResponseEntity<?> editarAliado(){
        return  null;
    }

    @DeleteMapping
    public ResponseEntity<?> eliminarAliado(){
        return  null;
    }
}
