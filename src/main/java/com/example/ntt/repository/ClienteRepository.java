package com.example.ntt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ntt.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
