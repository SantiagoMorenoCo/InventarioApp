package Inventario.Vistas;

import Inventario.DAO.UsuarioDAO;
import Inventario.Enums.Roles;
import Inventario.Enums.TipoDeIdentificacion;
import Inventario.SQLite.*;
import inventario.Modelo.Usuario;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionarUsuario extends javax.swing.JInternalFrame {

    public GestionarUsuario() {
        initComponents();

        cmbRol.removeAllItems();
        for (Roles rol : Roles.values()) {
            cmbRol.addItem(rol);
        }

        cmbTipoDocumento.removeAllItems();
        for (TipoDeIdentificacion tipo : TipoDeIdentificacion.values()) {
            cmbTipoDocumento.addItem(tipo);
        }

        cargarUsuarios();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuario = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        lbRol = new javax.swing.JLabel();
        lbApellido = new javax.swing.JLabel();
        lbTelefono = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        lbCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        cmbRol = new javax.swing.JComboBox<>();
        lbTipoDocumento = new javax.swing.JLabel();
        cmbTipoDocumento = new javax.swing.JComboBox<>();
        btnLimpiarCampos = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setText("GESTION USUARIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 8, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N

        tablaUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Telefono", "Rol", "Cedula", "Tipo Documento", "Usuario", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuario);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 810, -1));

        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnActualizar)
                .addGap(12, 12, 12)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 78, -1, -1));

        lbNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNombre.setText("Nombre:");

        lbRol.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbRol.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbRol.setText("Rol:");

        lbApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbApellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbApellido.setText("Apellido:");

        lbTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTelefono.setText("Telefono:");

        lbUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUsuario.setText("Usuario:");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbCedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbCedula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCedula.setText("Cedula:");

        txtCedula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbTipoDocumento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTipoDocumento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTipoDocumento.setText("Tipo Doc:");

        btnLimpiarCampos.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnLimpiarCampos.setText("Limpiar Campos");
        btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbNombre)
                    .addComponent(lbRol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(cmbRol, 0, 150, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbTipoDocumento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbApellido)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbNombre)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbUsuario)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTipoDocumento)
                                    .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbRol)
                                .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbCedula)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnLimpiarCampos))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 341, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        cargarUsuarios();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tablaUsuario.getSelectedRow();

        if (filaSeleccionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) tablaUsuario.getModel();
            int idUsuario = (int) modelo.getValueAt(filaSeleccionada, 0); // ID en la columna 0

            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar al usuario con ID " + idUsuario + "?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                // Eliminar de la base de datos
                if (UsuarioDAO.eliminarUsuario(idUsuario)) {
                    JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente.");
                    cargarUsuarios(); // Recarga la tabla
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar usuario.");
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        txtNombre.setText("");
        txtApellido.setText("");
        txtUsuario.setText("");
        txtCedula.setText("");
        txtTelefono.setText("");
        cmbRol.setSelectedIndex(0);
        cmbTipoDocumento.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int fila = tablaUsuario.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila para modificar.");
            return;
        }

        int id = Integer.parseInt(tablaUsuario.getValueAt(fila, 0).toString());

        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre(txtNombre.getText());
        usuario.setApellido(txtApellido.getText());
        usuario.setTelefono(txtTelefono.getText());
        usuario.setRol((Roles) cmbRol.getSelectedItem());
        usuario.setCedula(txtCedula.getText());
        usuario.setTipoIdentificacion((TipoDeIdentificacion) cmbTipoDocumento.getSelectedItem());
        usuario.setUsuario(txtUsuario.getText());

        UsuarioDAO dao = new UsuarioDAO();
        if (dao.modificarUsuario(usuario)) {
            JOptionPane.showMessageDialog(null, "Usuario modificado correctamente.");
            cargarUsuarios(); 
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar usuario.");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tablaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuarioMouseClicked
        int fila = tablaUsuario.getSelectedRow();
        if (fila != -1) {
            txtNombre.setText(tablaUsuario.getValueAt(fila, 1).toString());
            txtApellido.setText(tablaUsuario.getValueAt(fila, 2).toString());
            txtTelefono.setText(tablaUsuario.getValueAt(fila, 3).toString());

            //text a Roles enum
            String rolTexto = tablaUsuario.getValueAt(fila, 4).toString();
            cmbRol.setSelectedItem(Roles.valueOf(rolTexto));

            txtCedula.setText(tablaUsuario.getValueAt(fila, 5).toString());

            // Convertir texto a enum TipoIdentificacion
            String tipoDocTexto = tablaUsuario.getValueAt(fila, 6).toString();
            cmbTipoDocumento.setSelectedItem(TipoDeIdentificacion.valueOf(tipoDocTexto));

            txtUsuario.setText(tablaUsuario.getValueAt(fila, 7).toString());
    }//GEN-LAST:event_tablaUsuarioMouseClicked
    }
    public void cargarUsuarios() {
    DefaultTableModel modelo = (DefaultTableModel) tablaUsuario.getModel();
    modelo.setRowCount(0); // limpia la tabla

    String sql = "SELECT * FROM usuario";

    try (Connection conn = Conexion.conectar(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

        while (rs.next()) {
            Object[] fila = {
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getString("telefono"),
                rs.getString("rol"),
                rs.getString("cedula"),
                rs.getString("tipo_identificacion"),
                rs.getString("usuario"),
                rs.getString("telefono")
            };
            modelo.addRow(fila);
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al cargar usuarios: " + e.getMessage());
    } 
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiarCampos;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<Inventario.Enums.Roles> cmbRol;
    private javax.swing.JComboBox<Inventario.Enums.TipoDeIdentificacion> cmbTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbCedula;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbRol;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbTipoDocumento;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JTable tablaUsuario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
