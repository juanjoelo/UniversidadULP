/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadulp;

import java.sql.Connection;
import universidadulp.AccesoADatos.Conexion;

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
        
        Connection con =Conexion.getConnection();
    }

}
