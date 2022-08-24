package com.registro.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registro.dto.RespuestaResportesDto;
import com.registro.service.ReporteService;

/**
 * Controlador de las Apis para los reportes.
 * @author Favian Ramos.
 *
 */

@RestController
@RequestMapping("/reporte")
public class ReporteController {
	
	@Autowired
	ReporteService reporteService;
	/**
	 * Api que devulve el listado de los enventos digitales consolidado por plataforma
	 * @param plataforma
	 * @return Lista consolidada
	 */
	@CrossOrigin(origins = "*")
	@GetMapping("/consolidadoEventos/{plataforma}")	
	public List<RespuestaResportesDto> reporteConsolidadoEventos(@PathVariable("plataforma") String plataforma) {
				
		return reporteService.respoterEventosdigitales(plataforma).stream().collect(Collectors.toList());
	}

}
