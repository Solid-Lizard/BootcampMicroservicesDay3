package com.nttdata.bootcamp.temperaturaspringautoconfigure.temperatura;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("temperatura.conversion")
@Getter
@Setter
public class TemperaturaProperties {
	private String eleccion;
	private double unidadesApasar;
	
}
