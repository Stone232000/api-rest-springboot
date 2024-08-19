package com.example.ntt.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ntt.model.Movimiento;
import com.example.ntt.model.MovimientoDTO;
import com.example.ntt.repository.MovimientoRepository;

@Service
public class MovimientoService {


    @Autowired
    private MovimientoRepository movimientoRepository;

    public List<MovimientoDTO> listarMovimientosPorFechaYUsuario(LocalDate fechaInicio, LocalDate fechaFin) {
        List<Movimiento> movimientos = movimientoRepository.findAllByFechaBetween(fechaInicio, fechaFin);

        return movimientos.stream().map(movimiento -> {
            MovimientoDTO dto = new MovimientoDTO();
            dto.setFecha(movimiento.getFecha());
            dto.setClienteNombre(movimiento.getCuenta().getCliente().getNombre());
            dto.setNumeroCuenta(movimiento.getCuenta().getNumeroCuenta());
            dto.setTipoCuenta(movimiento.getCuenta().getTipoCuenta());
            dto.setSaldoInicial(movimiento.getCuenta().getSaldoInicial());
            dto.setEstado(movimiento.getCuenta().isEstado());
            dto.setValorMovimiento(movimiento.getValor());
            dto.setSaldoDisponible(movimiento.getCuenta().getSaldoInicial() + movimiento.getValor());
            return dto;
        }).collect(Collectors.toList());
    }
}