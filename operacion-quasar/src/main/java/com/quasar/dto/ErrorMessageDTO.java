package com.quasar.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
/**
 * Objeto que se devuelve con el mensaje de error a la petición cuando esta
 * falla.
 * 
 * @author Favian Ramos
 *
 */
public class ErrorMessageDTO implements Serializable {
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	public ErrorMessageDTO(String message) {
		super();
		this.message = message;
	}

	private String message;
}
