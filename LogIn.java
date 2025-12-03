package com.mycompany.faithmetric;
import java.awt.Color;
import javax.swing.JOptionPane;
public class LogIn extends javax.swing.JFrame {
    Faithmetric Faithmetric = new Faithmetric();
    public void username_focus_gain(){
        if (jUsername.getText().equals("Enter Username")){
            jUsername.setText("");
            jUsername.setForeground(new Color(0,0,0));
        }
    }
    public void username_focus_lost(){
        if (jUsername.getText().equals("")){
            jUsername.setText("Enter Username");
            jUsername.setForeground(new Color(153,153,153));
        }
    }
    public void password_focus_gain(){
        if (jPassword.getText().equals("Enter Password")){
            if (jRadioShowPassword.isSelected()){
                jPassword.setEchoChar((char)0);
            }
            else{
                jPassword.setEchoChar('•');
            }
            jPassword.setText("");
            jPassword.setForeground(new Color(0,0,0));
        }
    }
    public void password_focus_lost(){
        if (jPassword.getText().equals("")){
            jPassword.setText("Enter Password");
            jPassword.setEchoChar((char)0);
            jPassword.setForeground(new Color(153,153,153));
        }
    }
    public void show_password(){
        if (jRadioShowPassword.isSelected()){
            if (!jPassword.getText().equals("Enter Password")){
                jPassword.setEchoChar((char)0);
            }
        }
        else{
            if (!jPassword.getText().equals("Enter Password")){
                jPassword.setEchoChar('•');
            }
        }
    }
    public void log_in(){
        boolean isError = false;
        String error = "";
        String username = jUsername.getText();
        String password = jPassword.getText();
        if (username.equals("Enter Username")){
            error += "Username is Empty\n";
            isError = true;
        }
        if (password.equals("Enter Password")){
            error += "Password is Empty\n";
            isError = true;
        }
        if (isError){
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (Faithmetric.log_in(username,password).equals("treasurer")){
            this.dispose();
            new Admin().setVisible(true);
        }
        else if (Faithmetric.log_in(username,password).equals("member")){
            this.dispose();
            new UserSec().setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "The Username or Password is wrong", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void switch_create_account(){
        this.dispose();
        new Create_account().setVisible(true);
    }
    public LogIn() {      
        initComponents();
        jPassword.setEchoChar((char)0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLogIn = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        jUsername = new javax.swing.JTextField();
        jCreateAccount = new javax.swing.JButton();
        jRadioShowPassword = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Faith Metrics");
        setName("LogInWindow"); // NOI18N
        setPreferredSize(new java.awt.Dimension(538, 422));
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(30, 63, 102));
        jPanel4.setPreferredSize(new java.awt.Dimension(226, 838));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME!");

        jLabel2.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:*");

        jLabel3.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:*");

        jLogIn.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLogIn.setText("Login");
        jLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogInActionPerformed(evt);
            }
        });

        jPassword.setForeground(new java.awt.Color(153, 153, 153));
        jPassword.setText("Enter Password");
        jPassword.setToolTipText("Enter Password");
        jPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFocusLost(evt);
            }
        });

        jUsername.setForeground(new java.awt.Color(153, 153, 153));
        jUsername.setText("Enter Username");
        jUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jUsernameFocusLost(evt);
            }
        });
        jUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsernameActionPerformed(evt);
            }
        });

        jCreateAccount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCreateAccount.setText("Create new account");
        jCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreateAccountActionPerformed(evt);
            }
        });

        jRadioShowPassword.setBackground(new java.awt.Color(30, 63, 102));
        jRadioShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        jRadioShowPassword.setText("Show Password");
        jRadioShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioShowPasswordActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(233, 236, 236));
        jPanel1.setForeground(new java.awt.Color(245, 245, 220));
        jPanel1.setMaximumSize(null);
        jPanel1.setPreferredSize(new java.awt.Dimension(220, 306));

        logo.setPreferredSize(new java.awt.Dimension(155, 172));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" ✝");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" ✝");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jUsername)
                            .addComponent(jLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jRadioShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioShowPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("LogInWindow");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsernameActionPerformed
   
    }//GEN-LAST:event_jUsernameActionPerformed

    private void jCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreateAccountActionPerformed
        switch_create_account();
    }//GEN-LAST:event_jCreateAccountActionPerformed

    private void jUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jUsernameFocusGained
        username_focus_gain();
    }//GEN-LAST:event_jUsernameFocusGained

    private void jUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jUsernameFocusLost
        username_focus_lost();
    }//GEN-LAST:event_jUsernameFocusLost

    private void jPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFocusGained
        password_focus_gain();
    }//GEN-LAST:event_jPasswordFocusGained

    private void jPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFocusLost
        password_focus_lost();
    }//GEN-LAST:event_jPasswordFocusLost

    private void jRadioShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioShowPasswordActionPerformed
        show_password();
    }//GEN-LAST:event_jRadioShowPasswordActionPerformed

    private void jLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogInActionPerformed
        log_in();
    }//GEN-LAST:event_jLogInActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCreateAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLogIn;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JRadioButton jRadioShowPassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jUsername;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
