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
import Modelo.login;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Yimmy
 */
public class login_test {

    @Test
    public void probarCreacionUsuario() {

        login usuario = new login(
                1,
                "Juan Perez",
                "juan@gmail.com",
                "12345",
                "Administrador"
        );

        assertEquals(1, usuario.getId());
        assertEquals("Juan Perez", usuario.getNombre());
        assertEquals("juan@gmail.com", usuario.getCorreo());
        assertEquals("12345", usuario.getPass());
        assertEquals("Administrador", usuario.getRol());
    }


    @Test
    public void probarModificarUsuario() {

        login usuario = new login();

        usuario.setId(2);
        usuario.setNombre("Maria Lopez");
        usuario.setCorreo("maria@gmail.com");
        usuario.setPass("abc123");
        usuario.setRol("Empleado");


        assertEquals(2, usuario.getId());
        assertEquals("Maria Lopez", usuario.getNombre());
        assertEquals("maria@gmail.com", usuario.getCorreo());
        assertEquals("abc123", usuario.getPass());
        assertEquals("Empleado", usuario.getRol());
    }
}