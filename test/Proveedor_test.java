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
import Modelo.Proveedor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Proveedor_test {

    @Test
    public void probarCreacionProveedor() {

        Proveedor proveedor = new Proveedor(
                1,
                "20123456789",
                "Distribuidora ABC",
                "999888777",
                "Av. Principal 456"
        );

        assertEquals(1, proveedor.getId());
        assertEquals("20123456789", proveedor.getRuc());
        assertEquals("Distribuidora ABC", proveedor.getNombre());
        assertEquals("999888777", proveedor.getTelefono());
        assertEquals("Av. Principal 456", proveedor.getDireccion());
    }

    @Test
    public void probarModificarProveedor() {

        Proveedor proveedor = new Proveedor();

        proveedor.setId(2);
        proveedor.setRuc("20987654321");
        proveedor.setNombre("Proveedor XYZ");
        proveedor.setTelefono("988777666");
        proveedor.setDireccion("Jr. Comercio 789");

        assertEquals(2, proveedor.getId());
        assertEquals("20987654321", proveedor.getRuc());
        assertEquals("Proveedor XYZ", proveedor.getNombre());
        assertEquals("988777666", proveedor.getTelefono());
        assertEquals("Jr. Comercio 789", proveedor.getDireccion());
    }
}
