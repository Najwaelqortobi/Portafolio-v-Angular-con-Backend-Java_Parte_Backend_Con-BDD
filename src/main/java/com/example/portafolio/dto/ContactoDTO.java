package com.example.portafolio.dto;

public class ContactoDTO {


private String nombre;
private String apellido;
private String email;
private String mensaje;

// Constructor vacío 
public ContactoDTO() {}

// Getters y setters
public String getNombre() {
	return nombre; 
	}
public void setNombre(String nombre) { 
	this.nombre = nombre; 
	}

public String getApellido() {
	return apellido; 
	}
public void setApellido(String apellido){ 
	this.apellido = apellido; 
	}

public String getEmail() { 
	return email;
	}
public void setEmail(String email) {
	this.email = email;
	}

public String getMensaje() { 
	return mensaje; 
	}
public void setMensaje(String mensaje){ 
	this.mensaje = mensaje; 
	}
}