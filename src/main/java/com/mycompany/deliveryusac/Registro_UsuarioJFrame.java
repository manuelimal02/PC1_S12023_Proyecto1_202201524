package com.mycompany.deliveryusac;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.io.File;
import javax.swing.*;
/**
 *
 * @author manuel
 */


public class Registro_UsuarioJFrame extends javax.swing.JFrame {
    public Registro_UsuarioJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("REGISTRAR USUARIO");
        
        kioscoTXT.setVisible(false);
        kioscoLB.setVisible(false);
        for(int i = 0; i < AppState.listaKiosco.size(); i++) {
        kioscoTXT.addItem(AppState.listaKiosco.get(i).getnombre().toString()+". Codigo: "+AppState.listaKiosco.get(i).getcodigo().toString());   
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        correoTXT = new javax.swing.JTextField();
        nombreTXT = new javax.swing.JTextField();
        apellidoTXT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dpiTXT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        generoTXT = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        rolTXT = new javax.swing.JComboBox<>();
        nacionalidadTXT = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        sobrenombreTXT = new javax.swing.JTextField();
        telefonoTXT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        contra1TXT = new javax.swing.JPasswordField();
        contra2TXT = new javax.swing.JPasswordField();
        fechaTXT = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        kioscoTXT = new javax.swing.JComboBox<>();
        kioscoLB = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rutaTXT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fotoLBL = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel1.setText("Nombre");

        correoTXT.setBackground(new java.awt.Color(255, 255, 255));
        correoTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        correoTXT.setForeground(new java.awt.Color(0, 0, 0));

        nombreTXT.setBackground(new java.awt.Color(255, 255, 255));
        nombreTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        nombreTXT.setForeground(new java.awt.Color(0, 0, 0));

        apellidoTXT.setBackground(new java.awt.Color(255, 255, 255));
        apellidoTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        apellidoTXT.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setText("Reingresar Contraseña");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setText("Contraseña");
        jLabel5.setToolTipText("");

        dpiTXT.setBackground(new java.awt.Color(255, 255, 255));
        dpiTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        dpiTXT.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel6.setText("DPI");

        generoTXT.setBackground(new java.awt.Color(255, 255, 255));
        generoTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        generoTXT.setForeground(new java.awt.Color(0, 0, 0));
        generoTXT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setText("Género");

        rolTXT.setBackground(new java.awt.Color(255, 255, 255));
        rolTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        rolTXT.setForeground(new java.awt.Color(0, 0, 0));
        rolTXT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario Individual", "Usuario Empresarial", "Kiosco" }));
        rolTXT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rolTXTItemStateChanged(evt);
            }
        });

        nacionalidadTXT.setBackground(new java.awt.Color(255, 255, 255));
        nacionalidadTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        nacionalidadTXT.setForeground(new java.awt.Color(0, 0, 0));
        nacionalidadTXT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guatemalteco", "Salvadoreño", "Panameño", "Nicaragüense", "Costarrisense", "Panameño", "Mexicano" }));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel11.setText("Nacionalidad");

        sobrenombreTXT.setBackground(new java.awt.Color(255, 255, 255));
        sobrenombreTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        sobrenombreTXT.setForeground(new java.awt.Color(0, 0, 0));
        sobrenombreTXT.setToolTipText("");

        telefonoTXT.setBackground(new java.awt.Color(255, 255, 255));
        telefonoTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        telefonoTXT.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel9.setText("Sobrenombre");

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel13.setText("Teléfono");

        jButton1.setBackground(new java.awt.Color(254, 65, 87));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(110, 77, 252));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REGISTRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel10.setText("REGISTRO DE USUARIO (CREAR NUEVA CUENTA)");

        contra1TXT.setBackground(new java.awt.Color(255, 255, 255));
        contra1TXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        contra1TXT.setForeground(new java.awt.Color(0, 0, 0));

        contra2TXT.setBackground(new java.awt.Color(255, 255, 255));
        contra2TXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        contra2TXT.setForeground(new java.awt.Color(0, 0, 0));

        fechaTXT.setBackground(new java.awt.Color(255, 255, 255));
        fechaTXT.setForeground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel12.setText("Fecha De Nacimiento");

        jButton3.setBackground(new java.awt.Color(255, 217, 79));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Foto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        kioscoTXT.setBackground(new java.awt.Color(255, 255, 255));
        kioscoTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        kioscoTXT.setForeground(new java.awt.Color(0, 0, 0));
        kioscoTXT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kioscoTXTItemStateChanged(evt);
            }
        });

        kioscoLB.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        kioscoLB.setText("Selecciona El Kiosco");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setText("Correo");

        rutaTXT.setEditable(false);
        rutaTXT.setBackground(new java.awt.Color(255, 255, 255));
        rutaTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        rutaTXT.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setText("Apellido");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(fotoLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(fotoLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel14.setText("Rol");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dpiTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rolTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kioscoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(kioscoLB, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43))))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correoTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(nombreTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(contra1TXT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apellidoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contra2TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(fechaTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                                .addComponent(generoTXT, 0, 186, Short.MAX_VALUE))
                                            .addComponent(jLabel8))
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nacionalidadTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(sobrenombreTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(telefonoTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                                .addComponent(rutaTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rutaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel12)
                        .addComponent(jLabel2))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sobrenombreTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombreTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(apellidoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fechaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contra1TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contra2TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nacionalidadTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dpiTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kioscoLB)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rolTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kioscoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        if(fechaTXT.getDate() == null ||correoTXT.getText().isEmpty() || nombreTXT.getText().isEmpty() || apellidoTXT.getText().isEmpty() || contra1TXT.getText().isEmpty() || contra2TXT.getText().isEmpty() || dpiTXT.getText().isEmpty() || sobrenombreTXT.getText().isEmpty() || telefonoTXT.getText().isEmpty() /*|| rutaTXT.getText().isEmpty()*/){
            JOptionPane.showMessageDialog(null, "Campos Vacíos, Debe llenar todos los campos.", "REGISTRAR USUARIO", JOptionPane.ERROR_MESSAGE); 
        }
        else{
            String password =contra1TXT.getText();
            final int MAX=8, MIN_Uppercase=1, MIN_Lowercase=1, NUM_Digits=1, Special=1;
            int uppercaseCounter=0, lowercaseCounter=0, digitCounter=0, specialCounter=0; 
            for (int i=0; i < password.length(); i++ ) {
                char c = password.charAt(i);
                if(Character.isUpperCase(c)) 
                    uppercaseCounter++;
                else if(Character.isLowerCase(c)) 
                    lowercaseCounter++;
                else if(Character.isDigit(c)) 
                    digitCounter++;     
                if(c>=33&&c<=46||c==64){
                    specialCounter++;
                }
            }
            if (password.length()>= MAX && uppercaseCounter>= MIN_Uppercase && lowercaseCounter>= MIN_Lowercase && digitCounter>= NUM_Digits && specialCounter>= Special){ 
                boolean existe=false;
                for (int i=0;i<AppState.listaUsuario.size();i++){
                    if (correoTXT.getText().equals(AppState.listaUsuario.get(i).getcorreo())==true){
                        existe=true;
                        break;
                    }
                }
                if(existe){
                     JOptionPane.showMessageDialog(null, "Este Correo Ya Ha Sido Registrado. Intenta con uno nuevo.", "REGISTRAR USUARIO", JOptionPane.WARNING_MESSAGE);
                }else if(rolTXT.getSelectedIndex()==2){
                    String correo=correoTXT.getText(), nombre=nombreTXT.getText(), apellido=apellidoTXT.getText(), fechaNacimiento=fechaTXT.getDate().toString(), genero=generoTXT.getSelectedItem().toString(), sobrenombre = sobrenombreTXT.getText(), nacionalidad = nacionalidadTXT.getSelectedItem().toString(), rol=kioscoTXT.getSelectedItem().toString();
                    long dpi= Long.parseLong(dpiTXT.getText()), telefono = Long.parseLong(telefonoTXT.getText());
                    ImageIcon foto= new ImageIcon(rutaTXT.getText());
                    Usuario nuevoUsuario = new Usuario();
                    nuevoUsuario.correo=correo;
                    nuevoUsuario.nombre=nombre;
                    nuevoUsuario.apellido=apellido;
                    nuevoUsuario.password=password;
                    nuevoUsuario.dpi=dpi;
                    nuevoUsuario.fechaNacimiento=fechaNacimiento;
                    nuevoUsuario.genero=genero;
                    nuevoUsuario.nacionalidad=nacionalidad;
                    nuevoUsuario.sobrenombre=sobrenombre;
                    nuevoUsuario.telefono=telefono;
                    nuevoUsuario.rol=rol;
                    nuevoUsuario.foto=foto;//SE AGREGA EL NUEVO OBJETO AL ARRAYLIST
                    AppState.listaUsuario.add(nuevoUsuario);
                    JOptionPane.showMessageDialog(null, "Usuario Registrado Correctamente. Rol: Kiosco", "REGISTRAR USUARIO", JOptionPane.WARNING_MESSAGE);
                    correoTXT.setText(null);nombreTXT.setText(null);apellidoTXT.setText(null);contra1TXT.setText(null);contra2TXT.setText(null); dpiTXT.setText(null); sobrenombreTXT.setText(null); sobrenombreTXT.setText(null);telefonoTXT.setText(null);fechaTXT.setCalendar(null);
                    for(int i = 0; i<AppState.listaUsuario.size(); i++){
                        System.out.println(AppState.listaUsuario.get(i).getcorreo()+" - "+AppState.listaUsuario.get(i).getnombre()+" - "+AppState.listaUsuario.get(i).getapellido()+" - "+AppState.listaUsuario.get(i).getpassword()+" - "+ AppState.listaUsuario.get(i).getDPI()+" - "+AppState.listaUsuario.get(i).getfechaNacimiento()+" - "+AppState.listaUsuario.get(i).getgenero()+" - "+AppState.listaUsuario.get(i).getnacionalidad()+" - "+AppState.listaUsuario.get(i).getsobrenombre()+" - "+AppState.listaUsuario.get(i).gettelefono()+" - "+AppState.listaUsuario.get(i).getrol()+" - "+AppState.listaUsuario.get(i).getfoto()+" - "+AppState.listaUsuario.get(i).getcontadorPaquete());
                    }
                    System.out.println("--------------------------------------------------------------------");

                }else if(rolTXT.getSelectedIndex()==0||rolTXT.getSelectedIndex()==1){
                    String correo=correoTXT.getText(), nombre=nombreTXT.getText(), apellido=apellidoTXT.getText(), fechaNacimiento=fechaTXT.getDate().toString(), genero=generoTXT.getSelectedItem().toString(), sobrenombre = sobrenombreTXT.getText(), nacionalidad = nacionalidadTXT.getSelectedItem().toString(), rol=rolTXT.getSelectedItem().toString();
                    long dpi= Long.parseLong(dpiTXT.getText()), telefono = Long.parseLong(telefonoTXT.getText());
                    ImageIcon foto= new ImageIcon(rutaTXT.getText());
                    Usuario nuevoUsuario = new Usuario();
                    nuevoUsuario.correo=correo;
                    nuevoUsuario.nombre=nombre;
                    nuevoUsuario.apellido=apellido;
                    nuevoUsuario.password=password;
                    nuevoUsuario.dpi=dpi;
                    nuevoUsuario.fechaNacimiento=fechaNacimiento;
                    nuevoUsuario.genero=genero;
                    nuevoUsuario.nacionalidad=nacionalidad;
                    nuevoUsuario.sobrenombre=sobrenombre;
                    nuevoUsuario.telefono=telefono;
                    nuevoUsuario.rol=rol;
                    nuevoUsuario.foto=foto;//SE AGREGA EL NUEVO OBJETO AL ARRAYLIST
                    AppState.listaUsuario.add(nuevoUsuario);
                    JOptionPane.showMessageDialog(null, "Usuario Registrado Correctamente", "REGISTRAR USUARIO", JOptionPane.WARNING_MESSAGE);
                    correoTXT.setText(null);nombreTXT.setText(null);apellidoTXT.setText(null);contra1TXT.setText(null);contra2TXT.setText(null); dpiTXT.setText(null); sobrenombreTXT.setText(null); sobrenombreTXT.setText(null);telefonoTXT.setText(null);fechaTXT.setCalendar(null);
                    for(int i = 0; i<AppState.listaUsuario.size(); i++){
                        System.out.println(AppState.listaUsuario.get(i).getcorreo()+" - "+AppState.listaUsuario.get(i).getnombre()+" - "+AppState.listaUsuario.get(i).getapellido()+" - "+AppState.listaUsuario.get(i).getpassword()+" - "+ AppState.listaUsuario.get(i).getDPI()+" - "+AppState.listaUsuario.get(i).getfechaNacimiento()+" - "+AppState.listaUsuario.get(i).getgenero()+" - "+AppState.listaUsuario.get(i).getnacionalidad()+" - "+AppState.listaUsuario.get(i).getsobrenombre()+" - "+AppState.listaUsuario.get(i).gettelefono()+" - "+AppState.listaUsuario.get(i).getrol()+" - "+AppState.listaUsuario.get(i).getfoto());
                    }
                    System.out.println("--------------------------------------------------------------------");
                }   
            }else if(password.equals(contra2TXT.getText())==false || contra2TXT.getText().equals(password)==false){      
                JOptionPane.showMessageDialog(null, "Las Contraseñas No Coinciden", "REGISTRAR USUARIO", JOptionPane.WARNING_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "La Contraseña debe contener letras mayusculas, minusculas, números y caracteres especiales.", "REGISTRAR USUARIO", JOptionPane.WARNING_MESSAGE);
            }
        }    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser archivo = new JFileChooser();
        int ventana= archivo.showOpenDialog(null);
        if (ventana == JFileChooser.APPROVE_OPTION){
            File file= archivo.getSelectedFile();
            rutaTXT.setText(String.valueOf(file));
            Image foto = getToolkit().getImage(rutaTXT.getText());
            foto = foto.getScaledInstance(110, 110, Image.SCALE_DEFAULT);
            fotoLBL.setIcon(new ImageIcon(foto));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loginJFrame Login = new loginJFrame();
        Login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rolTXTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rolTXTItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()== ItemEvent.SELECTED){ 
            if(this.rolTXT.getSelectedIndex()==0){ 
                kioscoTXT.setVisible(false);
                kioscoLB.setVisible(false);
            }else if(this.rolTXT.getSelectedIndex()==1){ 
                kioscoTXT.setVisible(false);
                kioscoLB.setVisible(false);
            }
            else if(this.rolTXT.getSelectedIndex()==2){ 
                kioscoTXT.setVisible(true);
                kioscoLB.setVisible(true);
            }
         }
    }//GEN-LAST:event_rolTXTItemStateChanged

    private void kioscoTXTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_kioscoTXTItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_kioscoTXTItemStateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_UsuarioJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoTXT;
    private javax.swing.JPasswordField contra1TXT;
    private javax.swing.JPasswordField contra2TXT;
    private javax.swing.JTextField correoTXT;
    private javax.swing.JTextField dpiTXT;
    private com.toedter.calendar.JDateChooser fechaTXT;
    private javax.swing.JLabel fotoLBL;
    private javax.swing.JComboBox<String> generoTXT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel kioscoLB;
    private javax.swing.JComboBox<String> kioscoTXT;
    private javax.swing.JComboBox<String> nacionalidadTXT;
    private javax.swing.JTextField nombreTXT;
    private javax.swing.JComboBox<String> rolTXT;
    private javax.swing.JTextField rutaTXT;
    private javax.swing.JTextField sobrenombreTXT;
    private javax.swing.JTextField telefonoTXT;
    // End of variables declaration//GEN-END:variables
}
