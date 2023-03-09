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
        regionTXT1.addItem(AppState.listaRegion.get(i).getnombreRegion().toString()); 
        regionTXT2.addItem(AppState.listaRegion.get(i).getnombreRegion().toString()); 
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
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        regionTXT1 = new javax.swing.JComboBox<>();
        deptoTXT1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        municipioActualTXT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        municipioNuevoTXT = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        regionTXT2 = new javax.swing.JComboBox<>();
        deptoTXT2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        municipioEliminarTXT1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 36, 48));
        jPanel1.setForeground(new java.awt.Color(32, 36, 48));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MANEJO DE DEPARTAMENTOS Y MUNICIPIOS");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Región");

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

        jPanel2.setBackground(new java.awt.Color(117, 232, 250));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("MODIFICAR NOMBRE MUNCIPIO");

        regionTXT1.setBackground(new java.awt.Color(255, 255, 255));
        regionTXT1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        regionTXT1.setForeground(new java.awt.Color(0, 0, 0));
        regionTXT1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                regionTXT1ItemStateChanged(evt);
            }
        });
        regionTXT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionTXT1ActionPerformed(evt);
            }
        });

        deptoTXT1.setBackground(new java.awt.Color(255, 255, 255));
        deptoTXT1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        deptoTXT1.setForeground(new java.awt.Color(0, 0, 0));
        deptoTXT1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                deptoTXT1ItemStateChanged(evt);
            }
        });
        deptoTXT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptoTXT1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Región:");

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Departamento:");

        municipioActualTXT.setBackground(new java.awt.Color(255, 255, 255));
        municipioActualTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        municipioActualTXT.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Municipio Actual:");

        jButton3.setBackground(new java.awt.Color(255, 217, 79));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("MODIFICAR MUNICIPIO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Municipio Nuevo:");

        municipioNuevoTXT.setBackground(new java.awt.Color(255, 255, 255));
        municipioNuevoTXT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        municipioNuevoTXT.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(regionTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton3)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(municipioActualTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(deptoTXT1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(municipioNuevoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regionTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deptoTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(municipioActualTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(municipioNuevoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton3)
                        .addContainerGap(26, Short.MAX_VALUE))))
        );

        jPanel3.setBackground(new java.awt.Color(117, 232, 250));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ELIMINAR MUNCIPIO APERTURADO");

        regionTXT2.setBackground(new java.awt.Color(255, 255, 255));
        regionTXT2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        regionTXT2.setForeground(new java.awt.Color(0, 0, 0));
        regionTXT2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                regionTXT2ItemStateChanged(evt);
            }
        });
        regionTXT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionTXT2ActionPerformed(evt);
            }
        });

        deptoTXT2.setBackground(new java.awt.Color(255, 255, 255));
        deptoTXT2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        deptoTXT2.setForeground(new java.awt.Color(0, 0, 0));
        deptoTXT2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                deptoTXT2ItemStateChanged(evt);
            }
        });
        deptoTXT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptoTXT2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Región:");

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Departamento:");

        municipioEliminarTXT1.setBackground(new java.awt.Color(255, 255, 255));
        municipioEliminarTXT1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        municipioEliminarTXT1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Municipio:");

        jButton4.setBackground(new java.awt.Color(254, 65, 87));
        jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ELIMINAR MUNICIPIO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(regionTXT2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton4)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(municipioEliminarTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(deptoTXT2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regionTXT2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deptoTXT2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(municipioEliminarTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(municipioTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deptoTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regionTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(codigoDeptoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(regionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deptoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigoDeptoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(municipioTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
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
                
                JOptionPane.showMessageDialog(null, "Municipio Registrado Correctamente", "MANEJO DE DEPARTAMENTOS Y MUNICIPIOS", JOptionPane.INFORMATION_MESSAGE);
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

    private void regionTXT1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_regionTXT1ItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()== ItemEvent.SELECTED){
            if(this.regionTXT1.getSelectedIndex()==0){ 
                this.deptoTXT1.setModel(new DefaultComboBoxModel(this.getDeptoMetropolitana(this.regionTXT1.getSelectedItem().toString())));
            }else if(this.regionTXT1.getSelectedIndex()==1){ 
                this.deptoTXT1.setModel(new DefaultComboBoxModel(this.getDeptoNorte(this.regionTXT1.getSelectedItem().toString())));
            }else if(this.regionTXT1.getSelectedIndex()==2){ 
                this.deptoTXT1.setModel(new DefaultComboBoxModel(this.getDeptoNororiente(this.regionTXT1.getSelectedItem().toString())));
            }else if(this.regionTXT1.getSelectedIndex()==3){ 
                this.deptoTXT1.setModel(new DefaultComboBoxModel(this.getDeptoSuroriente(this.regionTXT1.getSelectedItem().toString())));
            }else if(this.regionTXT1.getSelectedIndex()==4){ 
                this.deptoTXT1.setModel(new DefaultComboBoxModel(this.getDeptoSuroccidente(this.regionTXT1.getSelectedItem().toString())));
            }else if(this.regionTXT1.getSelectedIndex()==5){ 
                this.deptoTXT1.setModel(new DefaultComboBoxModel(this.getDeptoNoroccidente(this.regionTXT1.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_regionTXT1ItemStateChanged

    private void regionTXT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionTXT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionTXT1ActionPerformed

    private void deptoTXT1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_deptoTXT1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_deptoTXT1ItemStateChanged

    private void deptoTXT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptoTXT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptoTXT1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here

       if(regionTXT1.getSelectedItem().toString().isEmpty()||deptoTXT1.getSelectedItem().toString().isEmpty()||municipioActualTXT.getText().isEmpty()||municipioNuevoTXT.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos Vacíos, Debe Llenar todos los campos.", "MANEJO DE DEPARTAMENTOS Y MUNICIPIOS", JOptionPane.ERROR_MESSAGE);
        }else{
            boolean existe=false;
            for (int i=0;i<AppState.listaDeptoMunicipio.size();i++){
                if (regionTXT1.getSelectedItem().toString().equals(AppState.listaDeptoMunicipio.get(i).getregion())&&deptoTXT1.getSelectedItem().toString().equals(AppState.listaDeptoMunicipio.get(i).getdepto())&&municipioActualTXT.getText().equals(AppState.listaDeptoMunicipio.get(i).getmunicipio())){
                    existe=true;
                    break;
                }
            }
            if(existe){
                for (int i=0;i<AppState.listaDeptoMunicipio.size();i++){
                    if (regionTXT1.getSelectedItem().toString().equals(AppState.listaDeptoMunicipio.get(i).getregion())&&deptoTXT1.getSelectedItem().toString().equals(AppState.listaDeptoMunicipio.get(i).getdepto())&&municipioActualTXT.getText().equals(AppState.listaDeptoMunicipio.get(i).getmunicipio())){
                        AppState.listaDeptoMunicipio.get(i).setmunicipio(municipioNuevoTXT.getText());
                        break;
                    }
                }
                for(int i = 0; i<AppState.listaDeptoMunicipio.size(); i++){
                    System.out.println(AppState.listaDeptoMunicipio.get(i).getregion()+" - "+AppState.listaDeptoMunicipio.get(i).getdepto()+" - "+AppState.listaDeptoMunicipio.get(i).codigoDepto+" - "+AppState.listaDeptoMunicipio.get(i).getmunicipio());
                }
                System.out.println("--------------------------------------------------------------------");
                JOptionPane.showMessageDialog(null, "Municipio Modificado Correctamente.", "MANEJO DE DEPARTAMENTOS Y MUNICIPIOS", JOptionPane.INFORMATION_MESSAGE);
                municipioActualTXT.setText(null);
                municipioNuevoTXT.setText(null);
            }else{

                  JOptionPane.showMessageDialog(null, "Nombre de Municipio no Coindice con el Municipio Registrado Registrado.", "REGISTRO DE TARJETA DE CRÉDITO/DÉBITO", JOptionPane.WARNING_MESSAGE);
            }
        } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void regionTXT2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_regionTXT2ItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()== ItemEvent.SELECTED){
            if(this.regionTXT2.getSelectedIndex()==0){ 
                this.deptoTXT2.setModel(new DefaultComboBoxModel(this.getDeptoMetropolitana(this.regionTXT2.getSelectedItem().toString())));
            }else if(this.regionTXT2.getSelectedIndex()==1){ 
                this.deptoTXT2.setModel(new DefaultComboBoxModel(this.getDeptoNorte(this.regionTXT2.getSelectedItem().toString())));
            }else if(this.regionTXT2.getSelectedIndex()==2){ 
                this.deptoTXT2.setModel(new DefaultComboBoxModel(this.getDeptoNororiente(this.regionTXT2.getSelectedItem().toString())));
            }else if(this.regionTXT2.getSelectedIndex()==3){ 
                this.deptoTXT2.setModel(new DefaultComboBoxModel(this.getDeptoSuroriente(this.regionTXT2.getSelectedItem().toString())));
            }else if(this.regionTXT2.getSelectedIndex()==4){ 
                this.deptoTXT2.setModel(new DefaultComboBoxModel(this.getDeptoSuroccidente(this.regionTXT2.getSelectedItem().toString())));
            }else if(this.regionTXT2.getSelectedIndex()==5){ 
                this.deptoTXT2.setModel(new DefaultComboBoxModel(this.getDeptoNoroccidente(this.regionTXT2.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_regionTXT2ItemStateChanged

    private void regionTXT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionTXT2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionTXT2ActionPerformed

    private void deptoTXT2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_deptoTXT2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_deptoTXT2ItemStateChanged

    private void deptoTXT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptoTXT2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptoTXT2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(regionTXT2.getSelectedItem().toString().isEmpty()||deptoTXT2.getSelectedItem().toString().isEmpty()||municipioEliminarTXT1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos Vacíos, Debe Llenar todos los campos.", "MANEJO DE DEPARTAMENTOS Y MUNICIPIOS", JOptionPane.ERROR_MESSAGE);
        }else{
            boolean existe=false;
            for (int i=0;i<AppState.listaDeptoMunicipio.size();i++){
                if (regionTXT2.getSelectedItem().toString().equals(AppState.listaDeptoMunicipio.get(i).getregion())&&deptoTXT2.getSelectedItem().toString().equals(AppState.listaDeptoMunicipio.get(i).getdepto())&&municipioEliminarTXT1.getText().equals(AppState.listaDeptoMunicipio.get(i).getmunicipio())){
                    existe=true;
                    break;
                }
            }
            if(existe){
                for (int i=0;i<AppState.listaDeptoMunicipio.size();i++){
                    if (regionTXT2.getSelectedItem().toString().equals(AppState.listaDeptoMunicipio.get(i).getregion())&&deptoTXT2.getSelectedItem().toString().equals(AppState.listaDeptoMunicipio.get(i).getdepto())&&municipioEliminarTXT1.getText().equals(AppState.listaDeptoMunicipio.get(i).getmunicipio())){
                        AppState.listaDeptoMunicipio.remove(i);
                        break;
                    }
                }
                for(int i = 0; i<AppState.listaDeptoMunicipio.size(); i++){
                    System.out.println(AppState.listaDeptoMunicipio.get(i).getregion()+" - "+AppState.listaDeptoMunicipio.get(i).getdepto()+" - "+AppState.listaDeptoMunicipio.get(i).codigoDepto+" - "+AppState.listaDeptoMunicipio.get(i).getmunicipio());
                }
                System.out.println("--------------------------------------------------------------------");
                JOptionPane.showMessageDialog(null, "Municipio Eliminado Correctamente.", "MANEJO DE DEPARTAMENTOS Y MUNICIPIOS", JOptionPane.INFORMATION_MESSAGE);
                municipioEliminarTXT1.setText(null);
            }else{

                  JOptionPane.showMessageDialog(null, "Nombre de Municipio no Coindice con el Municipio Registrado Registrado.", "REGISTRO DE TARJETA DE CRÉDITO/DÉBITO", JOptionPane.WARNING_MESSAGE);
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
    private javax.swing.JComboBox<String> deptoTXT1;
    private javax.swing.JComboBox<String> deptoTXT2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField municipioActualTXT;
    private javax.swing.JTextField municipioEliminarTXT1;
    private javax.swing.JTextField municipioNuevoTXT;
    private javax.swing.JTextField municipioTXT;
    private javax.swing.JComboBox<String> regionTXT;
    private javax.swing.JComboBox<String> regionTXT1;
    private javax.swing.JComboBox<String> regionTXT2;
    // End of variables declaration//GEN-END:variables
}
