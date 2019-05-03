package com.example.Parqueadero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Parqueadero.entity.Parqueadero;


@Repository
public interface ParqueaderoRepository extends JpaRepository<Parqueadero, Long>{
	

}
