/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bibliotecagrupo5.Vistas;

import bibliotecagrupo5.AccesoADatos.EjemplarData;
import bibliotecagrupo5.AccesoADatos.LibroData;
import bibliotecagrupo5.Entidades.Condicion;
import bibliotecagrupo5.Entidades.Ejemplar;
import bibliotecagrupo5.Entidades.Libro;
import bibliotecagrupo5.Entidades.Tipo;
import java.util.TreeSet;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Leandro
 */
public class GestionDeEjemplares extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private LibroData librodata = new LibroData();
    private Libro libroAux = null;
    private Ejemplar ejemplar = null;
    private EjemplarData ejemplardata = new EjemplarData();

    /**
     * Creates new form GestionDeEjemplares
     */
    public GestionDeEjemplares() {

        initComponents();
        try {
            cargarComboLibros();
            cargarComboCondicionTotal();
            cargarComboCondicion();
            armarCabecera();
            ajustarTamañoColumnas();
//        crearComboBox();
           
            SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
            modeloSpinner.setMinimum(1);
            modeloSpinner.setValue(1);
            jsCantidad1.setModel(modeloSpinner);
            SpinnerNumberModel modeloSpinner1 = new SpinnerNumberModel();
            modeloSpinner1.setMinimum(1);
            jsCantidad2.setModel(modeloSpinner1);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Debes cargar libros en gestion de libros");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbEjemplarLibro = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jrbEstado = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jcbCondicion = new javax.swing.JComboBox<>();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jsCantidad1 = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcbEjemplarLibro2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jcbCondicion1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jsCantidad2 = new javax.swing.JSpinner();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jrbDisponible = new javax.swing.JRadioButton();
        jrbReparacion = new javax.swing.JRadioButton();
        jsCantidadModificar = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setText("Ejemplares");

        jcbEjemplarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEjemplarLibroActionPerformed(evt);
            }
        });

        jLabel3.setText("Libro:");

        jLabel4.setText("Cantidad:");

        jLabel6.setText("Estado:");

        jrbEstado.setSelected(true);
        jrbEstado.setEnabled(false);

        jLabel7.setText("Condicion:");

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jsCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jrbEstado)
                                                    .addComponent(jLabel1))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jcbCondicion, 0, 157, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbEjemplarLibro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbGuardar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEjemplarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jsCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbEstado)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcbCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbGuardar))
                .addGap(60, 60, 60))
        );

        jLabel2.setText("Modificacion de Ejemplares");

        jLabel5.setText("Libro:");

        jcbEjemplarLibro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEjemplarLibro2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Condicion:");

        jcbCondicion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCondicion1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Cantidad:");

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Titulo", "Autor", "Tipo"
            }
        ));
        jtTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTabla);
        if (jtTabla.getColumnModel().getColumnCount() > 0) {
            jtTabla.getColumnModel().getColumn(0).setResizable(false);
            jtTabla.getColumnModel().getColumn(1).setResizable(false);
            jtTabla.getColumnModel().getColumn(2).setResizable(false);
        }

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jrbDisponible.setText("Disponible");
        jrbDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDisponibleActionPerformed(evt);
            }
        });

        jrbReparacion.setText("Reparacion");
        jrbReparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbReparacionActionPerformed(evt);
            }
        });

        jLabel10.setText("Cantidad a modificar:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jbModificar))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jsCantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addComponent(jbEliminar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbSalir))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jrbDisponible)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jrbReparacion)
                                        .addGap(44, 44, 44)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jsCantidadModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jcbCondicion1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbEjemplarLibro2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbEjemplarLibro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcbCondicion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jsCantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsCantidadModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jrbReparacion)
                    .addComponent(jrbDisponible))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbEjemplarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEjemplarLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEjemplarLibroActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        jcbEjemplarLibro.setSelectedIndex(-1);
        jsCantidad1.setValue(1);
        jcbCondicion.setSelectedIndex(-1);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        Libro libroSeleccionado = (Libro) jcbEjemplarLibro.getSelectedItem();

        int cantLibros = (Integer) jsCantidad1.getValue();
        boolean estado = jrbEstado.isSelected();
        Condicion condicion = (Condicion) jcbCondicion.getSelectedItem();
        Ejemplar ejemplarNuevo = ejemplardata.BuscarEjemplarIdLibroYCondicion(libroSeleccionado.getIdLibro(), condicion);
        if (ejemplarNuevo == null) {
            Ejemplar ejemplar = new Ejemplar(libroSeleccionado, cantLibros, estado, condicion);
            ejemplardata.guardarEjemplar(ejemplar);
            JOptionPane.showMessageDialog(this, "Ejemplar Guardado");

            jcbEjemplarLibro.setSelectedItem(0);
            jsCantidad1.setValue(1);
            jcbCondicion.setSelectedItem(0);


        } else {
            int cantNueva = ejemplarNuevo.getCantidad() + cantLibros;
            ejemplarNuevo.setCantidad(cantNueva);
            ejemplardata.modificarEjemplar(ejemplarNuevo);

            JOptionPane.showMessageDialog(this, "Ejemplar Guardado");
            jcbEjemplarLibro.setSelectedIndex(0);
            jsCantidad1.setValue(1);
            jcbCondicion.setSelectedIndex(0);
            jcbEjemplarLibro2.setSelectedIndex(0);

            JOptionPane.showMessageDialog(this, "Ejemplar Modificado");

        }


    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jcbEjemplarLibro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEjemplarLibro2ActionPerformed
        borrarTabla();
        Libro libroSeleccionado = (Libro) jcbEjemplarLibro2.getSelectedItem();

        TreeSet<Ejemplar> ejemplares = ejemplardata.listarEjemplaresPorLibro(libroSeleccionado.getIdLibro());
        cargarTabla(ejemplares);
        jsCantidad2.setValue(1);
        jcbCondicion1.setVisible(true);
        jsCantidad2.setVisible(true);
        jtTabla.setEnabled(iconable);


    }//GEN-LAST:event_jcbEjemplarLibro2ActionPerformed

    private void jcbCondicion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCondicion1ActionPerformed
        borrarTabla();
        jtTabla.setEnabled(true);
        Libro libroSeleccionado = (Libro) jcbEjemplarLibro2.getSelectedItem();
        Condicion condicion = (Condicion) jcbCondicion1.getSelectedItem();

        Ejemplar ejemplaresC = ejemplardata.BuscarEjemplarIdLibroYCondicion(libroSeleccionado.getIdLibro(), condicion);
        if (ejemplaresC != null) {
            jsCantidadModificar.setValue(ejemplaresC.getCantidad());
            jsCantidad2.setValue(ejemplaresC.getCantidad());
            cargarTabla(ejemplaresC);
            if (condicion.equals(Condicion.DISPONIBLE)) {
                jrbDisponible.setSelected(true);
                jrbReparacion.setSelected(false);
            } else {
                jrbReparacion.setSelected(true);
                jrbDisponible.setSelected(false);
            }
        }
    }//GEN-LAST:event_jcbCondicion1ActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea Salir?",
                "Salir", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        if (respuesta == 0) {
            dispose();
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int filaSeleccionada = jtTabla.getSelectedRow();
        Libro libroSeleccionado = (Libro) jcbEjemplarLibro2.getSelectedItem();

        if (filaSeleccionada != -1) {
            int codigo = (int) jtTabla.getValueAt(filaSeleccionada, 0);
            TreeSet<Ejemplar> listaEjemplares = ejemplardata.listarEjemplaresNoDisponibles(libroSeleccionado.getIdLibro(), Condicion.DISPONIBLE);
            if (listaEjemplares.isEmpty()) {
                int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el libro con id " + codigo + " ?",
                        "Eliminacion", JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);

                if (respuesta == 0) {
                    ejemplardata.eliminarEjemplar(codigo);
                    borrarTabla();
                    jcbEjemplarLibro2.setSelectedIndex(0);
                    jcbCondicion1.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(this, "Ejemplar Eliminado");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No puede eliminar el libro con id " + codigo + " "
                        + "- Existen ejemplares con la condicion Prestado, Retraso o Reparacion");
            }
            jtTabla.clearSelection();
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        try {
            int filaSeleccionada = (Integer) jtTabla.getSelectedRow();
            Libro libro = (Libro) jcbEjemplarLibro2.getSelectedItem();
            Condicion condicion = (Condicion) jcbCondicion1.getSelectedItem();
            Ejemplar ejem = ejemplardata.BuscarEjemplarIdLibroYCondicion(libro.getIdLibro(), condicion);

            if (filaSeleccionada != -1) {

                try {
                    int cantidad = (Integer) jsCantidad2.getValue();
                    int cantidadMod = (Integer) jsCantidadModificar.getValue();
                    int resul = cantidad - cantidadMod;
                    if (cantidad >= cantidadMod) {//control de cantidad

                        if (condicion.ordinal() == 3 && jrbReparacion.isSelected()) {
                            Condicion nuevaCondicion = Condicion.REPARACION;
                            Ejemplar ejemplar1 = ejemplardata.BuscarEjemplarIdLibroYCondicion(libro.getIdLibro(), nuevaCondicion);
                            if (ejemplar1 == null) {
                                Ejemplar ejemplar2 = new Ejemplar(libro, cantidadMod, true, nuevaCondicion);
                                ejemplardata.guardarEjemplar(ejemplar2);
                                ejem.setCantidad(resul);
                                ejemplardata.modificarEjemplar(ejem);
                                JOptionPane.showMessageDialog(this, "Ejemplar modificado");
                                jcbEjemplarLibro2.setSelectedItem(0);
                                jcbCondicion1.setSelectedItem(0);
                                jsCantidadModificar.setValue(1);
                                jsCantidad2.setValue(1);
                                borrarTabla();
                                jcbCondicion1.setSelectedIndex(0);
                                jcbEjemplarLibro2.setSelectedIndex(0);
                            } else {
                                int result = ejemplar1.getCantidad() + cantidadMod;
                                ejemplar1.setCantidad(result);
                                ejemplardata.modificarEjemplar(ejemplar1);
                                ejem.setCantidad(resul);
                                ejemplardata.modificarEjemplar(ejem);
                                JOptionPane.showMessageDialog(this, "Ejemplar Modificado");
                                jcbEjemplarLibro2.setSelectedItem(0);
                                jcbCondicion1.setSelectedItem(0);
                                jsCantidadModificar.setValue(1);
                                jsCantidad2.setValue(1);
                                borrarTabla();
                                jcbCondicion1.setSelectedIndex(0);
                                jcbEjemplarLibro2.setSelectedIndex(0);
                            }
                        } else if (condicion.ordinal() == 2 && jrbDisponible.isSelected()) {
                            Condicion nuevaCondicion = Condicion.DISPONIBLE;
                            Ejemplar ejemplar1 = ejemplardata.BuscarEjemplarIdLibroYCondicion(libro.getIdLibro(), nuevaCondicion);
                            int result = ejemplar1.getCantidad() + cantidadMod;
                            ejemplar1.setCantidad(result);
                            ejemplardata.modificarEjemplar(ejemplar1);
                            ejem.setCantidad(resul);
                            ejemplardata.modificarEjemplar(ejem);
                            JOptionPane.showMessageDialog(this, "Ejemplar Modificado");
                            jcbCondicion1.setSelectedIndex(0);
                            jcbEjemplarLibro2.setSelectedIndex(0);
                            jsCantidadModificar.setValue(1);
                            jsCantidad2.setValue(1);
                            borrarTabla();
                        } else if (condicion.ordinal() == 3 && jrbDisponible.isSelected()) {
                            JOptionPane.showMessageDialog(this, "Seleccione la opcion de Reparacion");
                            
                        } else {
                            JOptionPane.showMessageDialog(this, "Seleccione la opcion de Disponible");
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "la cantidad que desea modificar es mayor a la disponible");

                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Debe ingresar un numero");
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(this, "el ejemplar no se encontro");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        }

    }//GEN-LAST:event_jbModificarActionPerformed

    private void jrbDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDisponibleActionPerformed
        jrbReparacion.setSelected(false);
        jrbDisponible.setSelected(true);
    }//GEN-LAST:event_jrbDisponibleActionPerformed

    private void jrbReparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbReparacionActionPerformed
        jrbReparacion.setSelected(true);
        jrbDisponible.setSelected(false);
    }//GEN-LAST:event_jrbReparacionActionPerformed

    private void jtTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaMouseClicked

    }//GEN-LAST:event_jtTablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Condicion> jcbCondicion;
    private javax.swing.JComboBox<Condicion> jcbCondicion1;
    private javax.swing.JComboBox<Libro> jcbEjemplarLibro;
    private javax.swing.JComboBox<Libro> jcbEjemplarLibro2;
    private javax.swing.JRadioButton jrbDisponible;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JRadioButton jrbReparacion;
    private javax.swing.JSpinner jsCantidad1;
    private javax.swing.JSpinner jsCantidad2;
    private javax.swing.JSpinner jsCantidadModificar;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
    public void cargarComboLibros() {
        try {

            TreeSet<Libro> listarLibros = librodata.listarLibros();
            for (Libro aux : listarLibros) {
                jcbEjemplarLibro.addItem(aux);
                jcbEjemplarLibro2.addItem(aux);
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Error No se cargo ningun Libro" + ex.getMessage());
        }
    }

    private void borrarTabla() {
        modelo.setRowCount(0);
    }

    public void cargarComboCondicionTotal() {

        jcbCondicion1.addItem(Condicion.DISPONIBLE);

        jcbCondicion1.addItem(Condicion.REPARACION);

    }

    public void cargarComboCondicion() {
        jcbCondicion.addItem(Condicion.DISPONIBLE);

    }

    public void armarCabecera() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Titulo");
        modelo.addColumn("Autor");
        modelo.addColumn("Condicion");
        modelo.addColumn("Cantidad");

        jtTabla.setModel(modelo);
    }

    private void ajustarTamañoColumnas() {

        TableColumn columnaCodigo = jtTabla.getColumnModel().getColumn(0);
        columnaCodigo.setPreferredWidth(20);
        TableColumn columnaTitulo = jtTabla.getColumnModel().getColumn(1);
        columnaTitulo.setPreferredWidth(50);
        TableColumn columnaAutor = jtTabla.getColumnModel().getColumn(2);
        columnaAutor.setPreferredWidth(40);
        TableColumn columnaCondicion = jtTabla.getColumnModel().getColumn(3);
        columnaCondicion.setPreferredWidth(50);
        TableColumn columnaCantidad = jtTabla.getColumnModel().getColumn(4);
        columnaCantidad.setPreferredWidth(10);

    }

//    private void crearComboBox() {
//        JComboBox<Condicion> comboBox = new JComboBox<>();
//        comboBox.addItem(Condicion.DISPONIBLE);
//        comboBox.addItem(Condicion.REPARACION);
//        DefaultCellEditor customEditor = new DefaultCellEditor(comboBox);
//
//        jtTabla.getColumnModel().getColumn(3).setCellEditor(customEditor);
//    }
    private void cargarTabla(TreeSet<Ejemplar> ListarEjemplar) {
        for (Ejemplar aux : ListarEjemplar) {
            modelo.addRow(new Object[]{aux.getCodigo(), aux.getLibro().getTitulo(), aux.getLibro().getAutor(), aux.getCondicion(), aux.getCantidad()});
        }
    }

    private void cargarTabla(Ejemplar ejemplar) {

        modelo.addRow(new Object[]{ejemplar.getCodigo(), ejemplar.getLibro().getTitulo(), ejemplar.getLibro().getAutor(), ejemplar.getCondicion(), ejemplar.getCantidad()});

    }

}
