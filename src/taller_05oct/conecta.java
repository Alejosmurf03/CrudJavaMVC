package taller_05oct;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class conecta {
    public static final String URL = "jdbc:mysql://localhost:3307/bd_inpahu";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "usbw";
    
    //abrir base de datos
    public static Connection abrebase(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
        }catch (Exception e){
            System.out.println("Error de conexion = "+e);
        }
        return connection;
    }
}
