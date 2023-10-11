/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadulp;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import universidadulp.AccesoADatos.AlumnoData;
import universidadulp.AccesoADatos.Conexion;
import universidadulp.Entidades.Alumno;

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
        
        Alumno alumno1 = new Alumno(657567, "Alfonsin", "Raul", LocalDate.of(1930, Month.MARCH, 14), true);
        AlumnoData ad = new AlumnoData();
        ad.guardarAlumno(alumno1);
       // ad.buscarAlumno(15);
       // ad.buscarAlumnoPorDni(123123);
        //ad.listarAlumnos();
        //ad.modificarAlumno(alumno1);
        //ad.eliminarAlumno(15);
        
    }
    
}
