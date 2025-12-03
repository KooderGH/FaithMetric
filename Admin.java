package com.mycompany.faithmetric;
import java.awt.Color;
public class Admin extends javax.swing.JFrame {
    public Admin() {
        initComponents();
        this.setExtendedState(Admin.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jBuilding = new javax.swing.JLabel();
        jVehicle = new javax.swing.JLabel();
        jMission = new javax.swing.JLabel();
        jOfferings = new javax.swing.JLabel();
        jServiceType = new javax.swing.JLabel();
        jTotalFunds = new javax.swing.JLabel();
        jTithes = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jMembers1 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");
        setExtendedState(Admin.MAXIMIZED_BOTH);
        setFocusCycleRoot(false);
        setSize(new java.awt.Dimension(1250, 700));

        jPanel1.setBackground(new java.awt.Color(30, 63, 102));

        jLabel3.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FAITH METRICS | ADMIN");

        jBuilding.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        jBuilding.setForeground(new java.awt.Color(255, 255, 255));
        jBuilding.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBuilding.setText("Building Fund");
        jBuilding.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBuilding.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBuildingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBuildingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBuildingMouseExited(evt);
            }
        });

        jVehicle.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        jVehicle.setForeground(new java.awt.Color(255, 255, 255));
        jVehicle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jVehicle.setText("Vehicle");
        jVehicle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jVehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jVehicleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jVehicleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jVehicleMouseExited(evt);
            }
        });

        jMission.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        jMission.setForeground(new java.awt.Color(255, 255, 255));
        jMission.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMission.setText("Mission");
        jMission.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMissionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMissionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMissionMouseExited(evt);
            }
        });

        jOfferings.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        jOfferings.setForeground(new java.awt.Color(255, 255, 255));
        jOfferings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jOfferings.setText("Offerings");
        jOfferings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jOfferings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jOfferingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jOfferingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jOfferingsMouseExited(evt);
            }
        });

        jServiceType.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        jServiceType.setForeground(new java.awt.Color(255, 255, 255));
        jServiceType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jServiceType.setText("Service Type");
        jServiceType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jServiceType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jServiceTypeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jServiceTypeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jServiceTypeMouseExited(evt);
            }
        });

        jTotalFunds.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        jTotalFunds.setForeground(new java.awt.Color(255, 255, 255));
        jTotalFunds.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTotalFunds.setText("Total Funds");
        jTotalFunds.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTotalFunds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTotalFundsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTotalFundsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTotalFundsMouseExited(evt);
            }
        });

        jTithes.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        jTithes.setForeground(new java.awt.Color(255, 255, 255));
        jTithes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTithes.setText("Tithes");
        jTithes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTithes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTithesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTithesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTithesMouseExited(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jMembers1.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        jMembers1.setForeground(new java.awt.Color(255, 255, 255));
        jMembers1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMembers1.setText("Members");
        jMembers1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMembers1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMembers1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMembers1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMembers1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMembers1MousePressed(evt);
            }
        });

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" ✝");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jMembers1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTithes)
                .addGap(28, 28, 28)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTotalFunds)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jServiceType)
                .addGap(12, 12, 12)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jOfferings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMission)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jVehicle)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBuilding)
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTotalFunds)
                                .addComponent(jServiceType)
                                .addComponent(jOfferings)
                                .addComponent(jMission)
                                .addComponent(jVehicle)
                                .addComponent(jBuilding))
                            .addComponent(jTithes)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jMembers1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel8))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setPreferredSize(new java.awt.Dimension(1250, 700));
        jScrollPane3.setViewportView(jPanel2);

        jTable2.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setText("CHART");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(349, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel1)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        jLabel2.setText("CHART");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(349, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel2)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        jLabel4.setText("TOTAL :");

        jScrollPane1.setViewportView(jTextPane1);

        jLabel5.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        jLabel5.setText("TABLE");

        jLabel6.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        jLabel6.setText("CHARTS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(385, 385, 385)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(398, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1536, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMembers1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMembers1MouseEntered
       
    }//GEN-LAST:event_jMembers1MouseEntered

    private void jMembers1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMembers1MouseExited
        jMembers1.setForeground(Color.WHITE);       
    }//GEN-LAST:event_jMembers1MouseExited

    private void jMembers1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMembers1MouseClicked
        jMembers1.setForeground(Color.YELLOW); 
    }//GEN-LAST:event_jMembers1MouseClicked

    private void jMembers1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMembers1MousePressed

    }//GEN-LAST:event_jMembers1MousePressed

    private void jTithesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTithesMouseClicked
        jTithes.setForeground(Color.YELLOW);        
    }//GEN-LAST:event_jTithesMouseClicked

    private void jTotalFundsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTotalFundsMouseClicked
        jTotalFunds.setForeground(Color.YELLOW);
    }//GEN-LAST:event_jTotalFundsMouseClicked

    private void jServiceTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jServiceTypeMouseClicked
        jServiceType.setForeground(Color.YELLOW);
    }//GEN-LAST:event_jServiceTypeMouseClicked

    private void jOfferingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOfferingsMouseClicked
        jOfferings.setForeground(Color.YELLOW);
    }//GEN-LAST:event_jOfferingsMouseClicked

    private void jMissionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMissionMouseClicked
        jMission.setForeground(Color.YELLOW);
    }//GEN-LAST:event_jMissionMouseClicked

    private void jVehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVehicleMouseClicked
        jVehicle.setForeground(Color.YELLOW);
    }//GEN-LAST:event_jVehicleMouseClicked

    private void jBuildingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBuildingMouseClicked
       jBuilding.setForeground(Color.YELLOW);
    }//GEN-LAST:event_jBuildingMouseClicked

    private void jServiceTypeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jServiceTypeMouseEntered
      
    }//GEN-LAST:event_jServiceTypeMouseEntered

    private void jTithesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTithesMouseExited
        jTithes.setForeground(Color.WHITE);        
    }//GEN-LAST:event_jTithesMouseExited

    private void jTotalFundsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTotalFundsMouseEntered
                
    }//GEN-LAST:event_jTotalFundsMouseEntered

    private void jOfferingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOfferingsMouseEntered
        
    }//GEN-LAST:event_jOfferingsMouseEntered

    private void jMissionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMissionMouseEntered
 
    }//GEN-LAST:event_jMissionMouseEntered

    private void jVehicleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVehicleMouseEntered
 
    }//GEN-LAST:event_jVehicleMouseEntered

    private void jBuildingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBuildingMouseEntered
        
    }//GEN-LAST:event_jBuildingMouseEntered

    private void jTithesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTithesMouseEntered
        
    }//GEN-LAST:event_jTithesMouseEntered

    private void jTotalFundsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTotalFundsMouseExited
        jTotalFunds.setForeground(Color.WHITE); 
    }//GEN-LAST:event_jTotalFundsMouseExited

    private void jServiceTypeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jServiceTypeMouseExited
        jServiceType.setForeground(Color.WHITE); 
    }//GEN-LAST:event_jServiceTypeMouseExited

    private void jOfferingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOfferingsMouseExited
        jOfferings.setForeground(Color.WHITE); 
    }//GEN-LAST:event_jOfferingsMouseExited

    private void jMissionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMissionMouseExited
        jMission.setForeground(Color.WHITE); 
    }//GEN-LAST:event_jMissionMouseExited

    private void jVehicleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVehicleMouseExited
        jVehicle.setForeground(Color.WHITE); 
    }//GEN-LAST:event_jVehicleMouseExited

    private void jBuildingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBuildingMouseExited
        jBuilding.setForeground(Color.WHITE); 
    }//GEN-LAST:event_jBuildingMouseExited
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBuilding;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jMembers1;
    private javax.swing.JLabel jMission;
    private javax.swing.JLabel jOfferings;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel jServiceType;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel jTithes;
    private javax.swing.JLabel jTotalFunds;
    private javax.swing.JLabel jVehicle;
    // End of variables declaration//GEN-END:variables
}
