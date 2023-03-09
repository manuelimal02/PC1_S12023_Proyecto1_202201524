package com.mycompany.deliveryusac;

import javax.swing.JOptionPane;


/**
 *
 * @author manuel
 */
public class Datos_FacturacionJFrame extends javax.swing.JFrame {

    public Datos_FacturacionJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("REGISTRO DE DATOS DE FACTURACIÓN");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreTXT = new javax.swing.JTextField();
        direccionTXT = new javax.swing.JTextField();
        nitTXT = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        correoTXT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombreActualTXT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nombreNuevoTXT = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        direccionNuevoTXT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nitNuevoTXT = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nombreEliminarTXT = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 36, 48));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE DATOS DE FACTURACIÓN");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Completo:");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dirección Completo:");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NIT:");

        nombreTXT.setBackground(new java.awt.Color(255, 255, 255));
        nombreTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        nombreTXT.setForeground(new java.awt.Color(0, 0, 0));

        direccionTXT.setBackground(new java.awt.Color(255, 255, 255));
        direccionTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        direccionTXT.setForeground(new java.awt.Color(0, 0, 0));

        nitTXT.setBackground(new java.awt.Color(255, 255, 255));
        nitTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        nitTXT.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(110, 77, 252));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(254, 65, 87));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("MENÚ PRINCIPAL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        correoTXT.setEditable(false);
        correoTXT.setBackground(new java.awt.Color(255, 255, 255));
        correoTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        correoTXT.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo:");

        jPanel2.setBackground(new java.awt.Color(117, 232, 250));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("MODIFICAR DIRECCIÓN ");

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre Actual:");

        nombreActualTXT.setBackground(new java.awt.Color(255, 255, 255));
        nombreActualTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        nombreActualTXT.setForeground(new java.awt.Color(0, 0, 0));
        nombreActualTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActualTXTActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre Nuevo:");

        nombreNuevoTXT.setBackground(new java.awt.Color(255, 255, 255));
        nombreNuevoTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        nombreNuevoTXT.setForeground(new java.awt.Color(0, 0, 0));

        jButton3.setBackground(new java.awt.Color(255, 217, 79));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("MODIFICAR DATOS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Dirección Nueva:");

        direccionNuevoTXT.setBackground(new java.awt.Color(255, 255, 255));
        direccionNuevoTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        direccionNuevoTXT.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("NIT Nuevo:");

        nitNuevoTXT.setBackground(new java.awt.Color(255, 255, 255));
        nitNuevoTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        nitNuevoTXT.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nitNuevoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(direccionNuevoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombreNuevoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombreActualTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreActualTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreNuevoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(direccionNuevoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nitNuevoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(117, 232, 250));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ELIMINAR DATOS DE FACTURACIÓN");

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Nombre Completo: ");

        nombreEliminarTXT.setBackground(new java.awt.Color(255, 255, 255));
        nombreEliminarTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        nombreEliminarTXT.setForeground(new java.awt.Color(0, 0, 0));

        jButton4.setBackground(new java.awt.Color(254, 65, 87));
        jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ELIMINAR DATOS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nombreEliminarTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreEliminarTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(64, 64, 64)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nombreTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(direccionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nitTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(correoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(correoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nombreTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(direccionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nitTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton1))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Menu_UsuarioJFrame MenuUS = new Menu_UsuarioJFrame();
        MenuUS.setVisible(true);
        String correo1 = correoTXT.getText();
        MenuUS.correoTXT.setText(correo1);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(correoTXT.getText().isEmpty()||nombreTXT.getText().isEmpty()||direccionTXT.getText().isEmpty()||nitTXT.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos Vacíos, Debe llenar todos los campos.", "REGISTRO DE DATOS DE FACTURACIÓN", JOptionPane.ERROR_MESSAGE);  
        }else{
            boolean existe=false;
            for (int i=0;i<AppState.listaDatosFacturacion.size();i++){
                if (correoTXT.getText().equals(AppState.listaDatosFacturacion.get(i).getcorreo())==true&&direccionTXT.getText().equals(AppState.listaDatosFacturacion.get(i).getdireccion())){
                    existe=true;
                    break;
                }
            }
            if(existe){
                JOptionPane.showMessageDialog(null, "Esta Dirección Ya Ha Sido Registrado a Este Usuario. Intenta con una dirección nuevo.", "REGISTRO DE DATOS DE FACTURACIÓN", JOptionPane.WARNING_MESSAGE);
            }else{
                String correo=correoTXT.getText();
                String nombreCompleto=nombreTXT.getText();
                String direccion=direccionTXT.getText();
                String nit=nitTXT.getText();
                DatosFacturacion nuevoDato = new DatosFacturacion();
                nuevoDato.correo=correo;
                nuevoDato.nombreCompleto=nombreCompleto;
                nuevoDato.direccion=direccion;
                nuevoDato.nit=nit;
                AppState.listaDatosFacturacion.add(nuevoDato);
                JOptionPane.showMessageDialog(null, "Datos Registrados Correctamente", "REGISTRO DE DATOS DE FACTURACIÓN", JOptionPane.INFORMATION_MESSAGE);
                nombreTXT.setText(null);
                direccionTXT.setText(null);
                nitTXT.setText(null);
                for(int i = 0; i<AppState.listaDatosFacturacion.size(); i++){
                    System.out.println(AppState.listaDatosFacturacion.get(i).getcorreo()+" - "+AppState.listaDatosFacturacion.get(i).getnombreCompleto()+" - "+AppState.listaDatosFacturacion.get(i).getdireccion()+" - "+AppState.listaDatosFacturacion.get(i).getnit());
                }
                System.out.println("--------------------------------------------------------------------");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nombreActualTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActualTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActualTXTActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here
        if(nombreActualTXT.getText().isEmpty()||nombreNuevoTXT.getText().isEmpty()||direccionNuevoTXT.getText().isEmpty()||nitNuevoTXT.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Campos Vacíos, Debe llenar todos los campos modificación.", "REGISTRO DE DATOS DE FACTURACIÓN", JOptionPane.ERROR_MESSAGE);
        }
        else{
            boolean existe=false;
            for (int i=0;i<AppState.listaDatosFacturacion.size();i++){
                if (correoTXT.getText().equals(AppState.listaDatosFacturacion.get(i).getcorreo())&& nombreActualTXT.getText().equals(AppState.listaDatosFacturacion.get(i).getnombreCompleto())){
                    existe=true;
                    break;
                }
            }
            if(existe){
               for (int i=0;i<AppState.listaDatosFacturacion.size();i++){
                    if (correoTXT.getText().equals(AppState.listaDatosFacturacion.get(i).getcorreo())&& nombreActualTXT.getText().equals(AppState.listaDatosFacturacion.get(i).getnombreCompleto())){
                        AppState.listaDatosFacturacion.get(i).setnombreCompleto(nombreNuevoTXT.getText());
                        AppState.listaDatosFacturacion.get(i).setdireccion(direccionNuevoTXT.getText());
                        AppState.listaDatosFacturacion.get(i).setnit(nitNuevoTXT.getText());
                        break;
                    }
                }

                for(int i = 0; i<AppState.listaDatosFacturacion.size(); i++){
                    System.out.println(AppState.listaDatosFacturacion.get(i).getcorreo()+" - "+AppState.listaDatosFacturacion.get(i).getnombreCompleto()+" - "+AppState.listaDatosFacturacion.get(i).getdireccion()+" - "+AppState.listaDatosFacturacion.get(i).getnit());
                }
                System.out.println("--------------------------------------------------------------------");
                JOptionPane.showMessageDialog(null, "Datos de Facturación Modificados Correctamente.", "REGISTRO DE DATOS DE FACTURACIÓN", JOptionPane.INFORMATION_MESSAGE);
                nombreActualTXT.setText(null);
                nombreNuevoTXT.setText(null);
                direccionNuevoTXT.setText(null);
                nitNuevoTXT.setText(null);
            }else{
                JOptionPane.showMessageDialog(null, "El Nombre Actual no Coindice con el Nombre Registrado.", "REGISTRO DE DATOS DE FACTURACIÓN", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(nombreEliminarTXT.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos Vacíos, Debe llenar todos los campos eliminación.", "REGISTRO DE TARJETA DE CRÉDITO/DÉBITO", JOptionPane.ERROR_MESSAGE);
        }
        else{
            boolean existe=false;
            for (int i=0;i<AppState.listaDatosFacturacion.size();i++){
                if (correoTXT.getText().equals(AppState.listaDatosFacturacion.get(i).getcorreo())&& nombreEliminarTXT.getText().equals(AppState.listaDatosFacturacion.get(i).getnombreCompleto())){
                    existe=true;
                    break;
                }
            }
            if(existe){
                for (int i=0;i<AppState.listaDatosFacturacion.size();i++){
                    if (correoTXT.getText().equals(AppState.listaDatosFacturacion.get(i).getcorreo())&& nombreEliminarTXT.getText().equals(AppState.listaDatosFacturacion.get(i).getnombreCompleto())){
                        AppState.listaDatosFacturacion.remove(i);
                        break;
                    }
                }

                for(int i = 0; i<AppState.listaDatosFacturacion.size(); i++){
                    System.out.println(AppState.listaDatosFacturacion.get(i).getcorreo()+" - "+AppState.listaDatosFacturacion.get(i).getnombreCompleto()+" - "+AppState.listaDatosFacturacion.get(i).getdireccion()+" - "+AppState.listaDatosFacturacion.get(i).getnit());
                }
                System.out.println("--------------------------------------------------------------------");
                JOptionPane.showMessageDialog(null, "Datos de Facturación Elimados Correctamente.", "REGISTRO DE DATOS DE FACTURACIÓN", JOptionPane.INFORMATION_MESSAGE);
                nombreEliminarTXT.setText(null);
            }else{
                 JOptionPane.showMessageDialog(null, "El Nombre no Coindice con el Nombre Registrado.", "REGISTRO DE DATOS DE FACTURACIÓN", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Datos_FacturacionJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos_FacturacionJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos_FacturacionJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos_FacturacionJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos_FacturacionJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField correoTXT;
    private javax.swing.JTextField direccionNuevoTXT;
    private javax.swing.JTextField direccionTXT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nitNuevoTXT;
    private javax.swing.JTextField nitTXT;
    private javax.swing.JTextField nombreActualTXT;
    private javax.swing.JTextField nombreEliminarTXT;
    private javax.swing.JTextField nombreNuevoTXT;
    private javax.swing.JTextField nombreTXT;
    // End of variables declaration//GEN-END:variables
}
