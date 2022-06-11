package com.quasar.service.impl;

import java.util.List;

import org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.lemmingapex.trilateration.NonLinearLeastSquaresSolver;
import com.lemmingapex.trilateration.TrilaterationFunction;
import com.quasar.controller.LocationController;
import com.quasar.dto.SateliteDto;
import com.quasar.dto.SateliteDto.Satelites;
import com.quasar.dto.SateliteSplitDto;
import com.quasar.entity.Satelite;
import com.quasar.util.Position;

@Service
public class PositionServiceImpl {
	public double i;
	private static Logger logger = LoggerFactory.getLogger(LocationController.class);

	public Position satelitePosicion(List<Satelite> satelites, SateliteDto sateliteDto) {

		double[] extraerDistancias = obtenerDistancias(sateliteDto);
		double[][] extraerPosiciones = obtenerPosiciones(satelites);

		double[] posicionRespuesta = obtenerLocalicacion(extraerPosiciones,extraerDistancias);
		Position resPosition = new Position();
		resPosition.setX(posicionRespuesta[0]);
		resPosition.setY(posicionRespuesta[1]);
		return resPosition;

	}

	public Position satelitePosicion(List<Satelite> satelite, SateliteSplitDto sateliteSplitDto) {
		double[] extraerDistancias = new double[1]; 
		extraerDistancias[0]=sateliteSplitDto.getDistance();
		double[][] extraerPosiciones = obtenerPosiciones(satelite);

		double[] posicionRespuesta = obtenerLocalicacion(extraerPosiciones,extraerDistancias);
		Position resPosition = new Position();
		resPosition.setX(posicionRespuesta[0]);
		resPosition.setY(posicionRespuesta[1]);
		return resPosition;
	}
	


	private double[][] obtenerPosiciones(List<Satelite> satelites) {
		double[][] posiciones = new double[satelites.size()][2];

		for (int x = 0; x < posiciones.length; x++) {
			posiciones[x][0] = satelites.get(x).getPositionX();
			posiciones[x][1] = satelites.get(x).getPositionY();
		}

		return posiciones;
	}

	public double[] obtenerDistancias(SateliteDto sateliteDto) {
		double[] distancias = new double[sateliteDto.getSatelite().size()];
		int i = 0;
		for (Satelites s : sateliteDto.getSatelite()) {
			distancias[i] = s.getDistance();
			i++;
		}
		return distancias;
	}

	public double[] obtenerLocalicacion(double[][] posiciones, double[] distancias) {

		TrilaterationFunction trilaterationFunction = new TrilaterationFunction(posiciones, distancias);
		NonLinearLeastSquaresSolver nonLinearLeastSquaresSolver = new NonLinearLeastSquaresSolver(trilaterationFunction,
				new LevenbergMarquardtOptimizer());
		return nonLinearLeastSquaresSolver.solve().getPoint().toArray();
	}



}
