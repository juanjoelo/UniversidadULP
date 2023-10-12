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
import universidadulp.AccesoADatos.InscripcionData;
import universidadulp.AccesoADatos.MateriaData;
import universidadulp.Entidades.Alumno;
import universidadulp.Entidades.Inscripcion;
import universidadulp.Entidades.Materia;

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
        InscripcionData inscData = new InscripcionData();
        AlumnoData alumnoData = new AlumnoData();
        Alumno al = new Alumno(3255293,"Jeresssssz","Joan",LocalDate.of(2001, Month.MARCH, 5),true);
        alumnoData.guardarAlumno(al);
        MateriaData matData = new MateriaData();
        Materia mat = new Materia("Historiaaaaa",2,true);
        matData.guardarMateria(mat);
        Inscripcion insc = new Inscripcion(al,mat,0);
        inscData.guardarInscripcion(insc);
        
        //Alumno alumno1 = new Alumno(657567, "Alfonsin", "Raul", LocalDate.of(1930, Month.MARCH, 14), true);
        //AlumnoData ad = new AlumnoData();
        //ad.guardarAlumno(alumno1);
        //ad.buscarAlumno(15);
        //ad.buscarAlumnoPorDni(123123);
        //ad.listarAlumnos();
        //ad.modificarAlumno(new Alumno(18,657567, "Araujo", "Raul", LocalDate.of(1930, Month.MARCH, 14), true));
        //ad.eliminarAlumno(18);  
    } 
}
