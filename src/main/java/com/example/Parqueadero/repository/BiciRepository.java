package com.example.Parqueadero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Parqueadero.entity.Bici;

public interface BiciRepository extends JpaRepository <Bici, Long>{

}
