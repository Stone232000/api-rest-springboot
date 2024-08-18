package com.example.ntt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ntt.model.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {}