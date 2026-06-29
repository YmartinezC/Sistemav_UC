/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Modelo.Cliente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Yimmy
 */
public class Cliente_test {

    @Test
    public void probarCreacionCliente() {

        Cliente cliente = new Cliente(
                1,
                "12345678",
                "Juan Perez",
                "999999999",
                "Av. Lima 123"
        );

        assertEquals(1, cliente.getId());
        assertEquals("12345678", cliente.getDni());
        assertEquals("Juan Perez", cliente.getNombre());
        assertEquals("999999999", cliente.getTelefono());
        assertEquals("Av. Lima 123", cliente.getDireccion());
    }


    @Test
    public void probarModificarCliente() {

        Cliente cliente = new Cliente();

        cliente.setId(2);
        cliente.setDni("87654321");
        cliente.setNombre("Maria Lopez");
        cliente.setTelefono("988888888");
        cliente.setDireccion("Jr. Arequipa 456");


        assertEquals(2, cliente.getId());
        assertEquals("87654321", cliente.getDni());
        assertEquals("Maria Lopez", cliente.getNombre());
        assertEquals("988888888", cliente.getTelefono());
        assertEquals("Jr. Arequipa 456", cliente.getDireccion());
    }
}