package bibliotecagrupo5.Control;

import bibliotecagrupo5.AccesoADatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author BETO
 */
public class FormularioUsuario extends javax.swing.JInternalFrame {

    private Connection con = null;
    JFrame login = new Login();
    ArrayList<String> listaUsuarios = new ArrayList<>();

    /**
     * Creates new form FormularioUsuario
     */
    public FormularioUsuario() {
        initComponents();
        con = Conexion.getConexion2("login");
        jbEliminar.setEnabled(false);
        habilitarCampos();
        llenarListaUsuarios();
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
        jLabel5 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jpfContrasenia = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jpfRepContrasenia = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setTitle("Formulario Usuarios");

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Biblioteca ANTONIO ESTEBAN AGÜERO");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel5.setText("Usuario:");

        jbBuscar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel6.setText("Contraseña:");

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel7.setText("Repita Contraseña:");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel4.setText("Email:");

        jbNuevo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                        .addComponent(jtfApellido)
                                        .addComponent(jtfNombre)
                                        .addComponent(jpfContrasenia)
                                        .addComponent(jtfUsuario)
                                        .addComponent(jpfRepContrasenia))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(287, 287, 287)
                                        .addComponent(jbBuscar))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jbNuevo)
                                .addGap(28, 28, 28)
                                .addComponent(jbEliminar)
                                .addGap(31, 31, 31)
                                .addComponent(jbGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jbSalir)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jpfContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jpfRepContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbGuardar)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:

        try {

            if (!comprobarCamposVacios()) {
                if (validarContraseñasIguales()) {

                    String usuario = jtfUsuario.getText();

                    if (validarUsuario(usuario)) {

                        String contraseña = jpfContrasenia.getText();
                        String nombre = jtfNombre.getText();
                        String apellido = jtfApellido.getText();
                        String email = jtfEmail.getText();

                        String sql = "INSERT INTO usuario (user, password, nombre, apellido, email) VALUES (?,?,?,?,?)";
                        PreparedStatement ps = con.prepareStatement(sql);

                        ps.setString(1, usuario);
                        ps.setString(2, contraseña);
                        ps.setString(3, nombre);
                        ps.setString(4, apellido);
                        ps.setString(5, email);

                        int exito = ps.executeUpdate();

                        if (exito == 1) {
                            JOptionPane.showMessageDialog(this, "Usuario guardado correctamente");
                            borrarCampos();
                            llenarListaUsuarios();
                        }
                        
                    } else {
                        JOptionPane.showMessageDialog(this, "Ya existe un usuario con ese nombre");
                        jtfUsuario.setText("");
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Debe ingresar la misma contraseña en los respectivos campos");
                    jpfContrasenia.setText("");
                    jpfRepContrasenia.setText("");
                }
            } else {

                JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacios");
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(this, "Error FI1 - Error al acceder a la tabla Login: " + ex.getMessage());

        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        habilitarCampos();
        borrarCampos();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        try {
            if (!jtfUsuario.getText().isEmpty()) {

                String sql = "SELECT * FROM usuario WHERE user=? ";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, jtfUsuario.getText());
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    jbEliminar.setEnabled(true);
                    jpfContrasenia.setText(rs.getString("password"));
                    jtfNombre.setText(rs.getString("nombre"));
                    jtfApellido.setText(rs.getString("apellido"));
                    jtfEmail.setText(rs.getString("email"));
                    inhabilitarCampos();
                }

            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un usuario");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error FI2 - Error al acceder a la tabla Login: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
       dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM usuario WHERE user=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, jtfUsuario.getText());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(this, "Usuario eliminado correctamente");
                borrarCampos();
                jbEliminar.setEnabled(false);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error FI3 - Error al acceder a la tabla Login: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JPasswordField jpfContrasenia;
    private javax.swing.JPasswordField jpfRepContrasenia;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables

    private boolean comprobarCamposVacios() {
        return jtfUsuario.getText().isEmpty() && jpfContrasenia.getText().isEmpty() && jpfRepContrasenia.getText().isEmpty()
                && jtfNombre.getText().isEmpty() && jtfApellido.getText().isEmpty() && jtfEmail.getText().isEmpty();
    }

    private boolean validarContraseñasIguales() {
        return jpfContrasenia.getText().equals(jpfRepContrasenia.getText());
    }

    public void borrarCampos() {
        jtfUsuario.setText("");
        jpfContrasenia.setText("");
        jpfRepContrasenia.setText("");
        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfEmail.setText("");
    }

    private void inhabilitarCampos() {
        jtfUsuario.setEditable(false);
        jpfContrasenia.setEditable(false);
        jpfRepContrasenia.setEditable(false);
        jtfNombre.setEditable(false);
        jtfApellido.setEditable(false);
        jtfEmail.setEditable(false);
    }

    private void habilitarCampos() {
        jtfUsuario.setEditable(true);
        jpfContrasenia.setEditable(true);
        jpfRepContrasenia.setEditable(true);
        jtfNombre.setEditable(true);
        jtfApellido.setEditable(true);
        jtfEmail.setEditable(true);
    }

    private void llenarListaUsuarios() {
        try {
            String sql = "SELECT user FROM usuario";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            listaUsuarios.clear(); 

            while (rs.next()) {
                String usuario = rs.getString("user");
                listaUsuarios.add(usuario);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar la lista de usuarios: " + ex.getMessage());
        }
    }

    private boolean validarUsuario(String usuarioABuscar) {
        boolean respuesta = true;

        if (!listaUsuarios.isEmpty()) {
            for (String aux : listaUsuarios) {
                if (aux.equals(usuarioABuscar)) {
                    respuesta = false;
                    break;
                }
            }
        }

        return respuesta;
    }

}
