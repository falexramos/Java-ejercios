package com.registro.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="registro_eventos")
@Setter
@Getter
@ToString

/**
 * Entidad que contine el historico de los eventos registrados para cada plataforma
 * @author Favian Ramos
 *
 */
public class RegistroEventos {
	
	@Id
	@Column(name="id_registro_eventos")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRegistroEventos;
	
	@Column(name="fecha_evento")
	private Date fechaEvento;
	
	@Column(name="cantidad")
	private Integer cantidad;
	
	@Column(name="costo_evento")
	private Double costoEvento;
	
	@Column(name="evento_idevento")
	private String evento;
	
	@Column(name="plataforma_id_plataforma")
	private String plataforma;
	
}
