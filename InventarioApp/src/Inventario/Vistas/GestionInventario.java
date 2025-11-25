package Inventario.Vistas;

import Inventario.SQLite.Conexion;
import inventario.Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GestionInventario extends javax.swing.JInternalFrame {
    private LinkedList<Producto> listaProductos = new LinkedList<>();
    private Stack<Producto> pilaEliminados = new Stack<>();
    private Queue<Producto> colaStock = new LinkedList<>();

    public GestionInventario() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PanelDeAcciones = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        PanelDeDetalle = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("Gestion De Inventario");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jScrollPane1.setToolTipText("\n");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("ActualizarStock");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDeAccionesLayout = new javax.swing.GroupLayout(PanelDeAcciones);
        PanelDeAcciones.setLayout(PanelDeAccionesLayout);
        PanelDeAccionesLayout.setHorizontalGroup(
            PanelDeAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeAccionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(171, 171, 171))
        );
        PanelDeAccionesLayout.setVerticalGroup(
            PanelDeAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeAccionesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelDeAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("Descripcion:");

        javax.swing.GroupLayout PanelDeDetalleLayout = new javax.swing.GroupLayout(PanelDeDetalle);
        PanelDeDetalle.setLayout(PanelDeDetalleLayout);
        PanelDeDetalleLayout.setHorizontalGroup(
            PanelDeDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeDetalleLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelDeDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeDetalleLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDeDetalleLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(366, Short.MAX_VALUE))
        );
        PanelDeDetalleLayout.setVerticalGroup(
            PanelDeDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeDetalleLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PanelDeDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelDeAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelDeDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDeAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelDeDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.getAccessibleContext().setAccessibleDescription("\n");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    int fila = jTable1.getSelectedRow();
     if (fila == -1) {
        JOptionPane.showMessageDialog(null, "Selecciona un producto para eliminar.");
        return;
    }


    int id = (int) jTable1.getValueAt(fila, 0);
    String nombre = (String) jTable1.getValueAt(fila, 1);
    String descripcion = (String) jTable1.getValueAt(fila, 2);
    Double precioVenta = (Double) jTable1.getValueAt(fila, 3);
    Double precioCompra = (Double) jTable1.getValueAt(fila, 4);
    float iva = (float) jTable1.getValueAt(fila, 5);
    int stock = (int) jTable1.getValueAt(fila, 6);

   Producto eliminado = new Producto(id, nombre, descripcion,
                                   precioVenta, precioCompra,
                                   iva, stock);

   pilaEliminados.push(eliminado);
   try {
            Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement("DELETE FROM producto WHERE id = ?");
            ps.setInt(1, id); 
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto eliminado.");
            cargarProductosEnTabla();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String valor = jTextField1.getText().trim();

    if (valor.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Escribe el nombre del producto que estas buscando");   
    return;
    }
    ArrayList<Object[]> listaResultados = new ArrayList<>();
    String consulta = "SELECT * FROM producto WHERE nombre LIKE ? OR descripcion LIKE ?"; // Changed 'productos' to 'producto' and added WHERE clause

   try {
        Connection con = Conexion.conectar();
        PreparedStatement ps = con.prepareStatement(consulta);
        ps.setString(1, "%" + valor + "%"); // Bind value to the first placeholder
        ps.setString(2, "%" + valor + "%"); // Bind value to the second placeholder for description search as well
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            listaResultados.add(new Object[]{
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("descripcion"),
                rs.getDouble("precioVenta"),
                rs.getDouble("precioCompra"),
                rs.getDouble("iva"),
                rs.getInt("stock")
            });
        }
        if (listaResultados.isEmpty()){
           JOptionPane.showMessageDialog(null,"El producto no esta en nuestra base de datos");
           jTextField1.setText("");
        return;
        }
        
   DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID");
    modelo.addColumn("Nombre");
    modelo.addColumn("Descripción");
    modelo.addColumn("Precio Venta");
    modelo.addColumn("Precio Compra");
    modelo.addColumn("IVA");
    modelo.addColumn("Stock");     
    
    for (Object[] fila : listaResultados) {
        modelo.addRow(fila);
    }
   jTable1.setModel(modelo);
       
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error en la búsqueda: " + ex.getMessage());
    }

    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  int fila = jTable1.getSelectedRow();
if (fila == -1) {
    JOptionPane.showMessageDialog(null, "Selecciona un producto para actualizar el stock.");
    return;
}

String stockStr = JOptionPane.showInputDialog(
    null, 
    "Ingresa el nuevo stock:", 
    "Actualizar Stock", 
    JOptionPane.QUESTION_MESSAGE
);

if (stockStr != null && !stockStr.trim().isEmpty()) {
    try {
        int nuevoStock = Integer.parseInt(stockStr.trim());
        if (nuevoStock < 0) {
            JOptionPane.showMessageDialog(null, "El stock no puede ser negativo.");
            return;
        }

    int id = (int) jTable1.getValueAt(fila, 0);
     for (Producto p : listaProductos) {
    if (p.getId() == id) {
        p.setStock(nuevoStock);
        colaStock.add(p); 
        break;
    }
}
  
        Connection con = Conexion.conectar();
        PreparedStatement ps = con.prepareStatement("UPDATE producto SET stock = ? WHERE id = ?");
        ps.setInt(1, nuevoStock);
        ps.setInt(2, id);
        
        int filasAfectadas = ps.executeUpdate();
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Stock actualizado correctamente.");
            cargarProductosEnTabla();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el stock.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido.");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al actualizar stock: " + ex.getMessage());
    }
}

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int fila = jTable1.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona un producto para editar.");
            return;
        }

        int id = (int) jTable1.getValueAt(fila, 0);
        String nuevaDescripcion = jTextField2.getText().trim();

        if (nuevaDescripcion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La descripción no puede estar vacía.");
            return;
        }

        try {
            Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement("UPDATE producto SET descripcion = ? WHERE id = ?");
            ps.setString(1, nuevaDescripcion);
            ps.setInt(2, id);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Descripción actualizada correctamente.");
            cargarProductosEnTabla();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al editar: " + ex.getMessage());
        }
    
    }//GEN-LAST:event_jButton3ActionPerformed
private void cargarProductosEnTabla() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID");
    modelo.addColumn("Nombre");
    modelo.addColumn("Descripción");
    modelo.addColumn("Precio Venta");
    modelo.addColumn("Precio Compra");
    modelo.addColumn("IVA");
    modelo.addColumn("Stock");

    try {
        Connection con = Conexion.conectar();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM producto");
        
        listaProductos.clear();
        while (rs.next()) {
              Producto p = new Producto(
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("descripcion"),
                rs.getDouble("precioVenta"),
                rs.getDouble("precioCompra"),
                rs.getFloat("iva"),
                rs.getInt("stock")
            );
         listaProductos.add(p); 
         modelo.addRow(new Object[]{
        p.getId(),
        p.getNombre(),
        p.getDescripcion(),
        p.getPrecioVenta(),
        p.getPrecioCompra(),
        p.getIva(),
        p.getStock()
    });

        }

        jTable1.setModel(modelo);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al cargar productos: " + ex.getMessage());
    }
}




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDeAcciones;
    private javax.swing.JPanel PanelDeDetalle;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
