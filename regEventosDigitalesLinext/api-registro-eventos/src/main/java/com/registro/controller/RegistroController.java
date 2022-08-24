package com.registro.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registro.dto.RegistroDto;
import com.registro.dto.RespuestaRegistroDto;
import com.registro.service.RegistroService;

/**
 * Controlador de las Apis para el registro de eventos.
 * @author Favian Ramos.
 *
 */

@RestController
@RequestMapping("/registro")
public class RegistroController {
	
	private static Logger logger=LoggerFactory.getLogger(RegistroController.class);
	
	@Autowired
	RegistroService registroService;
	
	/**
	 * Servicio de tipo Post que registra el evento
	 * @param registroDto
	 * @return RespuestaRegistroDto
	 */
	@CrossOrigin(origins =  "*")
	@PostMapping(value="/agregarRegistro")
	public RespuestaRegistroDto addRegistro(@RequestBody RegistroDto registroDto) {
		
		return registroService.registrarEvento(registroDto);
	}
	
}
