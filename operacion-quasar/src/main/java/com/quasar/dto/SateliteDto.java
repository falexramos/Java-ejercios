package com.quasar.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter	
@ToString
public class SateliteDto {

private List<Satelites> satelite;	
	

	@Getter
	@Setter
	@ToString
	public static class Satelites{
		private String name;
		private double distance;
		private List<String>  message;
	}
	
}
