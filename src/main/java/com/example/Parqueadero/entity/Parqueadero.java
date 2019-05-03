package com.example.Parqueadero.entity;

import java.util.List;

import javax.persistence.*;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
@Entity
public class Parqueadero {

	@Id
	@JsonProperty
	@GeneratedValue
	private long id;
	@JsonProperty
	private int puestosDosponibles;
	@JsonProperty
	private int puestosOcupados;
	
	@JsonProperty
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "park")
	private List<Vehiculo> vehiculos;
	
	
	public Parqueadero(){
		this.puestosDosponibles = 15;
		this.puestosOcupados = 0;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPuestosDosponibles() {
		return puestosDosponibles;
	}

	public void setPuestosDosponibles(int puestosDosponibles) {
		this.puestosDosponibles = puestosDosponibles;
	}

	public int getPuestosOcupados() {
		return puestosOcupados;
	}

	public void setPuestosOcupados(int puestosOcupados) {
		this.puestosOcupados = puestosOcupados;
	}

	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	@Override
	public String toString() {
		return "Parqueadero [id=" + id + ", puestosDosponibles="
				+ puestosDosponibles + ", puestosOcupados=" + puestosOcupados
				+ ", vehiculos=" + vehiculos + "]";
	}
	
}
