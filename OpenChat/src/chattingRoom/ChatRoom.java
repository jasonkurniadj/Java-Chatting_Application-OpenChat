package chattingRoom;

import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import java.awt.event.*;
import java.rmi.*;
import loginRegister.*;
import chatServer.*;
import menuOption.*;

/**
 *
 * @author Jason.
 */
public class ChatRoom extends JFrame{
    private static int check = 0;
    
    public ChatRoom() {
        initComponents();
        main(new String[0]);
        System.out.println("0x");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_userOnline = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_room = new javax.swing.JTextArea();
        txt_chat = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_send = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_logout = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_editDetails = new javax.swing.JMenuItem();
        menu_editPassword = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menu_help = new javax.swing.JMenuItem();
        menu_about = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

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

        txt_userOnline.setColumns(20);
        txt_userOnline.setRows(5);
        jScrollPane1.setViewportView(txt_userOnline);

        txt_room.setColumns(20);
        txt_room.setRows(5);
        txt_room.setText("Welcome...\n");
        jScrollPane2.setViewportView(txt_room);

        txt_chat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_chat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_chatKeyPressed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Users" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User Online");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select user");

        btn_send.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_send.setText(">");
        btn_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_chat)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_send, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_chat, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btn_send, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu1.setText("File");

        menu_logout.setSelected(true);
        menu_logout.setText("Logout");
        menu_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_logoutActionPerformed(evt);
            }
        });
        jMenu1.add(menu_logout);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        menu_editDetails.setText("Edit Details");
        menu_editDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_editDetailsActionPerformed(evt);
            }
        });
        jMenu2.add(menu_editDetails);

        menu_editPassword.setText("Change Password");
        menu_editPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_editPasswordActionPerformed(evt);
            }
        });
        jMenu2.add(menu_editPassword);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        menu_help.setText("Help Contents");
        menu_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_helpActionPerformed(evt);
            }
        });
        jMenu3.add(menu_help);

        menu_about.setText("About");
        menu_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_aboutActionPerformed(evt);
            }
        });
        jMenu3.add(menu_about);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

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

    private void txt_chatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_chatKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER && !txt_chat.getText().equals("")){
            try {
                iserver.msgToServer(txt_chat.getText(), nickname, jComboBox1.getSelectedItem().toString());
                txt_chat.setText("");
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_txt_chatKeyPressed

    private void menu_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_aboutActionPerformed
        new AboutUs();
    }//GEN-LAST:event_menu_aboutActionPerformed

    private void menu_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_logoutActionPerformed
        try {
            iserver.logoutToServer(userObj, nickname);
            this.dispose();
            JOptionPane.showMessageDialog(cr, "Thank You for Using OpenChat! See You Again..", "Thank You", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } catch (RemoteException ex) {
            Logger.getLogger(ChatRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menu_logoutActionPerformed

    private void menu_editDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_editDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_editDetailsActionPerformed

    private void menu_editPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_editPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_editPasswordActionPerformed

    private void btn_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendActionPerformed
        try {
            iserver.msgToServer(txt_chat.getText(), nickname, jComboBox1.getSelectedItem().toString());
            txt_chat.setText("");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_sendActionPerformed

    private void menu_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_helpActionPerformed
        new Help();
    }//GEN-LAST:event_menu_helpActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt){
        try {
            if(iserver != null)
                iserver.logoutToServer(userObj, nickname);
        } catch (RemoteException e) {
            Logger.getLogger(ChatRoom.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public static void chat(){
        try {
            //cr = new ChatRoom();
            cr.setLocationRelativeTo(null);
            cr.setVisible(true);
            
            userObj = new  UserObj();
            host = JOptionPane.showInputDialog("Input Server", "localhost");
            iserver = (IServer)Naming.lookup("//"+host+"/OpenChatServer");

            check++;
            boolean flag = true;
            while(flag){
                nickname = JOptionPane.showInputDialog("Input Display Name");

                if(nickname == null){
                    JOptionPane.showMessageDialog(cr, "Please Input Display Name!", "Warning!", JOptionPane.WARNING_MESSAGE);
                }
                else if(!nickname.equalsIgnoreCase("")){
                    if(iserver.registerToServer(userObj, nickname)){
                        cr.setTitle("OpenChat (Beta Version) | "+nickname);
                        flag = false;
                    }
                    else{
                        JOptionPane.showMessageDialog(cr, "Display Name Already Exists!", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            
            if(check == 0){
                JOptionPane.showMessageDialog(cr, "Can't Connect to Server!", "Error", JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                chat();
            }
        });
    }

    public static void _msgArrived(String msg, String fromUser){
        cr.newMsg(msg, fromUser);
    }
    public static void _updateUserList(List<String> UsersName){
        cr.newUser(UsersName);
    }
    
    public void newUser(List<String> UsersName){
        txt_userOnline.setText("");
        String selectedUser = jComboBox1.getSelectedItem().toString();
        jComboBox1.removeAllItems();
        jComboBox1.addItem("All Users");
        
        for(String userName : UsersName){
            if(userName.length() > 15){
                userName = userName.substring(0,15)+"...";
            }
            
            txt_userOnline.append(" "+userName+"\n");
            jComboBox1.addItem(userName);
        }
        
        jComboBox1.setSelectedItem(selectedUser);
    }
    
    public void newMsg(String msg, String fromUser){
        txt_room.append(fromUser+" : "+msg+"\n");
    }
    
    static ChatRoom cr = new ChatRoom();
    static UserObj userObj;
    static IServer iserver;
    static String host;
    static String nickname;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_send;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JMenuItem menu_about;
    private javax.swing.JMenuItem menu_editDetails;
    private javax.swing.JMenuItem menu_editPassword;
    private javax.swing.JMenuItem menu_help;
    private javax.swing.JCheckBoxMenuItem menu_logout;
    private javax.swing.JTextField txt_chat;
    private javax.swing.JTextArea txt_room;
    private javax.swing.JTextArea txt_userOnline;
    // End of variables declaration//GEN-END:variables
}
