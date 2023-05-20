/*
 * CalculatorProject-ICT5-2022
 * @AnjaliC,@MalshanS,@BimalkaS,@TharnagaD
 */
package CalculatorUI;

import java.awt.Color;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public class AgeCalculator extends javax.swing.JFrame {

    /**
     * Creates new form AgeCalculator
     */
    public AgeCalculator() {
        initComponents();
        jPanel2.setVisible(false);
        clear.setVisible(false);
    }
       
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        by = new javax.swing.JTextField();
        bm = new javax.swing.JTextField();
        bd = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        calculate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        sy = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sm = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sd = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        backgroundimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Age Calculator");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Year");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Month");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 154, 100, 20));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back to Calculator");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, -1));

        by.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        by.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                byMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                byMouseExited(evt);
            }
        });
        jPanel1.add(by, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 90, -1));

        bm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bmMouseExited(evt);
            }
        });
        jPanel1.add(bm, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 90, -1));

        bd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bdMouseExited(evt);
            }
        });
        jPanel1.add(bd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 90, -1));

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clear.setText("Clear");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 80, -1));

        calculate.setBackground(new java.awt.Color(255, 255, 255));
        calculate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        calculate.setText("Calculate Age");
        calculate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calculateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calculateMouseExited(evt);
            }
        });
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        jPanel1.add(calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("            Your age is");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        sy.setBackground(new java.awt.Color(0, 0, 0));
        sy.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sy.setForeground(new java.awt.Color(255, 0, 51));
        sy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(sy, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 50, 59, 37));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("years");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 50, 42, 37));

        sm.setBackground(new java.awt.Color(0, 0, 0));
        sm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sm.setForeground(new java.awt.Color(255, 0, 51));
        sm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(sm, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 98, 59, 34));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Months");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 98, -1, 34));

        sd.setBackground(new java.awt.Color(0, 0, 0));
        sd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sd.setForeground(new java.awt.Color(255, 0, 51));
        sd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(sd, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 143, 59, 32));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("            Your age is");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 140, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Days");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 143, 42, 32));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ta2.jpg"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 220, 240));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 220, 230));

        backgroundimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/IMG-20220807-WA0016.jpg"))); // NOI18N
        backgroundimage.setText("You are");
        jPanel1.add(backgroundimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int x= JOptionPane.showConfirmDialog(null,"Do you want to Switch to calculator?","Switch to Calculator",JOptionPane.YES_NO_OPTION);
       if(x==0)
       {
           Calculator c = new Calculator();
           c.setVisible(true);
           this.setVisible(false);
           this.dispose();
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        int byy=Integer.parseInt(by.getText());
        int bmm=Integer.parseInt(bm.getText());
        int bdd=Integer.parseInt(bd.getText());
        LocalDate today= LocalDate.now();
        LocalDate birthdate=LocalDate.of(byy, bmm, bdd);
        int yrs = Period.between(birthdate, today).getYears();
        int mts = Period.between(birthdate, today).getMonths();
        int ds = Period.between(birthdate, today).getDays();
        jPanel2.setVisible(true);
        calculate.setEnabled(false);
        clear.setVisible(true);
        clear.setText("Reset");
        sy.setText(Integer.toString(yrs));
        sm.setText(Integer.toString(mts));
        sd.setText(Integer.toString(ds));
    }//GEN-LAST:event_calculateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        by.setText("");
        bd.setText("");
        bm.setText("");
        jPanel2.setVisible(false);
        calculate.setEnabled(true);
        clear.setVisible(false);
    }//GEN-LAST:event_clearActionPerformed

    private void calculateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateMouseEntered
       calculate.setBackground(Color.red);
    }//GEN-LAST:event_calculateMouseEntered

    private void calculateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateMouseExited
        calculate.setBackground(Color.white);
    }//GEN-LAST:event_calculateMouseExited

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        clear.setBackground(Color.red);
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        clear.setBackground(Color.white);
    }//GEN-LAST:event_clearMouseExited

    private void byMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_byMouseEntered
        jLabel2.setText("Enter Year");
    }//GEN-LAST:event_byMouseEntered

    private void byMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_byMouseExited
        jLabel2.setText("Year");
    }//GEN-LAST:event_byMouseExited

    private void bmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bmMouseEntered
        jLabel1.setText("Enter Month");
    }//GEN-LAST:event_bmMouseEntered

    private void bmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bmMouseExited
        jLabel1.setText("Month");
    }//GEN-LAST:event_bmMouseExited

    private void bdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdMouseEntered
        jLabel3.setText("Enter Date");
    }//GEN-LAST:event_bdMouseEntered

    private void bdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdMouseExited
        jLabel3.setText("Date");
    }//GEN-LAST:event_bdMouseExited

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
            java.util.logging.Logger.getLogger(AgeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgeCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundimage;
    private javax.swing.JTextField bd;
    private javax.swing.JTextField bm;
    private javax.swing.JTextField by;
    private javax.swing.JButton calculate;
    private javax.swing.JButton clear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel sd;
    private javax.swing.JLabel sm;
    private javax.swing.JLabel sy;
    // End of variables declaration//GEN-END:variables
}
