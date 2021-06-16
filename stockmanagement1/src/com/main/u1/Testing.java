/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.u1;
import com.main.design.products;
import com.main.utility.DbConnection;
import com.main.utility.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaConstants.Constants;
import javax.swing.JOptionPane;
/**
 *
 * @author NIVEDITA BIRAJDAR
 */
public class Testing  extends TimerTask {

    @Override
    public void run() {
        
        try {
                    com.mysql.jdbc.Connection con1 = (com.mysql.jdbc.Connection) new DbConnection().getConnection();
                      int  id =  1;
                    PreparedStatement insert1 = con1.prepareStatement("select * from "
                            + "currentstocks "
                            + "WHERE currentstocks.pid='" + id + "' ");
                    System.out.println("insert : " + insert1);
                    ResultSet rs1 = insert1.executeQuery();
                    String quantity ="" ,name="";
                    while (rs1.next()) {
                         name =  rs1.getString("pid");
                         quantity = rs1.getString("quantity");
                        System.out.println("Name : " + name + "   Quantity : "+quantity);
                    }
                   int onewQuantity =  2 + Integer.parseInt(quantity)    ;   
                    PreparedStatement insert = con1.prepareStatement("update currentstocks "
                            + "set quantity='" + onewQuantity + "' where pid = '" + name + "'");

                    
                    System.out.println("\ninsert : " + insert );
                    
                    insert.executeUpdate();

                    System.out.println("\n Data updated !!!");

                } catch (SQLException | NullPointerException ex) {
                    Logger.getLogger(products.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
         }     


    
    
    
    
//    public void run()
//	{
//
//                GMailServer sender = new GMailServer(Constants.setFrom, Constants.setPassword);
//
//	            try {
//			    sender.sendMail("Subject","This is Java4s",Constants.setFrom,Constants.emailTO);
//			}
//                   catch (Exception e) {
//			     e.printStackTrace();
//			}  
//
//				System.out.println("Email Sent Succesfully...");
//
//	        }

