/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraRadio;

import javax.swing.JOptionPane;

/**
 *
 * @author luciano.t.da.silva
 */
public class Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Inicial
     */
    public Inicial() {
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

        GrupoRadio = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        TxtValor1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtValor2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtResultado = new javax.swing.JTextField();
        RdoBtnSomar = new javax.swing.JRadioButton();
        RdoBtnSubtrair = new javax.swing.JRadioButton();
        RdoBtnMultiplicar = new javax.swing.JRadioButton();
        RdoBtnDividir = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Primeiro Valor");

        TxtValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtValor1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Segundo Valor");

        jLabel3.setText("Resultado");

        TxtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtResultadoActionPerformed(evt);
            }
        });

        GrupoRadio.add(RdoBtnSomar);
        RdoBtnSomar.setText("Soma");
        RdoBtnSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdoBtnSomarActionPerformed(evt);
            }
        });

        GrupoRadio.add(RdoBtnSubtrair);
        RdoBtnSubtrair.setText("Subtração");

        GrupoRadio.add(RdoBtnMultiplicar);
        RdoBtnMultiplicar.setText("Multiplicação");

        GrupoRadio.add(RdoBtnDividir);
        RdoBtnDividir.setText("Divisão");

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addComponent(TxtValor2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                            .addComponent(TxtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RdoBtnSomar)
                            .addComponent(RdoBtnSubtrair)
                            .addComponent(RdoBtnMultiplicar)
                            .addComponent(RdoBtnDividir))
                        .addGap(82, 82, 82))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RdoBtnSomar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RdoBtnSubtrair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RdoBtnMultiplicar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RdoBtnDividir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RdoBtnSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdoBtnSomarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RdoBtnSomarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try {
            
            double Valor1;
            double Valor2;
            double Resultado;

            Valor1 = Double.parseDouble(TxtValor1.getText());
            Valor2 = Double.parseDouble(TxtValor2.getText());

            if (RdoBtnSomar.isSelected()) {

                Resultado = Valor1 + Valor2;
                TxtResultado.setText(Double.toString(Resultado));

            } else if (RdoBtnSubtrair.isSelected()) {

                Resultado = Valor1 - Valor2;
                TxtResultado.setText(Double.toString(Resultado));

            } else if (RdoBtnMultiplicar.isSelected()){

                Resultado = Valor1 * Valor2;
                TxtResultado.setText(Double.toString(Resultado));

            } else if (RdoBtnDividir.isSelected()){
                
                if (Valor2 == 0){
                    
                    JOptionPane.showMessageDialog(null, "Não possível dividir por 0!!!");
                    
                }
                else {
                    
                    Resultado = Valor1 / Valor2;
                    TxtResultado.setText(Double.toString(Resultado));
                    
                }

            }
            
            else {
                
                JOptionPane.showMessageDialog(null, "Selecione uma das Operações Matemáticas Disponíveis !!!");
                
            }

        } catch (NumberFormatException e){
            
            JOptionPane.showMessageDialog(null,"Revise os Valores para executar a operação!!!");
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TxtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtResultadoActionPerformed

    private void TxtValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtValor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtValor1ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoRadio;
    private javax.swing.JRadioButton RdoBtnDividir;
    private javax.swing.JRadioButton RdoBtnMultiplicar;
    private javax.swing.JRadioButton RdoBtnSomar;
    private javax.swing.JRadioButton RdoBtnSubtrair;
    private javax.swing.JTextField TxtResultado;
    private javax.swing.JTextField TxtValor1;
    private javax.swing.JTextField TxtValor2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
