/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;
import hms.login_page;
/**
 *
 * @author ezhilnero
 */
public class home_Screen extends javax.swing.JFrame {

    /**
     * Creates new form home_Screen
     */
    public home_Screen() {
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

        jPanel1 = new javax.swing.JPanel();
        hos_btn = new javax.swing.JButton();
        pharmacy_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 775, 455));
        setPreferredSize(new java.awt.Dimension(770, 455));
        setResizable(false);
        setSize(new java.awt.Dimension(770, 455));

        jPanel1.setLayout(null);

        hos_btn.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 18)); // NOI18N
        hos_btn.setText("Hospital");
        hos_btn.setBorder(null);
        hos_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hos_btnActionPerformed(evt);
            }
        });
        jPanel1.add(hos_btn);
        hos_btn.setBounds(110, 270, 180, 50);

        pharmacy_btn.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 18)); // NOI18N
        pharmacy_btn.setText("Pharmacy");
        pharmacy_btn.setBorder(null);
        pharmacy_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacy_btnActionPerformed(evt);
            }
        });
        jPanel1.add(pharmacy_btn);
        pharmacy_btn.setBounds(470, 270, 180, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/back1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 770, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pharmacy_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacy_btnActionPerformed
        super.dispose();
        new login_page().setVisible(true);
    }//GEN-LAST:event_pharmacy_btnActionPerformed

    private void hos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hos_btnActionPerformed
        super.dispose();
        new login_page().setVisible(true);
    }//GEN-LAST:event_hos_btnActionPerformed

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
            java.util.logging.Logger.getLogger(home_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home_Screen().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton hos_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton pharmacy_btn;
    // End of variables declaration//GEN-END:variables
}
