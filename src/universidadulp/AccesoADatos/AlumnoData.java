/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadulp.AccesoADatos;
import java.sql.Date;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadulp.Entidades.Alumno;

/**
 *
 * @author Bruno
 */
public class AlumnoData {
    Connection con;

    public AlumnoData() {
        con = Conexion.getConnection(); 
    }
    
    public void guardarAlumno(Alumno al){
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";
        try {
           PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           ps.setInt(1, al.getDni());
           ps.setString(2, al.getApellido());
           ps.setString(3, al.getNombre());
           ps.setDate(4, al.getFechaNacimiento());
           ps.setBoolean(5, al.isEstado()); // 
           ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();
           if (rs.next()) {
               al.setIdAlumno(rs.getInt(1));
               
               JOptionPane.showMessageDialog(null, "Alumno añadido con exito.");
          }
        ps.close();

        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno: "+ex.getMessage());
       }

    }
    
    public Alumno buscarAlumno(int id){
    Alumno alumno = null;
    String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
    PreparedStatement ps = null;
    try {
    ps = con.prepareStatement(sql);
    ps.setInt(1,id );
    ResultSet rs = ps.executeQuery();

    if (rs.next()) {
    alumno=new Alumno();
    alumno.setIdAlumno(id);
    alumno.setDni(rs.getInt("dni"));
    alumno.setApellido(rs.getString("apellido"));
    alumno.setNombre(rs.getString("nombre"));
    alumno.setFechaNacimiento(rs.getDate("fechaNacimiento"));
    //antes escribimos esto alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());, pero otra vez la estamos transformando, y no hace falta.
    //borramos '.toLocalDate()' y debería andar.
    alumno.setEstado(true);
       // System.out.println(alumno);
        JOptionPane.showMessageDialog(null, alumno);
    } else {
    JOptionPane.showMessageDialog(null, "No existe el alumno");
   ps.close();
    }
    }catch (SQLException ex) {
   JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage()); 
   }

    return alumno;
    }
    
    public Alumno buscarAlumnoPorDni(int dni){
        Alumno alumno = null;
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni=? AND estado = 1";
        PreparedStatement ps = null;
        try {
        ps = con.prepareStatement(sql);
        ps.setInt(1,dni );
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            alumno=new Alumno();
            alumno.setIdAlumno(rs.getInt("idAlumno"));
            alumno.setDni(rs.getInt("dni"));
            alumno.setApellido(rs.getString("apellido"));
            alumno.setNombre(rs.getString("nombre"));
            alumno.setFechaNacimiento(rs.getDate("fechaNacimiento"));
            alumno.setEstado(true);
            
            
        } else {
        JOptionPane.showMessageDialog(null, "No existe el alumno");
       }
        ps.close();
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
        }


        return alumno;

    }
    
    public List<Alumno> listarAlumnos(){
        List<Alumno> alumnos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM alumno WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();

                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento"));
                alumno.setEstado(rs.getBoolean("estado"));
                alumnos.add(alumno);
                
            }
            ps.close();
            

        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno "+ex.getMessage());
        }
        return alumnos;
    }
    
    public void modificarAlumno(Alumno al){
        String sql = "UPDATE alumno SET dni = ? , apellido = ?, nombre = ?, fechaNacimiento = ? WHERE idAlumno = ?";
        PreparedStatement ps = null;

    try {
        ps = con.prepareStatement(sql);
        ps.setInt(1, al.getDni());
        ps.setString(2, al.getApellido());
        ps.setString(3, al.getNombre());
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
//----> Antes la linea era así--> ps.setDate(4, Date.valueOf(al.getFechaNacimiento())); pero al estar convirtiendo
//      la fecha directamente en el constructor de alumno,
//      ya no hace falta escribirlo así, sino pasar directamente 'getFechaNacimiento();'
//      asumiendo que getFechaNacimiento() devuelve un objeto de tipo java.sql.Date,
//      no es necesario convertirlo con Date.valueOf(). 
//      La conversión ya se habría hecho en la implementación de getFechaNacimiento();.
        ps.setDate(4,al.getFechaNacimiento());
        ps.setInt(5, al.getIdAlumno());
        int exito = ps.executeUpdate();

        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El alumno no existe");
        }

    }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
    }
        
    }
    
    public void eliminarAlumno(int id){
        try {
            String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila=ps.executeUpdate();

            if(fila==1){
                JOptionPane.showMessageDialog(null, " Se eliminó el alumno.");
                }
                ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno");
        }

    }
    
    public void eliminarAlumnoPorDNI(int dni){
        try {
            String sql = "UPDATE alumno SET estado = 0 WHERE dni = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int fila=ps.executeUpdate();

            if(fila==1){
                JOptionPane.showMessageDialog(null, " Se eliminó el alumno.");
                }
                ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno");
        }
    }
    
    
}
