/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadulp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author juan_
 */
public class UniversidadULP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            String URL="jdbc:mariadb://localhost:3306/UniversidadULP";
            String USUARIO="root";
            String PASSWORD="";
            Connection con=DriverManager.getConnection(URL,USUARIO,PASSWORD);
    }catch(ClassNotFoundException cnf){
            JOptionPane.showMessageDialog(null,"Error al cargar driver");
        }catch(SQLException sql){
            System.out.println(sql.getErrorCode());
            if (sql.getErrorCode()== 1062) {
                JOptionPane.showMessageDialog(null,"Ya existe un alumno con ese DNI.");
            }else if(sql.getErrorCode()== 1049){
                JOptionPane.showMessageDialog(null,"Base de datos inexistente.");
            }else{
                JOptionPane.showMessageDialog(null,"Error al conectarse a bd");
                System.out.println(sql.getMessage());
            }      
    
}
    }
    }