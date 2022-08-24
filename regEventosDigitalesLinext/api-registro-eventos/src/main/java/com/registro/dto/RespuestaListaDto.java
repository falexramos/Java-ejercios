package com.registro.dto;

import java.util.List;

import com.registro.model.Evento;
import com.registro.model.Plataforma;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class RespuestaListaDto {

	private List<Evento> evento;
	private List<Plataforma> plataforma;
}
