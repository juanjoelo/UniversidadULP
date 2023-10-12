/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadulp.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadulp.Entidades.Alumno;
import universidadulp.Entidades.Inscripcion;
import universidadulp.Entidades.Materia;

/**
 *
 * @author Bruno
 */
public class InscripcionData {
    private Connection con;
    private AlumnoData aluData;

    public InscripcionData() {
    }
    
    public void guardarInscripcion(Inscripcion insc){
        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) "
                + "VALUES (?, ?, ?)";
        try {
           PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           ps.setDouble(1, insc.getNota());
           ps.setInt(2, insc.getAlumno().getIdAlumno());
           ps.setInt(3, insc.getMateria().getIdMateria());
           ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();
           if (rs.next()) {
               
               JOptionPane.showMessageDialog(null, "El alumno ha sido inscrito en "
                       +insc.getMateria().getNombre()+" con exito");
          }
        ps.close();

        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion: "+ex.getMessage());
       }
    }
    public List<Inscripcion> obtenerInscripciones(){
        try {
            String sql = "SELECT * FROM inscripcion WHERE 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Inscripcion> inscriptos = new ArrayList<>();
            
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();

                insc.getAlumno().setIdAlumno((rs.getInt("idAlumno")));
                insc.setNota(rs.getInt("nota"));
                insc.getMateria().setIdMateria(rs.getInt("idMateria"));
                inscriptos.add(insc);
                
            }
            ps.close();
            return inscriptos;

        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno "+ex.getMessage());
        }
        return null;
        
    }
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        return null;
    }
    
    public List<Materia> obtenerMateriasCursadas(int id){
        return null;
    }
    
    public List<Materia> obtenerMateriasNOCursadas(int id){
        return null;
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        
    }
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
        return null;
    }
}
