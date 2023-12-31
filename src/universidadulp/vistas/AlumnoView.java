/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadulp.vistas;

import java.sql.Date;
import javax.swing.JOptionPane;
import universidadulp.AccesoADatos.AlumnoData;
import universidadulp.Entidades.Alumno;

/**
 *
 * @author juan_
 */
public class AlumnoView extends javax.swing.JInternalFrame {

    /**
     * Creates new form Alumno
     */
    public AlumnoView() {
        initComponents();
    }
    AlumnoData al = new AlumnoData();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botonNuevo = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        textoDocumento = new javax.swing.JTextField();
        textoApellido = new javax.swing.JTextField();
        textoNombre = new javax.swing.JTextField();
        botonRadioEstado = new javax.swing.JRadioButton();
        botonSeleccionFecha = new com.toedter.calendar.JDateChooser();
        botonBuscar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        jLabel1.setText("Alumno");

        jLabel2.setText("Documento:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Estado:");

        jLabel6.setText("Fecha de Nacimiento:");

        botonNuevo.setText("Nuevo");
        botonNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNuevoMouseClicked(evt);
            }
        });
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.setEnabled(false);
        botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarMouseClicked(evt);
            }
        });
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar");
        botonGuardar.setEnabled(false);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalirMouseClicked(evt);
            }
        });

        textoDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoDocumentoMouseClicked(evt);
            }
        });
        textoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoDocumentoActionPerformed(evt);
            }
        });

        textoApellido.setEnabled(false);

        textoNombre.setEnabled(false);
        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });

        botonRadioEstado.setEnabled(false);
        botonRadioEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRadioEstadoActionPerformed(evt);
            }
        });

        botonSeleccionFecha.setEnabled(false);

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.setEnabled(false);
        botonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonModificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(botonSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botonSeleccionFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textoDocumento)
                                    .addComponent(textoApellido)
                                    .addComponent(textoNombre)
                                    .addComponent(botonRadioEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(botonModificar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(botonRadioEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(botonSeleccionFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevo)
                    .addComponent(botonEliminar)
                    .addComponent(botonGuardar)
                    .addComponent(botonSalir))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNombreActionPerformed

    private void botonRadioEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRadioEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRadioEstadoActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
       
        try {
            String texto = textoDocumento.getText();
       int num = Integer.parseInt(texto);
       Alumno alumno1 = al.buscarAlumnoPorDniGeneral(num);
        botonEliminar.setEnabled(true);
         botonModificar.setEnabled(true);
        JOptionPane.showMessageDialog(null, alumno1.toString());
        textoApellido.setText(alumno1.getApellido());
        textoNombre.setText(alumno1.getNombre());
        botonRadioEstado.setSelected(alumno1.isEstado());
        botonSeleccionFecha.setDate(alumno1.getFechaNacimiento());
        habilitarCampos();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Campo vacío. Introduzca el dato correcto para buscar.");
        }
        catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error al buscar. Introduzca un dato válido.");

        }
        
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
       
       
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // TODO add your handling code here:
        boolean completado=false;
        
        try {
            String texto1= textoDocumento.getText();
            int dni = Integer.parseInt(texto1);
            String texto2 = textoApellido.getText();
            String texto3 = textoNombre.getText();
            boolean estado = botonRadioEstado.isSelected();
            // Convertir java.util.Date a java.sql.Date
            java.sql.Date dateSql = new java.sql.Date(botonSeleccionFecha.getDate().getTime());  // java.sql.Date directamente
            Alumno nuevoAlumno = new Alumno(dni, texto2, texto3, dateSql, estado);
            al.guardarAlumno(nuevoAlumno);
            completado = true;
            if (completado= true) {
                limpiar();
                deshabilitarCampos();
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error. Uno o varios campos erróneos.");
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error. Uno o varios campos erróneos.");
        }
     
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void textoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDocumentoActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_textoDocumentoActionPerformed

    private void textoDocumentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoDocumentoMouseClicked
        // TODO add your handling code here:
         botonBuscar.setEnabled(true);
        
    }//GEN-LAST:event_textoDocumentoMouseClicked

    private void botonNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNuevoMouseClicked
        // TODO add your handling code here:
        textoNombre.setEnabled(true);
        textoApellido.setEnabled(true);
        textoDocumento.setEnabled(true);
        botonRadioEstado.setEnabled(true);
        botonSeleccionFecha.setEnabled(true);
        botonGuardar.setEnabled(true);
        limpiar();
        botonModificar.setEnabled(false);
    }//GEN-LAST:event_botonNuevoMouseClicked

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
        // TODO add your handling code here:
       
        dispose();
    
    }//GEN-LAST:event_botonSalirMouseClicked

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseClicked
        // TODO add your handling code here:
        int texto1= Integer.parseInt(textoDocumento.getText());
        al.eliminarAlumnoPorDNI(texto1);
        textoDocumento.setText("");
        
    }//GEN-LAST:event_botonEliminarMouseClicked

    private void botonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarMouseClicked
        // TODO add your handling code here:
           
            String texto = textoDocumento.getText();
            int dni = Integer.parseInt(texto);
            int id = al.buscarAlumnoPorDni(dni).getIdAlumno();
            String texto2 = textoApellido.getText();
            String texto3 = textoNombre.getText();
            boolean estado = botonRadioEstado.isSelected();
            java.sql.Date dateSql = new java.sql.Date(botonSeleccionFecha.getDate().getTime());  // java.sql.Date directamente
            Alumno nuevoAlumno = new Alumno(id, dni, texto2, texto3, dateSql, estado);
            al.modificarAlumno(nuevoAlumno);
       
    }//GEN-LAST:event_botonModificarMouseClicked

    public void limpiar(){
        textoDocumento.setText("");
        textoApellido.setText("");
        textoNombre.setText("");
        botonRadioEstado.setSelected(false);
        botonSeleccionFecha.setDate(null);
    }
    public void deshabilitarCampos(){
        textoNombre.setEnabled(false);
        textoApellido.setEnabled(false);
        botonRadioEstado.setEnabled(false);
        botonSeleccionFecha.setEnabled(false);
        botonGuardar.setEnabled(false);
        botonEliminar.setEnabled(false);
    }
    public void habilitarCampos(){
        textoNombre.setEnabled(true);
        textoApellido.setEnabled(true);
        textoDocumento.setEnabled(true);
        botonRadioEstado.setEnabled(true);
        botonSeleccionFecha.setEnabled(true);
        botonGuardar.setEnabled(true);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JRadioButton botonRadioEstado;
    private javax.swing.JButton botonSalir;
    private com.toedter.calendar.JDateChooser botonSeleccionFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField textoApellido;
    private javax.swing.JTextField textoDocumento;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables
}
