package com.example.Parqueadero;

import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParqueaderoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParqueaderoApplication.class, args);
		int fecha = new Date().getMinutes();
//		Date calendar = Calendar.getInstance().getTime().getHours();
		System.out.println(fecha);
//		System.out.println(calendar);
		
	}
	
	public static int  calcularTiempo(){
		int tiempo=0;
		int 
		
		return tiempo;
	}

}
