/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.miprimeracalculadora;

/**
 *FGALVEZ
 * WLOPEZ
 * AORJUELA
 */
public class Calculadora extends javax.swing.JFrame {

    public float numero1;
    public float numero2;
    public String operador;
    

    public Calculadora() {

        initComponents();
        this.setLocationRelativeTo(null); //codificacion para que la pantalla aparezca en el centro
    }

   
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonSuma1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Boton10 = new javax.swing.JButton();
        PantallaCalculadora = new javax.swing.JTextField();
        Botoncero = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton1 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        BotonRaizCuadrada = new javax.swing.JButton();
        BotonSuma = new javax.swing.JButton();
        BotonResta = new javax.swing.JButton();
        BotonMultiplicacion = new javax.swing.JButton();
        BotonDivision = new javax.swing.JButton();
        BotonPotencia = new javax.swing.JButton();
        BotonIgual = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        BotonPunto = new javax.swing.JButton();

        BotonSuma1.setText("+");

        jButton1.setText("jButton1");

        Boton10.setText("3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PantallaCalculadora.setBackground(new java.awt.Color(204, 204, 255));
        PantallaCalculadora.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        PantallaCalculadora.setForeground(new java.awt.Color(0, 0, 0));
        PantallaCalculadora.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        PantallaCalculadora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        PantallaCalculadora.setCaretColor(new java.awt.Color(0, 0, 0));
        PantallaCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PantallaCalculadoraActionPerformed(evt);
            }
        });

        Botoncero.setBackground(new java.awt.Color(153, 153, 153));
        Botoncero.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Botoncero.setForeground(new java.awt.Color(0, 0, 0));
        Botoncero.setText("0");
        Botoncero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonceroActionPerformed(evt);
            }
        });

        Boton2.setBackground(new java.awt.Color(153, 153, 153));
        Boton2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Boton2.setForeground(new java.awt.Color(0, 0, 0));
        Boton2.setText("2");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        Boton1.setBackground(new java.awt.Color(153, 153, 153));
        Boton1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Boton1.setForeground(new java.awt.Color(0, 0, 0));
        Boton1.setText("1");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Boton3.setBackground(new java.awt.Color(153, 153, 153));
        Boton3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Boton3.setForeground(new java.awt.Color(0, 0, 0));
        Boton3.setText("3");
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });

        Boton4.setBackground(new java.awt.Color(153, 153, 153));
        Boton4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Boton4.setForeground(new java.awt.Color(0, 0, 0));
        Boton4.setText("4");
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });

        Boton5.setBackground(new java.awt.Color(153, 153, 153));
        Boton5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Boton5.setForeground(new java.awt.Color(0, 0, 0));
        Boton5.setText("5");
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });

        Boton6.setBackground(new java.awt.Color(153, 153, 153));
        Boton6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Boton6.setForeground(new java.awt.Color(0, 0, 0));
        Boton6.setText("6");
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });

        Boton7.setBackground(new java.awt.Color(153, 153, 153));
        Boton7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Boton7.setForeground(new java.awt.Color(0, 0, 0));
        Boton7.setText("7");
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });

        Boton8.setBackground(new java.awt.Color(153, 153, 153));
        Boton8.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Boton8.setForeground(new java.awt.Color(0, 0, 0));
        Boton8.setText("8");
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });

        Boton9.setBackground(new java.awt.Color(153, 153, 153));
        Boton9.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Boton9.setForeground(new java.awt.Color(0, 0, 0));
        Boton9.setText("9");
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });

        BotonRaizCuadrada.setBackground(new java.awt.Color(153, 153, 153));
        BotonRaizCuadrada.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        BotonRaizCuadrada.setForeground(new java.awt.Color(0, 0, 0));
        BotonRaizCuadrada.setText("√");
        BotonRaizCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRaizCuadradaActionPerformed(evt);
            }
        });

        BotonSuma.setBackground(new java.awt.Color(153, 153, 153));
        BotonSuma.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        BotonSuma.setForeground(new java.awt.Color(0, 0, 0));
        BotonSuma.setText("+");
        BotonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumaActionPerformed(evt);
            }
        });

        BotonResta.setBackground(new java.awt.Color(153, 153, 153));
        BotonResta.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        BotonResta.setForeground(new java.awt.Color(0, 0, 0));
        BotonResta.setText("-");
        BotonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRestaActionPerformed(evt);
            }
        });

        BotonMultiplicacion.setBackground(new java.awt.Color(153, 153, 153));
        BotonMultiplicacion.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        BotonMultiplicacion.setForeground(new java.awt.Color(0, 0, 0));
        BotonMultiplicacion.setText("*");
        BotonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMultiplicacionActionPerformed(evt);
            }
        });

        BotonDivision.setBackground(new java.awt.Color(153, 153, 153));
        BotonDivision.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        BotonDivision.setForeground(new java.awt.Color(0, 0, 0));
        BotonDivision.setText("÷");
        BotonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDivisionActionPerformed(evt);
            }
        });

        BotonPotencia.setBackground(new java.awt.Color(153, 153, 153));
        BotonPotencia.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        BotonPotencia.setForeground(new java.awt.Color(0, 0, 0));
        BotonPotencia.setText("^");
        BotonPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPotenciaActionPerformed(evt);
            }
        });

        BotonIgual.setBackground(new java.awt.Color(153, 153, 153));
        BotonIgual.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        BotonIgual.setForeground(new java.awt.Color(0, 0, 0));
        BotonIgual.setText("=");
        BotonIgual.setSize(new java.awt.Dimension(55, 55));
        BotonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIgualActionPerformed(evt);
            }
        });

        BotonBorrar.setBackground(new java.awt.Color(153, 153, 153));
        BotonBorrar.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        BotonBorrar.setForeground(new java.awt.Color(0, 0, 0));
        BotonBorrar.setText("CE");
        BotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarActionPerformed(evt);
            }
        });

        BotonPunto.setBackground(new java.awt.Color(153, 153, 153));
        BotonPunto.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        BotonPunto.setForeground(new java.awt.Color(0, 0, 0));
        BotonPunto.setText(".");
        BotonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPuntoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PantallaCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Botoncero, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotonRaizCuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotonPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(PantallaCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonRaizCuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonSuma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Botoncero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
        // TODO add your handling code here:
        this.PantallaCalculadora.setText(this.PantallaCalculadora.getText() + "5");
    }//GEN-LAST:event_Boton5ActionPerformed

    private void BotonPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPotenciaActionPerformed
        // TODO add your handling code here:
        this.numero1 = Float.parseFloat(this.PantallaCalculadora.getText());
        this.operador = "^";
        this.PantallaCalculadora.setText("");

    }//GEN-LAST:event_BotonPotenciaActionPerformed

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        // TODO add your handling code here:
        this.PantallaCalculadora.setText(this.PantallaCalculadora.getText() + "1");
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        // TODO add your handling code here:
        this.PantallaCalculadora.setText(this.PantallaCalculadora.getText() + "2");
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        // TODO add your handling code here:
        this.PantallaCalculadora.setText(this.PantallaCalculadora.getText() + "3");
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        // TODO add your handling code here:
        this.PantallaCalculadora.setText(this.PantallaCalculadora.getText() + "4");
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
        // TODO add your handling code here:
        this.PantallaCalculadora.setText(this.PantallaCalculadora.getText() + "6");
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
        // TODO add your handling code here:
        PantallaCalculadora.setText(this.PantallaCalculadora.getText() + "7");
    }//GEN-LAST:event_Boton7ActionPerformed

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
        // TODO add your handling code here:
        this.PantallaCalculadora.setText(this.PantallaCalculadora.getText() + "8");
    }//GEN-LAST:event_Boton8ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
        // TODO add your handling code here:
        this.PantallaCalculadora.setText(this.PantallaCalculadora.getText() + "9");
    }//GEN-LAST:event_Boton9ActionPerformed

    private void BotonceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonceroActionPerformed
        // TODO add your handling code here:
        this.PantallaCalculadora.setText(this.PantallaCalculadora.getText() + "0");
    }//GEN-LAST:event_BotonceroActionPerformed

    private void BotonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPuntoActionPerformed
        // TODO add your handling code here:
        if (!(this.PantallaCalculadora.getText().contains("."))) {
            this.PantallaCalculadora.setText(this.PantallaCalculadora.getText() + ".");
        }
    }//GEN-LAST:event_BotonPuntoActionPerformed

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        // TODO add your handling code here:
        this.PantallaCalculadora.setText("");

    }//GEN-LAST:event_BotonBorrarActionPerformed

    private void BotonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumaActionPerformed
        // TODO add your handling code here:
        this.numero1 = Float.parseFloat(this.PantallaCalculadora.getText());
        this.operador = "+";
        this.PantallaCalculadora.setText("");


    }//GEN-LAST:event_BotonSumaActionPerformed

    private void BotonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIgualActionPerformed
        // TODO add your handling code here:
        this.numero2 = Float.parseFloat(PantallaCalculadora.getText());

        switch (this.operador) {
            case "+" -> this.PantallaCalculadora.setText(NoCero(this.numero1 + this.numero2));
            case "-" -> this.PantallaCalculadora.setText(NoCero(this.numero1 - this.numero2));
            case "*" -> this.PantallaCalculadora.setText(NoCero(this.numero1 * this.numero2));
            case "^" -> this.PantallaCalculadora.setText(NoCero((float) Math.pow(this.numero1, this.numero2)));
            case "√" -> this.PantallaCalculadora.setText(NoCero((float) Math.sqrt(this.numero2)));
            case "/" -> {
                if (this.numero2 == 0) {
                    this.PantallaCalculadora.setText("NO SE PERMITE DIVIDIR ENTRE CERO");
                } else {
                    this.PantallaCalculadora.setText(NoCero(this.numero1 / this.numero2));
                }
            }
           

        }

    }//GEN-LAST:event_BotonIgualActionPerformed

    private void BotonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRestaActionPerformed
        // TODO add your handling code here:
        this.numero1 = Float.parseFloat(this.PantallaCalculadora.getText());
        this.operador = "-";
        this.PantallaCalculadora.setText("");
    }//GEN-LAST:event_BotonRestaActionPerformed

    private void BotonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMultiplicacionActionPerformed
        // TODO add your handling code here:
        this.numero1 = Float.parseFloat(this.PantallaCalculadora.getText());
        this.operador = "*";
        this.PantallaCalculadora.setText("");
    }//GEN-LAST:event_BotonMultiplicacionActionPerformed

    private void BotonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDivisionActionPerformed
        // TODO add your handling code here:
        this.numero1 = Float.parseFloat(this.PantallaCalculadora.getText());
        this.operador = "/";
        this.PantallaCalculadora.setText("");
        
    }//GEN-LAST:event_BotonDivisionActionPerformed

    private void BotonRaizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRaizCuadradaActionPerformed
        // TODO add your handling code here:
        this.operador = "√";
        this.numero1 = Float.parseFloat(this.PantallaCalculadora.getText());
        this.PantallaCalculadora.setText("");
    }//GEN-LAST:event_BotonRaizCuadradaActionPerformed

    private void PantallaCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PantallaCalculadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PantallaCalculadoraActionPerformed

    public String NoCero(float resultado) {
        String retorno = "";
        retorno = Float.toString(resultado);
        if (resultado % 1 == 0) {
            retorno = retorno.substring(0, retorno.length() - 2);

        }
        return retorno;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton10;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonDivision;
    private javax.swing.JButton BotonIgual;
    private javax.swing.JButton BotonMultiplicacion;
    private javax.swing.JButton BotonPotencia;
    private javax.swing.JButton BotonPunto;
    private javax.swing.JButton BotonRaizCuadrada;
    private javax.swing.JButton BotonResta;
    private javax.swing.JButton BotonSuma;
    private javax.swing.JButton BotonSuma1;
    private javax.swing.JButton Botoncero;
    private javax.swing.JTextField PantallaCalculadora;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
