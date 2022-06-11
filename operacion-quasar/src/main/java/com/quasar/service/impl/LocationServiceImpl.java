package com.quasar.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quasar.controller.LocationController;
import com.quasar.dto.RespuestaDto;
import com.quasar.dto.SateliteDto;
import com.quasar.dto.SateliteSplitDto;
import com.quasar.entity.Satelite;
import com.quasar.repository.InterfaceLocationRepository;
import com.quasar.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

	private static Logger logger = LoggerFactory.getLogger(LocationController.class);

	@Autowired
	private InterfaceLocationRepository l;

	@Autowired
	private MensageServiceImpl mensageServiceImpl;
	
	@Autowired
	private PositionServiceImpl positionServiceImpl;

	@Override
	public RespuestaDto getLocation(SateliteDto sateliteDto) {		
		List<Satelite> satelites = l.findAll();
		RespuestaDto respuestaDto = new RespuestaDto();
		respuestaDto.setMensaje(mensageServiceImpl.descifrarMensaje(sateliteDto));
		respuestaDto.setPosition(positionServiceImpl.satelitePosicion(satelites,sateliteDto));
		
		return respuestaDto;
	}

	@Override
	public RespuestaDto getLocationSplit(SateliteSplitDto sateliteSplitDto, String sateliteName) {
		List<Satelite> satelite = l.findByName(sateliteName);
		RespuestaDto respuestaDto = new RespuestaDto();
		respuestaDto.setMensaje(mensageServiceImpl.descifrarMensaje(sateliteSplitDto));
		respuestaDto.setPosition(positionServiceImpl.satelitePosicion(satelite,sateliteSplitDto));
		return respuestaDto;
	}

}
