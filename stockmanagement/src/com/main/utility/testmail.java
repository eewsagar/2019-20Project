/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.utility;

/**
 *
 * @author NIVEDITA BIRAJDAR
 */
public class testmail {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String to ="niveditavb05@gmail.com";
        String subject = "TestMail";
        String msg = "Send Mail properly ";
        Mailer.send(to, subject, msg);
    }
}
