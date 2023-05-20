/*
 * CalculatorProject-ICT5-2022
 * @AnjaliC,@MalshanS,@BimalkaS,@TharnagaD
 */
package CalculatorUI;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Calculator extends javax.swing.JFrame {
    double num1;
    double num2;
    double tot;
    char operator;
    public Calculator() {
        initComponents();
        power.setBackground(Color.red);
        power.setText("PRESS TO TURN ON");
        off();
        normalmode();
        welcome.setVisible(false);
    }
    public void on()
    {
        number1.setEnabled(true);
        number2.setEnabled(true);
        number3.setEnabled(true);
        number4.setEnabled(true);
        number5.setEnabled(true);
        number6.setEnabled(true);
        number7.setEnabled(true);
        number8.setEnabled(true);
        number9.setEnabled(true);
        number0.setEnabled(true);
        dot.setEnabled(true);
        equal.setEnabled(true);
        backspace.setEnabled(true);
        plus.setEnabled(true);
        minus.setEnabled(true);
        divide.setEnabled(true);
        multiply.setEnabled(true);
        clear.setEnabled(true);
        display.setEnabled(true);
        label.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        modeswitch.setEnabled(true);
        jButton7.setEnabled(true);
        testanimation();
        
    }
    public void off()
    {
        number1.setEnabled(false);
        number2.setEnabled(false);
        number3.setEnabled(false);
        number4.setEnabled(false);
        number5.setEnabled(false);
        number6.setEnabled(false);
        number7.setEnabled(false);
        number8.setEnabled(false);
        number9.setEnabled(false);
        number0.setEnabled(false);
        dot.setEnabled(false);
        equal.setEnabled(false);
        backspace.setEnabled(false);
        plus.setEnabled(false);
        minus.setEnabled(false);
        divide.setEnabled(false);
        multiply.setEnabled(false);
        clear.setEnabled(false);
        display.setEnabled(false);
        label.setEnabled(false);
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        modeswitch.setEnabled(false);
        jButton7.setEnabled(false);
    }
    public void normalmode()
    {
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        plus.setVisible(true);
        minus.setVisible(true);
        multiply.setVisible(true);
        divide.setVisible(true);
        equal.setVisible(true);
        modeswitch.setBackground(Color.orange);
        modeswitch.setText("Advanced Mode");
    }
    public void advancedmode()
    {
        testanimationAdvanced();
        plus.setVisible(false);
        minus.setVisible(false);
        multiply.setVisible(false);
        divide.setVisible(false);
        equal.setVisible(false);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(true);
        modeswitch.setBackground(Color.green);
        modeswitch.setText("Normal Mode");
    }
    public void testanimation()
    {
        welcome.setVisible(true);
        final int max_x=390;
        final int min_x=50;
        Thread animation = new Thread(new Runnable() {
            @Override
            public void run() {
                int x=180;
                int y=20;// Starting Position
                boolean checked=true;
                while(true)
                {
                    if(checked)
                    {
                    welcome.setLocation(x,y);
                    x+=10;
                    }
                    if(x>max_x)
                    {
                        checked=false;
                        welcome.setVisible(false);
                      //  welcome.setLocation(180,20);
                    }
                    if(x<min_x)
                    {
                        checked=true;
                    }
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                }
            }
        });
        animation.start();
       // welcome.setLocation(180,20);
    }
    public void testanimationAdvanced()
    {
        welcome.setText("Advanced");
        welcome.setVisible(true);
        final int max_x=390;
        final int min_x=50;
        Thread animation = new Thread(new Runnable() {
            @Override
            public void run() {
                int x=180;
                int y=20;// Starting Position
                boolean checked=true;
                while(true)
                {
                    if(checked)
                    {
                    welcome.setLocation(x,y);
                    x+=10;
                    }
                    if(x>max_x)
                    {
                        checked=false;
                        welcome.setVisible(false);
                      //  welcome.setLocation(180,20);
                    }
                    if(x<min_x)
                    {
                        checked=true;
                    }
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                }
            }
        });
        animation.start();
       // welcome.setLocation(180,20);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        display = new javax.swing.JTextField();
        number1 = new javax.swing.JButton();
        number4 = new javax.swing.JButton();
        number7 = new javax.swing.JButton();
        number2 = new javax.swing.JButton();
        number5 = new javax.swing.JButton();
        number8 = new javax.swing.JButton();
        number3 = new javax.swing.JButton();
        number6 = new javax.swing.JButton();
        number9 = new javax.swing.JButton();
        number0 = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        power = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        modeswitch = new javax.swing.JToggleButton();
        backspace = new javax.swing.JButton();
        backgroundimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                windowopened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcome.setBackground(new java.awt.Color(0, 0, 0));
        welcome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        welcome.setForeground(new java.awt.Color(51, 255, 0));
        welcome.setText("Welcome");
        jPanel1.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 90, 50));

        display.setBackground(new java.awt.Color(0, 0, 0));
        display.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        display.setForeground(new java.awt.Color(51, 255, 0));
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        jPanel1.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 290, 50));

        number1.setBackground(new java.awt.Color(255, 255, 255));
        number1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number1.setText("1");
        number1.setBorder(null);
        number1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                number1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                number1MouseExited(evt);
            }
        });
        number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });
        jPanel1.add(number1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 50, 60));

        number4.setBackground(new java.awt.Color(255, 255, 255));
        number4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number4.setText("4");
        number4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                number4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                number4MouseExited(evt);
            }
        });
        number4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number4ActionPerformed(evt);
            }
        });
        jPanel1.add(number4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 50, 60));

        number7.setBackground(new java.awt.Color(255, 255, 255));
        number7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number7.setText("7");
        number7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                number7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                number7MouseExited(evt);
            }
        });
        number7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number7ActionPerformed(evt);
            }
        });
        jPanel1.add(number7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 50, 50));

        number2.setBackground(new java.awt.Color(255, 255, 255));
        number2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number2.setText("2");
        number2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                number2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                number2MouseExited(evt);
            }
        });
        number2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });
        jPanel1.add(number2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 50, 60));

        number5.setBackground(new java.awt.Color(255, 255, 255));
        number5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number5.setText("5");
        number5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                number5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                number5MouseExited(evt);
            }
        });
        number5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number5ActionPerformed(evt);
            }
        });
        jPanel1.add(number5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 50, 60));

        number8.setBackground(new java.awt.Color(255, 255, 255));
        number8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number8.setText("8");
        number8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                number8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                number8MouseExited(evt);
            }
        });
        number8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number8ActionPerformed(evt);
            }
        });
        jPanel1.add(number8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 50, 50));

        number3.setBackground(new java.awt.Color(255, 255, 255));
        number3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number3.setText("3");
        number3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                number3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                number3MouseExited(evt);
            }
        });
        number3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number3ActionPerformed(evt);
            }
        });
        jPanel1.add(number3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 50, 60));

        number6.setBackground(new java.awt.Color(255, 255, 255));
        number6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number6.setText("6");
        number6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                number6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                number6MouseExited(evt);
            }
        });
        number6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number6ActionPerformed(evt);
            }
        });
        jPanel1.add(number6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 50, 60));

        number9.setBackground(new java.awt.Color(255, 255, 255));
        number9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number9.setText("9");
        number9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                number9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                number9MouseExited(evt);
            }
        });
        number9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number9ActionPerformed(evt);
            }
        });
        jPanel1.add(number9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 50, 50));

        number0.setBackground(new java.awt.Color(255, 255, 255));
        number0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number0.setText("0");
        number0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                number0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                number0MouseExited(evt);
            }
        });
        number0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number0ActionPerformed(evt);
            }
        });
        jPanel1.add(number0, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 50, 50));

        dot.setBackground(new java.awt.Color(255, 255, 255));
        dot.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dot.setText(".");
        dot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dotMouseExited(evt);
            }
        });
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });
        jPanel1.add(dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 50, 50));

        plus.setBackground(new java.awt.Color(255, 255, 255));
        plus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        plus.setText("+");
        plus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plusMouseExited(evt);
            }
        });
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        jPanel1.add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 60, 60));

        equal.setBackground(new java.awt.Color(255, 255, 255));
        equal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        equal.setText("=");
        equal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                equalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                equalMouseExited(evt);
            }
        });
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });
        jPanel1.add(equal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 70, 50));

        minus.setBackground(new java.awt.Color(255, 255, 255));
        minus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minus.setText("-");
        minus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minusMouseExited(evt);
            }
        });
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        jPanel1.add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 60, 60));

        multiply.setBackground(new java.awt.Color(255, 255, 255));
        multiply.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        multiply.setText("*");
        multiply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                multiplyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                multiplyMouseExited(evt);
            }
        });
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });
        jPanel1.add(multiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 60, 50));

        divide.setBackground(new java.awt.Color(255, 255, 255));
        divide.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        divide.setText("/");
        divide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                divideMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                divideMouseExited(evt);
            }
        });
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });
        jPanel1.add(divide, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 60, 50));

        power.setBackground(new java.awt.Color(255, 255, 255));
        power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerActionPerformed(evt);
            }
        });
        jPanel1.add(power, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 160, 50));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Square Root");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 40));

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
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
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 120, 50));

        label.setBackground(new java.awt.Color(255, 255, 255));
        label.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 84, 220, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Square");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Km to mi");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 120, 40));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("mi to Km");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 120, 40));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Age");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 120, 60));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("cm to inch");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 120, 40));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setText("Days");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 120, 50));

        modeswitch.setBackground(new java.awt.Color(255, 255, 255));
        modeswitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeswitchActionPerformed(evt);
            }
        });
        jPanel1.add(modeswitch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, 30));

        backspace.setBackground(new java.awt.Color(255, 255, 255));
        backspace.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backspace.setText("<x");
        backspace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backspaceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backspaceMouseExited(evt);
            }
        });
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });
        jPanel1.add(backspace, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 80, 60, 30));

        backgroundimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/pexels-laura-tancredi-7078052.jpg"))); // NOI18N
        jPanel1.add(backgroundimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 497, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1ActionPerformed
        display.setText(display.getText()+"1");
        label.setText(label.getText()+"1");
    }//GEN-LAST:event_number1ActionPerformed

    private void number4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number4ActionPerformed
        display.setText(display.getText()+"4");
        label.setText(label.getText()+"4");
    }//GEN-LAST:event_number4ActionPerformed

    private void number7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number7ActionPerformed
        display.setText(display.getText()+"7");
        label.setText(label.getText()+"7");
    }//GEN-LAST:event_number7ActionPerformed

    private void number8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number8ActionPerformed
        display.setText(display.getText()+"8");
        label.setText(label.getText()+"8");
    }//GEN-LAST:event_number8ActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        num2=Double.parseDouble(display.getText());
        if(operator=='+')
        {
            tot=num1+num2;
        }
        else if(operator=='-')
        {
            tot=num1-num2;
        }
        else if(operator=='*')
        {
            tot=num1*num2;
        }
        else
        {
            tot=num1/num2;
        }
        
        display.setText(Double.toString(tot));
        label.setText(label.getText()+"="+tot);
    }//GEN-LAST:event_equalActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        StringBuilder s = new StringBuilder(display.getText());
        s=s.deleteCharAt(display.getText().length()-1);
        display.setText(s.toString());
        StringBuilder sb = new StringBuilder(label.getText());
        sb=sb.deleteCharAt(label.getText().length()-1);
        label.setText(sb.toString());
    }//GEN-LAST:event_backspaceActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        num1=Double.parseDouble(display.getText());
        display.setText("");
        label.setText(label.getText()+"-");
        operator='-';
    }//GEN-LAST:event_minusActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        num1=Double.parseDouble(display.getText());
        display.setText("");
        label.setText(label.getText()+"*");
        operator='*';
    }//GEN-LAST:event_multiplyActionPerformed

    private void number9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number9ActionPerformed
        display.setText(display.getText()+"9");
        label.setText(label.getText()+"9");
    }//GEN-LAST:event_number9ActionPerformed

    private void number2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number2ActionPerformed
        display.setText(display.getText()+"2");
        label.setText(label.getText()+"2");
    }//GEN-LAST:event_number2ActionPerformed

    private void number3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number3ActionPerformed
        display.setText(display.getText()+"3");
        label.setText(label.getText()+"3");
    }//GEN-LAST:event_number3ActionPerformed

    private void number5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number5ActionPerformed
        display.setText(display.getText()+"5");
        label.setText(label.getText()+"5");
    }//GEN-LAST:event_number5ActionPerformed

    private void number6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number6ActionPerformed
        display.setText(display.getText()+"6");
        label.setText(label.getText()+"6");
    }//GEN-LAST:event_number6ActionPerformed

    private void number0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number0ActionPerformed
        display.setText(display.getText()+"0");
        label.setText(label.getText()+"0");
    }//GEN-LAST:event_number0ActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        display.setText(display.getText()+".");
        label.setText(label.getText()+".");
    }//GEN-LAST:event_dotActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        int x=JOptionPane.showConfirmDialog(null,"Are you sure you want to clear all fields?","Clear",JOptionPane.YES_NO_OPTION);
        if(x==0)
        {
            display.setText("");
            label.setText("");
        }
    }//GEN-LAST:event_clearActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        num1=Double.parseDouble(display.getText());
        display.setText("");
        label.setText(label.getText()+"+");
        operator='+';
    }//GEN-LAST:event_plusActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        num1=Double.parseDouble(display.getText());
        display.setText("");
        label.setText(label.getText()+"/");
        operator='/';
    }//GEN-LAST:event_divideActionPerformed

    private void powerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerActionPerformed
        if(power.isSelected())
        {
            power.setBackground(Color.green);
            power.setText("PRESS TO TURN OFF");
            on();
            testanimation();
        }
        else
        {
            power.setBackground(Color.red);
            power.setText("PRESS TO TURN ON");
            off();
        }
    }//GEN-LAST:event_powerActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        num1=Double.parseDouble(display.getText());
        double d=num1/2.54;
        display.setText(Double.toString(d));
        label.setText("Converted  inches to Cm.");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        num1=Double.parseDouble(display.getText());
        double d=Math.sqrt(num1);
        display.setText(Double.toString(d));
        label.setText("Square root is calculated.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        num1=Double.parseDouble(display.getText());
        double d=num1*num1;
        display.setText(Double.toString(d));
        label.setText("Square is calculated.");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        num1=Double.parseDouble(display.getText());
        double d=num1/1.609;
        display.setText(Double.toString(d));
        label.setText("Converted Kilometers to Miles");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        num1=Double.parseDouble(display.getText());
        double d=num1*1.609;
        display.setText(Double.toString(d));
        label.setText("Converted Miles to Kilometers");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int x=JOptionPane.showConfirmDialog(null,"Do you want to switch to age calculator?","Switch to Age Calculator",JOptionPane.YES_NO_OPTION);
        if(x==0)
        {
        AgeCalculator ag = new AgeCalculator();
        ag.setVisible(true);
        this.setVisible(false);
        this.dispose();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void modeswitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeswitchActionPerformed
        if(modeswitch.isSelected())
        {
            normalmode();
        }
        else
        {
            advancedmode();
        }
    }//GEN-LAST:event_modeswitchActionPerformed

    private void number1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number1MouseEntered
        number1.setBackground(Color.green);
    }//GEN-LAST:event_number1MouseEntered

    private void number1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number1MouseExited
        number1.setBackground(Color.white);
    }//GEN-LAST:event_number1MouseExited

    private void number2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number2MouseEntered
        number2.setBackground(Color.green);
    }//GEN-LAST:event_number2MouseEntered

    private void number2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number2MouseExited
        number2.setBackground(Color.white);
    }//GEN-LAST:event_number2MouseExited

    private void number3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number3MouseEntered
        number3.setBackground(Color.green);
    }//GEN-LAST:event_number3MouseEntered

    private void number3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number3MouseExited
        number3.setBackground(Color.white);
    }//GEN-LAST:event_number3MouseExited

    private void number4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number4MouseEntered
        number4.setBackground(Color.green);
    }//GEN-LAST:event_number4MouseEntered

    private void number4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number4MouseExited
        number4.setBackground(Color.white);
    }//GEN-LAST:event_number4MouseExited

    private void number5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number5MouseEntered
        number5.setBackground(Color.green);
    }//GEN-LAST:event_number5MouseEntered

    private void number5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number5MouseExited
        number5.setBackground(Color.white);
    }//GEN-LAST:event_number5MouseExited

    private void number6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number6MouseEntered
        number6.setBackground(Color.green);
    }//GEN-LAST:event_number6MouseEntered

    private void number6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number6MouseExited
        number6.setBackground(Color.white);
    }//GEN-LAST:event_number6MouseExited

    private void number7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number7MouseEntered
        number7.setBackground(Color.green);
    }//GEN-LAST:event_number7MouseEntered

    private void number7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number7MouseExited
       number7.setBackground(Color.white);
    }//GEN-LAST:event_number7MouseExited

    private void number8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number8MouseEntered
        number8.setBackground(Color.green);
    }//GEN-LAST:event_number8MouseEntered

    private void number9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number9MouseEntered
        number9.setBackground(Color.green);
    }//GEN-LAST:event_number9MouseEntered

    private void number0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number0MouseEntered
        number0.setBackground(Color.green);
    }//GEN-LAST:event_number0MouseEntered

    private void number9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number9MouseExited
        number9.setBackground(Color.white);
    }//GEN-LAST:event_number9MouseExited

    private void number0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number0MouseExited
        number0.setBackground(Color.white);
    }//GEN-LAST:event_number0MouseExited

    private void dotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotMouseEntered
        dot.setBackground(Color.green);
    }//GEN-LAST:event_dotMouseEntered

    private void dotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotMouseExited
        dot.setBackground(Color.white);
    }//GEN-LAST:event_dotMouseExited

    private void equalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalMouseEntered
       equal.setBackground(Color.yellow);
    }//GEN-LAST:event_equalMouseEntered

    private void equalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalMouseExited
        equal.setBackground(Color.white);
    }//GEN-LAST:event_equalMouseExited

    private void backspaceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backspaceMouseEntered
       backspace.setBackground(Color.orange);
    }//GEN-LAST:event_backspaceMouseEntered

    private void backspaceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backspaceMouseExited
       backspace.setBackground(Color.white);
    }//GEN-LAST:event_backspaceMouseExited

    private void plusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusMouseEntered
        plus.setBackground(Color.orange);
    }//GEN-LAST:event_plusMouseEntered

    private void plusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusMouseExited
        plus.setBackground(Color.white);
    }//GEN-LAST:event_plusMouseExited

    private void minusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMouseEntered
       minus.setBackground(Color.orange);
    }//GEN-LAST:event_minusMouseEntered

    private void minusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMouseExited
        minus.setBackground(Color.white);
    }//GEN-LAST:event_minusMouseExited

    private void multiplyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplyMouseEntered
     multiply.setBackground(Color.orange);
    }//GEN-LAST:event_multiplyMouseEntered

    private void multiplyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplyMouseExited
        multiply.setBackground(Color.white);
    }//GEN-LAST:event_multiplyMouseExited

    private void divideMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divideMouseEntered
        divide.setBackground(Color.orange);
    }//GEN-LAST:event_divideMouseEntered

    private void divideMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divideMouseExited
        divide.setBackground(Color.white);
    }//GEN-LAST:event_divideMouseExited

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        clear.setBackground(Color.red);
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        clear.setBackground(Color.white);
    }//GEN-LAST:event_clearMouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(Color.orange);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(Color.white);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
       jButton2.setBackground(Color.orange);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(Color.white);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
       jButton3.setBackground(Color.orange);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBackground(Color.white);
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setBackground(Color.orange);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
       jButton4.setBackground(Color.white);
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
      jButton6.setBackground(Color.orange);
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        jButton6.setBackground(Color.white);
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        jButton5.setBackground(Color.orange);
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
       jButton5.setBackground(Color.white);                                
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
       jButton7.setBackground(Color.orange);
    }//GEN-LAST:event_jButton7MouseEntered

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

    private void windowopened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_windowopened
        
    }//GEN-LAST:event_windowopened

    private void number8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number8MouseExited
        number8.setBackground(Color.white);
    }//GEN-LAST:event_number8MouseExited

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        jButton7.setBackground(Color.white);
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Dayscalculator d = new Dayscalculator();
        d.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundimage;
    private javax.swing.JButton backspace;
    private javax.swing.JButton clear;
    private javax.swing.JTextField display;
    private javax.swing.JButton divide;
    private javax.swing.JButton dot;
    private javax.swing.JButton equal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JButton minus;
    private javax.swing.JToggleButton modeswitch;
    private javax.swing.JButton multiply;
    private javax.swing.JButton number0;
    private javax.swing.JButton number1;
    private javax.swing.JButton number2;
    private javax.swing.JButton number3;
    private javax.swing.JButton number4;
    private javax.swing.JButton number5;
    private javax.swing.JButton number6;
    private javax.swing.JButton number7;
    private javax.swing.JButton number8;
    private javax.swing.JButton number9;
    private javax.swing.JButton plus;
    private javax.swing.JToggleButton power;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
