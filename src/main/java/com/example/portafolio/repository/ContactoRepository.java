package com.example.portafolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.portafolio.entity.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Long> {
}