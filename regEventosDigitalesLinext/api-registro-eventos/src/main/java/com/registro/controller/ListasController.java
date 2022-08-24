package com.registro.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registro.dto.RespuestaListaDto;
import com.registro.service.ListaService;

/**
 * Controlador de las Apis para mostrar las listas.
 * @author Favian Ramos.
 *
 */

@RestController
@RequestMapping("/lista")
public class ListasController {
	
private static Logger logger=LoggerFactory.getLogger(RegistroController.class);
	
	@Autowired
	ListaService listaService;
	
	/**
	 * Servicio de tipo Post que registra el evento
	 * 
	 * @param registroDto
	 * @return RespuestaRegistroDto
	 */
	@CrossOrigin(origins = "*")
	@GetMapping
	public RespuestaListaDto listas() {

		return listaService.listas();
	}
	
	
}
