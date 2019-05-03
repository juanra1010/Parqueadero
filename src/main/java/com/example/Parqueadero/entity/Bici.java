package com.example.Parqueadero.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
@Entity
public class Bici extends Vehiculo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonProperty
	private String tipo; 
	
	public Bici(){
	}

	public Bici(long id, int codigo, int indice, String nombre,
			int horaEntrada, int horaSalida, double costoHora,
			double descuento, Parqueadero park, String tipo) {
		super(id, codigo, indice, nombre, horaEntrada, horaSalida, costoHora,
				descuento, park);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
