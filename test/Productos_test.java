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
import Modelo.Productos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Yimmy
 */
public class Productos_test {

    @Test
    public void probarCreacionProducto() {

        Productos producto = new Productos(
                1,
                "P001",
                "Laptop Lenovo",
                1,
                "Proveedor Lenovo",
                10,
                2500.50
        );

        assertEquals(1, producto.getId());
        assertEquals("P001", producto.getCodigo());
        assertEquals("Laptop Lenovo", producto.getNombre());
        assertEquals(1, producto.getProveedor());
        assertEquals("Proveedor Lenovo", producto.getProveedorPro());
        assertEquals(10, producto.getStock());
        assertEquals(2500.50, producto.getPrecio());
    }


    @Test
    public void probarModificarProducto() {

        Productos producto = new Productos();

        producto.setId(2);
        producto.setCodigo("P002");
        producto.setNombre("Mouse Logitech");
        producto.setProveedor(2);
        producto.setProveedorPro("Proveedor Logitech");
        producto.setStock(25);
        producto.setPrecio(80.90);


        assertEquals(2, producto.getId());
        assertEquals("P002", producto.getCodigo());
        assertEquals("Mouse Logitech", producto.getNombre());
        assertEquals(2, producto.getProveedor());
        assertEquals("Proveedor Logitech", producto.getProveedorPro());
        assertEquals(25, producto.getStock());
        assertEquals(80.90, producto.getPrecio());
    }
}