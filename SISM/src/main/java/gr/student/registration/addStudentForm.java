/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gr.student.registration;

import java.sql.*;
import gr.student.registration.config.SQLDatabaseConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author shin
 */
public class addStudentForm extends javax.swing.JFrame {
    SQLDatabaseConnection sqlConnection = new SQLDatabaseConnection();
    Connection connection = sqlConnection.initializeConnection("exodus");
    PreparedStatement preparedStatement;
    ResultSet rs;
    /**
     * Creates new form StudentPanel
     */
    public addStudentForm() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        middleNameLabel = new javax.swing.JTextField();
        lrnLabel = new javax.swing.JLabel();
        LRNField = new javax.swing.JTextField();
        birthdateLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        yearLevelLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        midNameLabel = new javax.swing.JLabel();
        courseLabel = new javax.swing.JLabel();
        birthPlaceField = new javax.swing.JTextField();
        sexLabel = new javax.swing.JLabel();
        birthPlaceLabel = new javax.swing.JLabel();
        birthDateField = new javax.swing.JTextField();
        suffixLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        suffixField = new javax.swing.JTextField();
        sexComboBox = new javax.swing.JComboBox<>();
        yearComboBox = new javax.swing.JComboBox<>();
        courseComboBox = new javax.swing.JComboBox<>();
        cancelButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EXODUS - Add Student Information");
        setBackground(new java.awt.Color(39, 43, 48));
        setForeground(java.awt.Color.darkGray);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(39, 43, 48));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" STUDENT INFORMATION");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        middleNameLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleNameLabelActionPerformed(evt);
            }
        });

        lrnLabel.setForeground(new java.awt.Color(0, 0, 0));
        lrnLabel.setText("LRN");

        birthdateLabel.setForeground(new java.awt.Color(0, 0, 0));
        birthdateLabel.setText("Birthdate:");

        ageLabel.setForeground(new java.awt.Color(0, 0, 0));
        ageLabel.setText("Age:");

        lastNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        lastNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        lastNameLabel.setText("Last Name:");

        yearLevelLabel.setForeground(new java.awt.Color(0, 0, 0));
        yearLevelLabel.setText("Year Level:");

        firstNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        firstNameLabel.setText("First Name:");

        midNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        midNameLabel.setText("Middle Name:");

        courseLabel.setForeground(new java.awt.Color(0, 0, 0));
        courseLabel.setText("Course:");

        sexLabel.setForeground(new java.awt.Color(0, 0, 0));
        sexLabel.setText("Sex:");

        birthPlaceLabel.setForeground(new java.awt.Color(0, 0, 0));
        birthPlaceLabel.setText("Birthplace:");

        suffixLabel.setForeground(new java.awt.Color(0, 0, 0));
        suffixLabel.setText("Suffix");

        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });

        sexComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sex", "Male", "Female" }));

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year Level", "First Year", "Second Year", "Third Year", "Fourth Year" }));
        yearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboBoxActionPerformed(evt);
            }
        });

        courseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BS in Information Technology (BSIT)", "BS in Information System (BSIS)", "BS in Agro-Forestry (BSAF)", "BS in Fisheries and Aquatic Sciences (BSFAS)", "BS in Food Technology (BSFT)", "BS in Marine Biology (BSMB)", "Bachelor of Public Administration (BPA)", "BS in Disaster Resiliency and Management (BSDRM)", "BS in Entrepreneurship (BS ENTREP)", "BS in Social Work (BSSW)", "BS in Tourism Management (BSTM)", "Bachelor of Arts in Communication (BACOMM)", "Bachelor of Secondary Education (BSeD)", "Bachelor of Technology and Livelihood Education (BTLEd)" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yearLevelLabel)
                    .addComponent(lrnLabel)
                    .addComponent(birthPlaceLabel)
                    .addComponent(birthdateLabel)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameLabel)
                    .addComponent(LRNField, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addComponent(birthPlaceField)
                    .addComponent(firstNameField)
                    .addComponent(lastNameField)
                    .addComponent(birthDateField)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(midNameLabel)
                                    .addGap(117, 117, 117))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(middleNameLabel)
                                    .addGap(25, 25, 25)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageLabel)
                                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sexLabel)
                            .addComponent(suffixField, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(suffixLabel)
                            .addComponent(sexComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(courseLabel)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lastNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(firstNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(midNameLabel)
                    .addComponent(suffixLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(middleNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suffixField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(sexLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(birthdateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(birthDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(birthPlaceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(birthPlaceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lrnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LRNField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yearLevelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel3);

        cancelButton.setBackground(new java.awt.Color(255, 0, 0));
        cancelButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(81, 89, 99));
        clearButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear All");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(0, 145, 24));
        submitButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void middleNameLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middleNameLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middleNameLabelActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        lastNameField.setText(null);
        firstNameField.setText(null);
        middleNameLabel.setText(null);
        suffixField.setText(null);
        ageField.setText(null);
        birthDateField.setText(null);
        birthPlaceField.setText(null);
        LRNField.setText(null);
        sexComboBox.setSelectedIndex(0);
        yearComboBox.setSelectedIndex(0);
        courseComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void yearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearComboBoxActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String lastName = lastNameField.getText();
        String firstName = firstNameField.getText();
        String middleName = middleNameLabel.getText();
        String suffix = suffixField.getText();
        String age = ageField.getText();
        String birthDate = birthDateField.getText(); 
        String birthPlace = birthPlaceLabel.getText();
        String LRN = LRNField.getText();
        String sex = sexComboBox.getSelectedItem().toString();
        String yearLevel = yearComboBox.getSelectedItem().toString();
        String course = courseComboBox.getSelectedItem().toString();
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO `students` (`Student ID`, `First Name`, `Middle Name`, `Last Name`, `Suffix`, `Age`, `Birthdate`, `Birthplace`, `LRN`, `Year Level`, `Course`, `Sex`) VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, middleName);
            preparedStatement.setString(3, lastName);
            preparedStatement.setString(4, suffix);
            preparedStatement.setString(5, age);
            preparedStatement.setString(6, birthDate);
            preparedStatement.setString(7, birthPlace);
            preparedStatement.setString(8, LRN);
            preparedStatement.setString(9, yearLevel);
            preparedStatement.setString(10, course);
            preparedStatement.setString(11, sex);
            int statusCode = preparedStatement.executeUpdate();
            
            if(statusCode == 1) {
                JOptionPane.showMessageDialog(this, "Student has been added successfuly.");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "An error has occured while adding the student.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_submitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(addStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addStudentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LRNField;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField birthDateField;
    private javax.swing.JTextField birthPlaceField;
    private javax.swing.JLabel birthPlaceLabel;
    private javax.swing.JLabel birthdateLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> courseComboBox;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel lrnLabel;
    private javax.swing.JLabel midNameLabel;
    private javax.swing.JTextField middleNameLabel;
    private javax.swing.JComboBox<String> sexComboBox;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField suffixField;
    private javax.swing.JLabel suffixLabel;
    private javax.swing.JComboBox<String> yearComboBox;
    private javax.swing.JLabel yearLevelLabel;
    // End of variables declaration//GEN-END:variables
}
