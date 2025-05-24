/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package labtask3;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class registrationForm extends javax.swing.JFrame {

    
    public registrationForm() {
        initComponents();   
        
        updateform.setTableModel(model, model2);
        deleteform.setTableModel(model, model2);
        attendanceform.setTableModel(model, model2);
        studentlistform.setTableModel(model, model2);
        
        updateform.jTable1.setModel(model);
        deleteform.jTable1.setModel(model);
        attendanceform.jTable1.setModel(model2);
        studentlistform.jTable1.setModel(model2);
        
        model.addTableModelListener(e -> toggleButtons());
        toggleButtons();
    }
    updateForm updateform = new updateForm();
    deleteForm deleteform = new deleteForm();
    attendanceForm attendanceform = new attendanceForm();
    studentListForm studentlistform = new studentListForm();
    
    DefaultTableModel model = new DefaultTableModel(new Object[] {"Full Name", "Gender", "Program"}, 0);
    DefaultTableModel model2 = new DefaultTableModel(new Object[] {"Full Name", "Gender", "Program", "Present", "Absent"}, 0);
    
    
    int editingRow = -1;
    
    private void toggleButtons() {
        boolean hasRows = model.getRowCount() > 0;
        updateButton.setEnabled(hasRows);
        deleteButton.setEnabled(hasRows);
        attendanceButton.setEnabled(hasRows);
        studentListButton.setEnabled(hasRows);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fullNameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        maleRButton = new javax.swing.JRadioButton();
        femaleRButton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        programComboBox = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        attendanceButton = new javax.swing.JButton();
        studentListButton = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 100));
        jPanel2.setLayout(new java.awt.GridLayout(3, 1));

        jPanel6.setBackground(new java.awt.Color(255, 0, 0));
        jPanel6.setLayout(new java.awt.CardLayout());

        jLabel2.setFont(new java.awt.Font("Noto Serif KR", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dextoy Jan");
        jPanel6.add(jLabel2, "card2");

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 0, 0));
        jPanel7.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Noto Serif KR", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("University of Jeyna Jack Coal");
        jPanel7.add(jLabel1, "card2");

        jPanel2.add(jPanel7);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(800, 90));
        jPanel4.setLayout(new java.awt.GridLayout(3, 1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(1000, 100));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Noto Serif KR", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Student Attendance Register");
        jLabel8.setPreferredSize(new java.awt.Dimension(600, 53));
        jPanel9.add(jLabel8, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Noto Serif KR", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Full Name:");
        jPanel10.add(jLabel4);

        fullNameTextField.setBackground(new java.awt.Color(255, 255, 255));
        fullNameTextField.setPreferredSize(new java.awt.Dimension(200, 29));
        fullNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameTextFieldActionPerformed(evt);
            }
        });
        jPanel10.add(fullNameTextField);

        jLabel6.setFont(new java.awt.Font("Noto Serif KR", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Gender:");
        jPanel10.add(jLabel6);

        maleRButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(maleRButton);
        maleRButton.setFont(new java.awt.Font("Noto Serif KR", 0, 12)); // NOI18N
        maleRButton.setForeground(new java.awt.Color(0, 0, 0));
        maleRButton.setText("Male");
        jPanel10.add(maleRButton);

        femaleRButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(femaleRButton);
        femaleRButton.setFont(new java.awt.Font("Noto Serif KR", 0, 12)); // NOI18N
        femaleRButton.setForeground(new java.awt.Color(0, 0, 0));
        femaleRButton.setText("Female");
        jPanel10.add(femaleRButton);

        jLabel7.setFont(new java.awt.Font("Noto Serif KR", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Program:");
        jPanel10.add(jLabel7);

        programComboBox.setBackground(new java.awt.Color(255, 255, 255));
        programComboBox.setFont(new java.awt.Font("Noto Serif KR", 0, 12)); // NOI18N
        programComboBox.setForeground(new java.awt.Color(0, 0, 0));
        programComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COE", "IT", "CRI", "PSY", "ENG", "ACC", "PS", "MM", "SW", "AMT", "FM", "HR", "SCI" }));
        programComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                programComboBoxMouseClicked(evt);
            }
        });
        programComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programComboBoxActionPerformed(evt);
            }
        });
        jPanel10.add(programComboBox);

        jPanel4.add(jPanel10);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(419, 150));

        saveButton.setBackground(new java.awt.Color(255, 255, 255));
        saveButton.setForeground(new java.awt.Color(0, 0, 0));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel5.add(saveButton);

        updateButton.setBackground(new java.awt.Color(255, 255, 255));
        updateButton.setForeground(new java.awt.Color(0, 0, 0));
        updateButton.setText("Update");
        updateButton.setEnabled(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel5.add(updateButton);

        deleteButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteButton.setForeground(new java.awt.Color(0, 0, 0));
        deleteButton.setText("Delete");
        deleteButton.setEnabled(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel5.add(deleteButton);

        attendanceButton.setBackground(new java.awt.Color(255, 255, 255));
        attendanceButton.setForeground(new java.awt.Color(0, 0, 0));
        attendanceButton.setText("Attendance");
        attendanceButton.setEnabled(false);
        attendanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceButtonActionPerformed(evt);
            }
        });
        jPanel5.add(attendanceButton);

        studentListButton.setBackground(new java.awt.Color(255, 255, 255));
        studentListButton.setForeground(new java.awt.Color(0, 0, 0));
        studentListButton.setText("Student List");
        studentListButton.setEnabled(false);
        studentListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentListButtonActionPerformed(evt);
            }
        });
        jPanel5.add(studentListButton);

        jPanel4.add(jPanel5);

        jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(827, 536));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        deleteform.setVisible(true);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        updateform.setVisible(true);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
        if (fullNameTextField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill up the fields.", "Field is empty", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        try { 
            String radioButton = "";
            
            if (maleRButton.isSelected()) {
                radioButton = "Male";
            }
            else if (femaleRButton.isSelected()) {
                radioButton = "Female";
            }
            else {
                JOptionPane.showMessageDialog(this, "Please input your gender.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
//            Object[] rowDate = new Object[] {fullNameTextField.getText(), radioButton, programComboBox.getSelectedItem()};
            
            if (editingRow >= 0) {
                model.setValueAt(fullNameTextField.getText(), editingRow, 0);
                model2.setValueAt(fullNameTextField.getText(), editingRow, 0);
                model.setValueAt(radioButton, editingRow, 1);
                model2.setValueAt(radioButton, editingRow, 1);
                model.setValueAt(programComboBox.getSelectedItem(), editingRow, 2);
                model2.setValueAt(programComboBox.getSelectedItem(), editingRow, 2);
                editingRow = -1;
            }
            else {
                model.addRow(new Object[] {fullNameTextField.getText(), radioButton, programComboBox.getSelectedItem()});
                model2.addRow(new Object[] {fullNameTextField.getText(), radioButton, programComboBox.getSelectedItem()});
            }
            updateButton.setEnabled(true);
            deleteButton.setEnabled(true);
            attendanceButton.setEnabled(true);
            studentListButton.setEnabled(true);
            JOptionPane.showMessageDialog(this, "Student info added to the list successfully.", "Student info added", JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occured. Please try again.", "Inputting error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void programComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_programComboBoxActionPerformed

    private void programComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programComboBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_programComboBoxMouseClicked

    private void fullNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameTextFieldActionPerformed

    private void attendanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceButtonActionPerformed
        attendanceform.setVisible(true);
    }//GEN-LAST:event_attendanceButtonActionPerformed

    private void studentListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentListButtonActionPerformed
        studentlistform.setVisible(true);
    }//GEN-LAST:event_studentListButtonActionPerformed
    
    public void clearFields() {
        fullNameTextField.setText("");
        maleRButton.setSelected(false);
        femaleRButton.setSelected(false);
        programComboBox.setSelectedIndex(0);
    }
    
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
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attendanceButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JRadioButton femaleRButton;
    private javax.swing.JTextField fullNameTextField;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton maleRButton;
    private javax.swing.JComboBox<String> programComboBox;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton studentListButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
