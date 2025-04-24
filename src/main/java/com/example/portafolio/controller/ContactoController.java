package com.example.portafolio.controller;

import com.example.portafolio.dto.ContactoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contacto") //es mediante /api/contacto que se connecta con el frontend
@CrossOrigin(origins = "http://localhost:4200") // Permite peticiones desde Angular
public class ContactoController {

    @PostMapping
    public ResponseEntity<String> recibirMensaje(@RequestBody ContactoDTO contacto) {
        // Aquí puedes guardar el mensaje, enviar email, etc.
        System.out.println("Mensaje recibido: " + contacto.getNombre() + " " + contacto.getMensaje());
        return ResponseEntity.ok("¡Mensaje recibido!");
    }
}

//El @CrossOrigin es importante para evitar problemas de CORS entre Angular y Spring Boot