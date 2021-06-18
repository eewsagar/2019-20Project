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
import java.util.HashMap;
import java.util.Map;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaConstants.Constants;
import javax.swing.JOptionPane;

/**
 *
 * @author NIVEDITA BIRAJDAR
 */
public class UpdateStock extends TimerTask {

    @Override
    public void run() {

        try {

            com.mysql.jdbc.Connection con1 = (com.mysql.jdbc.Connection) new DbConnection().getConnection();

            PreparedStatement insert1 = con1.prepareStatement("SELECT "
                    + "cs.pid id, cs.quantity - dc.dailyconsumptionquan "
                    + "quan FROM `currentstocks` cs "
                    + "join tbl_dailyconsumption dc "
                    + "where cs.pid=dc.pid");
                         
            System.out.println("insert : " + insert1);
            ResultSet rs1 = insert1.executeQuery();
            String quantity = "", id = "";
            while (rs1.next()) {
                id = rs1.getString("id");
                quantity = rs1.getString("quan");
                System.out.println("Name : " + id + "   Quantity : " + quantity);

                PreparedStatement insert = con1.prepareStatement("update currentstocks "
                        + "set quantity='" + quantity + "' where pid = '" + id + "'");

                System.out.println("\ninsert : " + insert);

                insert.executeUpdate();

                System.out.println("\n Data updated !!!");

            }

        } catch (SQLException | NullPointerException ex) {
            Logger.getLogger(products.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
}
