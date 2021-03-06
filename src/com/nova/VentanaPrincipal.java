/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nova;

import java.awt.Component;

/**
 *
 * @author rbarrientos
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form index
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        pContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mSistema = new javax.swing.JMenu();
        mCerrarSesion = new javax.swing.JMenuItem();
        mSalir = new javax.swing.JMenuItem();
        mCatalogos = new javax.swing.JMenu();
        smCategoria = new javax.swing.JMenuItem();
        sbProductos = new javax.swing.JMenuItem();
        sbClientes = new javax.swing.JMenuItem();
        mMovimientos = new javax.swing.JMenu();
        sbCompras = new javax.swing.JMenuItem();
        sbPagos = new javax.swing.JMenuItem();
        sbMensualidad = new javax.swing.JMenuItem();
        mReportes = new javax.swing.JMenu();
        mAdmin = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Nova");

        pContenedor.setBackground(new java.awt.Color(249, 207, 72));

        jLabel1.setText("Usuario Conectado:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nova/img/user.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nova/img/Nova.png"))); // NOI18N

        javax.swing.GroupLayout pContenedorLayout = new javax.swing.GroupLayout(pContenedor);
        pContenedor.setLayout(pContenedorLayout);
        pContenedorLayout.setHorizontalGroup(
            pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 429, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        pContenedorLayout.setVerticalGroup(
            pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContenedorLayout.createSequentialGroup()
                .addContainerGap(453, Short.MAX_VALUE)
                .addGroup(pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        mSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nova/img/power.png"))); // NOI18N
        mSistema.setText("Sistema");

        mCerrarSesion.setText("Cerrar Sesión");
        mCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCerrarSesionActionPerformed(evt);
            }
        });
        mSistema.add(mCerrarSesion);

        mSalir.setText("Salir");
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        mSistema.add(mSalir);

        jMenuBar1.add(mSistema);

        mCatalogos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nova/img/notes2.png"))); // NOI18N
        mCatalogos.setText("Catálogos");

        smCategoria.setText("Categorías");
        smCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smCategoriaActionPerformed(evt);
            }
        });
        mCatalogos.add(smCategoria);

        sbProductos.setText("Productos");
        sbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbProductosActionPerformed(evt);
            }
        });
        mCatalogos.add(sbProductos);

        sbClientes.setText("Clientes");
        sbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbClientesActionPerformed(evt);
            }
        });
        mCatalogos.add(sbClientes);

        jMenuBar1.add(mCatalogos);

        mMovimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nova/img/retweet.png"))); // NOI18N
        mMovimientos.setText("Movimientos");

        sbCompras.setText("Compras");
        sbCompras.setToolTipText("");
        sbCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbComprasActionPerformed(evt);
            }
        });
        mMovimientos.add(sbCompras);

        sbPagos.setText("Pagos");
        sbPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbPagosActionPerformed(evt);
            }
        });
        mMovimientos.add(sbPagos);

        sbMensualidad.setText("Mensualidad");
        mMovimientos.add(sbMensualidad);

        jMenuBar1.add(mMovimientos);

        mReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nova/img/print.png"))); // NOI18N
        mReportes.setText("Reportes");
        jMenuBar1.add(mReportes);

        mAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nova/img/useradd.png"))); // NOI18N
        mAdmin.setText("Administrador");

        jMenuItem3.setText("Nuevo Usuario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mAdmin.add(jMenuItem3);

        jMenuBar1.add(mAdmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_mSalirActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        FormUsuarios usuario = new FormUsuarios();
        pContenedor.add(usuario);
        usuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void smCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smCategoriaActionPerformed
        // TODO add your handling code here:
        FormCategorias categoria = new FormCategorias();
        pContenedor.add(categoria);
        categoria.setVisible(true);
    }//GEN-LAST:event_smCategoriaActionPerformed

    private void sbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbProductosActionPerformed
        // TODO add your handling code here:
        FormProductos producto = new FormProductos();
        pContenedor.add(producto);
        producto.setVisible(true);
    }//GEN-LAST:event_sbProductosActionPerformed

    private void mCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCerrarSesionActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        login.pack();
        this.setVisible(false);
    }//GEN-LAST:event_mCerrarSesionActionPerformed

    private void sbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbClientesActionPerformed
        // TODO add your handling code here:
        FormClientes cliente = new FormClientes();
        pContenedor.add(cliente);
        cliente.setVisible(true);
        
        /*CapturarFoto foto = new CapturarFoto();
        pContenedor.add(foto);
        foto.setVisible(true);*/
    }//GEN-LAST:event_sbClientesActionPerformed

    private void sbComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sbComprasActionPerformed

    private void sbPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbPagosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sbPagosActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    public static javax.swing.JLabel lUsuario;
    private javax.swing.JMenu mAdmin;
    private javax.swing.JMenu mCatalogos;
    private javax.swing.JMenuItem mCerrarSesion;
    private javax.swing.JMenu mMovimientos;
    private javax.swing.JMenu mReportes;
    private javax.swing.JMenuItem mSalir;
    private javax.swing.JMenu mSistema;
    public static javax.swing.JPanel pContenedor;
    private javax.swing.JMenuItem sbClientes;
    private javax.swing.JMenuItem sbCompras;
    private javax.swing.JMenuItem sbMensualidad;
    private javax.swing.JMenuItem sbPagos;
    private javax.swing.JMenuItem sbProductos;
    private javax.swing.JMenuItem smCategoria;
    // End of variables declaration//GEN-END:variables
}
