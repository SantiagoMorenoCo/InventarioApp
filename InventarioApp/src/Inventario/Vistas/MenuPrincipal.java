package Inventario.Vistas;

import java.awt.Dimension;
import javax.swing.JDesktopPane;

public class MenuPrincipal extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu;

    public MenuPrincipal() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Ventas");

        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 110));
        this.add(jDesktopPane_menu);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        NuevoUsuar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        GestionUsuar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        NuevoProduct = new javax.swing.JMenuItem();
        GestionInvent = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        RealizarVent = new javax.swing.JMenuItem();
        Historic = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NuevoUsuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventario/Imagenes/audience_9928116.png"))); // NOI18N
        NuevoUsuar.setText("Usuario");
        NuevoUsuar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventario/Imagenes/add-user_15336957.png"))); // NOI18N
        jMenuItem1.setText("Nuevo Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        NuevoUsuar.add(jMenuItem1);

        GestionUsuar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        GestionUsuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventario/Imagenes/management_2683650.png"))); // NOI18N
        GestionUsuar.setText("Gestionar Usuario");
        GestionUsuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionUsuarActionPerformed(evt);
            }
        });
        NuevoUsuar.add(GestionUsuar);

        jMenuBar1.add(NuevoUsuar);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventario/Imagenes/product_16090175.png"))); // NOI18N
        jMenu2.setText("Producto e Inventario");
        jMenu2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N

        NuevoProduct.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        NuevoProduct.setText("Nuevo Producto");
        NuevoProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoProductActionPerformed(evt);
            }
        });
        jMenu2.add(NuevoProduct);

        GestionInvent.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        GestionInvent.setText("Gestion Inventario");
        GestionInvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionInventActionPerformed(evt);
            }
        });
        jMenu2.add(GestionInvent);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventario/Imagenes/sale_7832471.png"))); // NOI18N
        jMenu3.setText("Venta");
        jMenu3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N

        RealizarVent.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        RealizarVent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventario/Imagenes/cart_2304982.png"))); // NOI18N
        RealizarVent.setText("Realizar Venta");
        RealizarVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarVentActionPerformed(evt);
            }
        });
        jMenu3.add(RealizarVent);

        Historic.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Historic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventario/Imagenes/bill_1897109.png"))); // NOI18N
        Historic.setText("Historico");
        jMenu3.add(Historic);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        NuevoUsuario nuevoUsuario = new NuevoUsuario();
        jDesktopPane_menu.add(nuevoUsuario);
        nuevoUsuario.setVisible(true);

        Dimension desktopSize = jDesktopPane_menu.getSize();
        Dimension frameSize = nuevoUsuario.getSize();
        int x = (desktopSize.width - frameSize.width) / 2;
        int y = (desktopSize.height - frameSize.height) / 2;
        nuevoUsuario.setLocation(x, y);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void NuevoProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoProductActionPerformed
        NuevoProducto nuevoProducto = new NuevoProducto();
        jDesktopPane_menu.add(nuevoProducto);
        nuevoProducto.setVisible(true); 
        
        Dimension desktopSize = jDesktopPane_menu.getSize();
        Dimension frameSize = nuevoProducto.getSize();
        int x = (desktopSize.width - frameSize.width) / 2;
        int y = (desktopSize.height - frameSize.height) / 2;
        nuevoProducto.setLocation(x, y);
    }//GEN-LAST:event_NuevoProductActionPerformed

    private void GestionUsuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionUsuarActionPerformed
        GestionarUsuario gestionarUsuario = new GestionarUsuario();
        jDesktopPane_menu.add(gestionarUsuario);
        gestionarUsuario.setVisible(true);

        Dimension desktopSize = jDesktopPane_menu.getSize();
        Dimension frameSize = gestionarUsuario.getSize();
        int x = (desktopSize.width - frameSize.width) / 2;
        int y = (desktopSize.height - frameSize.height) / 2;
        gestionarUsuario.setLocation(x, y);


    }//GEN-LAST:event_GestionUsuarActionPerformed

    private void GestionInventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionInventActionPerformed
        GestionInventario gestionarInventario = new GestionInventario();
        jDesktopPane_menu.add(gestionarInventario);
        gestionarInventario.setVisible(true); 
        
        Dimension desktopSize = jDesktopPane_menu.getSize();
        Dimension frameSize = gestionarInventario.getSize();
        int x = (desktopSize.width - frameSize.width) / 2;
        int y = (desktopSize.height - frameSize.height) / 2;
        gestionarInventario.setLocation(x, y);

    }//GEN-LAST:event_GestionInventActionPerformed

    private void RealizarVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarVentActionPerformed
        RealizarVentas realizarVenta = new RealizarVentas();
        jDesktopPane_menu.add(realizarVenta);
        realizarVenta.setVisible(true);
        
        Dimension desktopSize = jDesktopPane_menu.getSize();
        Dimension frameSize = realizarVenta.getSize();
        int x = (desktopSize.width - frameSize.width) / 2;
        int y = (desktopSize.height - frameSize.height) / 2;
        realizarVenta.setLocation(x, y);
    }//GEN-LAST:event_RealizarVentActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem GestionInvent;
    private javax.swing.JMenuItem GestionUsuar;
    private javax.swing.JMenuItem Historic;
    private javax.swing.JMenuItem NuevoProduct;
    private javax.swing.JMenu NuevoUsuar;
    private javax.swing.JMenuItem RealizarVent;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
