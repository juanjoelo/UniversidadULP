/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadulp.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadulp.AccesoADatos.AlumnoData;
import universidadulp.AccesoADatos.InscripcionData;
import universidadulp.AccesoADatos.MateriaData;
import universidadulp.Entidades.Alumno;
import universidadulp.Entidades.Inscripcion;
import universidadulp.Entidades.Materia;

/**
 *
 * @author juan_
 */
public class CargaDeNotas extends javax.swing.JInternalFrame {
    
    private AlumnoData aluData;
    private MateriaData mateData;
    private InscripcionData inscData;
    private DefaultTableModel modeloTabla;
        
       

    
    /**
     * Creates new form CargaDeNotas
     */
    public CargaDeNotas() {
        initComponents();
            aluData = new AlumnoData();
            mateData = new MateriaData();
            inscData = new InscripcionData();
            armarModelo();
            inicializarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboSeleccionarAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCargaNotas = new javax.swing.JTable();
        botonGuardar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();

        jLabel1.setText("Carga de notas");

        jLabel2.setText("Seleccione un alumno:");

        tablaCargaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCargaNotas);

        botonGuardar.setText("Guardar");

        botonSalir.setText("Salir");

        botonBuscar.setText("Buscar");
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(comboSeleccionarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonBuscar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboSeleccionarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar)
                    .addComponent(botonSalir))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseClicked
      
    int dni = recibirDNIAlumno();        
    Alumno alumno = aluData.buscarAlumnoPorDni(dni);

    if (alumno != null) {
    ArrayList<Inscripcion> inscripciones = inscData.obtenerInscripcionesPorAlumno(alumno.getIdAlumno());
    
    try {
        if (inscripciones != null && !inscripciones.isEmpty()) {
            for (Inscripcion inscripcion : inscripciones) {
                modeloTabla.addRow(new Object[]{
                    inscripcion.getMateria().getIdMateria(),
                    inscripcion.getMateria().getNombre(),
                    inscripcion.getNota()
                });
            }
            tablaCargaNotas.setModel(modeloTabla);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron inscripciones para este alumno.");
        }
    } catch (NullPointerException e) {
        JOptionPane.showMessageDialog(null, "Null pointer");
    }
} else {
    JOptionPane.showMessageDialog(null, "No se encontró al alumno con el DNI especificado.");
}
        
    }//GEN-LAST:event_botonBuscarMouseClicked
    private void armarModelo(){
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Nota");
        tablaCargaNotas.setModel(modeloTabla);
    }
    private void cargarATabla(List<Inscripcion> inscrip){
        for(Inscripcion inscripcion:inscrip){
            modeloTabla.addRow(new Object[]{inscripcion.getIdInscripcion(),
            inscripcion.getMateria(),
            inscripcion.getNota()});
            }
        
        
        modeloTabla = null;
        armarModelo();
    }
    private void inicializarCombo(){
        List<Alumno> listaAlumnos = aluData.listarAlumnos();
        for(Alumno al:listaAlumnos){
           
            comboSeleccionarAlumno.addItem(al.getNombre()+" "+al.getApellido()+ " DNI:"+ al.getDni());
        } 
    }
     //TODO: Cambiar el toString() de Alumno para no tener que usar los getters aca.
    
    private void borrarFilas(){
        int filas = tablaCargaNotas.getRowCount()-1;
        for(int f = filas; f>=0; f--){
            modeloTabla.removeRow(f);
        }
    }
    
     private int recibirDNIAlumno(){
        String alumno = comboSeleccionarAlumno.getSelectedItem().toString();
        int dniAlumno = Integer.parseInt(alumno.substring(alumno.lastIndexOf(":") + 1)); 
        return dniAlumno;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> comboSeleccionarAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCargaNotas;
    // End of variables declaration//GEN-END:variables
}
