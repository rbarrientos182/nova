/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nova;

import clasesUtilidades.Conectar;
import clasesUtilidades.Herramientas;
import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author rbarrientos
 */
public class FormClientes extends javax.swing.JInternalFrame {
    DefaultTableModel model;
    private String idCliente;
    /**
     * Creates new form FormClientes
     */
    public FormClientes() {
        initComponents();
        ponerImgDefault();
        this.setLocation(150,15);
        bloquear();
        cargar("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser2 = new javax.swing.JFileChooser();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnActualizar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        selectEstatus = new javax.swing.JComboBox();
        imgCliente = new javax.swing.JLabel();
        btnTomarFoto = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtNFoto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnMostrarTodo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();

        mnActualizar.setText("Actualizar");
        mnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnActualizarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnActualizar);

        setBackground(new java.awt.Color(249, 207, 72));
        setClosable(true);
        setTitle("Clientes");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle Cliente"));

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido Paterno:");

        jLabel4.setText("Apellido Materno:");

        jLabel5.setText("Dirección:");

        jLabel6.setText("Colonia:");

        jLabel7.setText("C.P.:");

        txtCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPActionPerformed(evt);
            }
        });

        jLabel8.setText("Cel.:");

        jLabel9.setText("Estatus:");

        selectEstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Inactivo", "Activo" }));
        selectEstatus.setSelectedIndex(1);

        imgCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nova/img/anonymous.png"))); // NOI18N
        imgCliente.setToolTipText("");
        imgCliente.setMaximumSize(new java.awt.Dimension(340, 220));
        imgCliente.setMinimumSize(new java.awt.Dimension(340, 220));
        imgCliente.setPreferredSize(new java.awt.Dimension(340, 220));
        imgCliente.setSize(new java.awt.Dimension(340, 20));
        imgCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgClienteMouseClicked(evt);
            }
        });

        btnTomarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nova/img/camera.png"))); // NOI18N
        btnTomarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomarFotoActionPerformed(evt);
            }
        });

        jLabel10.setText("Nombre Foto:");

        txtNFoto.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectEstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCel, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                                    .addComponent(txtColonia)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10)
                                .addComponent(txtPaterno))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccion))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaterno)))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(imgCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTomarFoto)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(selectEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtNFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imgCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTomarFoto)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel2.setToolTipText("");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jLabel1.setText("Buscar:");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        btnMostrarTodo.setText("Mostrar Todo");
        btnMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodoActionPerformed(evt);
            }
        });

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Dirección", "Fecha Inscripción", "Celular", "Estatus"
            }
        ));
        tbClientes.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tbClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrarTodo)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarTodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodoActionPerformed
        // TODO add your handling code here:
        cargar("");
    }//GEN-LAST:event_btnMostrarTodoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        desbloquear();
        limpiar();
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPActionPerformed

    private void btnTomarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomarFotoActionPerformed
        // TODO add your handling code here:
        foto.run();
    }//GEN-LAST:event_btnTomarFotoActionPerformed

    private void imgClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgClienteMouseClicked
        // TODO add your handling code here:
        //System.out.println("obtuvo imagen");
        if(foto.obtenerNombreImagen()!=null){
            ImageIcon fot = new ImageIcon("fotos/"+foto.obtenerNombreImagen());
            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(imgCliente.getWidth(), imgCliente.getHeight(), Image.SCALE_DEFAULT));
            imgCliente.setIcon(icono);
            this.repaint();
            txtNFoto.setText(foto.obtenerNombreImagen());
        }
        //imgCliente.setIcon(new ImageIcon("fotos/"+foto.obtenerNombreImagen()));
    }//GEN-LAST:event_imgClienteMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        bloquear();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
        cargar(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        Herramientas tool = new Herramientas();
        String nombre;
        String paterno;
        String materno;
        String dir;
        String col;
        String cp;
        String cel;
        String img;
        
        String sql;
        
        nombre = txtNombre.getText();
        paterno = txtPaterno.getText();
        materno = txtMaterno.getText();
        dir = txtDireccion.getText();
        col = txtColonia.getText();
        cp = txtCP.getText();
        cel = txtCel.getText();
        //estatus = selectEstatus.
        img = foto.obtenerNombreImagen();
        
        if(img == null){
           img =  "anonymous.png";
        }
        
        if(!"".equals(nombre) && !"".equals(paterno) && !"".equals(materno) && !"".equals(dir) && !"".equals(col)){
            sql="INSERT INTO clientes (nombres,paterno,materno,direccion,colonia,cp,celular,fecha_mensualidad,foto,estatus) VALUES (?,?,?,?,?,?,?,?,?,?)";
                    try {
                        PreparedStatement pst  = cn.prepareStatement(sql);
                        pst.setString(1, nombre);
                        pst.setString(2, paterno);
                        pst.setString(3, materno);
                        pst.setString(4,dir);
                        pst.setString(5,col);
                        pst.setString(6,cp);
                        pst.setString(7,cel);
                        pst.setString(8,tool.obtenerFechaActualAAAAMMDD());
                        pst.setString(9,img);
                        pst.setInt(10, selectEstatus.getSelectedIndex());
                        int n=pst.executeUpdate();
                        if(n>0){
                        JOptionPane.showMessageDialog(null, "Registro Guardado con Éxito");
                        bloquear();
                        }
                        cargar("");
                    } catch (SQLException ex) {
                        Logger.getLogger(FormUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                    }
            
            
        }
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void mnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnActualizarActionPerformed
        // TODO add your handling code here:
        try{
            int filaMod=tbClientes.getSelectedRow();
            if(filaMod==-1){
                JOptionPane.showMessageDialog(null, "Seleccione alguna fila");
            }
            else{
                btnActualizar.setEnabled(true);
                String id;
                id = (String)tbClientes.getValueAt(filaMod, 0);
                desbloquear();
                buscarClienteEditar(id);
            }
        }
            catch(Exception e){
        }
    }//GEN-LAST:event_mnActualizarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        String sql="UPDATE clientes SET estatus = "+selectEstatus.getSelectedIndex()+",nombres ='"+txtNombre.getText()+"',paterno = '"+txtPaterno.getText()+"',materno ='"+txtMaterno.getText()+"',direccion = '"+txtDireccion.getText()+"', colonia = '"+txtColonia.getText()+"', cp = '"+txtCP.getText()+"', celular = '"+txtCel.getText()+"', foto = '"+txtNFoto.getText()+"'  WHERE idClientes = '"+this.idCliente+"'"; 
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualizado");
            cargar("");
            bloquear();
            limpiar();
        } catch (SQLException | HeadlessException e) {
             JOptionPane.showMessageDialog(null, e);
        }
        
        
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrarTodo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTomarFoto;
    private javax.swing.JLabel imgCliente;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnActualizar;
    private javax.swing.JComboBox selectEstatus;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNFoto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    // End of variables declaration//GEN-END:variables
    CapturarFoto foto = new CapturarFoto();
    Conectar cc= new Conectar();
    Connection cn=cc.conexion();
    
    private void cargar(String valor) {
        try{
            String [] titulos={"ID","Nombre","Dirección","CP","Fecha Incripción","Celular","Estatus"};
            String [] registros= new String[7];
            model =new DefaultTableModel(null,titulos);
            
            String cons="SELECT idclientes, CONCAT(nombres,' ',paterno,' ',materno) AS nombre, direccion, colonia, cp, celular, fecha_mensualidad, IF(estatus,'Activo','Inactivo') AS estatuscli FROM clientes "
                    + "WHERE CONCAT(idclientes,' ',nombres,' ',paterno,' ',materno) LIKE '%"+valor+"%'";
            Statement st= cn.createStatement();
            ResultSet rs = st.executeQuery(cons);
            while(rs.next()){
                registros[0]=rs.getString("idclientes");
                registros[1]=rs.getString("nombre");
                registros[2]=rs.getString("direccion");
                registros[3]=rs.getString("cp");
                registros[4]=rs.getString("fecha_mensualidad");
                registros[5]=rs.getString("celular");
                registros[6]=rs.getString("estatuscli");
                model.addRow(registros);      
            }
            tbClientes.setModel(model);
            tbClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbClientes.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbClientes.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbClientes.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbClientes.getColumnModel().getColumn(4).setPreferredWidth(100);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
    private void bloquear() {
        txtNombre.setEnabled(false);
        txtPaterno.setEnabled(false);
        txtMaterno.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtColonia.setEnabled(false);
        txtCP.setEnabled(false);
        txtCel.setEnabled(false);
        selectEstatus.setEnabled(false);
        imgCliente.setEnabled(false);
        btnTomarFoto.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnActualizar.setEnabled(false);
    }
    private void desbloquear() {
        txtNombre.setEnabled(true);
        txtPaterno.setEnabled(true);
        txtMaterno.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtColonia.setEnabled(true);
        txtCP.setEnabled(true);
        txtCel.setEnabled(true);
        selectEstatus.setEnabled(true);
        imgCliente.setEnabled(true);
        btnTomarFoto.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnCancelar.setEnabled(true);
    }

    private void limpiar() {
        txtNombre.setText("");
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtDireccion.setText("");
        txtColonia.setText("");
        txtCP.setText("");
        txtCel.setText("");
        selectEstatus.setSelectedIndex(1);
        ponerImgDefault();
        foto.ponerNombreImagenNull();
        
    }
    
    private void ponerImgDefault(){
        ImageIcon fot = new ImageIcon("fotos/anonymous.png");
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(imgCliente.getWidth(), imgCliente.getHeight(), Image.SCALE_DEFAULT));
        imgCliente.setIcon(icono);
        this.repaint();
        txtNFoto.setText("anonymous.png");
    }

    private void buscarClienteEditar(String idCliente) {
        try{
            String id="";
            String nom=""; 
            String pat="";
            String mat="";
            String dir = "";
            String col = "";
            String cp = "";
            String cel = "";
            String fot = "";
            int estatus = 0;
            String cons="SELECT idclientes,nombres,paterno,materno,direccion,colonia,cp,celular,foto,estatus FROM clientes WHERE idclientes="+idCliente;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cons);
            while(rs.next())
            {
                id=rs.getString(1);
                nom=rs.getString(2);
                pat=rs.getString(3);
                mat=rs.getString(4);
                dir=rs.getString(5);
                col=rs.getString(6);
                cp=rs.getString(7);
                cel=rs.getString(8);
                fot=rs.getString(9);
                estatus = rs.getInt(10);
           
            }
            this.idCliente = id;
            txtNombre.setText(nom);
            txtPaterno.setText(pat);
            txtMaterno.setText(mat);
            txtDireccion.setText(dir);
            txtColonia.setText(col);
            txtCP.setText(cp);
            txtCel.setText(cel);
            selectEstatus.setSelectedIndex(estatus);
            ImageIcon foto2 = new ImageIcon("fotos/"+fot);
            Icon icono = new ImageIcon(foto2.getImage().getScaledInstance(imgCliente.getWidth(), imgCliente.getHeight(), Image.SCALE_DEFAULT));
            imgCliente.setIcon(icono);
            this.repaint();
            txtNFoto.setText(fot);
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
