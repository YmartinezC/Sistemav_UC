package Modelo;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            // Obtiene la ruta del directorio raíz del proyecto
            String projectPath = new File("").getAbsolutePath();
            // Construye la ruta de la base de datos dentro de la carpeta del proyecto
            File dbFile = new File(projectPath + File.separator + "sis_java.accdb");

            // Verifica si el archivo existe antes de intentar conectarse
            if (dbFile.exists()) {
                String access = "jdbc:ucanaccess://" + dbFile.getAbsolutePath();
                con = DriverManager.getConnection(access);
                return con;
            } else {
                System.out.println("Error: El archivo de base de datos no se encuentra en la ruta: " + dbFile.getAbsolutePath());
            }
        } catch (SQLException e) {
            System.out.println("Error al conectarse a la base de datos: " + e.toString());
        }
        return null;
    }
}
