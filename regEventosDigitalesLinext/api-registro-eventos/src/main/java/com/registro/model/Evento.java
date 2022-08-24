package com.registro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="evento")
@Setter
@Getter
@ToString

/**
 * Entidad que contine los datos de los eventos
 * @author Favian Ramos
 *
 */
public class Evento {

	@Id
	@Column(name="idevento")
	private String idEvento;
	
	@Column(name="nombre_evento")
	private String nombreEvento;
	
	@Column(name="valor_evento")
	private Double valorEvento;
	
	
}



