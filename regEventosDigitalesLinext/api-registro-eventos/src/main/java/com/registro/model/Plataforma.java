package com.registro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="plataforma")
@Setter
@Getter
@ToString

/**
 * Entidad que contine los datos de las plataformas
 * @author Favian Ramos
 *
 */
public class Plataforma {
	
	
	@Id
	@Column(name="id_plataforma")
	private String idPlataforma;
	
	@Column(name="nombre_plataforma")
	private String nombrePlataforma;
}
