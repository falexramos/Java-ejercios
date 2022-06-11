package com.quasar.service;

import com.quasar.dto.RespuestaDto;
import com.quasar.dto.SateliteDto;
import com.quasar.dto.SateliteDto.Satelites;
import com.quasar.dto.SateliteSplitDto;

public interface LocationService {
	
		public abstract RespuestaDto getLocation(SateliteDto satelite);

		public abstract RespuestaDto getLocationSplit(SateliteSplitDto sateliteSplitDto, String sateliteName);

		
		
	
}
