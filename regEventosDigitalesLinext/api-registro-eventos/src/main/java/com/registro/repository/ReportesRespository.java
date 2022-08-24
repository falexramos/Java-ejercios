package com.registro.repository;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.registro.dto.RespuestaResportesDto;

@Repository
public interface ReportesRespository extends JpaRepository<RespuestaResportesDto, String>{

	
	@Query(nativeQuery = true, value = "SELECT e.nombre_evento,a.fecha_evento,COUNT(a.cantidad) AS cantidad,SUM(a.costo_evento) as costo "
			+ "FROM  registro_eventos a  "
			+ "INNER JOIN 	evento e ON (a.evento_idevento = e.idevento) "
			+ "INNER JOIN	plataforma p ON (a.plataforma_id_plataforma = p.id_plataforma) "
			+ "WHERE p.id_plataforma = ?1  "
			+ "GROUP BY e.nombre_evento,a.fecha_evento ORDER "
			+ "BY a.fecha_evento ASC, e.nombre_evento ASC")
	public List<RespuestaResportesDto> generarReporteEventos(String plataforma) throws SQLException;
}
