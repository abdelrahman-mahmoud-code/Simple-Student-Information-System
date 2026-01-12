package JavaTraining5.StudentInformationSystem;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class EditStudentPage extends javax.swing.JFrame {

    
    private static HashMap<Integer,Student> students1;
    static HomePage homePage;
    
    public EditStudentPage(HomePage homePage,HashMap<Integer,Student> students) {
        this.homePage = homePage;
        this.students1 = students;
        initComponents();
        disableIdField();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        gpaField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        courseField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        idSearchField = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Edit Student Info Page");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Student ID:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Student GPA:");

        gpaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpaFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Course:");

        searchButton.setText("Search 🔍");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Search ID:");

        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Student Name:");

        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(updateButton)
                            .addGap(18, 18, 18)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(idField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(gpaField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(courseField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(clearButton))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gpaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addGap(48, 48, 48)
                .addComponent(backButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gpaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpaFieldActionPerformed
    }//GEN-LAST:event_gpaFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        if(idSearchField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,
                "Please enter an ID to search.",
                "Error", JOptionPane.ERROR_MESSAGE);
        } else{
            try{
                searchId();

            }catch(NullPointerException e){
                JOptionPane.showMessageDialog(null,
                    "The students database is empty. Please add a student first.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,
                    "Please enter numerical values for this field.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        clearFields();
        this.setVisible(false);
        HomePage homepage = new HomePage(students1);
        homepage.setVisible(true);
        homepage.setLocationRelativeTo(null);
    }//GEN-LAST:event_backButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        if (nameField.getText().isEmpty() || idField.getText().isEmpty()
                || gpaField.getText().isEmpty() || courseField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Please enter an ID to search.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int userSearchIdInput = Integer.parseInt(idSearchField.getText());
                if(students1.containsKey(userSearchIdInput)){
                    updateStudentInfo();
                } else{
                    JOptionPane.showMessageDialog(null,
                        "The student with the ID: "+userSearchIdInput+" is not found.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Invalid input. Please enter valid numbers.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        if(idSearchField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,
                        "Please enter an ID to search.",
                        "Error", JOptionPane.ERROR_MESSAGE);
        } else{
            int userSearchIdInput = Integer.parseInt(idSearchField.getText());
            int confirmation = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to delete the information of the student"
                        + "\n with the ID: "+userSearchIdInput+" ?", "Confirmation",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(confirmation == JOptionPane.YES_OPTION){
            deleteStudentInfo();
            clearFields();
            JOptionPane.showMessageDialog(null,
                        "Student with the ID: "+userSearchIdInput+" is deleted Successfully.", "Confirmation",
                        JOptionPane.INFORMATION_MESSAGE);
        }else{
            
            }
        }    
    }//GEN-LAST:event_deleteButtonActionPerformed

    
    private void searchId(){
        int userSearchIdInput = Integer.parseInt(idSearchField.getText());
        
        if(students1.containsKey(userSearchIdInput)){
            Student student = students1.get(userSearchIdInput);
          
            
            nameField.setText(student.getName());
            idField.setText(String.valueOf(student.getId()));
            gpaField.setText(String.valueOf(student.getGpa()));
            courseField.setText(student.getDegree());
        } else if(!students1.containsKey(userSearchIdInput)){
            JOptionPane.showMessageDialog(null,
                    "The student with ID: "+userSearchIdInput+" is not found.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null,
                    "Student with ID: " + userSearchIdInput +" not found." ,
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void clearFields(){
        nameField.setText("");
        idField.setText("");
        gpaField.setText("");
        courseField.setText("");
        idSearchField.setText("");
    }
    
    private void updateStudentInfo(){
        String stdName = nameField.getText();
        int userSearchIdInput = Integer.parseInt(idSearchField.getText());
        double stdGPA = Double.parseDouble(gpaField.getText());
        String stdCourse = courseField.getText();
        
        int confirmation = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to Update the information of student with the ID: "+userSearchIdInput+" ?",
                    "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (confirmation == JOptionPane.YES_OPTION) {
                Student student = new Student(stdName, userSearchIdInput, stdGPA, stdCourse);
                students1.put(userSearchIdInput, student);

                JOptionPane.showMessageDialog(null,
                        "Student Information updated Successfully!!", "Confirmation",
                        JOptionPane.INFORMATION_MESSAGE);

                clearFields();
            } else {
                //Continue
            }
    }
    
    private void deleteStudentInfo(){
        
        int userSearchIdInput = Integer.parseInt(idSearchField.getText());

        if(students1.containsKey(userSearchIdInput)){
            students1.remove(userSearchIdInput);
        } else{
            JOptionPane.showMessageDialog(null,
                    "The student with the ID: '"+userSearchIdInput+"' is not found.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void disableIdField(){
        idField.setEditable(false);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField courseField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField gpaField;
    private javax.swing.JTextField idField;
    private javax.swing.JTextField idSearchField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
