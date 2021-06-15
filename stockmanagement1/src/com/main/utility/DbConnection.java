/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.utility;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author NIVEDITA BIRAJDAR
 */
public class DbConnection {
    
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    boolean flag=false;
    
    //Constructor starts
    public DbConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","");
            stmt=con.createStatement();
        }catch(ClassNotFoundException | SQLException e){
        }
    }//end of constructor ConnectionFactory
    
    //method Connection starts
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","");
        }catch(ClassNotFoundException | SQLException e){
        }
        return con;
    }//end of method Connection
    
    //method checkLogin starts
    public boolean checkLogin(String username,String password){
        
            String query="SELECT * FROM users WHERE username='"+username+"' AND password='"+password+"'";
            try{
                rs=stmt.executeQuery(query);
                while(rs.next()){
                    flag=true;
                }
            }catch(SQLException e){
            }
        return flag;
    }
}
