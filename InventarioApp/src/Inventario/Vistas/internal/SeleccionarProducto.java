package Inventario.Vistas.internal;

import Inventario.DAO.ProductoDAO;
import Inventario.Vistas.RealizarVentas;
import inventario.Modelo.Producto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SeleccionarProducto extends javax.swing.JInternalFrame {
    private RealizarVentas ventanaVentas;

    public SeleccionarProducto(RealizarVentas ventanaVentas) {
        initComponents();
        this.ventanaVentas = ventanaVentas;
        cargarProductos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSeleccionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();

        setClosable(true);

        btnSeleccionar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnSeleccionar.setText("Seleccionar Producto");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Precio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(btnSeleccionar)
                .addGap(147, 147, 147))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:
        int fila = tablaProductos.getSelectedRow();
        if (fila >= 0) {
            String nombre = tablaProductos.getValueAt(fila, 1).toString();         // Nombre está en columna 1
            String descripcion = tablaProductos.getValueAt(fila, 2).toString();    // Descripción está en columna 2
            double precioVenta = Double.parseDouble(tablaProductos.getValueAt(fila, 3).toString()); // ← PrecioVenta está en columna 3
            int stock = Integer.parseInt(tablaProductos.getValueAt(fila, 4).toString());

            String input = JOptionPane.showInputDialog(this, "Ingrese la cantidad:");
            if (input != null && !input.isEmpty()) {
                int cantidad = Integer.parseInt(input);

                if (cantidad > stock) {
                    JOptionPane.showMessageDialog(this, "Cantidad excede el stock disponible (" + stock + ")");
                    return;
                }

                // Aquí llamas a la ventana principal (RealizarVentas) para pasar el producto:
                ventanaVentas.agregarProductoDesdeSeleccion(nombre, descripcion, precioVenta, cantidad);
                dispose(); // cerrar la ventana de selección
            }
    
    }//GEN-LAST:event_btnSeleccionarActionPerformed
    }
    private void cargarProductos() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID");
    modelo.addColumn("Nombre");
    modelo.addColumn("Descripción");
    modelo.addColumn("Precio");
    modelo.addColumn("Stock");

    ProductoDAO productoDAO = new ProductoDAO(); // Asegúrate de tener esto
    List<Producto> productos = productoDAO.obtenerTodos(); // Método que debes tener

    for (Producto p : productos) {
        modelo.addRow(new Object[]{
            p.getId(), 
            p.getNombre(), 
            p.getDescripcion(), 
            p.getPrecioVenta(), 
            p.getStock()
        });
    }

    tablaProductos.setModel(modelo);

    tablaProductos.getColumnModel().getColumn(0).setMinWidth(0);
    tablaProductos.getColumnModel().getColumn(0).setMaxWidth(0);
    tablaProductos.getColumnModel().getColumn(0).setWidth(0);
}
    

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}


