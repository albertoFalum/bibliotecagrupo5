package bibliotecagrupo5.Vistas;

import bibliotecagrupo5.AccesoADatos.EjemplarData;
import bibliotecagrupo5.AccesoADatos.LectorData;
import bibliotecagrupo5.AccesoADatos.PrestamoData;
import bibliotecagrupo5.Entidades.Condicion;
import bibliotecagrupo5.Entidades.Ejemplar;
import bibliotecagrupo5.Entidades.Lector;
import bibliotecagrupo5.Entidades.Prestamo;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author BETO
 */
public class ManejoPrestamoDevolucion extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private LectorData lectorData = null;
    private EjemplarData ejemplarData = null;
    private PrestamoData prestamoData = null;
    private TreeSet<Lector> listaLector = null;
    private TreeSet<Ejemplar> listaEjemplar = null;
    private boolean recargarListaPrestamos = false;

    /**
     * Creates new form ManejoPrestamoDevolucion
     */
    public ManejoPrestamoDevolucion() {
        initComponents();
        armarCabecera();
        ajustarTamañoColumnas();

        lectorData = new LectorData();
        ejemplarData = new EjemplarData();
        prestamoData = new PrestamoData();

        cargarComboLector();
        cargarComboEjemplar();

        borrarTabla();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPrestamo = new javax.swing.JTable();
        jbMostrarPrestamos = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbDevolver = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jdchFechaInicio = new com.toedter.calendar.JDateChooser();
        jdchFechaFin = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jbPrestar = new javax.swing.JButton();
        jcbEjemplar = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jcbLector = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jbActualizarCondicion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 105, 242));
        setClosable(true);
        setTitle("Prestamos y Devoluciones");

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jTPrestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jTPrestamo.getTableHeader().setResizingAllowed(false);
        jTPrestamo.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTPrestamo);

        jbMostrarPrestamos.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jbMostrarPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo5/ImagenesVideosGif/icons8-mostrar-propiedad-24.png"))); // NOI18N
        jbMostrarPrestamos.setText("Mostrar Prestamos");
        jbMostrarPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarPrestamosActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo5/ImagenesVideosGif/limpiar.png"))); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbDevolver.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jbDevolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo5/ImagenesVideosGif/icons8-devolver-libro-24.png"))); // NOI18N
        jbDevolver.setText("Devolver");
        jbDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDevolverActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo5/ImagenesVideosGif/salir.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel4.setText("Fecha Inicio:");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel5.setText("Fecha Fin:");

        jbPrestar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jbPrestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo5/ImagenesVideosGif/prestar.png"))); // NOI18N
        jbPrestar.setText("PRESTAR");
        jbPrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPrestarActionPerformed(evt);
            }
        });

        jcbEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEjemplarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione un Ejemplar");

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel1.setText("Seleccione un Lector:");

        jcbLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbLectorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Formulario Prestamos y Devoluciones");

        jbActualizarCondicion.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jbActualizarCondicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo5/ImagenesVideosGif/icons8-actualizar-24.png"))); // NOI18N
        jbActualizarCondicion.setText("Actualizar Condicion");
        jbActualizarCondicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarCondicionActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo5/ImagenesVideosGif/Image20231018165055 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbMostrarPrestamos)
                                .addGap(29, 29, 29)
                                .addComponent(jbActualizarCondicion)
                                .addGap(51, 51, 51)
                                .addComponent(jbDevolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbLimpiar)
                                .addGap(62, 62, 62)
                                .addComponent(jbSalir))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbEjemplar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbLector, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jdchFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jdchFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbPrestar)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(25, 25, 25))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jcbLector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jcbEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(11, 11, 11)
                        .addComponent(jbPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jdchFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdchFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMostrarPrestamos)
                    .addComponent(jbDevolver)
                    .addComponent(jbSalir)
                    .addComponent(jbLimpiar)
                    .addComponent(jbActualizarCondicion))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPrestarActionPerformed
        // TODO add your handling code here:
        try {
            borrarTabla();

            Lector lector = (Lector) jcbLector.getSelectedItem();
            Ejemplar ejemplar = (Ejemplar) jcbEjemplar.getSelectedItem();
            LocalDate fechaInicio = jdchFechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaFin = jdchFechaFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (fechaFin.isAfter(fechaInicio)) {
                if (ejemplar.getCantidad() >= 1) {

                    Prestamo prestamo = null;

                    Ejemplar ejemplarPrestado = new Ejemplar(ejemplar.getLibro(), 1, true, Condicion.PRESTADO);
                    ejemplarData.guardarEjemplar(ejemplarPrestado);
                    prestamo = new Prestamo(fechaInicio, fechaFin, ejemplarPrestado, lector, true);

                    prestamoData.guardarPrestamo(prestamo);
                    borrarCampos();
                    cargarTabla(prestamo);

                    ejemplar.setCantidad(ejemplar.getCantidad() - 1);
                    ejemplarData.modificarEjemplar(ejemplar);

                    JOptionPane.showMessageDialog(this, "Prestamo Guardado");
                    borrarTabla();

                    cargarComboEjemplar();

                } else {
                    JOptionPane.showMessageDialog(this, "No exiten ejemplares para prestar");
                }
            } else {
                JOptionPane.showMessageDialog(this, "La fecha de devolucion debe ser posterior a la fecha de prestamo");
            }

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "MPD 1 - No hay datos cargados " + ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_jbPrestarActionPerformed

    private void jbDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDevolverActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jTPrestamo.getSelectedRow();
        try {
            if (filaSeleccionada != -1) {

                int idPrestamo = (int) jTPrestamo.getValueAt(filaSeleccionada, 0);
                int codigo = (int) jTPrestamo.getValueAt(filaSeleccionada, 2);

                Ejemplar ejemplarPrestado = ejemplarData.buscarEjemplar(codigo);

                prestamoData.eliminarPrestamo(idPrestamo);
              
                ejemplarData.eliminarEjemplar(codigo);

                Ejemplar ejemplarDisponible = ejemplarData.BuscarEjemplarIdLibroYCondicion(ejemplarPrestado.getLibro().getIdLibro(), Condicion.DISPONIBLE);
                ejemplarDisponible.setCantidad(ejemplarDisponible.getCantidad() + 1);
                ejemplarData.modificarEjemplar(ejemplarDisponible);
                cargarComboEjemplar();

                borrarTabla();
                cargarTablaLista(prestamoData.listarPrestamos());

            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "MPD 2 - No hay datos cargados " + ex.getMessage());
        }
    }//GEN-LAST:event_jbDevolverActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea Salir?",
                "Salir", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        if (respuesta == 0) {
            dispose();
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbLectorActionPerformed
        // TODO add your handling code here:
        borrarTabla();
        try {
            Lector lector = (Lector) jcbLector.getSelectedItem();

            TreeSet<Prestamo> listaPrestamosLector = prestamoData.listarPrestamosPorLector(lector.getNroSocio());
            cargarTablaLista(listaPrestamosLector);
        } catch (NullPointerException ex) {
            borrarTabla();
        }


    }//GEN-LAST:event_jcbLectorActionPerformed

    private void jcbEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEjemplarActionPerformed
        // TODO add your handling code here:
        borrarTabla();
        try {
            Ejemplar ejemplar = (Ejemplar) jcbEjemplar.getSelectedItem();
            int idLibro = ejemplar.getLibro().getIdLibro();

            TreeSet<Prestamo> listaPrestamosEjemplar = prestamoData.listarPrestamosPorEjemplar(idLibro);
            cargarTablaLista(listaPrestamosEjemplar);
        } catch (NullPointerException ex) {
            borrarTabla();
        }

    }//GEN-LAST:event_jcbEjemplarActionPerformed

    private void jbMostrarPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarPrestamosActionPerformed
        // TODO add your handling code here:
        try {
            borrarTabla();
            cargarTablaLista(prestamoData.listarPrestamos());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No hay prestamos para mostrar");
        }

    }//GEN-LAST:event_jbMostrarPrestamosActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        borrarTabla();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbActualizarCondicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarCondicionActionPerformed
        // TODO add your handling code here:
        borrarTabla();
        LocalDate fechaActual = LocalDate.now();

        try {
            TreeSet<Prestamo> listaPrestamo2 = prestamoData.obtenerPrestamosVencidos(fechaActual);

            for (Prestamo aux : listaPrestamo2) {
                aux.getEjemplar().setCondicion(Condicion.RETRASO);
                ejemplarData.modificarEjemplar(aux.getEjemplar());
                recargarListaPrestamos = true;
            }

            if (recargarListaPrestamos) {
                cargarTablaLista(listaPrestamo2);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "No hay datos para mostrar: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbActualizarCondicionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTPrestamo;
    private javax.swing.JButton jbActualizarCondicion;
    private javax.swing.JButton jbDevolver;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbMostrarPrestamos;
    private javax.swing.JButton jbPrestar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Ejemplar> jcbEjemplar;
    private javax.swing.JComboBox<Lector> jcbLector;
    private com.toedter.calendar.JDateChooser jdchFechaFin;
    private com.toedter.calendar.JDateChooser jdchFechaInicio;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera() {
        modelo.addColumn("ID Prestamo");
        modelo.addColumn("Nro Socio");
        modelo.addColumn("Cod Ejemplar");
        modelo.addColumn("Titulo Libro");
        modelo.addColumn("Fecha Prestamo");
        modelo.addColumn("Fecha Finalizacion");
        modelo.addColumn("Condicion");
        jTPrestamo.setModel(modelo);
    }

    private void ajustarTamañoColumnas() {
        TableColumn columnaIdPrestamo = jTPrestamo.getColumnModel().getColumn(0);
        columnaIdPrestamo.setPreferredWidth(30);

        TableColumn columnaNroSocio = jTPrestamo.getColumnModel().getColumn(1);
        columnaNroSocio.setPreferredWidth(30);

        TableColumn columnaCodigoEjemplar = jTPrestamo.getColumnModel().getColumn(2);
        columnaCodigoEjemplar.setPreferredWidth(30);

        TableColumn columnaTitulo = jTPrestamo.getColumnModel().getColumn(3);
        columnaTitulo.setPreferredWidth(200);

        TableColumn columnaFechaInicio = jTPrestamo.getColumnModel().getColumn(4);
        columnaFechaInicio.setPreferredWidth(30);

        TableColumn columnaFechaFin = jTPrestamo.getColumnModel().getColumn(5);
        columnaFechaFin.setPreferredWidth(40);

        TableColumn columnaCondicion = jTPrestamo.getColumnModel().getColumn(6);
        columnaCondicion.setPreferredWidth(30);

    }

    private void cargarTabla(Prestamo prestamo) {

        modelo.addRow(new Object[]{prestamo.getIdPrestamo(),
            prestamo.getLector().getNroSocio(),
            prestamo.getEjemplar().getCodigo(),
            prestamo.getEjemplar().getLibro().getTitulo(),
            prestamo.getFechaInicio(), prestamo.getFechaFin(),
            prestamo.getEjemplar().getCondicion()});

    }

    private void cargarTablaLista(TreeSet<Prestamo> listaPrestamos) {
        for (Prestamo prestamo : listaPrestamos) {
            cargarTabla(prestamo);
        }
    }

    private void borrarTabla() {
        modelo.setRowCount(0);
    }

    private void borrarCampos() {
        jdchFechaInicio.setDate(null);
        jdchFechaFin.setDate(null);
        jcbLector.setSelectedIndex(-1);
    }

    private void cargarComboLector() {
        try {
            listaLector = lectorData.listarLector();
            for (Lector lector : listaLector) {
                jcbLector.addItem(lector);
            }
        } catch (NullPointerException ex) {

        }

    }

    private void cargarComboEjemplar() {

        jcbEjemplar.removeAllItems();
        try {
            listaEjemplar = ejemplarData.listarEjemplaresPorCondicion(Condicion.DISPONIBLE);

            for (Ejemplar ejemplar : listaEjemplar) {
                if (ejemplar.getCantidad() >= 1) {
                    jcbEjemplar.addItem(ejemplar);
                }
            }
        } catch (NullPointerException ex) {

        }
    }
}
