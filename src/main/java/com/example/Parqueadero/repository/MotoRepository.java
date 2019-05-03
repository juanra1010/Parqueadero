package com.example.Parqueadero.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Parqueadero.entity.Moto;
import com.example.Parqueadero.entity.Vehiculo;

public interface MotoRepository extends JpaRepository <Moto, Long>{

}
