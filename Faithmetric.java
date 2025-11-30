package com.mycompany.faithmetric;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Faithmetric {
    // Written by Aaron
    public void sign_up(String name, String gender,String birthday,String address,int age,String contactno,String email,String userpassword){
        String url="jdbc:mysql://localhost:3306/faithmetric";
        String user="root";
        String password="root";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url,user,password);
            String query="insert into member(memberName,gender,birthDate,age,address,contactNum,email,password) values('"+name+"','"+gender+"',STR_TO_DATE('"+birthday+"', '%Y-%m-%d'),"+age+",'"+address+"','"+contactno+"','"+email+"','"+userpassword+"')";
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (ClassNotFoundException | SQLException ex) {
            System.getLogger(Faithmetric.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
