package com.mycompany.deliveryusac;

import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author manuel
 */
public class Cotizacion_CompraJFrame extends javax.swing.JFrame {
    public double precioEstandar=0, precioEspecial=0,TotalEspecial=0,TotalEstandar=0,TotalNeto=0,totalPago;
    public String tipoServicio,tipoPago,correo, codigoPaquete, numeroFactura, destinatario, origen, destino, fechaEnvio;
    public long nit,tamanoPaquete, numeroPaquete;
    
    public static String generarCodigo(){
        //LETRAS ALEATORIAS
        final String cadena="QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
        final int longi=3;
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0;i<longi; i++) {
            double aleatorio1=Math.random()*cadena.length();
            int posicion1=(int)aleatorio1;
            char letra1 =cadena.charAt(posicion1);
            sb1.append(letra1);
        }
        //NUMEROS ALEATORIOS
        int aleatorio1=0; 
        Random codigoRandom = new Random();
        aleatorio1=(int)(codigoRandom.nextDouble()*10);
        //CODIGO
        String codigo="IPC1A_"+sb1.toString()+aleatorio1;
        //RETORNO
        return codigo;
    }
    public static String generarFactura(){
        //LETRAS ALEATORIAS
        final String CADENA="QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
        final int LONG=4;
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<LONG; i++) {
            double aleatorio=Math.random()*CADENA.length();
            int posicion=(int)aleatorio;
            char letra =CADENA.charAt(posicion);
            sb.append(letra);
        }
        //NUMEROS ALEATORIOS
        int aleatorio=0; 
        Random codigoKioscoRandom = new Random();
        aleatorio=(int)(codigoKioscoRandom.nextDouble()*100);
        //CODIGO
        String CODIGO="FAC-"+sb.toString()+aleatorio;
        //RETORNO
        return CODIGO;
    }
    
    public Cotizacion_CompraJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("COTIZACIÓN DE PAQUETES Y COMPRA");
        
        codigoGuiaTXT.setText(generarCodigo());
        facturaTXT.setText(generarFactura());
        
        jButton3.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        
        tarjetaTXT.setEnabled(false);
        cvvTXT.setEnabled(false);
        for(int i = 0; i <AppState.listaRegion.size(); i++) {
            regionTXT.addItem(AppState.listaRegion.get(i).getnombreRegion().toString());   
        }
        for(int i = 0; i <AppState.listaRegion.size(); i++) {
            region1TXT.addItem(AppState.listaRegion.get(i).getnombreRegion().toString());   
        }   
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
        buttonGroup2.add(jRadioButton6);
        buttonGroup2.add(jRadioButton7);
        buttonGroup3.add(jRadioButton4);
        buttonGroup3.add(jRadioButton5);
        jSpinner1.setEnabled(false);
        jSpinner2.setEnabled(false);
        jSpinner3.setEnabled(false);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        regionTXT = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        deptoTXT = new javax.swing.JComboBox<>();
        direccion1TXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        municipioTXT = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        region1TXT = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        depto1TXT = new javax.swing.JComboBox<>();
        direccion2TXT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        municipio1TXT = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        numeroPaqueteTXT = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        precioEstandarTXT = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        precioEspecialTXT = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        correoTXT = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        totalTXT = new javax.swing.JTextField();
        servicioLBL = new javax.swing.JLabel();
        cvvLBL = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        tarjetaLBL = new javax.swing.JLabel();
        tarjetaTXT = new javax.swing.JComboBox<>();
        cvvTXT = new javax.swing.JTextField();
        datosTXT = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        codigoGuiaTXT = new javax.swing.JTextField();
        facturaTXT = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 36, 48));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("COTIZACIÓN DE PAQUETES Y COMPRA");

        jPanel2.setBackground(new java.awt.Color(117, 232, 250));

        regionTXT.setBackground(new java.awt.Color(255, 255, 255));
        regionTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
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

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setText("ORIGEN");
        jLabel2.setToolTipText("");

        deptoTXT.setBackground(new java.awt.Color(255, 255, 255));
        deptoTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
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

        direccion1TXT.setBackground(new java.awt.Color(255, 255, 255));
        direccion1TXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        direccion1TXT.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setText("Región:");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setText("Departamentos");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setText("Municipios:");

        municipioTXT.setBackground(new java.awt.Color(255, 255, 255));
        municipioTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        municipioTXT.setForeground(new java.awt.Color(0, 0, 0));
        municipioTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                municipioTXTActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel6.setText("Dirección:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regionTXT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deptoTXT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(direccion1TXT)
                    .addComponent(municipioTXT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deptoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(municipioTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(direccion1TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(117, 232, 250));

        region1TXT.setBackground(new java.awt.Color(255, 255, 255));
        region1TXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        region1TXT.setForeground(new java.awt.Color(0, 0, 0));
        region1TXT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                region1TXTItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel7.setText("DESTINO");
        jLabel7.setToolTipText("");

        depto1TXT.setBackground(new java.awt.Color(255, 255, 255));
        depto1TXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        depto1TXT.setForeground(new java.awt.Color(0, 0, 0));
        depto1TXT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                depto1TXTItemStateChanged(evt);
            }
        });

        direccion2TXT.setBackground(new java.awt.Color(255, 255, 255));
        direccion2TXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        direccion2TXT.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setText("Región:");

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel9.setText("Departamentos");

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel10.setText("Municipios:");

        municipio1TXT.setBackground(new java.awt.Color(255, 255, 255));
        municipio1TXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        municipio1TXT.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel11.setText("Dirección:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(region1TXT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(depto1TXT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(direccion2TXT)
                    .addComponent(municipio1TXT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(region1TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depto1TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(municipio1TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(direccion2TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(117, 232, 250));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        jLabel12.setText("TAMAÑO DE PAQUETES ");

        jRadioButton1.setBackground(new java.awt.Color(117, 232, 250));
        jRadioButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jRadioButton1.setText("Pequeño");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(117, 232, 250));
        jRadioButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jRadioButton2.setText("Mediano");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(117, 232, 250));
        jRadioButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jRadioButton3.setText("Grande");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jSpinner1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jSpinner2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(11, 11, 50, 1));

        jSpinner3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(51, 51, null, 1));

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 8)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("PESO 1 LIBRA A 10 LIBRAS");

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 8)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("PESO DE 11 LIBRAS A 50");

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 8)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("PESO DE 51 LIBRAS EN ADELANTE");

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        jLabel18.setText("NÚMERO DE PAQUETES A ENVIAR:");

        numeroPaqueteTXT.setBackground(new java.awt.Color(255, 255, 255));
        numeroPaqueteTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        numeroPaqueteTXT.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel15)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jSpinner2))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel16)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinner3)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroPaqueteTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(numeroPaqueteTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(17, 17, 17)
                .addComponent(jLabel12))
        );

        jPanel5.setBackground(new java.awt.Color(117, 232, 250));

        jRadioButton4.setBackground(new java.awt.Color(117, 232, 250));
        jRadioButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jRadioButton4.setText("Servicio Estándar ");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel13.setText("Total: Q.");

        precioEstandarTXT.setEditable(false);
        precioEstandarTXT.setBackground(new java.awt.Color(255, 255, 255));
        precioEstandarTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        precioEstandarTXT.setForeground(new java.awt.Color(0, 0, 0));

        jLabel20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel20.setText("ENTREGA DE 3 A 5 DÍAS HÁBILES");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precioEstandarTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel20)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(precioEstandarTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(255, 217, 79));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("REALIZAR COTIZACIÓN ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(117, 232, 250));

        jRadioButton5.setBackground(new java.awt.Color(117, 232, 250));
        jRadioButton5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jRadioButton5.setText("Servicio Especial");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jLabel14.setText("Total: Q.");

        precioEspecialTXT.setEditable(false);
        precioEspecialTXT.setBackground(new java.awt.Color(255, 255, 255));
        precioEspecialTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        precioEspecialTXT.setForeground(new java.awt.Color(0, 0, 0));
        precioEspecialTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioEspecialTXTActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel21.setText("ENTREGA INMEDIATA 1 O DOS DÍAS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precioEspecialTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(jLabel21)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(precioEspecialTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
        );

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

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Correo Usuario:");

        jButton3.setBackground(new java.awt.Color(110, 77, 252));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("FACTURA HTML");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(254, 65, 87));
        jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("REALIZAR PAGO Y ENVIAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        totalTXT.setEditable(false);
        totalTXT.setBackground(new java.awt.Color(255, 255, 255));
        totalTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        totalTXT.setForeground(new java.awt.Color(0, 0, 0));
        totalTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTXTActionPerformed(evt);
            }
        });

        servicioLBL.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        servicioLBL.setForeground(new java.awt.Color(255, 255, 255));
        servicioLBL.setText("SERVICIO: ");

        cvvLBL.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cvvLBL.setForeground(new java.awt.Color(255, 255, 255));
        cvvLBL.setText("No. CVV:");
        cvvLBL.setToolTipText("");

        jRadioButton6.setBackground(new java.awt.Color(32, 36, 48));
        jRadioButton6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("Pago Contra Entrega (Adicional Q. 5.00).");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("TIPO DE PAGO");

        jRadioButton7.setBackground(new java.awt.Color(32, 36, 48));
        jRadioButton7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setText("Pago Con Tarjeta (Registrada al Correo).");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        tarjetaLBL.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        tarjetaLBL.setForeground(new java.awt.Color(255, 255, 255));
        tarjetaLBL.setText("No. Tarjeta:");

        tarjetaTXT.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        tarjetaTXT.setForeground(new java.awt.Color(0, 0, 0));

        cvvTXT.setBackground(new java.awt.Color(255, 255, 255));
        cvvTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cvvTXT.setForeground(new java.awt.Color(0, 0, 0));

        datosTXT.setBackground(new java.awt.Color(255, 255, 255));
        datosTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        datosTXT.setForeground(new java.awt.Color(0, 0, 0));
        datosTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosTXTActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("DATOS DE FACTURACIÓN");

        codigoGuiaTXT.setEditable(false);
        codigoGuiaTXT.setBackground(new java.awt.Color(255, 255, 255));
        codigoGuiaTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        codigoGuiaTXT.setForeground(new java.awt.Color(0, 0, 0));

        facturaTXT.setEditable(false);
        facturaTXT.setBackground(new java.awt.Color(255, 255, 255));
        facturaTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        facturaTXT.setForeground(new java.awt.Color(0, 0, 0));

        jButton5.setBackground(new java.awt.Color(110, 77, 252));
        jButton5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("ETIQUETA DE ENVÍO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 217, 79));
        jButton6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("DESCARGAR COTIZACIÓN ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton6)
                                                .addGap(18, 18, 18))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(jButton1)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tarjetaLBL)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(servicioLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(datosTXT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cvvLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cvvTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tarjetaTXT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(35, 35, 35)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(566, 566, 566)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(correoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(facturaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(codigoGuiaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoGuiaTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facturaTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel19)
                            .addComponent(correoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton7)
                        .addGap(30, 30, 30)
                        .addComponent(tarjetaLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tarjetaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cvvTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cvvLBL))
                        .addGap(18, 18, 18)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(datosTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(servicioLBL)
                            .addComponent(totalTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton5))))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton6))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regionTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionTXTActionPerformed

    private void regionTXTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_regionTXTItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()== ItemEvent.SELECTED){
            if(this.regionTXT.getSelectedIndex()==0){ 
                this.municipioTXT.removeAllItems();
                this.deptoTXT.setModel(new DefaultComboBoxModel(this.getDeptoMetropolitana(this.regionTXT.getSelectedItem().toString())));
            }else if(this.regionTXT.getSelectedIndex()==1){ 
                this.municipioTXT.removeAllItems();
                this.deptoTXT.setModel(new DefaultComboBoxModel(this.getDeptoNorte(this.regionTXT.getSelectedItem().toString())));
            }else if(this.regionTXT.getSelectedIndex()==2){ 
                this.municipioTXT.removeAllItems();
                this.deptoTXT.setModel(new DefaultComboBoxModel(this.getDeptoNororiente(this.regionTXT.getSelectedItem().toString())));
            }else if(this.regionTXT.getSelectedIndex()==3){ 
                this.municipioTXT.removeAllItems();
                this.deptoTXT.setModel(new DefaultComboBoxModel(this.getDeptoSuroriente(this.regionTXT.getSelectedItem().toString())));
            }else if(this.regionTXT.getSelectedIndex()==4){ 
                this.municipioTXT.removeAllItems();
                this.deptoTXT.setModel(new DefaultComboBoxModel(this.getDeptoSuroccidente(this.regionTXT.getSelectedItem().toString())));
            }else if(this.regionTXT.getSelectedIndex()==5){ 
                this.municipioTXT.removeAllItems();
                this.deptoTXT.setModel(new DefaultComboBoxModel(this.getDeptoNoroccidente(this.regionTXT.getSelectedItem().toString())));
            }
            if(evt.getStateChange()== ItemEvent.SELECTED){
                if(this.deptoTXT.getSelectedItem().toString().equals("Guatemala")){
                    this.municipioTXT.removeAllItems();
                    String depto=deptoTXT.getSelectedItem().toString();
                    for (int i = 0; i<AppState.listaDeptoMunicipio.size(); i++) {
                        if(depto.equals(AppState.listaDeptoMunicipio.get(i).getdepto().toString())){
                            municipioTXT.addItem(AppState.listaDeptoMunicipio.get(i).getmunicipio().toString());
                        }
                    }}else if(this.deptoTXT.getSelectedItem().toString().equals("Petén")){
                    this.municipioTXT.removeAllItems();
                    String depto=deptoTXT.getSelectedItem().toString();
                    for (int i = 0; i<AppState.listaDeptoMunicipio.size(); i++) {
                        if(depto.equals(AppState.listaDeptoMunicipio.get(i).getdepto().toString())){
                            municipioTXT.addItem(AppState.listaDeptoMunicipio.get(i).getmunicipio().toString());
                        }
                    }}else if(this.deptoTXT.getSelectedItem().toString().equals("Izabal")){
                    this.municipioTXT.removeAllItems();
                    String depto=deptoTXT.getSelectedItem().toString();
                    for (int i = 0; i<AppState.listaDeptoMunicipio.size(); i++) {
                        if(depto.equals(AppState.listaDeptoMunicipio.get(i).getdepto().toString())){
                            municipioTXT.addItem(AppState.listaDeptoMunicipio.get(i).getmunicipio().toString());
                        }
                    }}else if(this.deptoTXT.getSelectedItem().toString().equals("Jalapa")){
                        this.municipioTXT.removeAllItems();
                        String depto=deptoTXT.getSelectedItem().toString();
                        for (int i = 0; i<AppState.listaDeptoMunicipio.size(); i++) {
                            if(depto.equals(AppState.listaDeptoMunicipio.get(i).getdepto().toString())){
                                municipioTXT.addItem(AppState.listaDeptoMunicipio.get(i).getmunicipio().toString());
                            }
                    }}else if(this.deptoTXT.getSelectedItem().toString().equals("Suchitepéquez")){
                        this.municipioTXT.removeAllItems();
                        String depto=deptoTXT.getSelectedItem().toString();
                        for (int i = 0; i<AppState.listaDeptoMunicipio.size(); i++) {
                            if(depto.equals(AppState.listaDeptoMunicipio.get(i).getdepto().toString())){
                                municipioTXT.addItem(AppState.listaDeptoMunicipio.get(i).getmunicipio().toString());
                            }
                    }}else if(this.deptoTXT.getSelectedItem().toString().equals("Huehuetenango")){
                        this.municipioTXT.removeAllItems();
                        String depto=deptoTXT.getSelectedItem().toString();
                        for (int i = 0; i<AppState.listaDeptoMunicipio.size(); i++) {
                            if(depto.equals(AppState.listaDeptoMunicipio.get(i).getdepto().toString())){
                                municipioTXT.addItem(AppState.listaDeptoMunicipio.get(i).getmunicipio().toString());
                            }
                        }
                    }
                }
            }
    }//GEN-LAST:event_regionTXTItemStateChanged

    private void region1TXTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_region1TXTItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()== ItemEvent.SELECTED){
            if(this.region1TXT.getSelectedIndex()==0){ 
                this.municipio1TXT.removeAllItems();
                this.depto1TXT.setModel(new DefaultComboBoxModel(this.getDeptoMetropolitana(this.region1TXT.getSelectedItem().toString())));
                for(int i = 0; i <AppState.listaRegion.size(); i++) {
                    if(region1TXT.getSelectedItem().toString().equals(AppState.listaRegion.get(i).getnombreRegion())==true){
                        precioEstandar=(AppState.listaRegion.get(i).getprecioEstandar());
                        precioEspecial=(AppState.listaRegion.get(i).getprecioEspecial());
                    } 
                }
            }else if(this.region1TXT.getSelectedIndex()==1){ 
                this.municipio1TXT.removeAllItems();
                this.depto1TXT.setModel(new DefaultComboBoxModel(this.getDeptoNorte(this.region1TXT.getSelectedItem().toString())));
                for(int i = 0; i <AppState.listaRegion.size(); i++) {
                    if(region1TXT.getSelectedItem().toString().equals(AppState.listaRegion.get(i).getnombreRegion())==true){
                        precioEstandar=(AppState.listaRegion.get(i).getprecioEstandar());
                        precioEspecial=(AppState.listaRegion.get(i).getprecioEspecial());
                    } 
                }
            }else if(this.region1TXT.getSelectedIndex()==2){ 
                this.municipio1TXT.removeAllItems();
                this.depto1TXT.setModel(new DefaultComboBoxModel(this.getDeptoNororiente(this.region1TXT.getSelectedItem().toString())));
                for(int i = 0; i <AppState.listaRegion.size(); i++) {
                    if(region1TXT.getSelectedItem().toString().equals(AppState.listaRegion.get(i).getnombreRegion())==true){
                        precioEstandar=(AppState.listaRegion.get(i).getprecioEstandar());
                        precioEspecial=(AppState.listaRegion.get(i).getprecioEspecial());
                    } 
                }
            }else if(this.region1TXT.getSelectedIndex()==3){ 
                this.municipio1TXT.removeAllItems();
                this.depto1TXT.setModel(new DefaultComboBoxModel(this.getDeptoSuroriente(this.region1TXT.getSelectedItem().toString())));
                for(int i = 0; i <AppState.listaRegion.size(); i++) {
                    if(region1TXT.getSelectedItem().toString().equals(AppState.listaRegion.get(i).getnombreRegion())==true){
                        precioEstandar=(AppState.listaRegion.get(i).getprecioEstandar());
                        precioEspecial=(AppState.listaRegion.get(i).getprecioEspecial());
                    } 
                }
                
            }else if(this.region1TXT.getSelectedIndex()==4){ 
                this.municipio1TXT.removeAllItems();
                this.depto1TXT.setModel(new DefaultComboBoxModel(this.getDeptoSuroccidente(this.region1TXT.getSelectedItem().toString())));
                for(int i = 0; i <AppState.listaRegion.size(); i++) {
                    if(region1TXT.getSelectedItem().toString().equals(AppState.listaRegion.get(i).getnombreRegion())==true){
                        precioEstandar=(AppState.listaRegion.get(i).getprecioEstandar());
                        precioEspecial=(AppState.listaRegion.get(i).getprecioEspecial());
                    } 
                }
            }else if(this.region1TXT.getSelectedIndex()==5){ 
                this.municipio1TXT.removeAllItems();
                this.depto1TXT.setModel(new DefaultComboBoxModel(this.getDeptoNoroccidente(this.region1TXT.getSelectedItem().toString())));
                for(int i = 0; i <AppState.listaRegion.size(); i++) {
                    if(region1TXT.getSelectedItem().toString().equals(AppState.listaRegion.get(i).getnombreRegion())==true){
                        precioEstandar=(AppState.listaRegion.get(i).getprecioEstandar());
                        precioEspecial=(AppState.listaRegion.get(i).getprecioEspecial());
                    } 
                }
            }
            if(evt.getStateChange()== ItemEvent.SELECTED){
                if(this.depto1TXT.getSelectedItem().toString().equals("Guatemala")){
                    this.municipio1TXT.removeAllItems();
                    String depto=depto1TXT.getSelectedItem().toString();
                    for (int i = 0; i<AppState.listaDeptoMunicipio.size(); i++) {
                        if(depto.equals(AppState.listaDeptoMunicipio.get(i).getdepto().toString())){
                            municipio1TXT.addItem(AppState.listaDeptoMunicipio.get(i).getmunicipio().toString());
                        }
                    }}else if(this.depto1TXT.getSelectedItem().toString().equals("Petén")){
                    this.municipio1TXT.removeAllItems();
                    String depto=depto1TXT.getSelectedItem().toString();
                    for (int i = 0; i<AppState.listaDeptoMunicipio.size(); i++) {
                        if(depto.equals(AppState.listaDeptoMunicipio.get(i).getdepto().toString())){
                            municipio1TXT.addItem(AppState.listaDeptoMunicipio.get(i).getmunicipio().toString());
                        }
                    }}else if(this.depto1TXT.getSelectedItem().toString().equals("Izabal")){
                    this.municipio1TXT.removeAllItems();
                    String depto=depto1TXT.getSelectedItem().toString();
                    for (int i = 0; i<AppState.listaDeptoMunicipio.size(); i++) {
                        if(depto.equals(AppState.listaDeptoMunicipio.get(i).getdepto().toString())){
                            municipio1TXT.addItem(AppState.listaDeptoMunicipio.get(i).getmunicipio().toString());
                        }
                    }}else if(this.depto1TXT.getSelectedItem().toString().equals("Jalapa")){
                        this.municipio1TXT.removeAllItems();
                        String depto=depto1TXT.getSelectedItem().toString();
                        for (int i = 0; i<AppState.listaDeptoMunicipio.size(); i++) {
                            if(depto.equals(AppState.listaDeptoMunicipio.get(i).getdepto().toString())){
                                municipio1TXT.addItem(AppState.listaDeptoMunicipio.get(i).getmunicipio().toString());
                            }
                    }}else if(this.depto1TXT.getSelectedItem().toString().equals("Suchitepéquez")){
                        this.municipio1TXT.removeAllItems();
                        String depto=depto1TXT.getSelectedItem().toString();
                        for (int i = 0; i<AppState.listaDeptoMunicipio.size(); i++) {
                            if(depto.equals(AppState.listaDeptoMunicipio.get(i).getdepto().toString())){
                                municipio1TXT.addItem(AppState.listaDeptoMunicipio.get(i).getmunicipio().toString());
                            }
                    }}else if(this.depto1TXT.getSelectedItem().toString().equals("Huehuetenango")){
                        this.municipio1TXT.removeAllItems();
                        String depto=depto1TXT.getSelectedItem().toString();
                        for (int i = 0; i<AppState.listaDeptoMunicipio.size(); i++) {
                            if(depto.equals(AppState.listaDeptoMunicipio.get(i).getdepto().toString())){
                                municipio1TXT.addItem(AppState.listaDeptoMunicipio.get(i).getmunicipio().toString());
                            }
                        }
                    }
                }
            }
       
        
    }//GEN-LAST:event_region1TXTItemStateChanged

    private void deptoTXTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_deptoTXTItemStateChanged
    if(evt.getStateChange()== ItemEvent.SELECTED){
        this.municipioTXT.removeAllItems();
        String depto=deptoTXT.getSelectedItem().toString();
        for (int i = 0; i<AppState.listaDeptoMunicipio.size(); i++) {
            if(depto.equals(AppState.listaDeptoMunicipio.get(i).getdepto().toString())){
                municipioTXT.addItem(AppState.listaDeptoMunicipio.get(i).getmunicipio().toString());
            }
        }
    }
    }//GEN-LAST:event_deptoTXTItemStateChanged

    private void municipioTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_municipioTXTActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_municipioTXTActionPerformed

    private void deptoTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptoTXTActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_deptoTXTActionPerformed

    private void depto1TXTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_depto1TXTItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()== ItemEvent.SELECTED){
        this.municipio1TXT.removeAllItems();
        String depto=depto1TXT.getSelectedItem().toString();
        for (int i = 0; i<AppState.listaDeptoMunicipio.size(); i++) {
            if(depto.equals(AppState.listaDeptoMunicipio.get(i).getdepto().toString())){
                municipio1TXT.addItem(AppState.listaDeptoMunicipio.get(i).getmunicipio().toString());
            }
        }
    }
    }//GEN-LAST:event_depto1TXTItemStateChanged

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()==true){
            jSpinner1.setEnabled(true);
            jSpinner2.setEnabled(false);
            jSpinner3.setEnabled(false);
        }   
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton2.isSelected()==true){
            jSpinner1.setEnabled(false);
            jSpinner2.setEnabled(true);
            jSpinner3.setEnabled(false);
        } 
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton3.isSelected()==true){
            jSpinner1.setEnabled(false);
            jSpinner2.setEnabled(false);
            jSpinner3.setEnabled(true);
        } 
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Menu_UsuarioJFrame MenuUS = new Menu_UsuarioJFrame();
        MenuUS.setVisible(true);
        String correo1 = correoTXT.getText();
        MenuUS.correoTXT.setText(correo1);  
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(municipioTXT.getSelectedItem()==null||direccion1TXT.getText().isEmpty()||municipio1TXT.getSelectedItem()==null||direccion2TXT.getText().isEmpty()||numeroPaqueteTXT.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos Vacíos, Debe llenar todos los campos.", "COTIZACIÓN DE PAQUETES Y COMPRA", JOptionPane.ERROR_MESSAGE); 
        }else if(jRadioButton3.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton1.isSelected()==false){
            JOptionPane.showMessageDialog(null, "Debe Especificar el Tamaño del total de Paquetes.", "COTIZACIÓN DE PAQUETES Y COMPRA", JOptionPane.ERROR_MESSAGE); 
        }else{
            if(jRadioButton1.isSelected()==true){
                double tamano=Double.parseDouble(jSpinner1.getValue().toString());
                double numero=Double.parseDouble(numeroPaqueteTXT.getText());
                TotalEstandar=precioEstandar*tamano*numero; 
                TotalEspecial=precioEspecial*tamano*numero; 
                precioEstandarTXT.setText(String.valueOf(TotalEstandar));
                precioEspecialTXT.setText(String.valueOf(TotalEspecial));
                datosTXT.removeAllItems();
                for (int i = 0; i<AppState.listaDatosFacturacion.size(); i++) {
                    if(correoTXT.getText().toString().equals(AppState.listaDatosFacturacion.get(i).getcorreo().toString())){
                        
                        datosTXT.addItem(String.valueOf((AppState.listaDatosFacturacion.get(i).getnombreCompleto())));
                        }
                    }
                jButton6.setVisible(true);
                JOptionPane.showMessageDialog(null, "Cotización Realizada Con Éxito.", "COTIZACIÓN DE PAQUETES Y COMPRA", JOptionPane.INFORMATION_MESSAGE); 
            }else if(jRadioButton2.isSelected()==true){
                double tamano=Double.parseDouble(jSpinner2.getValue().toString());
                double numero=Double.parseDouble(numeroPaqueteTXT.getText());
                TotalEstandar=precioEstandar*tamano*numero; 
                TotalEspecial=precioEspecial*tamano*numero; 
                precioEstandarTXT.setText(String.valueOf(TotalEstandar));
                precioEspecialTXT.setText(String.valueOf(TotalEspecial));
                datosTXT.removeAllItems();
                for (int i = 0; i<AppState.listaDatosFacturacion.size(); i++) {
                    if(correoTXT.getText().toString().equals(AppState.listaDatosFacturacion.get(i).getcorreo().toString())){
                        
                        datosTXT.addItem(String.valueOf((AppState.listaDatosFacturacion.get(i).getnombreCompleto())));
                        }
                    } 
                jButton6.setVisible(true);
                JOptionPane.showMessageDialog(null, "Cotización Realizada Con Éxito.", "COTIZACIÓN DE PAQUETES Y COMPRA", JOptionPane.INFORMATION_MESSAGE); 
            }else if(jRadioButton3.isSelected()==true){
                double tamano=Double.parseDouble(jSpinner3.getValue().toString());
                double numero=Double.parseDouble(numeroPaqueteTXT.getText());
                TotalEstandar=precioEstandar*tamano*numero; 
                TotalEspecial=precioEspecial*tamano*numero; 
                precioEstandarTXT.setText(String.valueOf(TotalEstandar));
                precioEspecialTXT.setText(String.valueOf(TotalEspecial));
                datosTXT.removeAllItems();
                for (int i = 0; i<AppState.listaDatosFacturacion.size(); i++) {
                    if(correoTXT.getText().toString().equals(AppState.listaDatosFacturacion.get(i).getcorreo().toString())){
                        
                        datosTXT.addItem(String.valueOf((AppState.listaDatosFacturacion.get(i).getnombreCompleto())));
                        }
                    }
                jButton6.setVisible(true);
                JOptionPane.showMessageDialog(null, "Cotización Realizada Con Éxito.", "COTIZACIÓN DE PAQUETES Y COMPRA", JOptionPane.INFORMATION_MESSAGE); 
            }
        }
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void precioEspecialTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioEspecialTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioEspecialTXTActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String[] Encabezado = {"Número De Paquetes","Tamaño Del Paquete", "Total De Pago"};
        String numerofactura1=numeroFactura;
        String codigoPaquete1=codigoPaquete;
        String origen1=origen;
        String destino1=destino;
        String nit1=String.valueOf(nit);
        String tipoPago1=tipoPago;
        String tamanoPaquete1=String.valueOf(tamanoPaquete);
        String numeroPaquete1=String.valueOf(numeroPaquete);
        String total1=String.valueOf(TotalNeto);
        String nombre1=destinatario;
        
        String tablaHtml = generarFacturaHTML(numerofactura1,codigoPaquete1,origen1,destino1,nit1,tipoPago1,tamanoPaquete1,numeroPaquete1,total1,nombre1,Encabezado);
        // Crea la carpeta de reportes si no esiste
        File carpeta = new File("C:/Users/manue/Downloads/");
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }

        // Escribe el archivo .html dentro de la carpeta
        try {
            FileWriter fileWriter = new FileWriter("C:/Users/manue/Downloads/Factura"+numeroFactura+".html");
            fileWriter.write(tablaHtml);
             JOptionPane.showMessageDialog(null, "Factura Descagada.", "COTIZACIÓN DE PAQUETES Y COMPRA", JOptionPane.INFORMATION_MESSAGE); 
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
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
    
    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false){
            JOptionPane.showMessageDialog(null, "Debes Seleccionar El Tipo De Servicio.", "COTIZACIÓN DE PAQUETES Y COMPRA", JOptionPane.WARNING_MESSAGE); 
            buttonGroup2.clearSelection();
        }else{
            if(jRadioButton6.isSelected()==true){
                tarjetaTXT.removeAllItems();
                tarjetaTXT.setEnabled(false);
                cvvTXT.setEnabled(false);
                if(jRadioButton4.isSelected()==true){
                    servicioLBL.setText("Servicio Estándar");
                    TotalNeto=TotalEstandar+5;
                    totalTXT.setText(String.valueOf(TotalNeto));  
                }else if(jRadioButton5.isSelected()==true){
                    servicioLBL.setText("Servicio Especial");
                    TotalNeto=TotalEspecial+5;
                    totalTXT.setText(String.valueOf(TotalNeto));     
                }
            }
        }
         
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false){
            JOptionPane.showMessageDialog(null, "Debes Seleccionar El Tipo De Servicio.", "COTIZACIÓN DE PAQUETES Y COMPRA", JOptionPane.WARNING_MESSAGE); 
            buttonGroup2.clearSelection();
        }else{
            if(jRadioButton7.isSelected()==true){
                tarjetaTXT.setEnabled(true);
                cvvTXT.setEnabled(true);
                for (int i = 0; i<AppState.listaTarjeta.size(); i++) {
                    String x="xxxxxxxxx";
                    if(correoTXT.getText().toString().equals(AppState.listaTarjeta.get(i).getcorreo().toString())){
                        tarjetaTXT.addItem(x+String.valueOf(AppState.listaTarjeta.get(i).getnumero()).substring(9, 13));
                        }
                    }
                 if(jRadioButton4.isSelected()==true){
                    servicioLBL.setText("Servicio Estándar");
                    TotalNeto=TotalEstandar;
                    totalTXT.setText(String.valueOf(TotalNeto));  
                }else if(jRadioButton5.isSelected()==true){
                    servicioLBL.setText("Servicio Especial");
                    TotalNeto=TotalEspecial;
                    totalTXT.setText(String.valueOf(TotalNeto));     
                }
                }
            }
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void totalTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTXTActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_totalTXTActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton4.isSelected()==true){
           buttonGroup2.clearSelection();
           tarjetaTXT.removeAllItems();
           tarjetaTXT.setEnabled(false);
           cvvTXT.setText(null);
           totalTXT.setText(null);
           cvvTXT.setEnabled(false); 
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton5.isSelected()==true){
           buttonGroup2.clearSelection();
           tarjetaTXT.removeAllItems();
           tarjetaTXT.setEnabled(false);
           cvvTXT.setText(null);
           totalTXT.setText(null);
           cvvTXT.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(municipioTXT.getSelectedItem()==null||direccion1TXT.getText().isEmpty()||municipio1TXT.getSelectedItem()==null||direccion2TXT.getText().isEmpty()||numeroPaqueteTXT.getText().isEmpty()||datosTXT.getSelectedItem()==null||totalTXT.getText().isEmpty()||precioEstandarTXT.getText().isEmpty()||precioEspecialTXT.getText().isEmpty()||(jRadioButton6.isSelected()==false&&jRadioButton7.isSelected()==false)){
             JOptionPane.showMessageDialog(null, "Campos Vacíos, Debe llenar todos los campos.", "COTIZACIÓN DE PAQUETES Y COMPRA", JOptionPane.ERROR_MESSAGE); 
        }else if(jRadioButton7.isSelected()==true&&(cvvTXT.getText().isEmpty()||tarjetaTXT.getSelectedItem()==null)){
            JOptionPane.showMessageDialog(null, "Campos Vacíos, Datos de la Tarjeta No Completados", "COTIZACIÓN DE PAQUETES Y COMPRA", JOptionPane.ERROR_MESSAGE);    
        }
        else{
            boolean existe=false;
            for (int i=0;i<AppState.listaDatos_CotCompra.size();i++){
                if (codigoGuiaTXT.getText().equals(AppState.listaDatos_CotCompra.get(i).getcodigoPaquete())==true||facturaTXT.getText().equals(AppState.listaDatos_CotCompra.get(i).getnumeroFactura())==true){
                    existe=true;
                    break;
                }
            }
            if(existe){
                codigoGuiaTXT.setText(null);
                facturaTXT.setText(null);
                JOptionPane.showMessageDialog(null, "Ocurrió Un Error, Precione el Botón -REALIZAR PAGO Y ENVIAR- de Nuevo.", "MANEJO DE KIOSCO", JOptionPane.WARNING_MESSAGE);
                codigoGuiaTXT.setText(generarCodigo());
                facturaTXT.setText(generarFactura());
            }else{
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        
                correo=correoTXT.getText();
                codigoPaquete=codigoGuiaTXT.getText(); 
                numeroFactura=facturaTXT.getText();
                
                if(jRadioButton4.isSelected()==true){
                    tipoServicio="Servico Estándar"; 
                }else if(jRadioButton5.isSelected()==true){
                    tipoServicio="Servico Especial";
                } 
                destinatario=datosTXT.getSelectedItem().toString();
                origen=deptoTXT.getSelectedItem().toString()+", "+municipioTXT.getSelectedItem().toString()+", "+direccion1TXT.getText()+".";
                destino=depto1TXT.getSelectedItem().toString()+", "+municipio1TXT.getSelectedItem().toString()+", "+direccion2TXT.getText()+".";;
                
                for (int i = 0; i<AppState.listaDatosFacturacion.size(); i++) {
                    if(datosTXT.getSelectedItem().toString().equals(AppState.listaDatosFacturacion.get(i).getnombreCompleto().toString())){
                        nit= Long.parseLong(AppState.listaDatosFacturacion.get(i).getnit());
                    }
                } 
                if(jRadioButton1.isSelected()==true){
                    tamanoPaquete= Long.parseLong(jSpinner1.getValue().toString());
                }else if(jRadioButton2.isSelected()==true){
                    tamanoPaquete= Long.parseLong(jSpinner2.getValue().toString());
                }else if(jRadioButton3.isSelected()==true){
                    tamanoPaquete= Long.parseLong(jSpinner3.getValue().toString());
                }
                
                if(jRadioButton6.isSelected()==true){
                    tipoPago="Pago Contra Entrega"; 
                }else if(jRadioButton7.isSelected()==true){
                    tipoPago="Pago Con Tarjeta";
                } 
                numeroPaquete=Long.parseLong(numeroPaqueteTXT.getText()); 
                fechaEnvio=dtf.format(LocalDateTime.now()); 
                double totalPago=Double.parseDouble(totalTXT.getText());
                
                Datos_CotCompra nuevaCompra = new Datos_CotCompra();
                nuevaCompra.correo=correo;
                nuevaCompra.codigoPaquete=codigoPaquete;
                nuevaCompra.numeroFactura=numeroFactura;
                nuevaCompra.tipoServicio=tipoServicio;
                nuevaCompra.destinatario=destinatario;
                nuevaCompra.origen=origen;
                nuevaCompra.destino=destino;
                nuevaCompra.nit=nit;
                nuevaCompra.tipoPago=tipoPago;
                nuevaCompra.tamanoPaquete=tamanoPaquete;
                nuevaCompra.numeroPaquete=numeroPaquete;
                nuevaCompra.fechaEnvio=fechaEnvio;
                nuevaCompra.totalPago=totalPago;
                
                AppState.listaDatos_CotCompra.add(nuevaCompra);
                
                for (int i = 0; i<AppState.listaRegion.size(); i++) {
                    if(region1TXT.getSelectedItem().toString().equals(AppState.listaRegion.get(i).getnombreRegion())==true){
                        AppState.listaRegion.get(i).setcontador(AppState.listaRegion.get(i).getcontador()+1);
                        break;
                    }
                }
                for (int i = 0; i<AppState.listaUsuario.size(); i++) {
                    if(correoTXT.getText().toString().equals(AppState.listaUsuario.get(i).getcorreo())==true){
                        AppState.listaUsuario.get(i).setcontadorPaquete(AppState.listaUsuario.get(i).getcontadorPaquete()+numeroPaquete);
                        System.out.println( AppState.listaUsuario.get(i).getcontadorPaquete()+" - "+ AppState.listaUsuario.get(i).getcorreo());
                        break;
                    }
                }
                for(int i = 0; i<AppState.listaRegion.size(); i++){
                    System.out.println(AppState.listaRegion.get(i).getnombreRegion()+" - "+AppState.listaRegion.get(i).getprecioEstandar()+" - "+AppState.listaRegion.get(i).getprecioEspecial()+" - "+AppState.listaRegion.get(i).getcontador());  
                }
                 System.out.println("--------------------------------------------------------------------");
                jButton3.setVisible(true);
                jButton5.setVisible(true);
                jButton6.setVisible(false);
                
                codigoGuiaTXT.setText(null);
                facturaTXT.setText(null); 
                JOptionPane.showMessageDialog(null, "Pago Realizado Con Éxito.", "COTIZACIÓN DE PAQUETES Y COMPRA", JOptionPane.WARNING_MESSAGE); 
                codigoGuiaTXT.setText(generarCodigo());
                facturaTXT.setText(generarFactura());
                
                direccion1TXT.setText(null);direccion2TXT.setText(null);numeroPaqueteTXT.setText(null);buttonGroup1.clearSelection();buttonGroup2.clearSelection();buttonGroup3.clearSelection();precioEspecialTXT.setText(null);precioEstandarTXT.setText(null);cvvTXT.setText(null);tarjetaTXT.setEnabled(false);
                cvvTXT.setEnabled(false);totalTXT.setText(null);servicioLBL.setText("SERVICIO");
                jSpinner1.setValue(1);jSpinner1.setEnabled(false);
                jSpinner2.setValue(11);jSpinner2.setEnabled(false);
                jSpinner3.setValue(51);jSpinner3.setEnabled(false);
        
                for(int i = 0; i<AppState.listaDatos_CotCompra.size(); i++){
                        System.out.println(AppState.listaDatos_CotCompra.get(i).getcorreo()+" - "+AppState.listaDatos_CotCompra.get(i).getcodigoPaquete()+" - "+AppState.listaDatos_CotCompra.get(i).getnumeroFactura()+" - "+AppState.listaDatos_CotCompra.get(i).gettipoServicio()+" - "+ AppState.listaDatos_CotCompra.get(i).getdestinatario()+" - "+AppState.listaDatos_CotCompra.get(i).getorigen()+" - "+AppState.listaDatos_CotCompra.get(i).getdestino()+" - "+AppState.listaDatos_CotCompra.get(i).getnit()+" - "+AppState.listaDatos_CotCompra.get(i).gettipoPago()+" - "+AppState.listaDatos_CotCompra.get(i).gettamanoPaquete()+" - "+AppState.listaDatos_CotCompra.get(i).getnumeroPaquete()+" - "+AppState.listaDatos_CotCompra.get(i).getfechaEnvio()+" - "+AppState.listaDatos_CotCompra.get(i).gettotalPago());
                    }
                    System.out.println("--------------------------------------------------------------------");
                    
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void datosTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datosTXTActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:  
        String codigoPaquete1=codigoPaquete;
        String origen1=origen;
        String destino1=destino;
        String tipoPago1=tipoPago;
        String tamanoPaquete1=String.valueOf(tamanoPaquete);
        String numeroPaquete1=String.valueOf(numeroPaquete);
        String total1=String.valueOf(TotalNeto);
        String fechaEnvio1=fechaEnvio;
        String nombre1=destinatario;
        
        String tablaHtml = generarGuiaHTML(codigoPaquete1,origen1,destino1,tipoPago1,tamanoPaquete1,numeroPaquete1,fechaEnvio1,total1,nombre1);
        // Crea la carpeta de reportes si no esiste
        File carpeta = new File("C:/Users/manue/Downloads/");
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }

        // Escribe el archivo .html dentro de la carpeta
        try {
            FileWriter fileWriter = new FileWriter("C:/Users/manue/Downloads/GUIA-"+codigoPaquete+".html");
            fileWriter.write(tablaHtml);
             JOptionPane.showMessageDialog(null, "Guía Descagada.", "COTIZACIÓN DE PAQUETES Y COMPRA", JOptionPane.INFORMATION_MESSAGE); 
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
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
        sb.append("<h5>").append("Total A Pagar: "+totalPago).append("</h5>");   
        sb.append("</tr>\n");
        //SE CIERRA
        sb.append("</font>");
        return sb.toString();
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String origen1=deptoTXT.getSelectedItem().toString()+", "+municipioTXT.getSelectedItem().toString()+", "+direccion1TXT.getText()+".";
        String destino1=depto1TXT.getSelectedItem().toString()+", "+municipio1TXT.getSelectedItem().toString()+", "+direccion2TXT.getText()+".";
        
        if(jRadioButton1.isSelected()==true){
            tamanoPaquete= Long.parseLong(jSpinner1.getValue().toString());
        }else if(jRadioButton2.isSelected()==true){
            tamanoPaquete= Long.parseLong(jSpinner2.getValue().toString());
        }else if(jRadioButton3.isSelected()==true){
            tamanoPaquete= Long.parseLong(jSpinner3.getValue().toString());
        }
   
        String tamanoPaquete1 = String.valueOf(tamanoPaquete);
        String numeroPaquete1=String.valueOf(numeroPaqueteTXT.getText());
        String precioEstandar1=String.valueOf(precioEstandarTXT.getText());
        String precioEspecial1=String.valueOf(precioEspecialTXT.getText());
        
        String tablaHtml = generaCotizacionHTML(origen1,destino1,tamanoPaquete1,numeroPaquete1,precioEstandar1,precioEspecial1);
        // Crea la carpeta de reportes si no esiste
        File carpeta = new File("C:/Users/manue/Downloads/");
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }

        // Escribe el archivo .html dentro de la carpeta
        try {
            FileWriter fileWriter = new FileWriter("C:/Users/manue/Downloads/COT-"+facturaTXT.getText()+".html");
            fileWriter.write(tablaHtml);
             JOptionPane.showMessageDialog(null, "Cotización Descagada.", "COTIZACIÓN DE PAQUETES Y COMPRA", JOptionPane.INFORMATION_MESSAGE); 
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed
    public static String generaCotizacionHTML(String origen,String destino,String tamanoPaquete,String numeroPaquete,String PrecioEstandar, String PrecioEspecial) {
        StringBuilder sb = new StringBuilder();
        sb.append("<font font face=\"Verdana\">");
        //DATOS FACTURA
        sb.append("<h5>").append("Origen: "+origen).append("</h5>");
        sb.append("<h5>").append("Destino: "+destino).append("</h5>");

        sb.append("<h5>").append("Número De Paquetes: "+numeroPaquete).append("</h5>");      
        sb.append("<h5>").append("Tamaño De Paquete: "+tamanoPaquete).append("</h5>");

        sb.append("<h5>").append("Precio Estándar: "+PrecioEstandar).append("</h5>");
        sb.append("<h5>").append("Precio Especial: "+PrecioEspecial).append("</h5>");

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
            java.util.logging.Logger.getLogger(Cotizacion_CompraJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cotizacion_CompraJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cotizacion_CompraJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cotizacion_CompraJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cotizacion_CompraJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField codigoGuiaTXT;
    public static javax.swing.JTextField correoTXT;
    private javax.swing.JLabel cvvLBL;
    private javax.swing.JTextField cvvTXT;
    private javax.swing.JComboBox<String> datosTXT;
    private javax.swing.JComboBox<String> depto1TXT;
    private javax.swing.JComboBox<String> deptoTXT;
    private javax.swing.JTextField direccion1TXT;
    private javax.swing.JTextField direccion2TXT;
    private javax.swing.JTextField facturaTXT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JComboBox<String> municipio1TXT;
    private javax.swing.JComboBox<String> municipioTXT;
    private javax.swing.JTextField numeroPaqueteTXT;
    private javax.swing.JTextField precioEspecialTXT;
    private javax.swing.JTextField precioEstandarTXT;
    private javax.swing.JComboBox<String> region1TXT;
    private javax.swing.JComboBox<String> regionTXT;
    private javax.swing.JLabel servicioLBL;
    private javax.swing.JLabel tarjetaLBL;
    private javax.swing.JComboBox<String> tarjetaTXT;
    private javax.swing.JTextField totalTXT;
    // End of variables declaration//GEN-END:variables
}
