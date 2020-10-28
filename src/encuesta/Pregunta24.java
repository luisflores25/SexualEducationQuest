/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuesta;

import Control.controlador;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Home
 */
public class Pregunta24 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Pregunta24
     */
    double puntos;
    controlador c;
    public Pregunta24() {
        c = new controlador();
        String p = c.leer("puntos");
        puntos = Double.parseDouble(p);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        setClosable(true);

        jLabel1.setText("24.- ¿Cuáles son los principales motivos de los embarazos en las adolecentes?");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Baja autoestima");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Falta de educación sobre sexualidad");

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("No sé");

        jButton1.setText("Siguiente Pregunta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Temperamento fuerte");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Falta de comunicación con los padres");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean sel = true;
        if(jRadioButton1.isSelected())
        puntos = puntos + 0;
        else if(jRadioButton2.isSelected())
        puntos = puntos + 1.0;
        else if(jRadioButton3.isSelected())
        puntos = puntos + 0;
        else if(jRadioButton4.isSelected())
        puntos = puntos + 0;
        else if(jRadioButton6.isSelected())
        puntos = puntos + 0;
        else
        sel = false;
        if (sel) {

            // TODO add your handling code here:

            BigDecimal bd = new BigDecimal(puntos);
            bd = bd.setScale(2, RoundingMode.HALF_UP);	// Ponemos 2 decimales
            //System.out.println(bd.doubleValue());
            System.out.println(bd);
            c.guardar("puntos", String.valueOf(bd));
            Pregunta25 abrir= new Pregunta25();
            Principal.jDesktopPane1.add(abrir);
            abrir.show();
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton6;
    // End of variables declaration//GEN-END:variables
}
