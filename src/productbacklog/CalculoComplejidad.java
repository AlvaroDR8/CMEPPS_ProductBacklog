/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productbacklog;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author miria
 */
public class CalculoComplejidad extends javax.swing.JFrame {

    private ArrayList<ElementosFuncionales> tElementos;
    //private ArrayList<Complejidad> aC;
    private HashMap<String, Complejidad> mC = new HashMap<>();

    DefaultTableModel complejidad = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    /**
     * Creates new form CalculoComplejidad
     */
    public CalculoComplejidad(ArrayList<ElementosFuncionales> tElementos) {
        initComponents();
        setLocationRelativeTo(null);
        this.tElementos = tElementos;
        this.mC.put("EE", new Complejidad("EE", 0, 0, 0));
        this.mC.put("SE", new Complejidad("SE", 0, 0, 0));
        this.mC.put("FLI", new Complejidad("FLI", 0, 0, 0));
        this.mC.put("FLE", new Complejidad("FLE", 0, 0, 0));
        this.mC.put("CE", new Complejidad("CE", 0, 0, 0));
        DrawingTabla();
    }

    private void DrawingTabla() {

        jTable1.setModel(complejidad);
        String[] col = {"Grupo Lógico","Tipo", "Nº Ficheros", "Nº Datos Elementales", "Complejidad"};
        complejidad.setColumnIdentifiers(col);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(140);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);

        fillTabla();
    }

    private void fillTabla() {

        Object[] columna = new Object[6];
        int n = tElementos.size();
        int nF, nDE;
        String tipo;

        int i = 0;
        while (i < n) {

            tipo = tElementos.get(i).getNomTipoComponente();

            if (tipo.equals("CE")) {

                nF = tElementos.get(i).getnFicheros();
                nDE = tElementos.get(i).getnDatosElementalesEnt();
                int nCS = tElementos.get(i).getnDatosElementalesSal();
                ArrayList<String> s = calculaCompCE(nF, nDE, nCS);
                columna[0] = tElementos.get(i).getNomGrupoLogico();
                columna[1] = tipo;
                columna[2] = nF;
                if (s.get(1).equals("E")) {
                    columna[3] = nDE;
                } else {
                    columna[3] = nCS;
                }

                columna[4] = s.get(0);
                complejidad.addRow(columna);

            } else {

                nF = tElementos.get(i).getnFicheros();
                nDE = tElementos.get(i).getnDatosElementalesEnt();

                columna[0] = tElementos.get(i).getNomGrupoLogico();
                columna[1] = tElementos.get(i).getNomTipoComponente();
                columna[2] = nF;
                columna[3] = nDE;
                columna[4] = calculaComplejidad(nF, nDE, tipo);
                complejidad.addRow(columna);
            }

            i++;
        }

    }

    ArrayList<String> calculaCompCE(int nF, int cE, int cS) {

        ArrayList<String> s = new ArrayList<>();

        String dE = "", dS = "";
        int compE, compS, nse = 0, nme = 0, nce = 0, nss = 0, nms = 0, ncs = 0;

        // Para DE ENTRADA
        if ((nF <= 1 && cE <= 15) || (nF == 2 && cE <= 4)) {
            dE = "S";
            compE = 1;
            nse++;
        } else if ((nF <= 1 && cE >= 16) || (nF >= 3 && cE <= 4) || (nF == 2 && (cE >= 5 && cE <= 15))) {
            dE = "M";
            compE = 2;
            nme++;
        } else {
            dE = "C";
            compE = 3;
            nce++;
        }

        //Para DE SALIDAS
        if ((nF <= 1 && cS <= 19) || ((nF == 2 || nF == 3) && cS <= 5)) {
            dS = "S";
            compS = 1;
            nss++;
        } else if ((nF <= 1 && cS >= 20) || (nF >= 4 && cS <= 5) || ((nF == 2 || nF == 3) && (cS >= 6 && cS <= 19))) {
            dS = "M";
            compS = 2;
            nms++;
        } else {
            dS = "C";
            compS = 3;
            ncs++;
        }

        // Elegimos la complejidad mayor
        Complejidad c = mC.get("CE");

        if (compE >= compS) {
            s.add(dE);
            s.add("E");
            c.setS(c.getS() + nse);
            c.setM(c.getM() + nme);
            c.setC(c.getC() + nce);
        } else {
            s.add(dS);
            s.add("S");
            c.setS(c.getS() + nss);
            c.setM(c.getM() + nms);
            c.setC(c.getC() + ncs);
        }

        mC.put("CE", c);

        return s;

    }

    String calculaComplejidad(int nF, int nDE, String tipo) {

        String s = "";
        int ns = 0, nm = 0, nc = 0;

        if (tipo.equals("EE")) {

            if ((nF <= 1 && nDE <= 15) || (nF == 2 && nDE <= 4)) {
                s = "S";
                ns++;
            } else if ((nF <= 1 && nDE >= 16) || (nF >= 3 && nDE <= 4) || (nF == 2 && (nDE >= 5 && nDE <= 15))) {
                s = "M";
                nm++;
            } else {
                s = "C";
                nc++;
            }

        } else if (tipo.equals("SE")) {

            if ((nF <= 1 && nDE <= 19) || ((nF == 2 || nF == 3) && nDE <= 5)) {
                s = "S";
                ns++;
            } else if ((nF <= 1 && nDE >= 20) || (nF >= 4 && nDE <= 5) || ((nF == 2 || nF == 3) && (nDE >= 6 && nDE <= 19))) {
                s = "M";
                nm++;
            } else {
                s = "C";
                nc++;
            }

        } else {

            if ((nF == 1 && nDE <= 50) || ((nF >= 2 && nF <= 5) && nDE <= 19)) {
                s = "S";
                ns++;
            } else if ((nF == 1 && nDE >= 51) || (nF >= 6 && nDE <= 19) || ((nF >= 2 && nF <= 5) && (nDE >= 20 && nDE <= 50))) {
                s = "M";
                nm++;
            } else {
                s = "C";
                nc++;
            }

        }

        Complejidad c = mC.get(tipo);
        c.setS(c.getS() + ns);
        c.setM(c.getM() + nm);
        c.setC(c.getC() + nc);

        mC.put(tipo, c);

        return s;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculo de Complejidad");
        setMaximumSize(new java.awt.Dimension(550, 309));
        setMinimumSize(new java.awt.Dimension(550, 309));
        setPreferredSize(new java.awt.Dimension(550, 309));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 496, 165));

        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 96, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        CalculoPFNA ven = new CalculoPFNA(mC);
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
            java.util.logging.Logger.getLogger(CalculoComplejidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculoComplejidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculoComplejidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculoComplejidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CalculoComplejidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
