package com.registro.service;


import org.hibernate.service.spi.ServiceException;

import com.registro.dto.RespuestaListaDto;


public interface ListaService {

	RespuestaListaDto listas() throws ServiceException ;
	
	
}
