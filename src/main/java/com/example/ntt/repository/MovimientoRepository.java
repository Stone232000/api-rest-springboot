package com.example.ntt.repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ntt.model.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
	
	List<Movimiento> findAllByFechaBetween(Date fechaInicio, Date fechaFin);

	List<Movimiento> findAllByFechaBetween(LocalDate fechaInicio, LocalDate fechaFin);
}
