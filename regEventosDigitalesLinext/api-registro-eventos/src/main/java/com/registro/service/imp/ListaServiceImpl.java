package com.registro.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registro.dto.RespuestaListaDto;
import com.registro.model.Evento;
import com.registro.model.Plataforma;
import com.registro.repository.EventoRepository;
import com.registro.repository.PlataformaRepository;
import com.registro.service.ListaService;

@Service
public class ListaServiceImpl implements ListaService {
	
	@Autowired
	EventoRepository eventoRepository;
	
	@Autowired
	PlataformaRepository plataformaRepository;
	
	@Override
	public RespuestaListaDto listas() throws ServiceException{
		RespuestaListaDto lista=new RespuestaListaDto();
		
		List<Evento> lisEvento = eventoRepository.findAll();
		List<Plataforma> lisPlataforma = plataformaRepository.findAll();
		
		lista.setEvento(lisEvento);
		lista.setPlataforma(lisPlataforma);
		
		
		return lista;
	}

	private List<Evento> consultarListaEvento()throws ServiceException {
		eventoRepository.findAll();
		return null;
	}

}
