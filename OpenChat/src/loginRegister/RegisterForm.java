package loginRegister;

import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.security.*;

/**
 *
 * @author Jason.
 */
public class RegisterForm extends JFrame {
    Connection conn;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public RegisterForm() {
        initComponents();
        this.setTitle("OpenChat (Beta Version) | Register");
        this.setResizable(false);
        
        rd_male.setSelected(true);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rd_male);
        bg.add(rd_female);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_address = new javax.swing.JTextArea();
        txt_name = new javax.swing.JTextField();
        rd_male = new javax.swing.JRadioButton();
        rd_female = new javax.swing.JRadioButton();
        cmb_year = new javax.swing.JComboBox<>();
        cmb_month = new javax.swing.JComboBox<>();
        cmb_day = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        txt_repassword = new javax.swing.JPasswordField();
        btn_register = new javax.swing.JButton();
        btn_backlogin = new javax.swing.JButton();
        chx_aggrement = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(68, 59, 66));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("OpenChat");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Beta Version");

        lbl_logo.setIcon(new javax.swing.ImageIcon("F:\\Users\\admin\\Documents\\NetBeansProjects\\OpenChat\\assets\\logo.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_logo)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
            .addComponent(lbl_logo)
        );

        jPanel2.setBackground(new java.awt.Color(140, 125, 101));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Register");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DOB");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address");

        txt_address.setColumns(20);
        txt_address.setRows(5);
        jScrollPane1.setViewportView(txt_address);

        txt_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        rd_male.setBackground(new java.awt.Color(140, 125, 101));
        rd_male.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rd_male.setForeground(new java.awt.Color(255, 255, 255));
        rd_male.setText("Male");

        rd_female.setBackground(new java.awt.Color(140, 125, 101));
        rd_female.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rd_female.setForeground(new java.awt.Color(255, 255, 255));
        rd_female.setText("Female");

        cmb_year.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmb_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1987" }));

        cmb_month.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmb_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        cmb_day.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmb_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Username");

        txt_username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password");

        txt_password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Re-Password");

        txt_repassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btn_register.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_register.setText("Register");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        btn_register.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_registerKeyPressed(evt);
            }
        });

        btn_backlogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_backlogin.setText("Back to Login Form");
        btn_backlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backloginActionPerformed(evt);
            }
        });
        btn_backlogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_backloginKeyPressed(evt);
            }
        });

        chx_aggrement.setBackground(new java.awt.Color(140, 125, 101));
        chx_aggrement.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chx_aggrement.setForeground(new java.awt.Color(255, 255, 255));
        chx_aggrement.setText("I agree all terms & conditions.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_backlogin)
                .addGap(177, 177, 177))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(chx_aggrement))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rd_male)
                                .addGap(18, 18, 18)
                                .addComponent(rd_female))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cmb_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_name)
                            .addComponent(jScrollPane1)
                            .addComponent(txt_username)
                            .addComponent(txt_password)
                            .addComponent(txt_repassword))))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_register)
                        .addGap(207, 207, 207))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(166, 166, 166))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_male)
                    .addComponent(rd_female)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_repassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chx_aggrement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btn_register)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_backlogin)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private String dob, monthNum, sha1, enPass;
    
    private void next(){
        if(rd_male.isSelected())
            gender = "male";
        else
            gender = "female";

        if(month == "January")
            monthNum = "01";
        else if(month == "February")
            monthNum = "02";
        else if(month == "March")
            monthNum = "03";
        else if(month == "April")
            monthNum = "04";
        else if(month == "May")
            monthNum = "05";
        else if(month == "June")
            monthNum = "06";
        else if(month == "July")
            monthNum = "07";
        else if(month == "August")
            monthNum = "08";
        else if(month == "September")
            monthNum = "09";
        else if(month == "October")
            monthNum = "10";
        else if(month == "November")
            monthNum = "11";
        else if(month == "December")
            monthNum = "12";

        dob = year+"-"+monthNum+"-"+day;

        enPass = encrypt(pass);

        conn = Database.getCon();

        try {
            //String checkUname = "SELECT username FROM users WHERE username LIKE";
            String sql = "INSERT INTO users VALUES (?,?,?,?,?,?,?,?,?,?)";

            ps = conn.prepareStatement(sql);
            ps.setString(1, null);
            ps.setString(2, name);
            ps.setString(3, dob);
            ps.setString(4, gender);
            ps.setString(5, address);
            ps.setString(6, null);
            ps.setString(7, null);
            ps.setString(8, uname);
            ps.setString(9, pass); //pass or enPass
            ps.setString(10, null);
            ps.execute();

            JOptionPane.showMessageDialog(this, "Success", "Thank You for Register", JOptionPane.INFORMATION_MESSAGE);

            LoginForm login = new LoginForm();
            this.setVisible(false);
            login.setVisible(true);

            // JOptionPane.showMessageDialog(this, "Username Duplicated", "Warning!", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Somethings Wrong", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        if(validation()){
            next();
        }
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_backloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backloginActionPerformed
        LoginForm login = new LoginForm();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_btn_backloginActionPerformed

    private void btn_registerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_registerKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            next();
        }
    }//GEN-LAST:event_btn_registerKeyPressed

    private void btn_backloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_backloginKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            LoginForm login = new LoginForm();
            this.setVisible(false);
            login.setVisible(true);
        }
    }//GEN-LAST:event_btn_backloginKeyPressed

    private String encrypt(String password){
        sha1 = "";
        
        try {
            MessageDigest crypt = MessageDigest.getInstance("SHA-1");
            crypt.reset();
            crypt.update(password.getBytes("UTF-8"));
            sha1 = byteToHex(crypt.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        
        return sha1;
    }
    
    private String byteToHex(final byte[] hash){
        Formatter formatter = new Formatter();
        
        for(byte b : hash){
            formatter.format("%02x", b);
        }
        
        String result = formatter.toString();
        formatter.close();
        
        return result;
    }
    
    private String name, year, month, day, gender, address, uname, pass, repass;
    private boolean validation(){
        name = txt_name.getText();
        year = cmb_year.getSelectedItem().toString();
        month = cmb_month.getSelectedItem().toString();
        day = cmb_day.getSelectedItem().toString();
        
        address = txt_address.getText();
        uname = txt_username.getText();
        pass = String.valueOf(txt_password.getPassword());
        repass = String.valueOf(txt_repassword.getPassword());
        
        if(name.equals("")){
            JOptionPane.showMessageDialog(this, "Please Input Name", "Warning!", JOptionPane.WARNING_MESSAGE);
            txt_name.requestFocus();
            return false;
        }
        else if(name.length()<4 || name.length()>25){
            JOptionPane.showMessageDialog(this, "Please Input Name between 4-25 Characters", "Warning!", JOptionPane.WARNING_MESSAGE);
            txt_name.requestFocus();
            return false;
        }
        else if(year.equalsIgnoreCase("Year")){
            JOptionPane.showMessageDialog(this, "Please Input Year", "Warning!", JOptionPane.WARNING_MESSAGE);
            cmb_year.requestFocus();
            return false;
        }
        else if(month.equalsIgnoreCase("Month")){
            JOptionPane.showMessageDialog(this, "Please Input Month", "Warning!", JOptionPane.WARNING_MESSAGE);
            cmb_month.requestFocus();
            return false;
        }
        else if(year.equalsIgnoreCase("Day")){
            JOptionPane.showMessageDialog(this, "Please Input Day", "Warning!", JOptionPane.WARNING_MESSAGE);
            cmb_day.requestFocus();
            return false;
        }
        else if(address.equals("")){
            JOptionPane.showMessageDialog(this, "Please Input Address", "Warning!", JOptionPane.WARNING_MESSAGE);
            txt_address.requestFocus();
            return false;
        }
        else if(address.length()<10 || address.length()>255){
            JOptionPane.showMessageDialog(this, "Please Input Correct Address", "Warning!", JOptionPane.WARNING_MESSAGE);
            txt_address.requestFocus();
            return false;
        }
        
        else if(uname.equals("")){
            JOptionPane.showMessageDialog(this, "Please Input Username", "Warning!", JOptionPane.WARNING_MESSAGE);
            txt_username.requestFocus();
            return false;
        }
        else if(uname.length()<4 || uname.length()>20){
            JOptionPane.showMessageDialog(this, "Please Input Username between 4-20 Characters", "Warning!", JOptionPane.WARNING_MESSAGE);
            txt_username.requestFocus();
            return false;
        }
        else if(pass.equals("")){
            JOptionPane.showMessageDialog(this, "Please Input Password", "Warning!", JOptionPane.WARNING_MESSAGE);
            txt_password.requestFocus();
            return false;
        }
        else if(pass.length()<6 || pass.length()>20){
            JOptionPane.showMessageDialog(this, "Please Input Password between 6-20 Characters", "Warning!", JOptionPane.WARNING_MESSAGE);
            txt_password.requestFocus();
            return false;
        }
        else if(repass.compareTo(pass) != 0){
            JOptionPane.showMessageDialog(this, "Please Input Correct Password", "Warning!", JOptionPane.WARNING_MESSAGE);
            txt_repassword.requestFocus();
            return false;
        }
        
        else if(!chx_aggrement.isSelected()){
            JOptionPane.showMessageDialog(this, "You must agree all statements", "Warning!", JOptionPane.WARNING_MESSAGE);
            chx_aggrement.requestFocus();
            return false;
        }
        
        return true;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_backlogin;
    private javax.swing.JButton btn_register;
    private javax.swing.JCheckBox chx_aggrement;
    private javax.swing.JComboBox<String> cmb_day;
    private javax.swing.JComboBox<String> cmb_month;
    private javax.swing.JComboBox<String> cmb_year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JRadioButton rd_female;
    private javax.swing.JRadioButton rd_male;
    private javax.swing.JTextArea txt_address;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_repassword;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
