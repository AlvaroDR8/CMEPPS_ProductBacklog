/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package productbacklog;

import java.text.DecimalFormat;

/**
 *
 * @author Aburo Senpai
 */
public class AjusteFinalPF extends javax.swing.JFrame {

    /**
     * Creates new form AjusteFinalPF
     */
    DecimalFormat formato1 = new DecimalFormat("0.00");
    int sva;
    float aux,FA;
    float PFA;
    public AjusteFinalPF(int sva, int PFNA) {
        initComponents();
        setLocationRelativeTo(null);
        lVar8.setText(formato1.format(PFNA));
        this.sva=sva;
        lVar2.setText(formato1.format(sva));
        aux=(this.sva*0.01f);
        FA= 0.65f+aux;
        lVar4.setText(formato1.format(FA));
        lVar9.setText(lVar4.getText());
        PFA=PFNA * FA;
        lVar6.setText(formato1.format(PFA));
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lVar1 = new javax.swing.JLabel();
        lVar4 = new javax.swing.JLabel();
        lVar3 = new javax.swing.JLabel();
        lVar2 = new javax.swing.JLabel();
        lVar5 = new javax.swing.JLabel();
        lVar6 = new javax.swing.JLabel();
        lVar7 = new javax.swing.JLabel();
        lVar8 = new javax.swing.JLabel();
        lVar9 = new javax.swing.JLabel();
        lVar10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculo de Final PF");
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lVar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lVar1.setText(") =");
        getContentPane().add(lVar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 30, -1));

        lVar4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lVar4.setText("0");
        getContentPane().add(lVar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 100, -1));

        lVar3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lVar3.setText("FA = 0.65 + (0.01  *");
        getContentPane().add(lVar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        lVar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lVar2.setText("0");
        getContentPane().add(lVar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 60, -1));

        lVar5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lVar5.setText("*");
        getContentPane().add(lVar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 120, -1, -1));

        lVar6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lVar6.setText("0");
        getContentPane().add(lVar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 80, -1));

        lVar7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lVar7.setText("PFA = ");
        getContentPane().add(lVar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        lVar8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lVar8.setText("0");
        getContentPane().add(lVar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 50, -1));

        lVar9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lVar9.setText("0");
        getContentPane().add(lVar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 50, -1));

        lVar10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lVar10.setText(" =");
        getContentPane().add(lVar10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ISBSG ven = new ISBSG(this.PFA);
        ven.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AjusteFinalPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjusteFinalPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjusteFinalPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjusteFinalPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JLabel lVar1;
    private javax.swing.JLabel lVar10;
    private javax.swing.JLabel lVar2;
    private javax.swing.JLabel lVar3;
    private javax.swing.JLabel lVar4;
    private javax.swing.JLabel lVar5;
    private javax.swing.JLabel lVar6;
    private javax.swing.JLabel lVar7;
    private javax.swing.JLabel lVar8;
    private javax.swing.JLabel lVar9;
    // End of variables declaration//GEN-END:variables
}
