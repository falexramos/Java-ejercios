package com.quasar.service;

import javax.xml.bind.ValidationException;

import com.quasar.dto.SateliteDto;
import com.quasar.dto.SateliteSplitDto;

public interface MensageService {

	public String descifrarMensaje(SateliteDto sateliteDto) throws ValidationException;
	public String descifrarMensaje(SateliteSplitDto sateliteSplitDto) throws ValidationException;
}
