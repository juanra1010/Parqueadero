package com.example.Parqueadero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Parqueadero.entity.Vehiculo;

@Repository
public interface VehiculoRepository  extends JpaRepository<Vehiculo, Long>{

	
	
}
