package com.mycompany.faithmetric;
import java.awt.Color;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
public class Create_account extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Create_account.class.getName());
    Faithmetric Faithmetric = new Faithmetric();
    public void name_focus_gain(){
        if (jTextboxName.getText().equals("Enter Name")){
            jTextboxName.setText("");
            jTextboxName.setForeground(new Color(0,0,0));
        }
    }
    public void name_focus_lost(){
        if (jTextboxName.getText().equals("")){
            jTextboxName.setText("Enter Name");
            jTextboxName.setForeground(new Color(153,153,153));
        }
    }
    public void name_key_type(java.awt.event.KeyEvent evt){
        char keyChar = evt.getKeyChar();
        boolean isLetter = Character.isLetter(keyChar);
        boolean isHyphen = (keyChar == '-');
        boolean isSpace = (keyChar == ' ');
        if(!isLetter && !isHyphen && !isSpace){
            evt.consume();
        }
    }
    public void birthday_day_focus_gain(){
        if (jTextBirthday_day.getText().equals("DD")){
            jTextBirthday_day.setText("");
            jTextBirthday_day.setForeground(new Color(0,0,0));
        }
    }
    public void birthday_day_focus_lost(){
        if (jTextBirthday_day.getText().equals("")){
            jTextBirthday_day.setText("DD");
            jTextBirthday_day.setForeground(new Color(153,153,153));
        }
    }
    public void birthday_day_key_type(java.awt.event.KeyEvent evt){
        char keyChar = evt.getKeyChar();
        boolean isLetter = Character.isDigit(keyChar);
        if(!isLetter){
            evt.consume();
        }
    }
    public void birthday_month_focus_gain(){
        if (jTextBirthday_month.getText().equals("MM")){
            jTextBirthday_month.setText("");
            jTextBirthday_month.setForeground(new Color(0,0,0));
        }
    }
    public void birthday_month_focus_lost(){
        if (jTextBirthday_month.getText().equals("")){
            jTextBirthday_month.setText("MM");
            jTextBirthday_month.setForeground(new Color(153,153,153));
        }
    }
    public void birthday_month_key_type(java.awt.event.KeyEvent evt){
        char keyChar = evt.getKeyChar();
        boolean isLetter = Character.isDigit(keyChar);
        if(!isLetter){
            evt.consume();
        }
    }
    public void birthday_year_focus_gain(){
        if (jTextBirthday_year.getText().equals("YYYY")){
            jTextBirthday_year.setText("");
            jTextBirthday_year.setForeground(new Color(0,0,0));
        }
    }
    public void birthday_year_focus_lost(){
        if (jTextBirthday_year.getText().equals("")){
            jTextBirthday_year.setText("YYYY");
            jTextBirthday_year.setForeground(new Color(153,153,153));
        }
    }
    public void birthday_year_key_type(java.awt.event.KeyEvent evt){
        char keyChar = evt.getKeyChar();
        boolean isLetter = Character.isDigit(keyChar);
        if(!isLetter){
            evt.consume();
        }
    }
    public void blk_no_focus_gain(){
        if (jTextBlkNo.getText().equals("Enter Blk")){
            jTextBlkNo.setText("");
            jTextBlkNo.setForeground(new Color(0,0,0));
        }
    }
    public void blk_no_focus_lost(){
        if (jTextBlkNo.getText().equals("")){
            jTextBlkNo.setText("Enter Blk");
            jTextBlkNo.setForeground(new Color(153,153,153));
        }
    }
    public void blk_no_key_type(java.awt.event.KeyEvent evt){
        char keyChar = evt.getKeyChar();
        boolean isLetter = Character.isDigit(keyChar);
        if(!isLetter){
            evt.consume();
        }
    }
    public void lot_no_focus_gain(){
        if (jTextLotNo.getText().equals("Enter Lot")){
            jTextLotNo.setText("");
            jTextLotNo.setForeground(new Color(0,0,0));
        }
    }
    public void lot_no_focus_lost(){
        if (jTextLotNo.getText().equals("")){
            jTextLotNo.setText("Enter Lot");
            jTextLotNo.setForeground(new Color(153,153,153));
        }
    }
    public void lot_no_key_type(java.awt.event.KeyEvent evt){
        char keyChar = evt.getKeyChar();
        boolean isLetter = Character.isDigit(keyChar);
        if(!isLetter){
            evt.consume();
        }
    }
    public void street_focus_gain(){
        if (jTextStreet.getText().equals("Enter Street")){
            jTextStreet.setText("");
            jTextStreet.setForeground(new Color(0,0,0));
        }
    }
    public void street_focus_lost(){
        if (jTextStreet.getText().equals("")){
            jTextStreet.setText("Enter Street");
            jTextStreet.setForeground(new Color(153,153,153));
        }
    }
    public void barangay_focus_gain(){
        if (jTextBarangay.getText().equals("Enter Barangay")){
            jTextBarangay.setText("");
            jTextBarangay.setForeground(new Color(0,0,0));
        }
    }
    public void barangay_focus_lost(){
        if (jTextBarangay.getText().equals("")){
            jTextBarangay.setText("Enter Barangay");
            jTextBarangay.setForeground(new Color(153,153,153));
        }
    }
    public void city_focus_gain(){
        if (jTextCity.getText().equals("Enter City")){
            jTextCity.setText("");
            jTextCity.setForeground(new Color(0,0,0));
        }
    }
    public void city_focus_lost(){
        if (jTextCity.getText().equals("")){
            jTextCity.setText("Enter City");
            jTextCity.setForeground(new Color(153,153,153));
        }
    }
    public void province_focus_gain(){
        if (jTextProvince.getText().equals("Enter Province")){
            jTextProvince.setText("");
            jTextProvince.setForeground(new Color(0,0,0));
        }
    }
    public void province_focus_lost(){
        if (jTextProvince.getText().equals("")){
            jTextProvince.setText("Enter Province");
            jTextProvince.setForeground(new Color(153,153,153));
        }
    }
    public void contact_no_focus_gain(){
        if (jTextContactNo.getText().equals("Enter Contact No")){
            jTextContactNo.setText("");
            jTextContactNo.setForeground(new Color(0,0,0));
        }
    }
    public void contact_no_focus_lost(){
        if (jTextContactNo.getText().equals("")){
            jTextContactNo.setText("Enter Contact No");
            jTextContactNo.setForeground(new Color(153,153,153));
        }
    }
    public void contact_no_key_type(java.awt.event.KeyEvent evt){
        char keyChar = evt.getKeyChar();
        boolean isDigit = Character.isDigit(keyChar);
        boolean isLimit = ((jTextContactNo.getText()).length() >= 11);
        if(!isDigit){
            evt.consume();
        }
        if(isLimit){
            evt.consume();
        }
    }
    public void username_focus_gain(){
        if (jTextUsername.getText().equals("Enter Username")){
            jTextUsername.setText("");
            jTextUsername.setForeground(new Color(0,0,0));
        }
    }
    public void username_focus_lost(){
        if (jTextUsername.getText().equals("")){
            jTextUsername.setText("Enter Username");
            jTextUsername.setForeground(new Color(153,153,153));
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
    public void confirm_password_focus_gain(){
        if (jPasswordConfirmPassword.getText().equals("Retype Password")){
            if (jRadioShowPassword.isSelected()){
                jPasswordConfirmPassword.setEchoChar((char)0);
            }
            else{
                jPasswordConfirmPassword.setEchoChar('•');
            }
            jPasswordConfirmPassword.setText("");
            jPasswordConfirmPassword.setForeground(new Color(0,0,0));
        }
    }
    public void confirm_password_focus_lost(){
        if (jPasswordConfirmPassword.getText().equals("")){
            jPasswordConfirmPassword.setText("Retype Password");
            jPasswordConfirmPassword.setEchoChar((char)0);
            jPasswordConfirmPassword.setForeground(new Color(153,153,153));
        }
    }
    public void show_password(){
        if (jRadioShowPassword.isSelected()){
            if (!jPassword.getText().equals("Enter Password")){
                jPassword.setEchoChar((char)0);
            }
            if (!jPasswordConfirmPassword.getText().equals("Retype Password")){
                jPasswordConfirmPassword.setEchoChar((char)0);
            }
        }
        else{
            if (!jPassword.getText().equals("Enter Password")){
                jPassword.setEchoChar('•');
            }
            if (!jPasswordConfirmPassword.getText().equals("Retype Password")){
                jPasswordConfirmPassword.setEchoChar('•');
            }
        }
    }
    public void sign_up_button(){
        boolean isError = false;
        String error = "";
        String name = jTextboxName.getText();
        String gender = (jComboBoxGender.getSelectedItem()).toString();
        
        String birthday_day = jTextBirthday_day.getText();
        String birthday_month = jTextBirthday_month.getText();
        String birthday_year = jTextBirthday_year.getText();
        String birthday = birthday_year + "-" + birthday_month + "-" + birthday_day;
        String blk = jTextBlkNo.getText();
        String lot = jTextLotNo.getText();
        String street = jTextStreet.getText();
        String barangay = jTextBarangay.getText();
        String city = jTextCity.getText();
        String province = jTextProvince.getText();
        if (!blk.equals("Enter Blk")){
            blk = "BLK " + jTextBlkNo.getText() + " " ;
        }
        else{
            blk = "";
        }
        if (!lot.equals("Enter Lot")){
            lot = "LOT " + jTextLotNo.getText() + ", ";
        }
        else{
            lot = "";
        }
        if (!street.equals("Enter Street")){
            street = jTextStreet.getText() + ", ";
        }
        else{
            street = "";
        }
        String address = blk + lot + street + barangay  + ", " + city + ", " + province;
        int age = 0;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate birthdayDate = LocalDate.parse(birthday, formatter);
            LocalDate currentDate = LocalDate.now();
            age = Period.between(birthdayDate, currentDate).getYears();
        }
        catch(Exception e){
            error += "Birthday is Invalid\n";
            isError = true;
        }
        String contactno = jTextContactNo.getText();
        String username = jTextUsername.getText();
        if (!username.isBlank()){
            username = jTextUsername.getText();
        }
        String password = jPassword.getText();
        String confirmpassword = jPasswordConfirmPassword.getText();
        boolean isTreasurer = false;
        if (name.equals("Enter Name")){
            error += "Name is Empty\n";
            isError = true;
        }
        if (birthday_day.isBlank() || birthday_month.isBlank() || birthday_year.isBlank()){
            error += "Birthday is Empty\n";
            isError = true;
        }
        if (barangay.equals("Enter Barangay")){
            error += "Barangay is Empty\n";
            isError = true;
        }
        if (city.equals("Enter City")){
            error += "City is Empty\n";
            isError = true;
        }
        if (province.equals("Enter Province")){
            error += "Province is Empty\n";
            isError = true;
        }
        if (contactno.equals("Enter Contact No")){
            error += "Contact No is Empty\n";
            isError = true;
        }
        if (username.equals("Enter Username")){
            error += "Username is Empty\n";
            isError = true;
        }
        if (!password.equals(confirmpassword)){
            error += "Passwords do not match\n";
            isError = true;
        }
        if (isError){
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Faithmetric.sign_up(name,gender,birthday,address,age,contactno,username,password,isTreasurer);
    }
    public void switch_log_in(){
        this.dispose();
        new LogIn().setVisible(true);
    }
    public Create_account() {
        initComponents();
        jPassword.setEchoChar((char)0);
        jPasswordConfirmPassword.setEchoChar((char)0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextCity1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextboxName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextBlkNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordConfirmPassword = new javax.swing.JPasswordField();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextBirthday_day = new javax.swing.JTextField();
        jTextLotNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextStreet = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextBarangay = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextCity = new javax.swing.JTextField();
        jTextProvince = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextContactNo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jRadioShowPassword = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jSwitchLogIn = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextUsername = new javax.swing.JTextField();
        jTextBirthday_month = new javax.swing.JTextField();
        jTextBirthday_year = new javax.swing.JTextField();

        jTextCity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCity1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(610, 725));
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(30, 63, 102));
        jPanel4.setPreferredSize(new java.awt.Dimension(680, 680));

        jLabel2.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:*");

        jLabel3.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADDRESS :");

        jTextboxName.setForeground(new java.awt.Color(153, 153, 153));
        jTextboxName.setText("Enter Name");
        jTextboxName.setToolTipText("Enter Name");
        jTextboxName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextboxNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextboxNameFocusLost(evt);
            }
        });
        jTextboxName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextboxNameActionPerformed(evt);
            }
        });
        jTextboxName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextboxNameKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SIGN UP");

        jTextBlkNo.setForeground(new java.awt.Color(153, 153, 153));
        jTextBlkNo.setText("Enter Blk");
        jTextBlkNo.setToolTipText("Enter Blk");
        jTextBlkNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextBlkNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextBlkNoFocusLost(evt);
            }
        });
        jTextBlkNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBlkNoActionPerformed(evt);
            }
        });
        jTextBlkNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextBlkNoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("City :*");

        jPasswordConfirmPassword.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordConfirmPassword.setText("Retype Password");
        jPasswordConfirmPassword.setToolTipText("Retype Password");
        jPasswordConfirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordConfirmPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordConfirmPasswordFocusLost(evt);
            }
        });

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE ", "FEMALE" }));
        jComboBoxGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGenderActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender :");

        jLabel7.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Birthday :*");

        jTextBirthday_day.setForeground(new java.awt.Color(153, 153, 153));
        jTextBirthday_day.setText("DD");
        jTextBirthday_day.setToolTipText("DD");
        jTextBirthday_day.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextBirthday_dayFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextBirthday_dayFocusLost(evt);
            }
        });
        jTextBirthday_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBirthday_dayActionPerformed(evt);
            }
        });
        jTextBirthday_day.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextBirthday_dayKeyTyped(evt);
            }
        });

        jTextLotNo.setForeground(new java.awt.Color(153, 153, 153));
        jTextLotNo.setText("Enter Lot");
        jTextLotNo.setToolTipText("Enter Lot");
        jTextLotNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextLotNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextLotNoFocusLost(evt);
            }
        });
        jTextLotNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextLotNoActionPerformed(evt);
            }
        });
        jTextLotNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextLotNoKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Blk No :");

        jLabel9.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Lot No :");

        jTextStreet.setForeground(new java.awt.Color(153, 153, 153));
        jTextStreet.setText("Enter Street");
        jTextStreet.setToolTipText("Enter Street");
        jTextStreet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextStreetFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextStreetFocusLost(evt);
            }
        });
        jTextStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextStreetActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Street :");

        jTextBarangay.setForeground(new java.awt.Color(153, 153, 153));
        jTextBarangay.setText("Enter Barangay");
        jTextBarangay.setToolTipText("Enter Barangay");
        jTextBarangay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextBarangayFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextBarangayFocusLost(evt);
            }
        });
        jTextBarangay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBarangayActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Barangay :*");

        jTextCity.setForeground(new java.awt.Color(153, 153, 153));
        jTextCity.setText("Enter City");
        jTextCity.setToolTipText("Enter City");
        jTextCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextCityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextCityFocusLost(evt);
            }
        });
        jTextCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCityActionPerformed(evt);
            }
        });

        jTextProvince.setForeground(new java.awt.Color(153, 153, 153));
        jTextProvince.setText("Enter Province");
        jTextProvince.setToolTipText("Enter Province");
        jTextProvince.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextProvinceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextProvinceFocusLost(evt);
            }
        });
        jTextProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextProvinceActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Province :*");

        jTextContactNo.setForeground(new java.awt.Color(153, 153, 153));
        jTextContactNo.setText("Enter Contact No");
        jTextContactNo.setToolTipText("Enter Contact No");
        jTextContactNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextContactNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextContactNoFocusLost(evt);
            }
        });
        jTextContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextContactNoActionPerformed(evt);
            }
        });
        jTextContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextContactNoKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Contact No :*");

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
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Password :*");

        jLabel16.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Confirm Password :*");

        jRadioShowPassword.setBackground(new java.awt.Color(30, 63, 102));
        jRadioShowPassword.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jRadioShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        jRadioShowPassword.setText("Show password");
        jRadioShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioShowPasswordActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSwitchLogIn.setForeground(new java.awt.Color(255, 255, 255));
        jSwitchLogIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSwitchLogIn.setText("Already have an account?");
        jSwitchLogIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jSwitchLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSwitchLogInMouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Username :*");

        jTextUsername.setForeground(new java.awt.Color(153, 153, 153));
        jTextUsername.setText("Enter Username");
        jTextUsername.setToolTipText("Enter Username");
        jTextUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextUsernameFocusLost(evt);
            }
        });
        jTextUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUsernameActionPerformed(evt);
            }
        });

        jTextBirthday_month.setForeground(new java.awt.Color(153, 153, 153));
        jTextBirthday_month.setText("MM");
        jTextBirthday_month.setToolTipText("MM");
        jTextBirthday_month.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextBirthday_monthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextBirthday_monthFocusLost(evt);
            }
        });
        jTextBirthday_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBirthday_monthActionPerformed(evt);
            }
        });
        jTextBirthday_month.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextBirthday_monthKeyTyped(evt);
            }
        });

        jTextBirthday_year.setForeground(new java.awt.Color(153, 153, 153));
        jTextBirthday_year.setText("YYYY");
        jTextBirthday_year.setToolTipText("YYYY");
        jTextBirthday_year.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextBirthday_yearFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextBirthday_yearFocusLost(evt);
            }
        });
        jTextBirthday_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBirthday_yearActionPerformed(evt);
            }
        });
        jTextBirthday_year.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextBirthday_yearKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(303, 303, 303))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextBlkNo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(105, 105, 105)
                                                .addComponent(jTextBirthday_month, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(48, 48, 48))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(158, 158, 158)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextBirthday_year, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextBarangay)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextBirthday_day, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextLotNo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSwitchLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCity, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextUsername)
                            .addComponent(jTextProvince)
                            .addComponent(jPasswordConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(jLabel18)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextboxName, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7))
                .addGap(0, 100, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextboxName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextBirthday_day, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextBirthday_month, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextBirthday_year, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextBlkNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextLotNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextBarangay, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioShowPassword)
                                .addGap(3, 3, 3)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(jSwitchLogIn))
                            .addComponent(jTextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );

        jLabel3.getAccessibleContext().setAccessibleName("Username");
        jTextBirthday_day.getAccessibleContext().setAccessibleDescription("DD/MM/YYYY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextboxNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextboxNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextboxNameActionPerformed

    private void jTextBlkNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBlkNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBlkNoActionPerformed

    private void jComboBoxGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGenderActionPerformed

    private void jTextBirthday_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBirthday_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBirthday_dayActionPerformed

    private void jTextLotNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextLotNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextLotNoActionPerformed

    private void jTextStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextStreetActionPerformed

    private void jTextBarangayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBarangayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBarangayActionPerformed

    private void jTextCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCityActionPerformed

    private void jTextProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextProvinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextProvinceActionPerformed

    private void jTextCity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCity1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCity1ActionPerformed

    private void jTextContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextContactNoActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jTextUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUsernameActionPerformed

    private void jTextBirthday_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBirthday_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBirthday_monthActionPerformed

    private void jTextBirthday_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBirthday_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBirthday_yearActionPerformed

    private void jTextboxNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextboxNameFocusGained
        name_focus_gain();
    }//GEN-LAST:event_jTextboxNameFocusGained

    private void jTextboxNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextboxNameFocusLost
        name_focus_lost();
    }//GEN-LAST:event_jTextboxNameFocusLost

    private void jTextboxNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextboxNameKeyTyped
        name_key_type(evt);
    }//GEN-LAST:event_jTextboxNameKeyTyped

    private void jTextBirthday_dayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextBirthday_dayFocusGained
        birthday_day_focus_gain();
    }//GEN-LAST:event_jTextBirthday_dayFocusGained

    private void jTextBirthday_dayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextBirthday_dayFocusLost
        birthday_day_focus_lost();
    }//GEN-LAST:event_jTextBirthday_dayFocusLost

    private void jTextBirthday_dayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBirthday_dayKeyTyped
        birthday_day_key_type(evt);
    }//GEN-LAST:event_jTextBirthday_dayKeyTyped

    private void jTextBirthday_monthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextBirthday_monthFocusGained
        birthday_month_focus_gain();
    }//GEN-LAST:event_jTextBirthday_monthFocusGained

    private void jTextBirthday_monthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextBirthday_monthFocusLost
        birthday_month_focus_lost();
    }//GEN-LAST:event_jTextBirthday_monthFocusLost

    private void jTextBirthday_monthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBirthday_monthKeyTyped
        birthday_month_key_type(evt);
    }//GEN-LAST:event_jTextBirthday_monthKeyTyped

    private void jTextBirthday_yearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextBirthday_yearFocusGained
        birthday_year_focus_gain();
    }//GEN-LAST:event_jTextBirthday_yearFocusGained

    private void jTextBirthday_yearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextBirthday_yearFocusLost
        birthday_year_focus_lost();
    }//GEN-LAST:event_jTextBirthday_yearFocusLost

    private void jTextBirthday_yearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBirthday_yearKeyTyped
        birthday_year_key_type(evt);
    }//GEN-LAST:event_jTextBirthday_yearKeyTyped

    private void jTextBlkNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextBlkNoFocusGained
        blk_no_focus_gain();
    }//GEN-LAST:event_jTextBlkNoFocusGained

    private void jTextBlkNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextBlkNoFocusLost
        blk_no_focus_lost();
    }//GEN-LAST:event_jTextBlkNoFocusLost

    private void jTextBlkNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBlkNoKeyTyped
        blk_no_key_type(evt);
    }//GEN-LAST:event_jTextBlkNoKeyTyped

    private void jTextLotNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextLotNoFocusGained
        lot_no_focus_gain();
    }//GEN-LAST:event_jTextLotNoFocusGained

    private void jTextLotNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextLotNoFocusLost
        lot_no_focus_lost();
    }//GEN-LAST:event_jTextLotNoFocusLost

    private void jTextLotNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextLotNoKeyTyped
        lot_no_key_type(evt);
    }//GEN-LAST:event_jTextLotNoKeyTyped

    private void jTextStreetFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextStreetFocusGained
        street_focus_gain();
    }//GEN-LAST:event_jTextStreetFocusGained

    private void jTextStreetFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextStreetFocusLost
        street_focus_lost();
    }//GEN-LAST:event_jTextStreetFocusLost

    private void jTextBarangayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextBarangayFocusGained
        barangay_focus_gain();
    }//GEN-LAST:event_jTextBarangayFocusGained

    private void jTextBarangayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextBarangayFocusLost
        barangay_focus_lost();
    }//GEN-LAST:event_jTextBarangayFocusLost

    private void jTextCityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextCityFocusGained
        city_focus_gain();
    }//GEN-LAST:event_jTextCityFocusGained

    private void jTextCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextCityFocusLost
        city_focus_lost();
    }//GEN-LAST:event_jTextCityFocusLost

    private void jTextContactNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextContactNoFocusGained
        contact_no_focus_gain();
    }//GEN-LAST:event_jTextContactNoFocusGained

    private void jTextContactNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextContactNoFocusLost
        contact_no_focus_lost();
    }//GEN-LAST:event_jTextContactNoFocusLost

    private void jTextContactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextContactNoKeyTyped
        contact_no_key_type(evt);
    }//GEN-LAST:event_jTextContactNoKeyTyped

    private void jTextUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextUsernameFocusGained
        username_focus_gain();
    }//GEN-LAST:event_jTextUsernameFocusGained

    private void jTextUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextUsernameFocusLost
        username_focus_lost();
    }//GEN-LAST:event_jTextUsernameFocusLost

    private void jPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFocusGained
        password_focus_gain();
    }//GEN-LAST:event_jPasswordFocusGained

    private void jPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFocusLost
        password_focus_lost();
    }//GEN-LAST:event_jPasswordFocusLost

    private void jPasswordConfirmPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordConfirmPasswordFocusGained
        confirm_password_focus_gain();
    }//GEN-LAST:event_jPasswordConfirmPasswordFocusGained

    private void jPasswordConfirmPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordConfirmPasswordFocusLost
        confirm_password_focus_lost();
    }//GEN-LAST:event_jPasswordConfirmPasswordFocusLost

    private void jTextProvinceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextProvinceFocusGained
        province_focus_gain();
    }//GEN-LAST:event_jTextProvinceFocusGained

    private void jTextProvinceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextProvinceFocusLost
        province_focus_lost();
    }//GEN-LAST:event_jTextProvinceFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sign_up_button();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSwitchLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSwitchLogInMouseClicked
        switch_log_in();
    }//GEN-LAST:event_jSwitchLogInMouseClicked

    private void jRadioShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioShowPasswordActionPerformed
        show_password();
    }//GEN-LAST:event_jRadioShowPasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPasswordField jPasswordConfirmPassword;
    private javax.swing.JRadioButton jRadioShowPassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jSwitchLogIn;
    private javax.swing.JTextField jTextBarangay;
    private javax.swing.JTextField jTextBirthday_day;
    private javax.swing.JTextField jTextBirthday_month;
    private javax.swing.JTextField jTextBirthday_year;
    private javax.swing.JTextField jTextBlkNo;
    private javax.swing.JTextField jTextCity;
    private javax.swing.JTextField jTextCity1;
    private javax.swing.JTextField jTextContactNo;
    private javax.swing.JTextField jTextLotNo;
    private javax.swing.JTextField jTextProvince;
    private javax.swing.JTextField jTextStreet;
    private javax.swing.JTextField jTextUsername;
    private javax.swing.JTextField jTextboxName;
    // End of variables declaration//GEN-END:variables
}
