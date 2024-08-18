package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.ntt.model.Cliente;
import com.example.ntt.repository.ClienteRepository;

@SpringBootTest
public class ClienteRepositoryTests {

    @Autowired
    private ClienteRepository clienteRepository;

    @Test
    public void testCreateCliente() {
        Cliente cliente = new Cliente();
        cliente.setNombre("Jose Lema");
        cliente.setContraseña("1234");
        cliente.setEstado(true);
        clienteRepository.save(cliente);

        assertNotNull(cliente.getId());
    }
}
