package com.mycompany.deliveryusac;

import static com.mycompany.deliveryusac.Menu_UsuarioJFrame.correoTXT;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author manuel
 */
public class EnviosJFrame extends javax.swing.JFrame {
    public String numerofactura1, codigoPaquete1,origen1,destino1,nit1,tipoPago1,tamanoPaquete1,numeroPaquete1,total1, nombre1,fechaEnvio1;
    /**
     * Creates new form EnviosJFrame
     */
    public EnviosJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("ENVÍOS SOLICITADOS");
        
        
        String correo = correoTXT.getText();
        DefaultTableModel model = new DefaultTableModel(new String[]{"Código de paquete", "Tipo de servicio","Destinatario","Total de envío","Tipo de pago"},AppState.listaDatos_CotCompra.size()){
            @Override
            public boolean isCellEditable(int row, int column) {
                if(column==5){
                    return true;
                }else{
                    return false;
                }
            }
            
        };
        jTable1.setModel(model);
  
        TableModel ModeloDato =  jTable1.getModel();
        
        for (int i = 0; i <AppState.listaDatos_CotCompra.size(); i++) {
           if(correo.equals(AppState.listaDatos_CotCompra.get(i).getcorreo())==true){
               Datos_CotCompra nuevoEnvio = AppState.listaDatos_CotCompra.get(i);
               ModeloDato.setValueAt(nuevoEnvio.getcodigoPaquete(), i, 0);
               ModeloDato.setValueAt(nuevoEnvio.gettipoServicio(), i, 1);
               ModeloDato.setValueAt(nuevoEnvio.getdestinatario(), i, 2);
               ModeloDato.setValueAt(nuevoEnvio.gettotalPago(), i, 3);
               ModeloDato.setValueAt(nuevoEnvio.gettipoPago(), i, 4);
           }  
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        correoReTXT = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        codigoPacTXT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 36, 48));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("VER ENVÍOS SOLICITADOS");

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Correo Cliente:");

        correoReTXT.setEditable(false);
        correoReTXT.setBackground(new java.awt.Color(255, 255, 255));
        correoReTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        correoReTXT.setForeground(new java.awt.Color(0, 0, 0));

        jTable1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton4.setBackground(new java.awt.Color(254, 65, 87));
        jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("MENÚ PRINCIPAL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(110, 77, 252));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("FACTURA HTML");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(110, 77, 252));
        jButton5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("ETIQUETA DE ENVÍO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        codigoPacTXT.setBackground(new java.awt.Color(255, 255, 255));
        codigoPacTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        codigoPacTXT.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código De Paquete:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(correoReTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codigoPacTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButton4))
                            .addComponent(jLabel10))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoPacTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(correoReTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addGap(28, 28, 28)
                .addComponent(jButton4)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Menu_UsuarioJFrame MenuUS = new Menu_UsuarioJFrame();
        MenuUS.setVisible(true);
        String correo1 = correoReTXT.getText();
        MenuUS.correoTXT.setText(correo1);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(codigoPacTXT.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Campos Vacíos, Debe Ingresar El Código del Paquete.", "ENVÍOS SOLICITADOS", JOptionPane.ERROR_MESSAGE);     
        }else{
            boolean existe=false;
            for (int i=0;i<AppState.listaDatos_CotCompra.size();i++){
                if (codigoPacTXT.getText().equals(AppState.listaDatos_CotCompra.get(i).getcodigoPaquete())==true){
                    existe=true;
                    break;
                }
            }
            if(existe){
                String[] Encabezado = {"Número De Paquetes","Tamaño Del Paquete", "Total De Pago"};
                for (int i = 0; i <AppState.listaDatos_CotCompra.size(); i++) {
                    if(codigoPacTXT.getText().equals(AppState.listaDatos_CotCompra.get(i).getcodigoPaquete())==true){
                        numerofactura1=AppState.listaDatos_CotCompra.get(i).getnumeroFactura();
                        codigoPaquete1=AppState.listaDatos_CotCompra.get(i).getcodigoPaquete();
                        origen1=AppState.listaDatos_CotCompra.get(i).getorigen();
                        destino1=AppState.listaDatos_CotCompra.get(i).getorigen();
                        nit1=String.valueOf(AppState.listaDatos_CotCompra.get(i).getnit());
                        tipoPago1=AppState.listaDatos_CotCompra.get(i).gettipoPago();
                        tamanoPaquete1=String.valueOf(AppState.listaDatos_CotCompra.get(i).gettamanoPaquete());
                        numeroPaquete1=String.valueOf(AppState.listaDatos_CotCompra.get(i).getnumeroPaquete());
                        total1=String.valueOf(AppState.listaDatos_CotCompra.get(i).gettotalPago());
                        nombre1=AppState.listaDatos_CotCompra.get(i).getdestinatario();
                    }
                }

                String tablaHtml = generarFacturaHTML(numerofactura1,codigoPaquete1,origen1,destino1,nit1,tipoPago1,tamanoPaquete1,numeroPaquete1,total1,nombre1,Encabezado);
                // Crea la carpeta de reportes si no esiste
                File carpeta = new File("C:/Users/manue/Downloads/");
                if (!carpeta.exists()) {
                    carpeta.mkdirs();
                }

                // Escribe el archivo .html dentro de la carpeta
                try {
                    FileWriter fileWriter = new FileWriter("C:/Users/manue/Downloads/Factura"+numerofactura1+".html");
                    fileWriter.write(tablaHtml);
                    JOptionPane.showMessageDialog(null, "Factura Descagada.", "ENVÍOS SOLICITADOS", JOptionPane.INFORMATION_MESSAGE);
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Verifica que el Código esté escrito Correctamente.", "ENVÍOS SOLICITADOS", JOptionPane.WARNING_MESSAGE);
            }
        
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    public static String generarFacturaHTML(String numerofactura,String codigoPaquete,String origen,String destino,String nit,String tipoPago,String tamanoPaquete,String numeroPaquete,String totalPago,String nombre, String[] Encabezado) {
        StringBuilder sb = new StringBuilder();
        sb.append("<font font face=\"Verdana\">");
        //DATOS FACTURA
        sb.append("<h5>").append("Número de Factura: "+numerofactura).append("</h5>");
        sb.append("<h5>").append("Código de Paquete: "+codigoPaquete).append("</h5>");
        sb.append("<h5>").append("Origen: "+origen).append("</h5>");
        sb.append("<h5>").append("Destino: "+destino).append("</h5>");
        sb.append("<h5>").append("NIT: "+nit).append("</h5>");
        sb.append("<h5>").append("Tipo De Pago: "+tipoPago).append("</h5>");
        sb.append("<h5>").append("Nombre: "+nombre).append("</h5>");
        // SE CREA LA TABLA
        sb.append("<table border=\"1\">\n");
        // FILA 1 ENCABEZADO
        sb.append("<tr>");
        for (String encabezado : Encabezado) {
            sb.append("<th>").append(encabezado).append("</th>");
        }
        sb.append("</tr>\n");
        // FILA 2 DATOS
        sb.append("<tr>");
        sb.append("<tr>");
        sb.append("<td>").append(numeroPaquete).append("</td>");      
        sb.append("<td>").append(tamanoPaquete).append("</td>");   
        sb.append("<td>").append(totalPago).append("</td>");   
        sb.append("</tr>\n");
        //SE CIERRA LA TABLA
        sb.append("</table>\n");
        sb.append("</font>");
        return sb.toString();
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(codigoPacTXT.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Campos Vacíos, Debe Ingresar El Código del Paquete.", "ENVÍOS SOLICITADOS", JOptionPane.ERROR_MESSAGE);     
        }else{
            boolean existe=false;
            for (int i=0;i<AppState.listaDatos_CotCompra.size();i++){
                if (codigoPacTXT.getText().equals(AppState.listaDatos_CotCompra.get(i).getcodigoPaquete())==true){
                    existe=true;
                    break;
                }
            }
            if(existe){
                for (int i = 0; i <AppState.listaDatos_CotCompra.size(); i++) {
                    if(codigoPacTXT.getText().equals(AppState.listaDatos_CotCompra.get(i).getcodigoPaquete())==true){
                        codigoPaquete1=AppState.listaDatos_CotCompra.get(i).getcodigoPaquete();
                        origen1=AppState.listaDatos_CotCompra.get(i).getorigen();
                        destino1=AppState.listaDatos_CotCompra.get(i).getdestino();
                        tipoPago1=AppState.listaDatos_CotCompra.get(i).gettipoPago();
                        tamanoPaquete1=String.valueOf(AppState.listaDatos_CotCompra.get(i).gettamanoPaquete());
                        numeroPaquete1=String.valueOf(AppState.listaDatos_CotCompra.get(i).getnumeroPaquete());
                        total1=String.valueOf(AppState.listaDatos_CotCompra.get(i).gettotalPago());
                        fechaEnvio1=AppState.listaDatos_CotCompra.get(i).getfechaEnvio();
                        nombre1=AppState.listaDatos_CotCompra.get(i).getdestinatario();
                    }
                }
                String tablaHtml = generarGuiaHTML(codigoPaquete1,origen1,destino1,tipoPago1,tamanoPaquete1,numeroPaquete1,fechaEnvio1,total1,nombre1);
                // Crea la carpeta de reportes si no esiste
                File carpeta = new File("C:/Users/manue/Downloads/");
                if (!carpeta.exists()) {
                    carpeta.mkdirs();
                }

                // Escribe el archivo .html dentro de la carpeta
                try {
                    FileWriter fileWriter = new FileWriter("C:/Users/manue/Downloads/GUIA-"+codigoPaquete1+".html");
                    fileWriter.write(tablaHtml);
                    JOptionPane.showMessageDialog(null, "Guía Descagada.", "ENVÍOS SOLICITADOS", JOptionPane.INFORMATION_MESSAGE);
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Verifica que el Código esté escrito Correctamente.", "ENVÍOS SOLICITADOS", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    public static String generarGuiaHTML(String codigoPaquete,String origen,String destino,String tipoPago,String tamanoPaquete,String numeroPaquete,String fechaEnvio,String totalPago,String nombre) {
        StringBuilder sb = new StringBuilder();
        sb.append("<font font face=\"Verdana\">");
        //DATOS
        sb.append("<tr>");
        sb.append("<h5>").append("Origen: "+origen).append("</h5>");
        sb.append("<h5>").append("Destino: "+destino).append("</h5>");
        sb.append("<h5>").append("Tipo de Pago: "+tipoPago).append("</h5>");
        sb.append("<h5>").append("Nombre: "+nombre).append("</h5>");
        sb.append("</tr>");
        //CODIGOS
        sb.append("<h5>").append("Código de Paquete: "+codigoPaquete).append("</h5>");
        sb.append("<img src=\" https://tar.mx/apps/barras/barras.png \" width=\"650\" height=\"200\">");
        // DATOS
        sb.append("<tr>");
        sb.append("<h5>").append("Tamaño Del Paquete: "+numeroPaquete).append("</h5>");      
        sb.append("<h5>").append("Número De Paquetes: "+tamanoPaquete).append("</h5>");
        sb.append("<h5>").append("Fecha De Envío: "+fechaEnvio).append("</h5>");  
        sb.append("<h5>").append("Total A Pagar: "+totalPago).append("</h5>");   
        sb.append("</tr>\n");
        //SE CIERRA
        sb.append("</font>");
        return sb.toString();
    }   
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
            java.util.logging.Logger.getLogger(EnviosJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnviosJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnviosJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnviosJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnviosJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigoPacTXT;
    public static javax.swing.JTextField correoReTXT;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
