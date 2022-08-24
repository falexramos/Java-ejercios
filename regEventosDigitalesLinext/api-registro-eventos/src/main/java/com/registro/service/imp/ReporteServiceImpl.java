package com.registro.service.imp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registro.dto.RespuestaResportesDto;
import com.registro.repository.ReportesRespository;
import com.registro.service.ReporteService;

@Service
public class ReporteServiceImpl implements ReporteService{
	
	@Autowired
	ReportesRespository reportesRespository;
	
	@Override
	public List<RespuestaResportesDto> respoterEventosdigitales(String plataforma) throws ServiceException {
		List<RespuestaResportesDto> response = new ArrayList<>();
		try {
			response = reportesRespository.generarReporteEventos(plataforma);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return response;
	}

}
