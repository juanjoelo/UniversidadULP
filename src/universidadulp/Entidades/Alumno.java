/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadulp.Entidades;
import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author juan_
 */
public class Alumno {
    private int idAlumno;
    private int dni;
    private String apellido;
    private String nombre;
    private java.sql.Date fechaNacimiento;
    private boolean estado;

    public Alumno() {
    }
//Se agregó el constructor sin el id.
    public Alumno(int dni, String apellido, String nombre, java.sql.Date fechaNacimiento, boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }
    
    

    public Alumno(int idAlumno, int dni, String apellido, String nombre, java.sql.Date fechaNacimiento, boolean estado) {
        this.idAlumno = idAlumno;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public java.sql.Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(java.sql.Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alumno: " + "\n" +
               "idAlumno: " + idAlumno +"\n" +
               "DNI: " + dni + "\n" +
               "Apellido: " + apellido +"\n" +
               "Nombre: " + nombre +"\n" + 
               "Fecha de nacimiento: " + fechaNacimiento + "\n" +
               "Activo: " + estado;
    }
    
    
}
