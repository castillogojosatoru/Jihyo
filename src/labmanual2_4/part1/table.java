/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package labmanual2_4.part1;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


//ayaw ni i-code
public class table extends javax.swing.JFrame {

    public table() {
        initComponents();
        jTable2.setModel(model); //For the table model. I-code ni diri.
    }
    
    DefaultTableModel model =  new DefaultTableModel(new Object[] {"Name", "Status", "Gender", "Languages", "Birthdate"}, 0);
    int editingRow = -1;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 384, -1, -1));

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 419, -1, -1));

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 454, -1, -1));

        jTextField1.setActionCommand("<Not Set>");
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 138, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Widowed", "Student", "Nigga" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 98, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText(" Male");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 146, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 179, -1, -1));

        jCheckBox1.setText("Bisakol");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 226, -1, -1));

        jCheckBox2.setText("Bisaya");
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 258, -1, -1));

        jCheckBox3.setText("Tanggalog");
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 290, -1, -1));

        jDateChooser1.setDateFormatString("MMM dd, yyyy");
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 344, 160, -1));

        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 25, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Pangalan", "Status", "Sex", "Language", "Birth Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //For clearing fields after clicking save button. I-code sad ni nga function.
    private void clearFormFields() {
        jTextField1.setText("");
        jComboBox1.setSelectedIndex(0);
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jDateChooser1.setDate(null);
    }
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String radioB = "";
        String sinultian;
        String date = "";
        StringBuilder sb = new StringBuilder();
        JCheckBox[] check = {jCheckBox1, jCheckBox2, jCheckBox3};
        
        for (JCheckBox jcheckbox : check) {
            if (jcheckbox.isSelected()) {
                sb.append(jcheckbox.getText()).append("\n");
            }
        }
        
        model = (DefaultTableModel) jTable2.getModel();
        jTable2.setModel(model);
        Date selectedDate = jDateChooser1.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
        String formattedDate = sdf.format(selectedDate);
        date = formattedDate;
        if (date == null) {
            JOptionPane.showMessageDialog(this, "Please input birthdate.");
            return;
        }
        
        if (jRadioButton1.isSelected()) {
            radioB = "Male";
        }
        else if (jRadioButton2.isSelected()) {
            radioB = "Female";
        }
        
        sinultian = sb.toString();
        
//        tabol.addRow(new Object[] {   - ayaw na ni i-code
//        jTextField1.getText(), jComboBox1.getSelectedItem(), radioB, sinultian, date}); - ayaw na ni i-code
        Object[] rowData = new Object[] {jTextField1.getText(), jComboBox1.getSelectedItem(), radioB, sinultian, date};
        
        if (editingRow >= 0) {
            
            model.setValueAt(jTextField1.getText(), editingRow, 0);
            model.setValueAt(jComboBox1.getSelectedItem(), editingRow, 1);
            model.setValueAt(radioB, editingRow, 2);
            model.setValueAt(sinultian, editingRow, 3);
            model.setValueAt(date, editingRow, 4);
            editingRow = -1;
        }
        else {
            model.addRow(new Object[] { jTextField1.getText(), jComboBox1.getSelectedItem(), radioB, sinultian, date});
        }
        clearFormFields();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        model = (DefaultTableModel) jTable2.getModel();
        int selectedRow = jTable2.getSelectedRow();
        if (selectedRow != -1) {
            try {
                Object neyms = model.getValueAt(selectedRow, 0);
                jTextField1.setText(neyms != null ? neyms.toString() : "");
                String gender = model.getValueAt(selectedRow, 1) != null ? model.getValueAt(selectedRow, 1).toString() : "";
                if (gender.equalsIgnoreCase("Male")) {
                    jRadioButton1.setSelected(true);
                }
                else if (gender.equalsIgnoreCase("Female")) {
                    jRadioButton2.setSelected(true);
                }
                String status = model.getValueAt(selectedRow, 2) != null ? model.getValueAt(selectedRow, 2).toString() : "";
                jComboBox1.setSelectedItem(status);
                String language = model.getValueAt(selectedRow, 3) != null ? model.getValueAt(selectedRow, 3).toString() : "";
                jCheckBox1.setSelected(language.contains("Bisakol"));
                jCheckBox2.setSelected(language.contains("Bisaya"));
                jCheckBox3.setSelected(language.contains("Tanggalog"));
                String datedate = model.getValueAt(selectedRow, 4) != null ? model.getValueAt(selectedRow, 4).toString() : "";
                Date deyt = new SimpleDateFormat("MM/dd/YYYY").parse(datedate);
                jDateChooser1.setDate(deyt);
            }
            catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error loading info.", "Updating info error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Select a row first.");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        model = (DefaultTableModel) jTable2.getModel();
        
        if (jTable2.getSelectedRowCount() == 1) {
//            tabol.removeRow(jTable2.getSelectedRow()); - ayaw na ni i-code
//            JOptionPane.showMessageDialog(this, "Info deleted.", "Deletion", JOptionPane.INFORMATION_MESSAGE); - ayaw nasad ni i-code
              int con = JOptionPane.showConfirmDialog(this, "Do you want to delete this?");
              if (con == 0) {
                  model.removeRow(jTable2.getSelectedRow());
                  JOptionPane.showMessageDialog(this, "Info deleted.");
              }
              else if (con == 1) {
                  JOptionPane.showMessageDialog(this, "Okay.");
              }
        }
        else {
            if (jTable2.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Info is empty.", "Emtpy", JOptionPane.ERROR_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(this, "Please select a data to delete.", "No data selection", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        model = (DefaultTableModel) jTable2.getModel();
        int selectedRow = jTable2.getSelectedRow();
        
        if (selectedRow != -1) {
            editingRow = selectedRow;
            try {
                jTextField1.setText(model.getValueAt(selectedRow, 0).toString());
                String gender = model.getValueAt(selectedRow, 1).toString();
                if (gender.equalsIgnoreCase("Male")) {
                    jRadioButton1.setSelected(true);
                }
                else if (gender.equalsIgnoreCase("Female")) {
                    jRadioButton2.setSelected(true);
                }
                String status = model.getValueAt(selectedRow, 2).toString();
                jComboBox1.setSelectedItem(status);
                String language = model.getValueAt(selectedRow, 3).toString();
                jCheckBox1.setSelected(language.contains("Bisakol"));
                jCheckBox2.setSelected(language.contains("Bisaya"));
                jCheckBox3.setSelected(language.contains("Tanggalog"));
                String datedate = model.getValueAt(selectedRow, 4).toString();
                Date deyt = new SimpleDateFormat("MM/dd/YYYY").parse(datedate);
                jDateChooser1.setDate(deyt);
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error loading info.", "Updating info error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Select a row first.");
        }
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
