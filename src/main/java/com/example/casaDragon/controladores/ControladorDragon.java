package com.example.casaDragon.controladores;

import com.example.casaDragon.servicios.DragonServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("casadragonapi/v1/dragon")
public class ControladorDragon {

    //Inyecta el servicio
    @Autowired
    DragonServicio dragonServicio;

    @PostMapping
    public ResponseEntity<?> guardarDragon(){
        return  null;
    }

    @GetMapping
    public ResponseEntity<?> buscarDragones(){
        return  null;
    }

    @GetMapping
    public ResponseEntity<?> buscarDragon(){
        return  null;
    }

    @PutMapping
    public ResponseEntity<?> editarDragon(){
        return  null;
    }

    @DeleteMapping
    public ResponseEntity<?> eliminarDragon(){
        return  null;
    }
}
