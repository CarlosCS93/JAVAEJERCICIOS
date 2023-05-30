package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {

    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";

// conecta la base deatos
    protected void conectarBase() throws Exception {
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }

// desactiva todas la conexiones existentes
    protected void desconectarBase() throws Exception {
        try {
            if (resultado != null) {
                resultado.close(); // .close permite cerrar la conexion con la base de datos
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

// me conecta a la base de datos, ejecuta las sentencias y desactiva de la base de datos
    protected void insertarModificarEliminar(String sql) throws Exception {
        try {
            conectarBase(); // primero conectar a la base de datos 
            sentencia = conexion.createStatement(); // preparar una sentencia (query en MySQL)
            sentencia.executeUpdate(sql); // ejecuta una query mediante la sentencia antes enciada por parametro
        } catch (SQLException ex) {
            // conexion.rollback(); permite regresar para atras en caso de fallar (omite lo relizado)
            /*  Descomentar la linea anterior si desean tener en cuenta el rollback.
                Correr el siguiente script en Workbench
            
                SET autocommit=1;
                COMMIT;
            
                **Sin rollback igual anda */

            throw ex;
        } finally { // siempre despues de insertar modificar o eliminar desconectar automaticamente
            desconectarBase();
        }
    }

// ejecuta las sentencias
    protected void consultarBase(String sql) throws Exception {
        try {
            conectarBase();// conecto nuevamente a la base de datos
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }
}
