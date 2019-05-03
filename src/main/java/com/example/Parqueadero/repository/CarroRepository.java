package com.example.Parqueadero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Parqueadero.entity.Carro;

public interface CarroRepository  extends JpaRepository <Carro, Long>{

}
