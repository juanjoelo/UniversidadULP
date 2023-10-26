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
import universidadulp.Entidades.Materia;

/**
 *
 * @author juan_
 */
public class MateriaData {
    Connection con;
    
    
    public MateriaData() {
        con = Conexion.getConnection(); 
    }
    
    
    public void guardarMateria(Materia mat){
        String sql = "INSERT INTO materia (nombre, año, estado) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, mat.getNombre());
            ps.setInt(2, mat.getAnioMateria());
            ps.setBoolean(3, mat.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                mat.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia añadida con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia: "+ex.getMessage());
        }
    }
    
    public Materia buscarMateria(int id){
        Materia materia = null;
        
        String sql="SELECT nombre, año FROM materia WHERE idMateria = ? AND estado = 1";
        PreparedStatement ps = null;
        
        try{
        ps=con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        
            if (rs.next()) {
                materia=new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(true);

     
            }
            else{
                JOptionPane.showMessageDialog(null, "No existe la materia");
            }
            
            ps.close();  
        } catch (SQLException ex) {
   JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage()); 
   }
        return materia;
    }
    
    public void modificarMateria(Materia mat){
        String sql = "UPDATE materia SET nombre = ?, año = ? WHERE idMateria = ? ";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mat.getNombre());
            ps.setInt(2, mat.getAnioMateria());
            ps.setInt(3, mat.getIdMateria());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            }else {
            JOptionPane.showMessageDialog(null, "La materia no existe");
        }
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia "+ex.getMessage());
    }
        
        
        
    }
    
    public void eliminnarMateria(int id){
            try {
                String sql= "UPDATE materia SET estado = 0 WHERE idMateria = ?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                int fila=ps.executeUpdate();
                if(fila==1){
                JOptionPane.showMessageDialog(null, " Se eliminó la materia.");
                }
                ps.close();
            } catch (Exception e) {
            }
        }
    
    
    public List<Materia> listarMaterias(){
        List<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT * FROM materia WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
                
            }
            ps.close();
            
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia "+ex.getMessage());
        }
        return materias;
    }
    
    public Materia buscarMateriasGeneral(int id){
        Materia materia = null;
        
        String sql="SELECT * FROM materia WHERE idMateria = ?";
        PreparedStatement ps = null;
        
        try{
        ps=con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        
            if (rs.next()) {
                materia=new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(rs.getBoolean("estado"));
                if (!materia.isActivo()) {
                    JOptionPane.showMessageDialog(null, "Atencion, esta materia está dada de baja.");
                }
                

     
            }
            else{
                JOptionPane.showMessageDialog(null, "No existe la materia");
            }
            
            ps.close();  
        } catch (SQLException ex) {
   JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage()); 
   }
        return materia;
    }
    
    
    
    
}
