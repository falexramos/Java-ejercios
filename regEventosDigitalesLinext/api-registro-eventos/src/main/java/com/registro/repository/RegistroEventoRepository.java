package com.registro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.model.RegistroEventos;

/**
 * Interface de los metodos del registro de eventos, consulta y registro  a la base de datos
 * @author Favian Ramos
 *
 */
@Repository
public interface RegistroEventoRepository extends JpaRepository<RegistroEventos, Integer> {

	
	
}
