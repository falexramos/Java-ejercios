package com.registro.service;

import java.util.List;

import org.hibernate.service.spi.ServiceException;

import com.registro.dto.RespuestaResportesDto;

/**
 * Interface para los reportes 
 * @author Favian Ramos
 *
 */

public interface ReporteService {
	
	List<RespuestaResportesDto> respoterEventosdigitales(String plataforma) throws ServiceException;
}
