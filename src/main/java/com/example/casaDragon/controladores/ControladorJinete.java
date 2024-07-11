package com.example.casaDragon.controladores;

import com.example.casaDragon.models.Jinete;
import com.example.casaDragon.servicios.DragonServicio;
import com.example.casaDragon.servicios.JineteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("casajineteapi/v1/jinete")
public class ControladorJinete {
    //Inyecta el servicio
    @Autowired
    JineteServicio jineteServicio;

    @PostMapping
    public ResponseEntity<?> guardarJinete(){
        return  null;
    }

    @GetMapping
    public ResponseEntity<?> buscarJinetes(){
        return  null;
    }

    @GetMapping
    public ResponseEntity<?> buscarJinete(){
        return  null;
    }

    @PutMapping
    public ResponseEntity<?> editarJinete(){
        return  null;
    }

    @DeleteMapping
    public ResponseEntity<?> eliminarJinete(){
        return  null;
    }
}
