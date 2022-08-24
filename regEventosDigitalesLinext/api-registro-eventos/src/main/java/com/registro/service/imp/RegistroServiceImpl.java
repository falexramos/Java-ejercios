package com.registro.service.imp;

import java.util.Date;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.registro.dto.RegistroDto;
import com.registro.dto.RespuestaRegistroDto;
import com.registro.model.Evento;
import com.registro.model.RegistroEventos;
import com.registro.repository.EventoRepository;
import com.registro.repository.RegistroEventoRepository;
import com.registro.service.RegistroService;

@Service
public class RegistroServiceImpl implements RegistroService{

	@Autowired
	RegistroEventoRepository registroRepository;
	
	@Autowired
	EventoRepository eventoRepository;
	
	private static Integer cantidadCosto=1;	
	
	/**
	 * Metodo encargado de registrar el evento
	 * @param RegistroDto
	 * @return RespuestaRegistroDto
	 * 
	 */
	
	@Override
	public RespuestaRegistroDto registrarEvento(RegistroDto registroDto) throws ServiceException{
		RespuestaRegistroDto respuestaRegistroDto = new RespuestaRegistroDto() ; 
		
		Optional<Evento> costoEvento = consultarCostoEvento(registroDto.getEvento());
		
		RegistroEventos registro = new RegistroEventos();
		
		registro = modelRegistroEvento(costoEvento,registroDto);
		
		try {
			registroRepository.save(registro);
			respuestaRegistroDto.setCodeStatus(HttpStatus.CREATED.value());
			respuestaRegistroDto.setMessage("Registro Creado");
			
		} catch (Exception e) {
			respuestaRegistroDto.setCodeStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			respuestaRegistroDto.setMessage(e.getMessage());
		}
		
		return respuestaRegistroDto;
		
	}

	/**
	 * Método para consultar el costo del evento
	 * @param idEvento
	 * @return Evento
	 */
	private Optional<Evento> consultarCostoEvento(String evento) throws ServiceException {
		return eventoRepository.findById(evento);		 
	}
	
	/**
	 * Método encargado de Mapear los datos para el registro del evento
	 * @param costoEvento
	 * @param registroDto datos del registro
	 * @return el model con los datos mapeados
	 */
	private RegistroEventos modelRegistroEvento(Optional<Evento> costoEvento, RegistroDto registroDto) throws ServiceException{
		RegistroEventos registroEve = new RegistroEventos();
		
		registroEve.setIdRegistroEventos(null);
		registroEve.setFechaEvento(new Date(System.currentTimeMillis()));
		registroEve.setCantidad(cantidadCosto);
		registroEve.setCostoEvento(costoEvento.get().getValorEvento());
		registroEve.setEvento(registroDto.getEvento());
		registroEve.setPlataforma(registroDto.getPlataforma());
		
		return registroEve;
	}
	
	
}
