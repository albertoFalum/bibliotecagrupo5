/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bibliotecagrupo5.Vistas;

import javax.swing.JOptionPane;
import bibliotecagrupo5.AccesoADatos.LectorData;
import bibliotecagrupo5.AccesoADatos.PrestamoData;
import bibliotecagrupo5.Entidades.Ejemplar;
import bibliotecagrupo5.Entidades.Lector;
import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author manue
 */
public class GestionDeLector extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            if (c == 0 || c == 3) {
                return false;
            }
            return true;
        }
    };

    LectorData lecData = new LectorData();
    Lector lector = null;
    Lector lectorAux = null;
    PrestamoData presData = new PrestamoData();
    

    /**
     * Creates new form FormularioLector
     */
    public GestionDeLector() {
        
        initComponents();
        armarCabecera();
        ajustarTamañoColumnas();
        jrbEstado.setEnabled(false);
        jrbEstado.setSelected(true);
        jrbEliminar.setEnabled(false);
        jrbModificar.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jrbNuevo = new javax.swing.JButton();
        jrbGuardar = new javax.swing.JButton();
        jrbEstado = new javax.swing.JRadioButton();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfDomicilio = new javax.swing.JTextField();
        jtfMail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfDni = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtexApellido = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaLector = new javax.swing.JTable();
        jrbModificar = new javax.swing.JButton();
        jrbSalir = new javax.swing.JButton();
        jrbEliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jtfNroSocio = new javax.swing.JTextField();
        jrbBuscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(900, 550));

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo5/ImagenesVideosGif/Image20231018165055 (1).png"))); // NOI18N
        jLabel1.setText("Formulario Lector");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel5.setText("Domicilio:");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel6.setText("Mail:");

        jrbNuevo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jrbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo5/ImagenesVideosGif/nuevo.png"))); // NOI18N
        jrbNuevo.setText("Nuevo");
        jrbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNuevoActionPerformed(evt);
            }
        });

        jrbGuardar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jrbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo5/ImagenesVideosGif/guardar.png"))); // NOI18N
        jrbGuardar.setText("Guardar");
        jrbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbGuardarActionPerformed(evt);
            }
        });

        jrbEstado.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel2.setText("Dni:");

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel12.setText("Estado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                    .addComponent(jLabel12)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbNuevo)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbEstado)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfMail, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jrbGuardar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtfDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jtfMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jrbEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Busqueda");

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel8.setText("Buscar por Apellido:");

        jtexApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtexApellidoKeyReleased(evt);
            }
        });

        jtaLector.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtaLector.getTableHeader().setResizingAllowed(false);
        jtaLector.getTableHeader().setReorderingAllowed(false);
        jtaLector.setUpdateSelectionOnSort(false);
        jtaLector.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jtaLector);

        jrbModificar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jrbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo5/ImagenesVideosGif/escribir.png"))); // NOI18N
        jrbModificar.setText("Modificar");
        jrbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbModificarActionPerformed(evt);
            }
        });

        jrbSalir.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jrbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo5/ImagenesVideosGif/salir.png"))); // NOI18N
        jrbSalir.setText("Salir");
        jrbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSalirActionPerformed(evt);
            }
        });

        jrbEliminar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jrbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo5/ImagenesVideosGif/eliminar.png"))); // NOI18N
        jrbEliminar.setText("Eliminar");
        jrbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEliminarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel9.setText("Buscar por Nro Socio:");

        jrbBuscar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jrbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo5/ImagenesVideosGif/buscar.png"))); // NOI18N
        jrbBuscar.setText("Buscar");
        jrbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNroSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jtexApellido)))
                        .addGap(18, 18, 18)
                        .addComponent(jrbBuscar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jrbModificar)
                                .addGap(91, 91, 91)
                                .addComponent(jrbEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtfNroSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbBuscar))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtexApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtexApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtexApellidoKeyReleased
        // TODO add your handling code here:
        borrarTabla();
        jtfNroSocio.setText("");
        TreeSet<Lector> listarLector = lecData.listarLector();

        for (Lector lec : listarLector) {

            if (lec.getApellido().toLowerCase().startsWith(jtexApellido.getText().toLowerCase()) && !jtexApellido.getText().isEmpty()) {

                cargarTabla(lec);

                jrbEliminar.setEnabled(true);
                jrbModificar.setEnabled(true);
                jtfNroSocio.setText("");
            } else {
               // JOptionPane.showMessageDialog(this, "debe ingresar solo letras");

            }

        }
    }//GEN-LAST:event_jtexApellidoKeyReleased

    private void jrbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSalirActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea Salir?",
                "Salir", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        if (respuesta == 0) {
            dispose();
        }
    }//GEN-LAST:event_jrbSalirActionPerformed

    private void jrbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbGuardarActionPerformed
        // TODO add your handling code here:

        try {
            if (!comprobarCamposVacios()) {

                String nombre = jtfNombre.getText();
                String apellido = jtfApellido.getText();
                int dni = Integer.parseInt(jtfDni.getText());
                String domicilio = jtfDomicilio.getText();
                String mail = jtfMail.getText();
                boolean estado = jrbEstado.isSelected();

                if (lectorAux == null) {
                    lector = new Lector(nombre, apellido, dni, domicilio, mail, estado);
                    lecData.guardarLector(lector);
                    JOptionPane.showMessageDialog(this, "Lector Guardado con exito");

                } else {
                    JOptionPane.showMessageDialog(this, "Los campos de datos  no deben estar vacíos");
                }
                borrarJtfLector();
            } else {
                JOptionPane.showMessageDialog(this, "Los campos de datos  no deben estar vacíos");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un Dni válido");
           
    }//GEN-LAST:event_jrbGuardarActionPerformed
    }

    private void jrbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNuevoActionPerformed
        // TODO add your handling code here:
        borrarCampos();
    }//GEN-LAST:event_jrbNuevoActionPerformed

    private void jrbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbBuscarActionPerformed
        // TODO add your handling code here:
        borrarTabla();
        jtexApellido.setText("");
        try {
            if (!jtfNroSocio.getText().isEmpty()) {

                int nroSocio = Integer.parseInt(jtfNroSocio.getText());
                Lector lector = lecData.buscarLectorPorNroSocio(nroSocio);

                if (lector != null) {
                    jrbEliminar.setEnabled(true);
                    jrbModificar.setEnabled(true);
                    cargarTabla(lector);
                } else {
                    jtfNroSocio.setText("");
                }
            } else {
                borrarTabla();
                JOptionPane.showMessageDialog(this, "El campo Buscar por NroSocio no debe estar vacio");

            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero entero");
           

    }//GEN-LAST:event_jrbBuscarActionPerformed
    }
    private void jrbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbModificarActionPerformed
        // TODO add your handling code here
        int filaSeleccionada = jtaLector.getSelectedRow();

        try {
            if (filaSeleccionada != -1) {

                int nroSocio = (Integer) jtaLector.getValueAt(filaSeleccionada, 0);
                String nombre = jtaLector.getValueAt(filaSeleccionada, 1).toString();
                String apellido = (String) jtaLector.getValueAt(filaSeleccionada, 2);
                int dni = (Integer) jtaLector.getValueAt(filaSeleccionada, 3);
                String domicilio = (String) jtaLector.getValueAt(filaSeleccionada, 4);
                String mail = jtaLector.getValueAt(filaSeleccionada, 5).toString();

                lectorAux = lecData.buscarLectorPorNroSocio(nroSocio);

                if (dni > 0 && dni < 100000000) {

                    if (!comprobarFilasVacias(filaSeleccionada)) {

                        int respuesta = JOptionPane.showConfirmDialog(this, "Desea modificar el lector",
                                "Modificacion", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        if (respuesta == 0) {

                            lectorAux.setNroSocio(nroSocio);
                            lectorAux.setNombre(nombre);
                            lectorAux.setApellido(apellido);
                            lectorAux.setDNI(dni);
                            lectorAux.setDomicilio(domicilio);
                            lectorAux.setMail(mail);
                            lecData.modificarLector(lectorAux);
                            
                            JOptionPane.showMessageDialog(this, "Lector modificado con exito");
                        }
                        borrarTabla();
                        borrarJtfBusqueda();
                        jrbEliminar.setEnabled(false);
                        jrbModificar.setEnabled(false);

                    } else {
                        JOptionPane.showMessageDialog(this, "Algunos campos estan vacios, debe ingresar datos en ellos");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "error2 debe ingresar un dni valido ");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe selecionar una fila");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, " error1 Debe ingresar un Dni válido");
        }

    }//GEN-LAST:event_jrbModificarActionPerformed

    private void jrbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEliminarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jtaLector.getSelectedRow();
        int resp = 0;

        if (filaSeleccionada != -1) {
            int nroSocio = (Integer) jtaLector.getValueAt(filaSeleccionada, 0);

            TreeSet<Ejemplar> listaPrestamos = presData.obtenerEjemplaresPrestadosPorLector(nroSocio);

            if (listaPrestamos.isEmpty()) {

                int respuesta = JOptionPane.showConfirmDialog(this, "Desea eliminar lector",
                        "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

                if (respuesta == 0) {
                    lecData.desactivarLector(nroSocio);
                    
                    JOptionPane.showMessageDialog(this, "Lector eliminado con exito");

                } else {
                    JOptionPane.showMessageDialog(this, "Ha elegido NO eliminar el lector con nrosocio " + nroSocio + ", si desea vuelva a intentarlo");

                }
                borrarTabla();
                borrarJtfBusqueda();
                jrbEliminar.setEnabled(false);
                jrbModificar.setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(this, "No puede eliminar al lector socio" + nroSocio + ", Tiene libros prestados");
                
            }
            jtaLector.clearSelection();
            borrarTabla();
            borrarJtfBusqueda();
        } else {
            JOptionPane.showMessageDialog(this, "Debe selecionar una fila");
        }


    }//GEN-LAST:event_jrbEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JButton jrbBuscar;
    private javax.swing.JButton jrbEliminar;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JButton jrbGuardar;
    private javax.swing.JButton jrbModificar;
    private javax.swing.JButton jrbNuevo;
    private javax.swing.JButton jrbSalir;
    private javax.swing.JTable jtaLector;
    private javax.swing.JTextField jtexApellido;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfDomicilio;
    private javax.swing.JTextField jtfMail;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfNroSocio;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        modelo.addColumn("Nro Socio");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Dni");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Mail");
        jtaLector.setModel(modelo);

    }

    private void ajustarTamañoColumnas() {
        TableColumn columnaNroSocio = jtaLector.getColumnModel().getColumn(0);
        columnaNroSocio.setPreferredWidth(60);

        TableColumn columnaNombre = jtaLector.getColumnModel().getColumn(1);
        columnaNombre.setPreferredWidth(100);

        TableColumn columnaApellido = jtaLector.getColumnModel().getColumn(2);
        columnaApellido.setPreferredWidth(100);

        TableColumn columnaDni = jtaLector.getColumnModel().getColumn(3);
        columnaDni.setPreferredWidth(60);

        TableColumn columnaDomicilio = jtaLector.getColumnModel().getColumn(4);
        columnaDomicilio.setPreferredWidth(80);

        TableColumn columnaMail = jtaLector.getColumnModel().getColumn(5);
        columnaMail.setPreferredWidth(80);

    }

    private void borrarCampos() {

        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfDni.setText("");
        jtfDomicilio.setText("");
        jtfMail.setText("");

    }

    private boolean comprobarCamposVacios() {
        return jtfNombre.getText().isEmpty() || jtfApellido.getText().isEmpty() || jtfDni.getText().isEmpty() || jtfDomicilio.getText().isEmpty() || jtfMail.getText().isEmpty();

    }

    private void borrarTabla() {
        modelo.setRowCount(0);
    }

    private void borrarFilas() {

        int filas = jtaLector.getRowCount();
        for (int f = filas; f >= 0; f--) {

            modelo.removeRow(f);
        }
    }

    private void cargarTabla(Lector lec) {
        modelo.addRow(new Object[]{
            lec.getNroSocio(),
            lec.getNombre(),
            lec.getApellido(),
            lec.getDNI(),
            lec.getDomicilio(),
            lec.getMail()

        });

    }

    private boolean comprobarFilasVacias(int filaSeleccionada) {

        String nombre = jtaLector.getValueAt(filaSeleccionada, 1).toString();
        String apellido = (String) jtaLector.getValueAt(filaSeleccionada, 2);
        int dni = (Integer) jtaLector.getValueAt(filaSeleccionada, 3);
        String domicilio = (String) jtaLector.getValueAt(filaSeleccionada, 4);
        String mail = jtaLector.getValueAt(filaSeleccionada, 5).toString();

        return nombre.equals("") || apellido.equals("") || domicilio.equals("") || mail.equals("");

    }

    private void borrarJtfBusqueda() {

        jtfNroSocio.setEditable(true);
        jtfNroSocio.setText("");
        jtexApellido.setText("");
    }

    private void borrarJtfLector() {

        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfDni.setText("");
        jtfDomicilio.setText("");
        jtfMail.setText("");

    }
}
