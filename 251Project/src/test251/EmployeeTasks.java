/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test251;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DecimalDV;
import java.sql.*;
import javax.swing.*;

public class EmployeeTasks extends javax.swing.JFrame {

    /**
     * Creates new form Decisions
     */
    public EmployeeTasks() {
        initComponents();
//        fill_Combo();
        //  fill_listDecisions();
             setLocationRelativeTo(null);
    }

    final void fill_Combo() { // to start open the sql plus , create virtul enviroment
        try {
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String username = "hr";
            String password = "hr";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stm = con.createStatement();

            String query = "SELECT meet_id FROM meeting";
            ResultSet rs = stm.executeQuery(query); // this is the array that takes the elements of select statments "executing the query"
            DefaultComboBoxModel dlm = new DefaultComboBoxModel();

            while (rs.next()) {
                dlm.addElement(rs.getString(1));
            }

//            meetingCombo.setModel(dlm);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    final void fill_listDecisions() { // to start open the sql plus , create virtul enviroment
        try {
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String username = "hr";
            String password = "hr";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stm = con.createStatement();

            String query = "SELECT decisions FROM meet_decisions where meet_id='" ;//+ meetingCombo.getSelectedItem() + "'" ;
            ResultSet rs = stm.executeQuery(query); // this is the array that takes the elements of select statments "executing the query"
            DefaultListModel dlm = new DefaultListModel();

            while (rs.next()) {
                dlm.addElement(rs.getString(1));
            }

         //   ListDecisions.setModel(dlm);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
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
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        meetName1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListDecisions1 = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListDecisions2 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        ListDecisions3 = new javax.swing.JList<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel6.setText("Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        jPanel2.setBackground(new java.awt.Color(52, 152, 219));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TASKS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1130, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 182, 340, 0));

        jLabel8.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, -1, -1));

        meetName1.setBackground(new java.awt.Color(255, 51, 102));
        meetName1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        meetName1.setForeground(new java.awt.Color(0, 0, 102));
        jPanel1.add(meetName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 210, 161, 28));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel10.setText("Due Date");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, -1, -1));

        ListDecisions1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ListDecisions1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListDecisions1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(ListDecisions1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 220, 330));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel12.setText("Discription");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        ListDecisions2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ListDecisions2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListDecisions2ValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(ListDecisions2);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 220, 330));

        ListDecisions3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ListDecisions3.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListDecisions3ValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(ListDecisions3);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 220, 330));

        jButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton4.setText("Main");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 780, 100, 40));

        jButton5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton5.setText("Main");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 800, 100, 40));

        jButton78.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton78.setText("Main");
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton78, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, -1, -1));

        jPanel3.setBackground(new java.awt.Color(52, 152, 219));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 30, 40));

        jPanel4.setBackground(new java.awt.Color(52, 152, 219));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 30, 40));

        jPanel5.setBackground(new java.awt.Color(52, 152, 219));
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 30, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListDecisions1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListDecisions1ValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ListDecisions1ValueChanged

    private void ListDecisions2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListDecisions2ValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ListDecisions2ValueChanged

    private void ListDecisions3ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListDecisions3ValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ListDecisions3ValueChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AdminControl cont = new AdminControl(); // creating an pbject from frame "meetings"
        cont.setVisible(true); // to open frame "Meeting" when the user puch at AdminMeeting button
        this.setVisible(false); // in all forms
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AdminControl cont = new AdminControl(); // creating an pbject from frame "meetings"
        cont.setVisible(true); // to open frame "Meeting" when the user puch at AdminMeeting button
        this.setVisible(false); // in all forms
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
        // TODO add your handling code here:
        Main main = new Main();
        main.setVisible(true);
    }//GEN-LAST:event_jButton78ActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeTasks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListDecisions1;
    private javax.swing.JList<String> ListDecisions2;
    private javax.swing.JList<String> ListDecisions3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton78;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel meetName1;
    // End of variables declaration//GEN-END:variables
}
