package com.example.Parqueadero.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Carro extends Vehiculo implements Serializable{

	private static final long serialVersionUID = 1L;

	public Carro() {
		super();
	}

	public Carro(long id, int codigo, int indice, String nombre,
			int horaEntrada, int horaSalida, double costoHora,
			double descuento, Parqueadero park) {
		super(id, codigo, indice, nombre, horaEntrada, horaSalida, costoHora,
				descuento, park);
	}
	
	
	
	
	

}
