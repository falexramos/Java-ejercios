package com.quasar.dto;

import com.quasar.util.Position;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
/**
 * Objeto de tipo Dto donde se da respuesta a la solicitud con los datos de la posicion y mensaje descifrado
 * @author Favian Ramos
 *
 */
public class RespuestaDto {
	

	private Position position; 
	private String mensaje;
	
}
