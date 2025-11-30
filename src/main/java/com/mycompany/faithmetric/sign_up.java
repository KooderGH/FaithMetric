package com.mycompany.faithmetric;
// Written by Aaron
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
public class sign_up {
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
            System.getLogger(sign_up.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    public static void main(String args[])
    {
        
    }
}
