package com.example.casaDragon.controladores;

import com.example.casaDragon.models.Jinete;
import com.example.casaDragon.servicios.DragonServicio;
import com.example.casaDragon.servicios.JineteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("casajineteapi/v1/jinete")
public class ControladorJinete {
    //Inyecta el servicio
    @Autowired
    JineteServicio jineteServicio;

    @PostMapping
    public ResponseEntity<?> guardarJinete(@RequestBody Jinete datosClienteJinete){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(jineteServicio.agregarJinete(datosClienteJinete));

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }

    @GetMapping
    public ResponseEntity<?> buscarJinetes(){
        try {

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(jineteServicio.buscarJinetes());

        }catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarJinete(@PathVariable Integer id){
        try {

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(jineteServicio.buscarJinetePorId(id));

        }catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
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
