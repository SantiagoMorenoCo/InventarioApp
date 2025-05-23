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
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventario/Imagenes/audience_9928116.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventario/Imagenes/add-user_15336957.png"))); // NOI18N
        jMenuItem1.setText("Nuevo Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventario/Imagenes/management_2683650.png"))); // NOI18N
        jMenuItem3.setText("Gestionar Usuario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventario/Imagenes/product_16090175.png"))); // NOI18N
        jMenu2.setText("Producto e Inventario");
        jMenu2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jMenuItem2.setText("Nuevo Producto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jMenuItem4.setText("Gestionar Producto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventario/Imagenes/sale_7832471.png"))); // NOI18N
        jMenu3.setText("Venta");
        jMenu3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventario/Imagenes/cart_2304982.png"))); // NOI18N
        jMenuItem5.setText("Realizar Venta");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventario/Imagenes/bill_1897109.png"))); // NOI18N
        jMenuItem6.setText("Historico");
        jMenu3.add(jMenuItem6);

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

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        NuevoProducto nuevoProducto = new NuevoProducto();
        jDesktopPane_menu.add(nuevoProducto);
        nuevoProducto.setVisible(true); 
        
        Dimension desktopSize = jDesktopPane_menu.getSize();
        Dimension frameSize = nuevoProducto.getSize();
        int x = (desktopSize.width - frameSize.width) / 2;
        int y = (desktopSize.height - frameSize.height) / 2;
        nuevoProducto.setLocation(x, y);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        GestionarUsuario gestionarUsuario = new GestionarUsuario();
        jDesktopPane_menu.add(gestionarUsuario);
        gestionarUsuario.setVisible(true);

        Dimension desktopSize = jDesktopPane_menu.getSize();
        Dimension frameSize = gestionarUsuario.getSize();
        int x = (desktopSize.width - frameSize.width) / 2;
        int y = (desktopSize.height - frameSize.height) / 2;
        gestionarUsuario.setLocation(x, y);


    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        GestionarProducto gestionarProducto = new GestionarProducto();
        jDesktopPane_menu.add(gestionarProducto);
        gestionarProducto.setVisible(true);
        
        Dimension desktopSize = jDesktopPane_menu.getSize();
        Dimension frameSize = gestionarProducto.getSize();
        int x = (desktopSize.width - frameSize.width) / 2;
        int y = (desktopSize.height - frameSize.height) / 2;
        gestionarProducto.setLocation(x, y);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        RealizarVentas realizarVenta = new RealizarVentas();
        jDesktopPane_menu.add(realizarVenta);
        realizarVenta.setVisible(true);
        
        Dimension desktopSize = jDesktopPane_menu.getSize();
        Dimension frameSize = realizarVenta.getSize();
        int x = (desktopSize.width - frameSize.width) / 2;
        int y = (desktopSize.height - frameSize.height) / 2;
        realizarVenta.setLocation(x, y);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    // End of variables declaration//GEN-END:variables
}
