/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.user.login;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author deepal_suranga
 */
public class user_login extends javax.swing.JFrame {

    /**
     * Creates new form user_login
     */
    public user_login() {
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

        Middle = new javax.swing.JPanel();
        Top = new javax.swing.JPanel();
        _lb_user_login_close = new javax.swing.JLabel();
        _lb_user_login_minimice = new javax.swing.JLabel();
        Botom = new javax.swing.JPanel();
        _lb_user_login_userName = new javax.swing.JLabel();
        _tf_user_loging_userName = new javax.swing.JTextField();
        _lb_user_login_password = new javax.swing.JLabel();
        _pf_user_login_password = new javax.swing.JPasswordField();
        _lb_user_login_qrCode = new javax.swing.JLabel();
        _lb_user_login_showPassword = new javax.swing.JLabel();
        _lb_user_login_pin = new javax.swing.JLabel();
        _tf_user_login_pin = new javax.swing.JTextField();
        _lb_user_login_login = new javax.swing.JLabel();
        _lb_user_login_cancel = new javax.swing.JLabel();
        _lb_user_login_seperator = new javax.swing.JLabel();
        _lb_user_login_logo = new javax.swing.JLabel();
        _lb_user_login_forgotPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Middle.setBackground(new java.awt.Color(0, 204, 204));
        Middle.setPreferredSize(new java.awt.Dimension(1370, 770));

        Top.setBackground(new java.awt.Color(0, 124, 171));
        Top.setPreferredSize(new java.awt.Dimension(1366, 60));

        _lb_user_login_close.setBackground(new java.awt.Color(0, 124, 171));
        _lb_user_login_close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        _lb_user_login_close.setForeground(new java.awt.Color(255, 255, 255));
        _lb_user_login_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lb_user_login_close.setText("X");
        _lb_user_login_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _lb_user_login_close.setOpaque(true);
        _lb_user_login_close.setPreferredSize(new java.awt.Dimension(25, 25));
        _lb_user_login_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _lb_user_login_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _lb_user_login_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _lb_user_login_closeMouseExited(evt);
            }
        });

        _lb_user_login_minimice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        _lb_user_login_minimice.setForeground(new java.awt.Color(255, 255, 255));
        _lb_user_login_minimice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lb_user_login_minimice.setText("-");
        _lb_user_login_minimice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _lb_user_login_minimice.setPreferredSize(new java.awt.Dimension(25, 25));
        _lb_user_login_minimice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _lb_user_login_minimiceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _lb_user_login_minimiceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _lb_user_login_minimiceMouseExited(evt);
            }
        });

        javax.swing.GroupLayout TopLayout = new javax.swing.GroupLayout(Top);
        Top.setLayout(TopLayout);
        TopLayout.setHorizontalGroup(
            TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(_lb_user_login_minimice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_user_login_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        TopLayout.setVerticalGroup(
            TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopLayout.createSequentialGroup()
                .addGroup(TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_lb_user_login_close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_lb_user_login_minimice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 35, Short.MAX_VALUE))
        );

        Botom.setBackground(new java.awt.Color(33, 33, 33));
        Botom.setPreferredSize(new java.awt.Dimension(1370, 50));

        javax.swing.GroupLayout BotomLayout = new javax.swing.GroupLayout(Botom);
        Botom.setLayout(BotomLayout);
        BotomLayout.setHorizontalGroup(
            BotomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        BotomLayout.setVerticalGroup(
            BotomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        _lb_user_login_userName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_user_login_userName.setForeground(new java.awt.Color(255, 255, 255));
        _lb_user_login_userName.setText("User Name");

        _tf_user_loging_userName.setPreferredSize(new java.awt.Dimension(300, 40));

        _lb_user_login_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_user_login_password.setForeground(new java.awt.Color(240, 240, 240));
        _lb_user_login_password.setText("Password");

        _pf_user_login_password.setPreferredSize(new java.awt.Dimension(300, 40));

        _lb_user_login_qrCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        _lb_user_login_qrCode.setPreferredSize(new java.awt.Dimension(125, 125));

        _lb_user_login_showPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lb_user_login_showPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenious/www/loging/images/ic_remove_red_eye_white_18dp_1x.png"))); // NOI18N
        _lb_user_login_showPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _lb_user_login_showPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _lb_user_login_showPasswordMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _lb_user_login_showPasswordMouseReleased(evt);
            }
        });

        _lb_user_login_pin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_user_login_pin.setForeground(new java.awt.Color(255, 255, 255));
        _lb_user_login_pin.setText("Enter PIN Code");

        _tf_user_login_pin.setMinimumSize(new java.awt.Dimension(6, 40));
        _tf_user_login_pin.setPreferredSize(new java.awt.Dimension(59, 40));

        _lb_user_login_login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_user_login_login.setForeground(new java.awt.Color(255, 255, 255));
        _lb_user_login_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lb_user_login_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenious/www/loging/images/buton.png"))); // NOI18N
        _lb_user_login_login.setText("Login");
        _lb_user_login_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _lb_user_login_login.setFocusable(false);
        _lb_user_login_login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        _lb_user_login_cancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_user_login_cancel.setForeground(new java.awt.Color(255, 255, 255));
        _lb_user_login_cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lb_user_login_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenious/www/loging/images/buton.png"))); // NOI18N
        _lb_user_login_cancel.setText("Cancel");
        _lb_user_login_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _lb_user_login_cancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _lb_user_login_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _lb_user_login_cancelMouseClicked(evt);
            }
        });

        _lb_user_login_seperator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenious/www/loging/images/Saperate_Bar.png"))); // NOI18N

        _lb_user_login_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenious/www/loging/images/Ramani Accademy 600 x 200.png"))); // NOI18N
        _lb_user_login_logo.setPreferredSize(new java.awt.Dimension(200, 100));

        _lb_user_login_forgotPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_user_login_forgotPassword.setForeground(new java.awt.Color(255, 255, 255));
        _lb_user_login_forgotPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        _lb_user_login_forgotPassword.setText("Forgot Password?");
        _lb_user_login_forgotPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _lb_user_login_forgotPassword.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        _lb_user_login_forgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _lb_user_login_forgotPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _lb_user_login_forgotPasswordMouseExited(evt);
            }
        });

        javax.swing.GroupLayout MiddleLayout = new javax.swing.GroupLayout(Middle);
        Middle.setLayout(MiddleLayout);
        MiddleLayout.setHorizontalGroup(
            MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiddleLayout.createSequentialGroup()
                .addGroup(MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Botom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Top, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE))
                    .addGroup(MiddleLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(_lb_user_login_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(_lb_user_login_seperator)
                        .addGap(18, 18, 18)
                        .addGroup(MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_tf_user_loging_userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_lb_user_login_userName)
                            .addComponent(_lb_user_login_password)
                            .addGroup(MiddleLayout.createSequentialGroup()
                                .addGroup(MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MiddleLayout.createSequentialGroup()
                                        .addComponent(_lb_user_login_qrCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(_lb_user_login_pin)
                                            .addComponent(_tf_user_login_pin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(_pf_user_login_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_lb_user_login_showPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(_lb_user_login_forgotPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(_lb_user_login_cancel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(_lb_user_login_login, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(10, 10, 10))
        );
        MiddleLayout.setVerticalGroup(
            MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiddleLayout.createSequentialGroup()
                .addComponent(Top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MiddleLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(MiddleLayout.createSequentialGroup()
                                .addComponent(_lb_user_login_userName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_tf_user_loging_userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_lb_user_login_password)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(_pf_user_login_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(_lb_user_login_showPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MiddleLayout.createSequentialGroup()
                                        .addComponent(_lb_user_login_qrCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(_lb_user_login_login))
                                    .addGroup(MiddleLayout.createSequentialGroup()
                                        .addComponent(_lb_user_login_pin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(_tf_user_login_pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(_lb_user_login_cancel))
                            .addComponent(_lb_user_login_seperator, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(MiddleLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(_lb_user_login_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_lb_user_login_forgotPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(Botom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(Middle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _lb_user_login_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_closeMouseClicked

        System.exit(0);
        
    }//GEN-LAST:event__lb_user_login_closeMouseClicked
        Border boder=BorderFactory.createLineBorder(Color.WHITE,1);
    private void _lb_user_login_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_closeMouseEntered

        _lb_user_login_close.setBorder(boder);
        _lb_user_login_close.setBackground(Color.red);
        
    }//GEN-LAST:event__lb_user_login_closeMouseEntered

    private void _lb_user_login_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_closeMouseExited
        _lb_user_login_close.setBorder(null);
        _lb_user_login_close.setBackground(new Color(0,124,171));
    }//GEN-LAST:event__lb_user_login_closeMouseExited

    private void _lb_user_login_minimiceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_minimiceMouseEntered

        _lb_user_login_minimice.setBorder(boder);
        
    }//GEN-LAST:event__lb_user_login_minimiceMouseEntered

    private void _lb_user_login_minimiceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_minimiceMouseExited

        _lb_user_login_minimice.setBorder(null);
        
    }//GEN-LAST:event__lb_user_login_minimiceMouseExited

    private void _lb_user_login_minimiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_minimiceMouseClicked

        this.setState(user_login.ICONIFIED);
        
    }//GEN-LAST:event__lb_user_login_minimiceMouseClicked

    private void _lb_user_login_showPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_showPasswordMousePressed
        
        _pf_user_login_password.setEchoChar((char)0);
        
    }//GEN-LAST:event__lb_user_login_showPasswordMousePressed

    private void _lb_user_login_showPasswordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_showPasswordMouseReleased
        
        _pf_user_login_password.setEchoChar('*');
        
    }//GEN-LAST:event__lb_user_login_showPasswordMouseReleased

    private void _lb_user_login_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_cancelMouseClicked
        
        System.exit(0);
        
    }//GEN-LAST:event__lb_user_login_cancelMouseClicked

    private void _lb_user_login_forgotPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_forgotPasswordMouseEntered
       
       _lb_user_login_forgotPassword.setText("<html><u>"+_lb_user_login_forgotPassword.getText()+"</u></html>");
       
    }//GEN-LAST:event__lb_user_login_forgotPasswordMouseEntered

    private void _lb_user_login_forgotPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_forgotPasswordMouseExited

        _lb_user_login_forgotPassword.setText("Forgot Password?");
        
    }//GEN-LAST:event__lb_user_login_forgotPasswordMouseExited

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
            java.util.logging.Logger.getLogger(user_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botom;
    private javax.swing.JPanel Middle;
    private javax.swing.JPanel Top;
    private javax.swing.JLabel _lb_user_login_cancel;
    private javax.swing.JLabel _lb_user_login_close;
    private javax.swing.JLabel _lb_user_login_forgotPassword;
    private javax.swing.JLabel _lb_user_login_login;
    private javax.swing.JLabel _lb_user_login_logo;
    private javax.swing.JLabel _lb_user_login_minimice;
    private javax.swing.JLabel _lb_user_login_password;
    private javax.swing.JLabel _lb_user_login_pin;
    private javax.swing.JLabel _lb_user_login_qrCode;
    private javax.swing.JLabel _lb_user_login_seperator;
    private javax.swing.JLabel _lb_user_login_showPassword;
    private javax.swing.JLabel _lb_user_login_userName;
    private javax.swing.JPasswordField _pf_user_login_password;
    private javax.swing.JTextField _tf_user_login_pin;
    private javax.swing.JTextField _tf_user_loging_userName;
    // End of variables declaration//GEN-END:variables
}
