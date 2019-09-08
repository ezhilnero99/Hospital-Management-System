/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import static hms.doct_dep_details.conn;
import java.awt.Color;
import java.sql.*;

/**
 *
 * @author ezhilnero
 */
public class doctor_avail extends javax.swing.JFrame {

    /**
     * Creates new form doctor_avail
     */
    public static String dname;
    public static int did;
    String dept;
    int allot;
    int flag;
    int allot_count;
    
    static Connection conn = null;
    Statement stmt = null;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String conn_str = "jdbc:mysql://localhost:3306/HMS";
    
    int t1;
    int t2;
    int t3;
    int t4;
    int t5;
    int t6;
    int t7;
    int t8;
    int t9;
    int t10;
    int t11;
    int t12;
    int t13;
    int t14;
    int t15;
    int t16;
    int t17;
    int t18;  
    
    
    public doctor_avail() {
        initComponents();
    }
    public doctor_avail(String dname) {
        this.dname = dname;
        initComponents();
        dname_tf.setText("DR."+dname);
        try{
      conn = DriverManager.getConnection(conn_str, USERNAME, PASSWORD);
      System.out.println("connected to DB");      
      stmt = conn.createStatement();
      String sql = "SELECT d_id,dept,allot FROM doctor where d_name =\"DR."+this.dname+"\";";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){
        did = rs.getInt("d_id");
        dept = rs.getString("dept");
        allot = rs.getInt("allot");
      }
      did_tf.setText(String.valueOf(did));
      dept_tf.setText(dept);
      allot_tf.setText(String.valueOf(allot));
      sql = "SELECT 10_1030,1030_11,11_1130,1130_12,1_130,130_2,2_230,230_3,3_330,330_4,4_430,430_5,5_530,530_6,6_630,630_7,7_730,730_8 from allotment where a_id ="+did+";";
      rs = stmt.executeQuery(sql);
      while(rs.next()){
        t1 = rs.getInt("10_1030");
        t2 = rs.getInt("1030_11");
        t3 = rs.getInt("11_1130");
        t4 = rs.getInt("1130_12");
        t5 = rs.getInt("1_130");
        t6 = rs.getInt("130_2");
        t7 = rs.getInt("2_230");
        t8 = rs.getInt("230_3");
        t9 = rs.getInt("3_330");
        t10 = rs.getInt("330_4");
        t11 = rs.getInt("4_430");
        t12 = rs.getInt("430_5");
        t13 = rs.getInt("5_530");
        t14 = rs.getInt("530_6");
        t15 = rs.getInt("6_630");
        t16 = rs.getInt("630_7");
        t17 = rs.getInt("7_730");
        t18 = rs.getInt("730_8");         
      }
      
if(t1==0)
	slot_tf.addItem("10_1030");
if(t2==0)
	slot_tf.addItem("1030_11");
if(t3==0)
	slot_tf.addItem("11_1130");
if(t4==0)
	slot_tf.addItem("1130_12");
if(t5==0)
	slot_tf.addItem("1_130");
if(t6==0)
	slot_tf.addItem("130_2");
if(t7==0)
	slot_tf.addItem("2_230");
if(t8==0)
	slot_tf.addItem("230_3");
if(t9==0)
	slot_tf.addItem("3_330");
if(t10==0)
	slot_tf.addItem("330_4");
if(t11==0)
	slot_tf.addItem("4_430");
if(t12==0)
	slot_tf.addItem("430_5");
if(t13==0)
	slot_tf.addItem("5_530");
if(t14==0)
	slot_tf.addItem("530_6");
if(t15==0)
	slot_tf.addItem("6_630");
if(t16==0)
	slot_tf.addItem("630_7");
if(t17==0)
	slot_tf.addItem("7_730");
if(t18==0)
	slot_tf.addItem("730_8");
      
      
      rs.close();
      conn.close();

   }catch(Exception se){
      //Handle errors for JDBC
      System.out.println("ERROR IS : " +se.toString());
   }
        
    }
    public doctor_avail(int did) {
        this.did = did;
        initComponents();
        did_tf.setText(String.valueOf(did));
        try{
      conn = DriverManager.getConnection(conn_str, USERNAME, PASSWORD);
      System.out.println("connected to DB");      
      stmt = conn.createStatement();
      String sql = "SELECT d_name,dept,allot FROM doctor where d_id ="+this.did+";";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){
        dname = rs.getString("d_name");
        dept = rs.getString("dept");
        allot = rs.getInt("allot");
      }
      dname_tf.setText(dname);
      dept_tf.setText(dept);
      allot_tf.setText(String.valueOf(allot));
      sql = "SELECT 10_1030,1030_11,11_1130,1130_12,1_130,130_2,2_230,230_3,3_330,330_4,4_430,430_5,5_530,530_6,6_630,630_7,7_730,730_8 from allotment where a_id ="+did+";";
      rs = stmt.executeQuery(sql);
      while(rs.next()){
        t1 = rs.getInt("10_1030");
        t2 = rs.getInt("1030_11");
        t3 = rs.getInt("11_1130");
        t4 = rs.getInt("1130_12");
        t5 = rs.getInt("1_130");
        t6 = rs.getInt("130_2");
        t7 = rs.getInt("2_230");
        t8 = rs.getInt("230_3");
        t9 = rs.getInt("3_330");
        t10 = rs.getInt("330_4");
        t11 = rs.getInt("4_430");
        t12 = rs.getInt("430_5");
        t13 = rs.getInt("5_530");
        t14 = rs.getInt("530_6");
        t15 = rs.getInt("6_630");
        t16 = rs.getInt("630_7");
        t17 = rs.getInt("7_730");
        t18 = rs.getInt("730_8");         
      }
      
if(t1==0)
	slot_tf.addItem("10_1030");
if(t2==0)
	slot_tf.addItem("1030_11");
if(t3==0)
	slot_tf.addItem("11_1130");
if(t4==0)
	slot_tf.addItem("1130_12");
if(t5==0)
	slot_tf.addItem("1_130");
if(t6==0)
	slot_tf.addItem("130_2");
if(t7==0)
	slot_tf.addItem("2_230");
if(t8==0)
	slot_tf.addItem("230_3");
if(t9==0)
	slot_tf.addItem("3_330");
if(t10==0)
	slot_tf.addItem("330_4");
if(t11==0)
	slot_tf.addItem("4_430");
if(t12==0)
	slot_tf.addItem("430_5");
if(t13==0)
	slot_tf.addItem("5_530");
if(t14==0)
	slot_tf.addItem("530_6");
if(t15==0)
	slot_tf.addItem("6_630");
if(t16==0)
	slot_tf.addItem("630_7");
if(t17==0)
	slot_tf.addItem("7_730");
if(t18==0)
	slot_tf.addItem("730_8");
      rs.close();
      conn.close();

   }catch(Exception se){
      //Handle errors for JDBC
      System.out.println("ERROR IS : " +se.toString());
   }
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pid_tf = new javax.swing.JTextField();
        dname_tf = new javax.swing.JLabel();
        dept_tf = new javax.swing.JLabel();
        allot_tf = new javax.swing.JLabel();
        did_tf = new javax.swing.JLabel();
        allot_btn = new javax.swing.JButton();
        tf_2 = new javax.swing.JLabel();
        tf_3 = new javax.swing.JLabel();
        tf_4 = new javax.swing.JLabel();
        tf_5 = new javax.swing.JLabel();
        tf_6 = new javax.swing.JLabel();
        tf_7 = new javax.swing.JLabel();
        tf_8 = new javax.swing.JLabel();
        tf_9 = new javax.swing.JLabel();
        tf_10 = new javax.swing.JLabel();
        tf_11 = new javax.swing.JLabel();
        tf_12 = new javax.swing.JLabel();
        tf_13 = new javax.swing.JLabel();
        tf_14 = new javax.swing.JLabel();
        tf_15 = new javax.swing.JLabel();
        tf_16 = new javax.swing.JLabel();
        tf_17 = new javax.swing.JLabel();
        tf_18 = new javax.swing.JLabel();
        tf_1 = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        check_btn = new javax.swing.JButton();
        slot_tf = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel2.setText("Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 140, 60, 19);

        jLabel3.setText("Dept:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 170, 60, 19);

        jLabel4.setText("Allots:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 200, 70, 19);

        jLabel5.setText("D ID:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 110, 60, 19);

        jLabel6.setText("P ID:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 250, 40, 30);

        pid_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pid_tfActionPerformed(evt);
            }
        });
        jPanel1.add(pid_tf);
        pid_tf.setBounds(130, 250, 120, 30);

        dname_tf.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 14)); // NOI18N
        jPanel1.add(dname_tf);
        dname_tf.setBounds(160, 140, 110, 20);

        dept_tf.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 14)); // NOI18N
        jPanel1.add(dept_tf);
        dept_tf.setBounds(160, 170, 110, 20);

        allot_tf.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 14)); // NOI18N
        jPanel1.add(allot_tf);
        allot_tf.setBounds(160, 200, 110, 20);

        did_tf.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 14)); // NOI18N
        jPanel1.add(did_tf);
        did_tf.setBounds(160, 110, 110, 20);

        allot_btn.setText("Allot");
        allot_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allot_btnActionPerformed(evt);
            }
        });
        jPanel1.add(allot_btn);
        allot_btn.setBounds(130, 330, 90, 31);

        tf_2.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 13)); // NOI18N
        tf_2.setText("1030_11:");
        jPanel1.add(tf_2);
        tf_2.setBounds(340, 120, 80, 19);

        tf_3.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 13)); // NOI18N
        tf_3.setText("11_1130 :");
        jPanel1.add(tf_3);
        tf_3.setBounds(340, 150, 90, 19);

        tf_4.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 13)); // NOI18N
        tf_4.setText("1130_12 :");
        jPanel1.add(tf_4);
        tf_4.setBounds(340, 180, 90, 19);

        tf_5.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 13)); // NOI18N
        tf_5.setText("1_130 :");
        jPanel1.add(tf_5);
        tf_5.setBounds(340, 210, 90, 19);

        tf_6.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 13)); // NOI18N
        tf_6.setText("130_2 :");
        jPanel1.add(tf_6);
        tf_6.setBounds(340, 240, 70, 19);

        tf_7.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 13)); // NOI18N
        tf_7.setText("2_230 :");
        jPanel1.add(tf_7);
        tf_7.setBounds(340, 270, 60, 19);

        tf_8.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 13)); // NOI18N
        tf_8.setText("230_3  : ");
        jPanel1.add(tf_8);
        tf_8.setBounds(340, 300, 80, 19);

        tf_9.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 13)); // NOI18N
        tf_9.setText("3_330 :");
        jPanel1.add(tf_9);
        tf_9.setBounds(340, 330, 80, 19);

        tf_10.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 13)); // NOI18N
        tf_10.setText("330_4 :");
        jPanel1.add(tf_10);
        tf_10.setBounds(470, 90, 170, 19);

        tf_11.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 13)); // NOI18N
        tf_11.setText("4_430 :");
        jPanel1.add(tf_11);
        tf_11.setBounds(470, 120, 170, 19);

        tf_12.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 13)); // NOI18N
        tf_12.setText("430_5 :");
        jPanel1.add(tf_12);
        tf_12.setBounds(470, 150, 170, 19);

        tf_13.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 13)); // NOI18N
        tf_13.setText("5_530 :");
        jPanel1.add(tf_13);
        tf_13.setBounds(470, 180, 160, 19);

        tf_14.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 13)); // NOI18N
        tf_14.setText("530_6 :");
        jPanel1.add(tf_14);
        tf_14.setBounds(470, 210, 170, 19);

        tf_15.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 13)); // NOI18N
        tf_15.setText("6_630 :");
        jPanel1.add(tf_15);
        tf_15.setBounds(470, 240, 170, 19);

        tf_16.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 13)); // NOI18N
        tf_16.setText("630_7 :");
        jPanel1.add(tf_16);
        tf_16.setBounds(470, 270, 180, 19);

        tf_17.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 13)); // NOI18N
        tf_17.setText("7_730:");
        jPanel1.add(tf_17);
        tf_17.setBounds(470, 300, 170, 19);

        tf_18.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 13)); // NOI18N
        tf_18.setText("730_8 :");
        jPanel1.add(tf_18);
        tf_18.setBounds(470, 330, 180, 19);

        tf_1.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 13)); // NOI18N
        tf_1.setText("10_1030 : ");
        jPanel1.add(tf_1);
        tf_1.setBounds(340, 90, 80, 19);

        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn);
        back_btn.setBounds(130, 370, 90, 31);

        jLabel7.setText("slot:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 300, 40, 19);

        check_btn.setText("Check");
        check_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_btnActionPerformed(evt);
            }
        });
        jPanel1.add(check_btn);
        check_btn.setBounds(380, 370, 100, 31);

        slot_tf.setToolTipText("");
        jPanel1.add(slot_tf);
        slot_tf.setBounds(130, 290, 120, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/doctor2.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 770, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pid_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pid_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pid_tfActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        super.dispose();
        new doct_recp().setVisible(true);

    }//GEN-LAST:event_back_btnActionPerformed

    private void allot_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allot_btnActionPerformed

        int pid =Integer.parseInt(pid_tf.getText().toString());
        String slot =slot_tf.getSelectedItem().toString();
              
       
       try{
      conn = DriverManager.getConnection(conn_str, USERNAME, PASSWORD);
      System.out.println("connected to DB");      
      stmt = conn.createStatement();
      String sql = "SELECT "+slot+" from allotment WHERE a_id = "+did+" ;";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){
         flag = rs.getInt(slot);
         System.out.println(flag);
      }
      rs.close();
      sql = "SELECT allot from doctor WHERE d_id = "+did+" ;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){
         allot_count = rs.getInt("allot");
         System.out.println(allot_count);

      }
      rs.close();
      allot_count++;
      sql = "UPDATE Patients SET d_no = "+ did +" WHERE pid = "+pid+" ;";
      stmt.executeUpdate(sql);
      sql = "UPDATE Patients SET slot = \""+ slot +"\" WHERE pid = "+pid+" ;";
      stmt.executeUpdate(sql);
      sql = "UPDATE allotment SET "+slot+"=1 WHERE a_id = "+did+" ;";
      stmt.executeUpdate(sql);
      sql = "UPDATE doctor SET allot = "+allot_count+" WHERE d_id = "+did+" ;";
      stmt.executeUpdate(sql);
      System.out.println("update success");

      
      

   }catch(Exception se){
      //Handle errors for JDBC
      System.out.println("ERROR IS : " +se.toString());
   }
        
        
    }//GEN-LAST:event_allot_btnActionPerformed

    private void check_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_btnActionPerformed
        try{
      conn = DriverManager.getConnection(conn_str, USERNAME, PASSWORD);
      System.out.println("connected to DB");      
      stmt = conn.createStatement();
      String sql = "SELECT 10_1030,1030_11,11_1130,1130_12,1_130,130_2,2_230,230_3,3_330,330_4,4_430,430_5,5_530,530_6,6_630,630_7,7_730,730_8 from allotment where a_id ="+did+";";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){
        t1 = rs.getInt("10_1030");
        t2 = rs.getInt("1030_11");
        t3 = rs.getInt("11_1130");
        t4 = rs.getInt("1130_12");
        t5 = rs.getInt("1_130");
        t6 = rs.getInt("130_2");
        t7 = rs.getInt("2_230");
        t8 = rs.getInt("230_3");
        t9 = rs.getInt("3_330");
        t10 = rs.getInt("330_4");
        t11 = rs.getInt("4_430");
        t12 = rs.getInt("430_5");
        t13 = rs.getInt("5_530");
        t14 = rs.getInt("530_6");
        t15 = rs.getInt("6_630");
        t16 = rs.getInt("630_7");
        t17 = rs.getInt("7_730");
        t18 = rs.getInt("730_8");         
      }
      
if(t1==1)
	tf_1.setForeground(Color.RED);
if(t2==1)
	tf_2.setForeground(Color.RED);
if(t3==1)
	tf_3.setForeground(Color.RED);
if(t4==1)
	tf_4.setForeground(Color.RED);
if(t5==1)
	tf_5.setForeground(Color.RED);
if(t6==1)
	tf_6.setForeground(Color.RED);
if(t7==1)
	tf_7.setForeground(Color.RED);
if(t8==1)
	tf_8.setForeground(Color.RED);
if(t9==1)
	tf_9.setForeground(Color.RED);
if(t10==1)
	tf_10.setForeground(Color.RED);
if(t11==1)
	tf_11.setForeground(Color.RED);
if(t12==1)
	tf_12.setForeground(Color.RED);
if(t13==1)
	tf_13.setForeground(Color.RED);
if(t14==1)
	tf_14.setForeground(Color.RED);
if(t15==1)
	tf_15.setForeground(Color.RED);
if(t16==1)
	tf_16.setForeground(Color.RED);
if(t17==1)
	tf_17.setForeground(Color.RED);
if(t18==1)
	tf_18.setForeground(Color.RED);



      rs.close();
      conn.close();

   }catch(Exception se){
      //Handle errors for JDBC
      System.out.println("ERROR IS : " +se.toString());
   }




        // TODO add your handling code here:
    }//GEN-LAST:event_check_btnActionPerformed

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
            java.util.logging.Logger.getLogger(doctor_avail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctor_avail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctor_avail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctor_avail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctor_avail().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allot_btn;
    private javax.swing.JLabel allot_tf;
    private javax.swing.JButton back_btn;
    private javax.swing.JButton check_btn;
    private javax.swing.JLabel dept_tf;
    private javax.swing.JLabel did_tf;
    private javax.swing.JLabel dname_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pid_tf;
    private javax.swing.JComboBox<String> slot_tf;
    private javax.swing.JLabel tf_1;
    private javax.swing.JLabel tf_10;
    private javax.swing.JLabel tf_11;
    private javax.swing.JLabel tf_12;
    private javax.swing.JLabel tf_13;
    private javax.swing.JLabel tf_14;
    private javax.swing.JLabel tf_15;
    private javax.swing.JLabel tf_16;
    private javax.swing.JLabel tf_17;
    private javax.swing.JLabel tf_18;
    private javax.swing.JLabel tf_2;
    private javax.swing.JLabel tf_3;
    private javax.swing.JLabel tf_4;
    private javax.swing.JLabel tf_5;
    private javax.swing.JLabel tf_6;
    private javax.swing.JLabel tf_7;
    private javax.swing.JLabel tf_8;
    private javax.swing.JLabel tf_9;
    // End of variables declaration//GEN-END:variables
}
