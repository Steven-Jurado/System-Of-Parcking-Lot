/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConectarBD;

import Clases.Carro;
import Clases.Moto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Steven
 */
public class ConexcionBD {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    static String User , Pass
    static Connection con ;
    static Moto moto;
    static Carro carro ;
    public static Connection Conectar() throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String aux = "jdbc:sqlserver:Nombre de su servidor:1433;databaseName=Nombre Base Datos";
        con = DriverManager.getConnection(aux, User, Pass);
        return con;
    }
    
}
