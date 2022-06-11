package com.quasar.dto;

import java.util.List;

import com.quasar.dto.SateliteDto.Satelites;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter	
@ToString
public class SateliteSplitDto {
	private List<String> message;
	private double distance;
	
}
