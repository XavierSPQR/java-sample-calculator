/*
 * CalculatorProject-ICT5-2022
 * @AnjaliC,@MalshanS,@BimalkaS,@TharnagaD
 */
package CalculatorUI;
import java.awt.Color;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;
/**
 *
 * @author TharangaD
 */
public class Dayscalculator extends javax.swing.JFrame {

    /**
     * Creates new form Dayscalculator
     */
    public Dayscalculator() {
        initComponents();
        clear.setVisible(false);
        jTextField7.setVisible(false);
        clear.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        yf = new javax.swing.JTextField();
        mf = new javax.swing.JTextField();
        df = new javax.swing.JTextField();
        yt = new javax.swing.JTextField();
        mt = new javax.swing.JTextField();
        dt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Days Calculator");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("From");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 40));

        yf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        yf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yfMouseClicked(evt);
            }
        });
        yf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yfActionPerformed(evt);
            }
        });
        jPanel1.add(yf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, 30));

        mf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mfMouseClicked(evt);
            }
        });
        mf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mfActionPerformed(evt);
            }
        });
        jPanel1.add(mf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 80, 30));

        df.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        df.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dfMouseClicked(evt);
            }
        });
        jPanel1.add(df, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 80, 30));

        yt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        yt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ytMouseClicked(evt);
            }
        });
        jPanel1.add(yt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 80, 30));

        mt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mtMouseClicked(evt);
            }
        });
        jPanel1.add(mt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 80, 30));

        dt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dtMouseClicked(evt);
            }
        });
        jPanel1.add(dt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 80, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("  Days");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 280, 70, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  Years");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 70, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("To");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 60, 20));

        clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 100, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back to Calculator");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, -1));

        jTextField7.setBackground(new java.awt.Color(0, 0, 0));
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(51, 204, 0));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 230, 50));

        calculate.setBackground(new java.awt.Color(255, 255, 255));
        calculate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        calculate.setText("Calculate");
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
        jPanel1.add(calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 325, 130, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  Months");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 70, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/IMG-20220807-WA0021.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 485));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mfActionPerformed

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
        int yfr = Integer.parseInt(yf.getText());
        int mfr = Integer.parseInt(mf.getText());
        int dfr = Integer.parseInt(df.getText());
        int yto = Integer.parseInt(yt.getText());
        int mto = Integer.parseInt(mt.getText());
        int dto = Integer.parseInt(dt.getText());
        LocalDate from=LocalDate.of(yfr,mfr,dfr);
        LocalDate to=LocalDate.of(yto,mto,dto);
        String year=Integer.toString(Period.between(from, to).getYears());
        String month=Integer.toString(Period.between(from, to).getMonths());
        String date=Integer.toString(Period.between(from, to).getDays());
        jTextField7.setText(year+" Years "+month+" Months "+date+" Days");
        calculate.setEnabled(false);
         jTextField7.setVisible(true);
        clear.setVisible(true);
    }//GEN-LAST:event_calculateActionPerformed

    private void yfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yfActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        yf.setText("");
        mf.setText("");
        df.setText("");
        yt.setText("");
        mt.setText("");
        dt.setText("");
        jTextField7.setText("");
        jTextField7.setVisible(false);
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

    private void yfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yfMouseClicked
        yf.setBackground(Color.black);
        yf.setForeground(Color.green);
    }//GEN-LAST:event_yfMouseClicked

    private void mfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mfMouseClicked
        mf.setBackground(Color.black);
        mf.setForeground(Color.green);
    }//GEN-LAST:event_mfMouseClicked

    private void dfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dfMouseClicked
        df.setBackground(Color.black);
        df.setForeground(Color.green);
    }//GEN-LAST:event_dfMouseClicked

    private void ytMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ytMouseClicked
        yt.setBackground(Color.black);
        yt.setForeground(Color.green);
    }//GEN-LAST:event_ytMouseClicked

    private void mtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mtMouseClicked
        mt.setBackground(Color.black);
        mt.setForeground(Color.green);
    }//GEN-LAST:event_mtMouseClicked

    private void dtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dtMouseClicked
        dt.setBackground(Color.black);
        dt.setForeground(Color.green);
    }//GEN-LAST:event_dtMouseClicked

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
            java.util.logging.Logger.getLogger(Dayscalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dayscalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dayscalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dayscalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dayscalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton calculate;
    private javax.swing.JButton clear;
    private javax.swing.JTextField df;
    private javax.swing.JTextField dt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField mf;
    private javax.swing.JTextField mt;
    private javax.swing.JTextField yf;
    private javax.swing.JTextField yt;
    // End of variables declaration//GEN-END:variables
}
