package com.registro.service;

import org.hibernate.service.spi.ServiceException;

import com.registro.dto.RegistroDto;
import com.registro.dto.RespuestaRegistroDto;

/**
 * Interface para obtener registrar el evento. 
 * @author Favian Ramos
 *
 */
public interface RegistroService {

	RespuestaRegistroDto  registrarEvento (RegistroDto registroDto) throws ServiceException;
	
}
