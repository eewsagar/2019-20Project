/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.design;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author GNPV 
 */
public class slideshownew extends JFrame {
    JLabel pic;
    Timer tm;
    int x=0;
    String[] list={
        "C:\\Users\\NIVEDITA BIRAJDAR\\Documents\\NetBeansProjects\\stockmanagement1\\src\\images\\k.jpeg",
        "C:\\Users\\NIVEDITA BIRAJDAR\\Documents\\NetBeansProjects\\stockmanagement1\\src\\images\\j.jpeg",
        "C:\\Users\\NIVEDITA BIRAJDAR\\Documents\\NetBeansProjects\\stockmanagement1\\src\\images\\i.jpeg",
        "C:\\Users\\NIVEDITA BIRAJDAR\\Documents\\NetBeansProjects\\stockmanagement1\\src\\images\\h.jpeg",
        "C:\\Users\\NIVEDITA BIRAJDAR\\Documents\\NetBeansProjects\\stockmanagement1\\src\\images\\group.jpeg",
        "C:\\Users\\NIVEDITA BIRAJDAR\\Documents\\NetBeansProjects\\stockmanagement1\\src\\images\\g.jpeg",
        "C:\\Users\\NIVEDITA BIRAJDAR\\Documents\\NetBeansProjects\\stockmanagement1\\src\\images\\f.jpeg",
        "C:\\Users\\NIVEDITA BIRAJDAR\\Documents\\NetBeansProjects\\stockmanagement1\\src\\images\\e.jpeg",
        "C:\\Users\\NIVEDITA BIRAJDAR\\Documents\\NetBeansProjects\\stockmanagement1\\src\\images\\d.jpeg",
        "C:\\Users\\NIVEDITA BIRAJDAR\\Documents\\NetBeansProjects\\stockmanagement1\\src\\images\\c.jpeg",
        "C:\\Users\\NIVEDITA BIRAJDAR\\Documents\\NetBeansProjects\\stockmanagement1\\src\\images\\b.jpeg",
        "C:\\Users\\NIVEDITA BIRAJDAR\\Documents\\NetBeansProjects\\stockmanagement1\\src\\images\\l.jpeg",
        "C:\\Users\\NIVEDITA BIRAJDAR\\Documents\\NetBeansProjects\\stockmanagement1\\src\\images\\a.jpeg"
    };
public slideshownew()
    {
     super("java slideshow");
     pic=new JLabel();
     pic.setBounds(100,30,1100,600);
     SetImageSize(12);
     tm=new Timer(2000,new ActionListener()  {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            // throw new UnSupportedoperationexception()
            SetImageSize(x);
           x+=1;
           if(x>=list.length)
               x=0;
           
            
         }
         
        
     });
     add(pic);
     tm.start();
     setLayout(null);
     setSize(1500,2000);
     getContentPane().setBackground(Color.decode("#bdb67b"));
     setLocationRelativeTo(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setVisible(true);
     
    }
    

    public void SetImageSize(int i)
    {
        ImageIcon icon=new ImageIcon(list[i]);
        Image img=icon.getImage();
        Image newImg=img.getScaledInstance(pic.getWidth(),pic.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon newImc=new ImageIcon(newImg);
        pic.setIcon(icon);
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        new slideshownew();
}
}