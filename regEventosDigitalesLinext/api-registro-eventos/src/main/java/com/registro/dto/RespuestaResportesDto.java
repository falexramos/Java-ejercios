package com.registro.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * Entidad que contine los datos del reporte Eventos digitales
 * @author Favian Ramos
 *
 */
@Setter
@Getter
@ToString
@Entity
public class RespuestaResportesDto {

	@Id
	@Column(name="nombre_evento")
	private String nombreEvento;
	
	@Column(name="fecha_evento")
	private Date fechaEvento;
	
	@Column(name="cantidad")
	private Integer cantidad;
	
	@Column(name ="costo")
	private Long costo;
}
