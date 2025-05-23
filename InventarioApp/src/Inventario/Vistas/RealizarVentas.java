package Inventario.Vistas;

import Inventario.Enums.MetodoPagoEnum;
import static Inventario.Vistas.MenuPrincipal.jDesktopPane_menu;
import Inventario.Vistas.internal.SeleccionarProducto;
import Inventario.Vistas.internal.SeleccionarUsuario;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class RealizarVentas extends javax.swing.JInternalFrame {

    public RealizarVentas() {
        initComponents();
        cargarMetodosPago();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        Detalles = new javax.swing.JPanel();
        lbCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lbMetodoPago = new javax.swing.JLabel();
        cmbMetodoPago = new javax.swing.JComboBox<>();
        lbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbFecha = new javax.swing.JLabel();
        jdFecha = new com.toedter.calendar.JDateChooser();
        bntBuscar = new javax.swing.JButton();
        Opciones = new javax.swing.JPanel();
        btnAgregarProductos = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        Productos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        Total = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnNueva = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Realizar Ventas");
        setAutoscrolls(true);

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setText("NUEVA FACTURA");

        Detalles.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "   Detalles Facturacion   ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N

        lbCedula.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbCedula.setText("CEDULA:");

        lbMetodoPago.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbMetodoPago.setText("METODO PAGO:");

        lbNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbNombre.setText("NOMBRE:");

        lbFecha.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbFecha.setText("FECHA:");

        bntBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventario/Imagenes/search_1265907.png"))); // NOI18N
        bntBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DetallesLayout = new javax.swing.GroupLayout(Detalles);
        Detalles.setLayout(DetallesLayout);
        DetallesLayout.setHorizontalGroup(
            DetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetallesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(DetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DetallesLayout.createSequentialGroup()
                        .addComponent(lbNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre))
                    .addGroup(DetallesLayout.createSequentialGroup()
                        .addComponent(lbCedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFecha)
                    .addComponent(lbMetodoPago))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbMetodoPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        DetallesLayout.setVerticalGroup(
            DetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DetallesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DetallesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbFecha))
                    .addGroup(DetallesLayout.createSequentialGroup()
                        .addGroup(DetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCedula)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMetodoPago)
                            .addComponent(bntBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(DetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbNombre)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jdFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
        );

        Opciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "   Opciones    ", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N

        btnAgregarProductos.setText("Agregar Producto");
        btnAgregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductosActionPerformed(evt);
            }
        });

        btnEliminarProducto.setText("Remover Producto");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OpcionesLayout = new javax.swing.GroupLayout(Opciones);
        Opciones.setLayout(OpcionesLayout);
        OpcionesLayout.setHorizontalGroup(
            OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(btnAgregarProductos)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarProducto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OpcionesLayout.setVerticalGroup(
            OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpcionesLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarProductos)
                    .addComponent(btnEliminarProducto))
                .addGap(14, 14, 14))
        );

        Productos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "   Productos   ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Producto", "Descripccion", "Valor Unit.", "Valor Total"
            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        javax.swing.GroupLayout ProductosLayout = new javax.swing.GroupLayout(Productos);
        Productos.setLayout(ProductosLayout);
        ProductosLayout.setHorizontalGroup(
            ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        ProductosLayout.setVerticalGroup(
            ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Total.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "   Total   ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N

        jLabel1.setText("Total:");

        lbTotal.setText("Total");

        javax.swing.GroupLayout TotalLayout = new javax.swing.GroupLayout(Total);
        Total.setLayout(TotalLayout);
        TotalLayout.setHorizontalGroup(
            TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TotalLayout.setVerticalGroup(
            TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbTotal))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "   Archivo   ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N

        btnGuardar.setText("Guardar Factura");

        btnImprimir.setText("Imprimir Factura");

        btnNueva.setText("Nueva Factura");
        btnNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNueva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImprimir)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNueva)
                    .addComponent(btnGuardar)
                    .addComponent(btnImprimir))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Productos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel5))
                    .addComponent(Detalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Detalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(1, 1, 1)
                .addComponent(Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductosActionPerformed
        // TODO add your handling code here:
        SeleccionarProducto seleccionar = new SeleccionarProducto(this); 
        getParent().add(seleccionar); 
        seleccionar.setVisible(true);
        seleccionar.toFront();
        
        Dimension desktopSize = jDesktopPane_menu.getSize();
        Dimension frameSize = seleccionar.getSize();
        int x = (desktopSize.width - frameSize.width) / 2;
        int y = (desktopSize.height - frameSize.height) / 2;
        seleccionar.setLocation(x, y);
        
    }//GEN-LAST:event_btnAgregarProductosActionPerformed

    private void bntBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarActionPerformed
        SeleccionarUsuario seleccionar = new SeleccionarUsuario(this); 
        getParent().add(seleccionar); 
        seleccionar.setVisible(true);
        seleccionar.toFront();
        
        Dimension desktopSize = jDesktopPane_menu.getSize();
        Dimension frameSize = seleccionar.getSize();
        int x = (desktopSize.width - frameSize.width) / 2;
        int y = (desktopSize.height - frameSize.height) / 2;
        seleccionar.setLocation(x, y);
        
    }//GEN-LAST:event_bntBuscarActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tablaProductos.getSelectedRow();

        if (filaSeleccionada >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tablaProductos.getModel();
            modelo.removeRow(filaSeleccionada);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un producto para eliminar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaActionPerformed
        // TODO add your handling code here:
        txtCedula.setText("");
        txtNombre.setText("");
        jdFecha.setDate(null); // Si usas un JDateChooser, sería txtFecha.setDate(null);

        // Limpiar tabla de productos
        DefaultTableModel modelo = (DefaultTableModel) tablaProductos.getModel();
        modelo.setRowCount(0); // Elimina todas las filas

        // Reiniciar total (si tienes un JLabel o JTextField para mostrarlo)
        lbTotal.setText("0.00");
    }//GEN-LAST:event_btnNuevaActionPerformed

    public void setDatosCliente(String cedula, String nombre) {
    txtCedula.setText(cedula);
    txtNombre.setText(nombre);
}
    
    public void agregarProductoATabla(String nombre, String descripcion, double valorUnitario) {
        DefaultTableModel modelo = (DefaultTableModel) tablaProductos.getModel();

        int cantidad = 1; 
        double valorTotal = cantidad * valorUnitario;

        modelo.addRow(new Object[]{
            cantidad, nombre, descripcion, valorUnitario, valorTotal
        });
    }
    
    
    private void cargarMetodosPago() {
        for (MetodoPagoEnum metodo : MetodoPagoEnum.values()) {
            cmbMetodoPago.addItem(metodo.toString());
        }
    }
    
    public void agregarProductoDesdeSeleccion(String nombre, String descripcion, double precioVenta, int cantidad) {
    double valorTotal = cantidad * precioVenta;

    DefaultTableModel modelo = (DefaultTableModel) tablaProductos.getModel();
    modelo.addRow(new Object[]{
        cantidad,
        nombre,
        descripcion,
        precioVenta,
        valorTotal
    });

    // Opcional: recalcular el total de la factura
    calcularTotalFactura();
}
    
    private void calcularTotalFactura() {
    DefaultTableModel modelo = (DefaultTableModel) tablaProductos.getModel();
    double total = 0.0;

    for (int i = 0; i < modelo.getRowCount(); i++) {
        total += Double.parseDouble(modelo.getValueAt(i, 4).toString()); // columna 4 = valor total
    }

    // Mostrar el total en un JLabel o JTextField
    lbTotal.setText(String.format("%.2f", total));
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Detalles;
    private javax.swing.JPanel Opciones;
    private javax.swing.JPanel Productos;
    private javax.swing.JPanel Total;
    private javax.swing.JButton bntBuscar;
    private javax.swing.JButton btnAgregarProductos;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNueva;
    private javax.swing.JComboBox<String> cmbMetodoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JLabel lbCedula;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbMetodoPago;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
 } 
