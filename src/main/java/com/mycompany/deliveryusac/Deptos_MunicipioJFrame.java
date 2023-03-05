package com.mycompany.deliveryusac;

import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author manuel
 */
public class Deptos_MunicipioJFrame extends javax.swing.JFrame {

    public Deptos_MunicipioJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("MANEJO DE DEPARTAMENTOS Y MUNICIPIOS");
        for(int i = 0; i <AppState.listaRegion.size(); i++) {
        regionTXT.addItem(AppState.listaRegion.get(i).getnombreRegion().toString());   
        }
        
    }
    
    public String[] getDeptoMetropolitana(String region1){ 
        String[] deptoMetropolitana = new String[4];
        if(region1.equalsIgnoreCase("(M) Metropolitana")){
            deptoMetropolitana[0]="Guatemala";
            deptoMetropolitana[1]="Sacatepéquez";
            deptoMetropolitana[2]="Escuintla";         
            deptoMetropolitana[3]="Chimaltenango";   
        }
        return deptoMetropolitana;
    }
    public String[] getDeptoNorte(String region2){ 
        String[] deptoNorte = new String[3];
        if(region2.equalsIgnoreCase("(NT) Norte")){
            deptoNorte[0]="Petén";
            deptoNorte[1]="Alta Verapaz";
            deptoNorte[2]="Baja Verapaz";
        }
        return deptoNorte;
    }
    public String[] getDeptoNororiente(String region3){ 
        String[] deptoNororiente = new String[4];
        if(region3.equalsIgnoreCase("(NO) Nororiente")){
            deptoNororiente[0]="Izabal";
            deptoNororiente[1]="El Progreso";
            deptoNororiente[2]="Zacapa";
            deptoNororiente[3]="Chiquimula";
        }
        return deptoNororiente;
    }
    public String[] getDeptoSuroriente(String region4){ 
        String[] deptoSuroriente = new String[3];
        if(region4.equalsIgnoreCase("(SO) Suroriente")){
            deptoSuroriente[0]="Jalapa";
            deptoSuroriente[1]="Jutiapa";
            deptoSuroriente[2]="Santa Rosa";
        }
        return deptoSuroriente;
    }
    public String[] getDeptoSuroccidente(String region5){ 
        String[] deptoSuroccidente = new String[6];
        if(region5.equalsIgnoreCase("(SOC) Suroccidente")){
            deptoSuroccidente[0]="Suchitepéquez";
            deptoSuroccidente[1]="Sololá";
            deptoSuroccidente[2]="Retalhuleu";
            deptoSuroccidente[3]="Quetzaltenango";
            deptoSuroccidente[4]="Totonicapán";
            deptoSuroccidente[5]="San Marcos"; 
        }
        return deptoSuroccidente;
    }
    public String[] getDeptoNoroccidente(String region6){ 
        String[] deptoNoroccidente = new String[2];
        if(region6.equalsIgnoreCase("(NOC) Noroccidente")){
            deptoNoroccidente[0]="Huehuetenango";
            deptoNoroccidente[1]="Quiché";
        }
        return deptoNoroccidente;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        deptoTXT = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        regionTXT = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        codigoDeptoTXT = new javax.swing.JTextField();
        municipioTXT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 36, 48));
        jPanel1.setForeground(new java.awt.Color(32, 36, 48));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MANEJO DE DEPARTAMENTOS Y MUNICIPIOS");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Region");

        deptoTXT.setBackground(new java.awt.Color(255, 255, 255));
        deptoTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        deptoTXT.setForeground(new java.awt.Color(0, 0, 0));
        deptoTXT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                deptoTXTItemStateChanged(evt);
            }
        });
        deptoTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptoTXTActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Departamento");

        regionTXT.setBackground(new java.awt.Color(255, 255, 255));
        regionTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        regionTXT.setForeground(new java.awt.Color(0, 0, 0));
        regionTXT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                regionTXTItemStateChanged(evt);
            }
        });
        regionTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionTXTActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Código Departamento");

        codigoDeptoTXT.setEditable(false);
        codigoDeptoTXT.setBackground(new java.awt.Color(255, 255, 255));
        codigoDeptoTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        codigoDeptoTXT.setForeground(new java.awt.Color(0, 0, 0));

        municipioTXT.setBackground(new java.awt.Color(255, 255, 255));
        municipioTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        municipioTXT.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Municipio");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoDeptoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(municipioTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(regionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deptoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(104, 104, 104))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deptoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoDeptoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(municipioTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deptoTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptoTXTActionPerformed
        if(this.deptoTXT.getSelectedItem().toString().equals("Guatemala")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("G-T");  
        }else if(this.deptoTXT.getSelectedItem().toString().equals("Sacatepéquez")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("S-A");    
        }else if(this.deptoTXT.getSelectedItem().toString().equals("Escuintla")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("E-L");    
        }else if(this.deptoTXT.getSelectedItem().toString().equals("Chimaltenango")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("C-H");    
        }else if(this.deptoTXT.getSelectedItem().toString().equals("Petén")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("P-T");    
        }else if(this.deptoTXT.getSelectedItem().toString().equals("Alta Verapaz")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("A-V");    
        }else if(this.deptoTXT.getSelectedItem().toString().equals("Baja Verapaz")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("B-V");    
        }else if(this.deptoTXT.getSelectedItem().toString().equals("Izabal")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("I-Z");     
        }else if(this.deptoTXT.getSelectedItem().toString().equals("El Progreso")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("E-P");     
        }else if(this.deptoTXT.getSelectedItem().toString().equals("Zacapa")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("Z-A");     
        }else if(this.deptoTXT.getSelectedItem().toString().equals("Chiquimula")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("C-I");     
        }else if(this.deptoTXT.getSelectedItem().toString().equals("Jalapa")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("J-A");
        }else if(this.deptoTXT.getSelectedItem().toString().equals("Jutiapa")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("J-U");
        }else if(this.deptoTXT.getSelectedItem().toString().equals("Santa Rosa")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("S-R");
        }else if(this.deptoTXT.getSelectedItem().toString().equals("Suchitepéquez")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("S-C"); 
        }else if(this.deptoTXT.getSelectedItem().toString().equals("Sololá")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("S-L"); 
        }else if(this.deptoTXT.getSelectedItem().toString().equals("Retalhuleu")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("R-T"); 
        }else if(this.deptoTXT.getSelectedItem().toString().equals("Quetzaltenango")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("Q-E"); 
        }else if(this.deptoTXT.getSelectedItem().toString().equals("Totonicapán")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("T-O"); 
        }else if(this.deptoTXT.getSelectedItem().toString().equals("San Marcos")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("S-M"); 
        }else if(this.deptoTXT.getSelectedItem().toString().equals("Huehuetenango")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("H-H");
        }else if(this.deptoTXT.getSelectedItem().toString().equals("Quiché")){
            this.codigoDeptoTXT.setText(null);
            this.codigoDeptoTXT.setText("Q-C");
        }
    }//GEN-LAST:event_deptoTXTActionPerformed

    private void regionTXTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_regionTXTItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()== ItemEvent.SELECTED){
            if(this.regionTXT.getSelectedIndex()==0){ 
                this.deptoTXT.setModel(new DefaultComboBoxModel(this.getDeptoMetropolitana(this.regionTXT.getSelectedItem().toString())));
            }else if(this.regionTXT.getSelectedIndex()==1){ 
                this.deptoTXT.setModel(new DefaultComboBoxModel(this.getDeptoNorte(this.regionTXT.getSelectedItem().toString())));
            }else if(this.regionTXT.getSelectedIndex()==2){ 
                this.deptoTXT.setModel(new DefaultComboBoxModel(this.getDeptoNororiente(this.regionTXT.getSelectedItem().toString())));
            }else if(this.regionTXT.getSelectedIndex()==3){ 
                this.deptoTXT.setModel(new DefaultComboBoxModel(this.getDeptoSuroriente(this.regionTXT.getSelectedItem().toString())));
            }else if(this.regionTXT.getSelectedIndex()==4){ 
                this.deptoTXT.setModel(new DefaultComboBoxModel(this.getDeptoSuroccidente(this.regionTXT.getSelectedItem().toString())));
            }else if(this.regionTXT.getSelectedIndex()==5){ 
                this.deptoTXT.setModel(new DefaultComboBoxModel(this.getDeptoNoroccidente(this.regionTXT.getSelectedItem().toString())));
            }
        }
        if(evt.getStateChange()== ItemEvent.SELECTED){
            if(this.deptoTXT.getSelectedItem().toString().equals("Guatemala")){
                this.codigoDeptoTXT.setText(null);
                this.codigoDeptoTXT.setText("G-T");
            }else if(this.deptoTXT.getSelectedItem().toString().equals("Petén")){
                this.codigoDeptoTXT.setText(null);
                this.codigoDeptoTXT.setText("P-T");
            }else if(this.deptoTXT.getSelectedItem().toString().equals("Izabal")){
                this.codigoDeptoTXT.setText(null);
                this.codigoDeptoTXT.setText("I-Z");
            }else if(this.deptoTXT.getSelectedItem().toString().equals("Jalapa")){
                this.codigoDeptoTXT.setText(null);
                this.codigoDeptoTXT.setText("J-P");
            }else if(this.deptoTXT.getSelectedItem().toString().equals("Suchitepéquez")){
                this.codigoDeptoTXT.setText(null);
                this.codigoDeptoTXT.setText("S-C");
            }else if(this.deptoTXT.getSelectedItem().toString().equals("Huehuetenango")){
                this.codigoDeptoTXT.setText(null);
                this.codigoDeptoTXT.setText("H-H");
            }
        } 
    }//GEN-LAST:event_regionTXTItemStateChanged

    private void regionTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionTXTActionPerformed
    
    private void deptoTXTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_deptoTXTItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_deptoTXTItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(regionTXT.getSelectedItem().toString().isEmpty()||deptoTXT.getSelectedItem().toString().isEmpty()||codigoDeptoTXT.getText().isEmpty()||municipioTXT.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos Vacíos, Debe Llenar todos los campos.", "MANEJO DE DEPARTAMENTOS Y MUNICIPIOS", JOptionPane.ERROR_MESSAGE);
        }else{
            boolean existe=false;
            for (int i=0;i<AppState.listaDeptoMunicipio.size();i++){
                if (municipioTXT.getText().equals(AppState.listaDeptoMunicipio.get(i).getmunicipio())==true){
                    existe=true;
                    break;
                }
            }
            if(existe){
                JOptionPane.showMessageDialog(null, "Este Municipio Ya Ha Sido Registrado. Intenta con uno nuevo.", "MANEJO DE DEPARTAMENTOS Y MUNICIPIOS", JOptionPane.WARNING_MESSAGE);
            }else{
                String region=regionTXT.getSelectedItem().toString();
                String depto=deptoTXT.getSelectedItem().toString();
                String codigoDepto=codigoDeptoTXT.getText();
                String municipio=municipioTXT.getText();
                
                Depto_Region nuevoMunicipio=new Depto_Region();
                nuevoMunicipio.region=region;
                nuevoMunicipio.depto=depto;
                nuevoMunicipio.codigoDepto=codigoDepto;
                nuevoMunicipio.municipio=municipio;
                AppState.listaDeptoMunicipio.add(nuevoMunicipio);
                
                JOptionPane.showMessageDialog(null, "Municipio Registrado Correctamente", "MANEJO DE DEPARTAMENTOS Y MUNICIPIOS", JOptionPane.WARNING_MESSAGE);
                municipioTXT.setText(null);    
            }
            for(int i = 0; i<AppState.listaDeptoMunicipio.size(); i++){
                    System.out.println(AppState.listaDeptoMunicipio.get(i).getregion()+" - "+AppState.listaDeptoMunicipio.get(i).getdepto()+" - "+AppState.listaDeptoMunicipio.get(i).codigoDepto+" - "+AppState.listaDeptoMunicipio.get(i).getmunicipio());
                }
                System.out.println("--------------------------------------------------------------------");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Menu_AdminJFrame MenuAd = new Menu_AdminJFrame();
        MenuAd.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Deptos_MunicipioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deptos_MunicipioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deptos_MunicipioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deptos_MunicipioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deptos_MunicipioJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigoDeptoTXT;
    private javax.swing.JComboBox<String> deptoTXT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField municipioTXT;
    private javax.swing.JComboBox<String> regionTXT;
    // End of variables declaration//GEN-END:variables
}
