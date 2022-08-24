package com.registro.dto;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class RespuestaRegistroDto {

	
	private String message;
	private Integer codeStatus;
	
	
}
