/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author juan_
 * CLASE DTO:
 * DATA TRANSFER OBJECT Patrón de diseño
 * 
 * 
 */
public class internalQuery {
                int id;
                double nota;
                String nombre;

                public internalQuery(int _id,String _nombre, double _nota ) {
                    this.id = _id;
                    this.nota = _nota;
                    this.nombre = _nombre;
            }

    public int getId() {
        return id;
    }

    public double getNota() {
        return nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
                
}
