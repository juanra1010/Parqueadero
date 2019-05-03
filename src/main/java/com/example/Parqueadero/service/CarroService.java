package com.example.Parqueadero.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Parqueadero.entity.Carro;
import com.example.Parqueadero.interfac.Procesos;
import com.example.Parqueadero.repository.CarroRepository;

public class CarroService implements Procesos{

	private double ciclo;
	
	@Autowired
	Carro carro;
	
	@Autowired
	CarroRepository carroRepository;
	
	public boolean crearCarro(Carro carro){
		try {
			carroRepository.save(carro);
			int indice = (int) carro.getId();
			carro.setIndice(indice);
			carro.setHoraEntrada(calcularChekIn());
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public List<Carro> listarCarros(){
		List<Carro> carros = new ArrayList<Carro>();
		
		return carros;
	}
	
	
	
	@SuppressWarnings("deprecation")
	@Override
	public int calcularChekIn() {
		return new java.util.Date().getMinutes();//retorna el minuto en que ingresa
	}

	@SuppressWarnings("deprecation")
	@Override
	public int calcularChekOut() {
		return new java.util.Date().getMinutes();//retorna el minuto en que sale
	}

	@Override
	public int TiempoDeParqueo() {
		int tiempoDeParqueo = calcularChekOut() - calcularChekIn();
		if (tiempoDeParqueo==0) {
		 tiempoDeParqueo = 1;
		} 
		return tiempoDeParqueo;
	}
	
	

}
