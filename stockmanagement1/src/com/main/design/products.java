/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.design;

import com.main.utility.DbConnection;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NIVEDITA BIRAJDAR
 */
public final class products extends javax.swing.JFrame {

    /**
     * Creates new form products
     */
    public products() {
        initComponents();
        // productCodeTxt.setVisible(false);
          loadDatas();
          supplier_name();
    }

    private void supplier_name()
    {
        try{
        PreparedStatement stmt;
        com.mysql.jdbc.Connection con;
        try
        {
         
            con = (com.mysql.jdbc.Connection) new DbConnection().getConnection();
          
            stmt = con.prepareStatement("select * from suppliers");
     ResultSet rs =stmt.executeQuery();

            
           System.out.println("after resultset");
           
          try{
            while(rs.next())
            {
               // String workername=rs.getString(2);
                cmbSupllier.addItem(rs.getString(2));
            
            }
          } catch(SQLException  e)
        {
            
        }
        }catch(NullPointerException e)
   {
   }
        }
        
        
           
        
        catch(SQLException  e)
        {
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        searchTxt = new javax.swing.JTextField();
        searchByLab = new javax.swing.JLabel();
        refreshBttn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        productNameLab = new javax.swing.JLabel();
        productNameTxt = new javax.swing.JTextField();
        costPriceLab = new javax.swing.JLabel();
        costPriceTxt = new javax.swing.JTextField();
        stateTxt = new javax.swing.JTextField();
        priceLab1 = new javax.swing.JLabel();
        addProduct = new javax.swing.JLabel();
        editBttn = new javax.swing.JLabel();
        deleteBttn = new javax.swing.JLabel();
        clearBttn = new javax.swing.JLabel();
        cmbSupllier = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        costPriceLab1 = new javax.swing.JLabel();
        costPriceLab2 = new javax.swing.JLabel();
        costPriceLab3 = new javax.swing.JLabel();
        costPriceLab4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comfortaa", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("PRODUCTS");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        searchTxt.setToolTipText("Search using Product Name, Brand Name OR Product Code");
        searchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtActionPerformed(evt);
            }
        });
        searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtKeyReleased(evt);
            }
        });

        searchByLab.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        searchByLab.setText("Search");

        refreshBttn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        refreshBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reload.png"))); // NOI18N
        refreshBttn.setText("Refresh");
        refreshBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBttnActionPerformed(evt);
            }
        });

        jPanel1.setBorder(BorderFactory.createLineBorder(Color.black));

        productNameLab.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        productNameLab.setText("Product Name :");

        productNameTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        productNameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                productNameTxtKeyPressed(evt);
            }
        });

        costPriceLab.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        costPriceLab.setText("Cost Price :");

        costPriceTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        costPriceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costPriceTxtActionPerformed(evt);
            }
        });
        costPriceTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                costPriceTxtKeyPressed(evt);
            }
        });

        stateTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        stateTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                stateTxtKeyPressed(evt);
            }
        });

        priceLab1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priceLab1.setText("State of Product :");

        addProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addProductMouseClicked(evt);
            }
        });

        editBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBttnMouseClicked(evt);
            }
        });

        deleteBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBttnMouseClicked(evt);
            }
        });

        clearBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBttnMouseClicked(evt);
            }
        });

        cmbSupllier.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbSupllier.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Supplier's Name" }));
        cmbSupllier.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSupllierItemStateChanged(evt);
            }
        });
        cmbSupllier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSupllierActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add item.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit item.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete item.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        costPriceLab1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        costPriceLab1.setText("Add");

        costPriceLab2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        costPriceLab2.setText("Edit");

        costPriceLab3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        costPriceLab3.setText("Delete");

        costPriceLab4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        costPriceLab4.setText("Clear");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addProduct)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(editBttn)
                        .addGap(21, 21, 21)
                        .addComponent(deleteBttn)
                        .addGap(18, 18, 18)
                        .addComponent(clearBttn))
                    .addComponent(productNameLab)
                    .addComponent(costPriceLab, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceLab1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(stateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addComponent(costPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(costPriceLab2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(cmbSupllier, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(costPriceLab1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(costPriceLab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(costPriceLab4)
                                .addGap(19, 19, 19)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(cmbSupllier, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(productNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productNameLab))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(costPriceLab, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(costPriceTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addProduct)
                            .addComponent(deleteBttn)
                            .addComponent(clearBttn)
                            .addComponent(editBttn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(priceLab1)
                                    .addComponent(stateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(costPriceLab1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(costPriceLab2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costPriceLab3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costPriceLab4))))
                .addContainerGap())
        );

        jTabbedPane1.addTab("PRODUCTS", jPanel1);

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/printLarge.png"))); // NOI18N
        jButton6.setText("Print");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(refreshBttn)
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(130, 130, 130)
                .addComponent(searchByLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(refreshBttn)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchByLab, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
DefaultTableModel Df = (DefaultTableModel)table.getModel();
        int selectedIndex = table.getSelectedRow();
        //comboBox .setSelectedItem(Df.getValueAt(selectedIndex, 1).toString());    
       productNameTxt .setText(Df.getValueAt(selectedIndex, 1).toString());
       costPriceTxt .setText(Df.getValueAt(selectedIndex, 2).toString());
      stateTxt  .setText(Df.getValueAt(selectedIndex, 3).toString());
          
    }//GEN-LAST:event_tableMouseClicked

     
    private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtKeyReleased

             
    }//GEN-LAST:event_searchTxtKeyReleased

        
    private void refreshBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBttnActionPerformed

       // productCodeTxt.setText("");
        productNameTxt.setText("");
        costPriceTxt.setText("");
        stateTxt.setText("");
       
    }//GEN-LAST:event_refreshBttnActionPerformed

    private void addProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProductMouseClicked
      
    }//GEN-LAST:event_addProductMouseClicked

    private void editBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBttnMouseClicked
   
    }//GEN-LAST:event_editBttnMouseClicked
 
 public void loadDatas(){
 int c;
//Connection con;
try 
{
    
    com.mysql.jdbc.Connection  con1 = (com.mysql.jdbc.Connection) new DbConnection().getConnection();
     PreparedStatement insert = con1.prepareStatement("select * from products");
     ResultSet rs =insert.executeQuery();
     ResultSetMetaData Rss = rs.getMetaData();
     c = Rss.getColumnCount();
     DefaultTableModel Df;
     Df = (DefaultTableModel) table.getModel();
     Df.setRowCount(0);

while(rs.next ())
{

Vector v2 = new Vector();

for(int a=1; a<=c ; a++)
{

v2.add(rs.getString("pid"));
v2.add(rs.getString("productname"));
v2.add(rs.getString("costprice"));
v2.add(rs.getString("state"));

}
Df.addRow(v2); 
}
}

catch(SQLException ex) {

Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);


}
        
        
        
    }//end of method DefaultTableModel
    
    
    
    private void deleteBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBttnMouseClicked
        
    }//GEN-LAST:event_deleteBttnMouseClicked

    private void clearBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBttnMouseClicked
       
        productNameTxt.setText("");
        costPriceTxt.setText("");
        stateTxt.setText("");
       
    }//GEN-LAST:event_clearBttnMouseClicked

    private void cmbSupllierItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSupllierItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSupllierItemStateChanged

    private void cmbSupllierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSupllierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSupllierActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // Connection con1;
        try{
PreparedStatement insert ;
String name= productNameTxt.getText(); 
Double cost=  Double.parseDouble(costPriceTxt.getText());
String state= stateTxt.getText();
        if (productNameTxt.getText().equals("") || costPriceTxt.getText().equals("") || stateTxt.getText().equals(""))  {
            JOptionPane.showMessageDialog(null, "Please fill all the fields!");
        } else {
           try{
   com.mysql.jdbc.Connection  con1 = (com.mysql.jdbc.Connection) new DbConnection().getConnection();    
                  
insert=con1.prepareStatement ("INSERT INTO products(productname,costprice,state) VALUES(?,?,?)");
insert.setString(1,name);
insert.setDouble(2,cost);
insert.setString(3,state);
insert.executeUpdate(); 

insert=con1.prepareStatement ("INSERT INTO currentstocks(pid,quantity) VALUES(?,?)");
insert.setString(1,name);
insert.setDouble(2,cost);
insert.setString(3,"");
insert.executeUpdate(); 

JOptionPane.showMessageDialog(this,"Record Added.....!!!!!");
            loadDatas();
        }
catch(SQLException  | NullPointerException ex ) {
Logger.getLogger(products.class.getName()).log(Level.SEVERE, null, ex);
}
        }        
  }catch( NullPointerException ex ) {
Logger.getLogger(products.class.getName()).log(Level.SEVERE, null, ex);
}     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
DefaultTableModel Df=(DefaultTableModel)table.getModel();
            int selectedIndex = table.getSelectedRow();
        Connection con1;
PreparedStatement insert ;
       String name= productNameTxt.getText();
       String price= costPriceTxt.getText();
       String state=stateTxt.getText();
       int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString ());
       con1 = (com.mysql.jdbc.Connection) new DbConnection().getConnection();
          if (table.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Select a table data first!");
        } else {
            if (productNameTxt.getText().equals("") || costPriceTxt.getText().equals("") ||   stateTxt.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields!");
            } else {
                try{
              insert = con1.prepareStatement("UPDATE products SET productname=?,costprice=?,state=? WHERE pid=?");
insert.setString(1, name);
insert.setString (2, price);
insert.setString(3, state);
insert.setInt (4, id);
insert.executeUpdate();   
   JOptionPane.showMessageDialog(null, "Updated Successfully");
                }
               catch (HeadlessException | SQLException e) {
            }   
            }
            loadDatas();
        }
    }//GEN-LAST:event_jButton2ActionPerformed
 Connection con ;
    PreparedStatement pstmt ;
    /*public void deleteProductDAO(int value){
        try{
            String query="DELETE FROM products where pid=?";
            pstmt.setInt(1,value);
            pstmt=con.prepareStatement(query);
            
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted..");
        }catch(SQLException  e){
        }
        deleteStock();
    }*/
    
    public void deleteStock(){
         try{
             Statement stmt = null;
             String q="DELETE FROM currentstocks WHERE pid ";
             
             //stmt.executeUpdate(q);
             stmt.executeUpdate(q);
         }catch(SQLException e){
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (table.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Select a table data first!");
        } else {
            DefaultTableModel Df = (DefaultTableModel)table.getModel();
        int selectedIndex = table.getSelectedRow();
        java.sql.Connection con1;
        PreparedStatement insert;
        try {

            int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());

            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to Delete the Record", "warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION)
            {
                con1 = (com.mysql.jdbc.Connection) new DbConnection().getConnection();
                insert = con1.prepareStatement("delete from products where pid=?");
                insert.setInt(1,id);
                insert.executeUpdate();
                JOptionPane.showMessageDialog(this,"Record Update");
                loadDatas();
                productNameTxt.setText("");
                costPriceTxt.setText("");
                stateTxt.setText("");                        
                productNameTxt .requestFocus();
            }
        }

        catch(SQLException ex) {

            Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);

        }
deleteStock();
           
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        productNameTxt.setText("");
                costPriceTxt.setText("");
                stateTxt.setText("");     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void costPriceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costPriceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costPriceTxtActionPerformed
public void close(){
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
     }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
  new menu().setVisible(true);
  close();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void productNameTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productNameTxtKeyPressed
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c) )
        {
           productNameTxt.setEditable(true);
            
    
        }
        else
        {
        JOptionPane.showMessageDialog(null," Please Enter valid product name.......");
            
        }
        
    }//GEN-LAST:event_productNameTxtKeyPressed

    private void costPriceTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costPriceTxtKeyPressed
        // TODO add your handling code here:
         String telephone=costPriceTxt.getText();
        int length=telephone.length();
        char c=evt.getKeyChar();
        if (Character.isLetter(c))
        {
            JOptionPane.showMessageDialog(null,"Please enter numbers only");
        }
        else{
        if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9' )
        {
            if(length<10)
            { 
              costPriceTxt.setEditable(true);
            }else{
              costPriceTxt.setEditable(false);
            }  
        }
        }
    }//GEN-LAST:event_costPriceTxtKeyPressed

    private void stateTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stateTxtKeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c) )
        {
           stateTxt.setEditable(true);
            
    
        }
        else
        {
        JOptionPane.showMessageDialog(null," Please Enter valid product name.......");
            
        }
    }//GEN-LAST:event_stateTxtKeyPressed

    private void searchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addProduct;
    private javax.swing.JLabel clearBttn;
    private javax.swing.JComboBox cmbSupllier;
    private javax.swing.JLabel costPriceLab;
    private javax.swing.JLabel costPriceLab1;
    private javax.swing.JLabel costPriceLab2;
    private javax.swing.JLabel costPriceLab3;
    private javax.swing.JLabel costPriceLab4;
    private javax.swing.JTextField costPriceTxt;
    private javax.swing.JLabel deleteBttn;
    private javax.swing.JLabel editBttn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel priceLab1;
    private javax.swing.JLabel productNameLab;
    private javax.swing.JTextField productNameTxt;
    private javax.swing.JButton refreshBttn;
    private javax.swing.JLabel searchByLab;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JTextField stateTxt;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
