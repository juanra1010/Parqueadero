package com.example.Parqueadero.entity;

import java.sql.Date;

import javax.persistence.*;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
@Entity
@Table(name = "vehiculo")
public class Vehiculo {

    @Id
    @GeneratedValue
    @Column(name = "id", unique = true , nullable = false )
    @JsonProperty
	private long id;
    @JsonProperty
    private int codigo;
    @JsonProperty
    private int indice;
    @JsonProperty
	private String nombre;
    @JsonProperty
	private int horaEntrada;
    @JsonProperty
	private int horaSalida;
    @JsonProperty
	private double costoHora;
    @JsonProperty
	private double descuento;
	
    @JsonProperty
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_PARQUEADERO")
    Parqueadero park;
	
    public Vehiculo(){
    }
    
	
    
	public Vehiculo(long id, int codigo, int indice, String nombre,
			int horaEntrada, int horaSalida, double costoHora,
			double descuento, Parqueadero park) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.indice = indice;
		this.nombre = nombre;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
		this.costoHora = costoHora;
		this.descuento = descuento;
		this.park = park;
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public int getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}
	public double getCostoHora() {
		return costoHora;
	}
	public void setCostoHora(double costoHora) {
		this.costoHora = costoHora;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public Parqueadero getPark() {
		return park;
	}
	public void setPark(Parqueadero park) {
		this.park = park;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}



	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", codigo=" + codigo + ", indice="
				+ indice + ", nombre=" + nombre + ", horaEntrada="
				+ horaEntrada + ", horaSalida=" + horaSalida + ", costoHora="
				+ costoHora + ", descuento=" + descuento + ", park=" + park
				+ "]";
	}
	
	
	
	
	
}
