package com.quasar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quasar.dto.RespuestaDto;
import com.quasar.dto.SateliteSplitDto;
import com.quasar.service.LocationService;


@RestController
@RequestMapping("/topsecret_split")
public class LocationSplitController {
	private static Logger logger=LoggerFactory.getLogger(LocationController.class);
	
	@Autowired
	private LocationService locationService;
	
	@CrossOrigin(origins =  "*")
	@GetMapping(value="/{sateliteName}")
	public RespuestaDto getLocationNameGet(@PathVariable("sateliteName") String  sateliteName,@RequestBody SateliteSplitDto sateliteSplitDto){
		
		return locationService.getLocationSplit(sateliteSplitDto,sateliteName);
		
	}
	
	@CrossOrigin(origins =  "*")
	@PostMapping(value="/{sateliteName}")
	public RespuestaDto getLocationNamePost(@PathVariable("sateliteName") String  sateliteName,
									  @RequestBody SateliteSplitDto sateliteSplitDto	){
		
		return locationService.getLocationSplit(sateliteSplitDto,sateliteName);
		
	}
	
}
