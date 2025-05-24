/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package labtask3;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Admin
 */
public class attendanceForm extends javax.swing.JFrame {
    

    DefaultTableModel model2;
    
    public attendanceForm() {
        initComponents();
    }
    
    public void setTableModel(DefaultTableModel sharedModel, DefaultTableModel sharedModel2) {
        this.model2 = sharedModel;
        jTable1.setModel(this.model2);
        jTable1.revalidate();
        jTable1.repaint();
    }
    
    int editingRow = -1;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fullNameTextField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        presentButton = new javax.swing.JRadioButton();
        absentButton = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        applyButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 729));
        jPanel1.setLayout(new java.awt.GridLayout(6, 1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel2.add(backButton);

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        jLabel4.setFont(new java.awt.Font("Noto Serif KR", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Full Name:");
        jPanel3.add(jLabel4);

        fullNameTextField.setEditable(false);
        fullNameTextField.setBackground(new java.awt.Color(255, 255, 255));
        fullNameTextField.setPreferredSize(new java.awt.Dimension(200, 29));
        fullNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameTextFieldActionPerformed(evt);
            }
        });
        fullNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fullNameTextFieldKeyReleased(evt);
            }
        });
        jPanel3.add(fullNameTextField);

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 1));

        presentButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(presentButton);
        presentButton.setForeground(new java.awt.Color(0, 0, 0));
        presentButton.setText("Present");
        jPanel4.add(presentButton);

        absentButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(absentButton);
        absentButton.setForeground(new java.awt.Color(0, 0, 0));
        absentButton.setText("Absent");
        jPanel4.add(absentButton);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(300, 20));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5);

        applyButton.setBackground(new java.awt.Color(255, 255, 255));
        applyButton.setForeground(new java.awt.Color(0, 0, 0));
        applyButton.setText("Apply");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });
        jPanel4.add(applyButton);

        jPanel1.add(jPanel4);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Gender", "Program", "Present", "Absent"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(875, 685));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void clearFields() {
        fullNameTextField.setText("");
        presentButton.setSelected(false);
        absentButton.setSelected(false);
    }
    
    private void fullNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameTextFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        try {
            int present = 0;
            int absent = 0;
            
            if (editingRow >= 0) {
                Object presentValue = model2.getValueAt(editingRow, 3);
                Object absentValue = model2.getValueAt(editingRow, 4);
                present = (presentValue != null && !presentValue.toString().isBlank() ? Integer.parseInt(presentValue.toString()) : 0);
                absent = (absentValue != null && !absentValue.toString().isBlank() ? Integer.parseInt(absentValue.toString()) : 0);;
                if (presentButton.isSelected()) {
                    present++;
                    model2.setValueAt(present, editingRow, 3);
                }
                    else if (absentButton.isSelected()) {
                    absent++;
                    model2.setValueAt(absent, editingRow, 4);
                }
                else {
                    JOptionPane.showMessageDialog(this, "Please select between the two buttons first for attendance.");
                    return;
                }
                editingRow = -1;
            }
            else {
                JOptionPane.showMessageDialog(this, "Please select a row to attendance.");
                return;
            }
            clearFields();
            if (fullNameTextField.getText().isEmpty()) {
                applyButton.setEnabled(false);
            }
            else {
                applyButton.setEnabled(true);
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Unknown error has been occured.", "Unknown Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_applyButtonActionPerformed

    private void fullNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fullNameTextFieldKeyReleased
        if (fullNameTextField.getText().isBlank()) {
            applyButton.setEnabled(false);
        }
        else {
            applyButton.setEnabled(true);
        }
    }//GEN-LAST:event_fullNameTextFieldKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        model2 = (DefaultTableModel) jTable1.getModel();
        editingRow = jTable1.getSelectedRow();
        if (editingRow != -1) {
            try {
                Object fullName = model2.getValueAt(editingRow, 0);
                fullNameTextField.setText(fullName != null ? fullName.toString() : "");
                presentButton.setSelected(false);
                absentButton.setSelected(false);
                applyButton.setEnabled(true);
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Unknown error has been occured. Please try again.", "Unknown Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(attendanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(attendanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(attendanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attendanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new attendanceForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton absentButton;
    private javax.swing.JButton applyButton;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField fullNameTextField;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JRadioButton presentButton;
    // End of variables declaration//GEN-END:variables
}
