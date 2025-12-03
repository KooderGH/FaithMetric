package com.mycompany.faithmetric;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Faithmetric {
    String url="jdbc:mysql://localhost:3306/faithmetric";
    String user="root";
    String password="root";
    
    public static String usernameSession;
    public static boolean isTreasurer;
    public void sign_up(String name, String gender,String birthday,String address,int age,String contactno,String username,String userpassword,boolean isTreasurer){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url,user,password);
            String query="select username from member where username = '" + username + "'";
            Statement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery(query);
            
            while(resultSet.next()){
                usernameSession = resultSet.getString("username");
            }
            if (usernameSession.equals(username)){
                JOptionPane.showMessageDialog(null, "A user with this username already exist", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.getLogger(Faithmetric.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url,user,password);
            String query="insert into member(memberName,gender,birthDate,age,address,contactNum,username,password,isTreasurer) values('"+name+"','"+gender+"',STR_TO_DATE('"+birthday+"', '%Y-%m-%d'),"+age+",'"+address+"','"+contactno+"','"+username+"','"+userpassword+"'," + isTreasurer +")";
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (ClassNotFoundException | SQLException ex) {
            System.getLogger(Faithmetric.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    public String log_in(String username, String userpassword){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url,user,password);
            String query="select username, isTreasurer from member where username = '" + username + "' and password = '" + userpassword + "'";
            Statement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery(query);
            
            while(resultSet.next()){
                usernameSession = resultSet.getString("username");
                isTreasurer = resultSet.getBoolean("isTreasurer");
            }
            if (isTreasurer == true){
                return "treasurer";
            }
            else {
                return "member";
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.getLogger(Faithmetric.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return "incorrect";
    }
}
