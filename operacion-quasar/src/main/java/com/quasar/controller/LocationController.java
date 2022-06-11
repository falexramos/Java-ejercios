package com.quasar.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quasar.dto.RespuestaDto;
import com.quasar.dto.SateliteDto;
import com.quasar.service.LocationService;

@RestController
@RequestMapping("/topsecret")
public class LocationController {
	
	private static Logger logger=LoggerFactory.getLogger(LocationController.class);
	
	@Autowired
	private LocationService locationService;
	
	@CrossOrigin(origins =  "*")
	@PostMapping
	public RespuestaDto getLocation(@RequestBody SateliteDto sateliteDto) {		
		
		return locationService.getLocation(sateliteDto);		
		
	}
	
	
	
}
