
package com.shivekyle.email;
/**
 *
 * @author shive
 */
public class EmailMainGUI extends javax.swing.JFrame {

    /**
     * Creates new form EmailMainGUI
     */
    public EmailMainGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        to_textField = new javax.swing.JTextField();
        sub_textField = new javax.swing.JTextField();
        textArea = new javax.swing.JScrollPane();
        message_field = new javax.swing.JTextArea();
        jLabel_close = new javax.swing.JLabel();
        jLabel_send = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(630, 450));
        setMinimumSize(new java.awt.Dimension(630, 450));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        to_textField.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        to_textField.setForeground(new java.awt.Color(255, 255, 255));
        to_textField.setBorder(null);
        to_textField.setCaretColor(new java.awt.Color(255, 255, 255));
        to_textField.setOpaque(false);
        getContentPane().add(to_textField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 550, 30));

        sub_textField.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        sub_textField.setForeground(new java.awt.Color(255, 255, 255));
        sub_textField.setBorder(null);
        sub_textField.setCaretColor(new java.awt.Color(255, 255, 255));
        sub_textField.setOpaque(false);
        getContentPane().add(sub_textField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 550, 30));

        textArea.setBorder(null);
        textArea.setViewportBorder(null);

        message_field.setBackground(new java.awt.Color(212, 106, 106));
        message_field.setColumns(20);
        message_field.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        message_field.setForeground(new java.awt.Color(255, 255, 255));
        message_field.setRows(5);
        message_field.setBorder(null);
        message_field.setCaretColor(java.awt.Color.white);
        message_field.setOpaque(true);
        textArea.setViewportView(message_field);

        getContentPane().add(textArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 550, 180));

        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseReleased(evt);
            }
        });
        getContentPane().add(jLabel_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 30, 30));

        jLabel_send.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel_sendMouseReleased(evt);
            }
        });
        getContentPane().add(jLabel_send, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 80, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kyleshive/images/Email_Sender.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        setLocation(new java.awt.Point(500, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_closeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseReleased
        System.exit(0);
        // end program
    }//GEN-LAST:event_jLabel_closeMouseReleased

    private void jLabel_sendMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_sendMouseReleased
        SendEmail SE = new SendEmail(to_textField.getText(), sub_textField.getText(),message_field.getText() );
    }//GEN-LAST:event_jLabel_sendMouseReleased

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmailMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmailMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmailMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmailMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmailMainGUI().setVisible(true);
                new LoginGUI().setVisible(true); // opens the login GUI
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_send;
    private javax.swing.JTextArea message_field;
    private javax.swing.JTextField sub_textField;
    private javax.swing.JScrollPane textArea;
    private javax.swing.JTextField to_textField;
    // End of variables declaration//GEN-END:variables
}
