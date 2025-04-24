package com.example.portafolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.portafolio.dto.ContactoDTO;
import com.example.portafolio.entity.Contacto;
import com.example.portafolio.repository.ContactoRepository;

@RestController
@RequestMapping("/api/contacto") //es mediante /api/contacto que se connecta con el frontend
@CrossOrigin(origins = "http://localhost:4200") // Permite peticiones desde Angular
public class ContactoController {

	 @Autowired
	    private ContactoRepository contactoRepository;

	    @PostMapping
	    public ResponseEntity<String> recibirMensaje(@RequestBody ContactoDTO contactoDTO) {
	        // Convertir DTO a entidad
	        Contacto contacto = new Contacto();
	        contacto.setNombre(contactoDTO.getNombre());
	        contacto.setApellido(contactoDTO.getApellido());
	        contacto.setEmail(contactoDTO.getEmail());
	        contacto.setMensaje(contactoDTO.getMensaje());

	        // Guardar en la base de datos
	        contactoRepository.save(contacto);

	        return ResponseEntity.ok("¡Mensaje guardado en la base de datos!");
	    }
	}

//El @CrossOrigin es importante para evitar problemas de CORS entre Angular y Spring Boot