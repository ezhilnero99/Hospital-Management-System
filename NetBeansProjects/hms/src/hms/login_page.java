/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.awt.Color;
import java.sql.*;

/**
 *
 * @author ezhilnero
 */
public class login_page extends javax.swing.JFrame {
    //copy this
    static Connection conn = null;
    Statement stmt = null;
    String password_t ;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String conn_str = "jdbc:mysql://localhost:3306/HMS";

    /**
     * Creates new form login_page
     */
    public login_page() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginid = new javax.swing.JTextField();
        submit_btn = new javax.swing.JButton();
        login_hint = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(770, 452));
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 14)); // NOI18N
        jLabel1.setText("Password");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 260, 80, 21);

        jLabel2.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 14)); // NOI18N
        jLabel2.setText("Login");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(290, 160, 50, 21);

        loginid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginidActionPerformed(evt);
            }
        });
        jPanel1.add(loginid);
        loginid.setBounds(240, 200, 280, 29);

        submit_btn.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 13)); // NOI18N
        submit_btn.setText("Submit");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });
        jPanel1.add(submit_btn);
        submit_btn.setBounds(340, 340, 90, 31);

        login_hint.setForeground(new java.awt.Color(255, 0, 0));
        login_hint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(login_hint);
        login_hint.setBounds(208, 379, 360, 20);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(240, 300, 280, 29);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/back2.png"))); // NOI18N
        jLabel6.setText("Login");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 770, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginidActionPerformed

 
    
    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
     try{
        conn = DriverManager.getConnection(conn_str, USERNAME, PASSWORD);
        System.out.println("connected to DB");
        stmt = conn.createStatement();    
     String sql = "SELECT password FROM logindetail where loginid = \""+loginid.getText().toString()+"\";";
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
         password_t = rs.getString("password");
         System.out.println("password is: " + password_t);
      }
      rs.close();
     }catch(Exception e){
         System.out.println("ERROR IS : "+e.toString());
     }
        if(password.getText().equals(password_t))
        {
            if(loginid.getText().contains("recep"))
            {
                super.dispose();
                new receptionist().setVisible(true);
            }
            else if(loginid.getText().contains("depadm"))
            {
                super.dispose();
               new dept_admin().setVisible(true);
            }
            else if(loginid.getText().contains("sysadm"))
            {
                super.dispose();
               new sys_adm_opt().setVisible(true);
            }
            else
            {
                 login_hint.setText("* invalid grade");
            }
        }
        else
        {
            login_hint.setText("* invalid login");
        }
    }//GEN-LAST:event_submit_btnActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_page().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel login_hint;
    public javax.swing.JTextField loginid;
    public javax.swing.JPasswordField password;
    public javax.swing.JButton submit_btn;
    // End of variables declaration//GEN-END:variables
}
