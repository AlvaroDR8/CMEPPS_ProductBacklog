/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package productbacklog;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Aburo Senpai
 */
public class ISBSG extends javax.swing.JFrame {

    /**
     * Creates new form AjusteFinalPF
     */
    DecimalFormat formato1 = new DecimalFormat("0.00");
    int sva;
    float aux,FA;
    float PFA;
    public ISBSG(float PFA) {
        initComponents();
        setLocationRelativeTo(null);
        this.PFA=PFA;
        lVar6.setText(formato1.format(this.PFA));
        lVar13.setText(formato1.format(this.PFA));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lVar3 = new javax.swing.JLabel();
        lVar6 = new javax.swing.JLabel();
        lVar7 = new javax.swing.JLabel();
        lVar9 = new javax.swing.JLabel();
        lVar10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jT1 = new javax.swing.JTextField();
        jT2 = new javax.swing.JTextField();
        lVar11 = new javax.swing.JLabel();
        lVar8 = new javax.swing.JLabel();
        jT3 = new javax.swing.JTextField();
        jT4 = new javax.swing.JTextField();
        lVar12 = new javax.swing.JLabel();
        lVar13 = new javax.swing.JLabel();
        lVar14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ISBSG");
        setMaximumSize(new java.awt.Dimension(400, 350));
        setMinimumSize(new java.awt.Dimension(400, 350));
        setPreferredSize(new java.awt.Dimension(400, 350));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lVar3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lVar3.setText("Esfuerzo = ");
        getContentPane().add(lVar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lVar6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lVar6.setText("0");
        getContentPane().add(lVar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 80, -1));

        lVar7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lVar7.setText("Duracion = ");
        getContentPane().add(lVar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 140, -1, -1));

        lVar9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lVar9.setText("*");
        getContentPane().add(lVar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 10, -1));

        lVar10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lVar10.setText(" =");
        getContentPane().add(lVar10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jT1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jT1.setMaximumSize(new java.awt.Dimension(40, 26));
        jT1.setMinimumSize(new java.awt.Dimension(40, 26));
        jT1.setPreferredSize(new java.awt.Dimension(40, 26));
        jT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT1ActionPerformed(evt);
            }
        });
        getContentPane().add(jT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jT2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jT2.setMaximumSize(new java.awt.Dimension(40, 26));
        jT2.setMinimumSize(new java.awt.Dimension(40, 26));
        jT2.setPreferredSize(new java.awt.Dimension(40, 26));
        jT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT2ActionPerformed(evt);
            }
        });
        getContentPane().add(jT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        lVar11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lVar11.setText("*");
        getContentPane().add(lVar11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 10, -1));

        lVar8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lVar8.setText("0");
        getContentPane().add(lVar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 80, -1));

        jT3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jT3.setMaximumSize(new java.awt.Dimension(60, 31));
        jT3.setMinimumSize(new java.awt.Dimension(60, 31));
        jT3.setPreferredSize(new java.awt.Dimension(60, 31));
        jT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT3ActionPerformed(evt);
            }
        });
        getContentPane().add(jT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jT4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jT4.setMaximumSize(new java.awt.Dimension(60, 31));
        jT4.setMinimumSize(new java.awt.Dimension(60, 31));
        jT4.setPreferredSize(new java.awt.Dimension(60, 31));
        jT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT4ActionPerformed(evt);
            }
        });
        getContentPane().add(jT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        lVar12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lVar12.setText(" =");
        getContentPane().add(lVar12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        lVar13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lVar13.setText("0");
        getContentPane().add(lVar13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 80, -1));

        lVar14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lVar14.setText("0");
        getContentPane().add(lVar14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 80, -1));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        float aux,aux2,aux3,aux4;
        if (jT1.getText().equals("")||jT2.getText().equals("")||jT3.getText().equals("")||jT4.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Revisa que los campos no esten vacios","Error",2);
        }else{
            aux = Float.valueOf(jT3.getText());
            aux2 = Float.valueOf(jT1.getText());
            
            lVar8.setText(formato1.format((float) (aux*(Math.pow(this.PFA,aux2)))));
            
            aux3 = Float.valueOf(jT4.getText());
            aux4 = Float.valueOf(jT2.getText());
            
            lVar14.setText(formato1.format((float) (aux3*(Math.pow(this.PFA,aux4)))));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT1ActionPerformed

    private void jT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT2ActionPerformed

    private void jT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT3ActionPerformed

    private void jT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        //AjusteInfluencia ven = new AjusteInfluencia(this.pfna);
        //ven.setVisible(true);
        System.exit(0);
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
            java.util.logging.Logger.getLogger(ISBSG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ISBSG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ISBSG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ISBSG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AjusteFinalPF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jT1;
    private javax.swing.JTextField jT2;
    private javax.swing.JTextField jT3;
    private javax.swing.JTextField jT4;
    private javax.swing.JLabel lVar10;
    private javax.swing.JLabel lVar11;
    private javax.swing.JLabel lVar12;
    private javax.swing.JLabel lVar13;
    private javax.swing.JLabel lVar14;
    private javax.swing.JLabel lVar3;
    private javax.swing.JLabel lVar6;
    private javax.swing.JLabel lVar7;
    private javax.swing.JLabel lVar8;
    private javax.swing.JLabel lVar9;
    // End of variables declaration//GEN-END:variables
}
