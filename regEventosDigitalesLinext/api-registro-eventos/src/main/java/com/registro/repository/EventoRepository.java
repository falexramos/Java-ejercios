package com.registro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.model.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, String>{

}
