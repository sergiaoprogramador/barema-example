package Controller;

import Models.Barema;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BaremaController {

    
    public String cadastrarBarema(int id, String atividade, String horas, String limite, String grupo) throws SQLException{
        Barema novoBarema = new Barema(id, atividade, horas, limite, grupo);
        
        Connection connection = null;
        
        try {  
            try {  
                // Load the JDBC driver  
                String driverName = "org.gjt.mm.mysql.Driver";  
                Class.forName(driverName);  
            } catch (ClassNotFoundException e) {  
                // Could not find the driver  
            }
       
            // Create a connection to the database  
            String serverName = "localhost";  
            String mydatabase = "prova";  
            String url = "jdbc:mysql://" + serverName +  "/" + mydatabase; // a JDBC url  
            String username = "root";  
            String password = "admin123";
            
            connection = DriverManager.getConnection(url, username, password);  
        } // Could not find the database driver
        catch (SQLException e) {  
        // Could not connect to the database  
        }
        
        try {
            Statement stmt = connection.createStatement();

            // Prepare a statement to insert a record  
            String sql = "INSERT INTO Barema (id, atividade_descricao, horas, limite, grupo) VALUES(" + novoBarema.getId() + ", '" + novoBarema.getAtividade() + "', '" + novoBarema.getHoras() + "', '" + novoBarema.getLimite() + "', '" + novoBarema.getGrupo() + "')";
            System.out.println(sql);

            // Execute the insert statement  
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
        }
        
        return "cadastrado";
        
    }
}
