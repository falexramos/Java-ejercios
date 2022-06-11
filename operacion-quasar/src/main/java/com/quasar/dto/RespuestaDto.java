package com.quasar.dto;

import com.quasar.util.Position;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RespuestaDto {
	

	private Position position; 
	private String mensaje;
}
