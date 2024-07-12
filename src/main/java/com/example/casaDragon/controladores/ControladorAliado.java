package com.example.casaDragon.controladores;

import com.example.casaDragon.models.Aliado;
import com.example.casaDragon.servicios.AliadoServicio;
import com.example.casaDragon.servicios.DragonServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("casaaliadoapi/v1/aliado")
public class ControladorAliado {

    //Inyecta el servicio
    @Autowired
    AliadoServicio aliadoServicio;

    @PostMapping
    public ResponseEntity<?> guardarAliado(@RequestBody Aliado datosClienteAliado){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(aliadoServicio.agregarAliado(datosClienteAliado));

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }

    @GetMapping
    public ResponseEntity<?> buscarAliados(){
        try {

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(aliadoServicio.buscarAliados());

        }catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarAliado(@PathVariable Integer id){
        try {

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(aliadoServicio.buscarAliadoPorId(id));

        }catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
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
