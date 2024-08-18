package com.example.ntt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ntt.model.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {}