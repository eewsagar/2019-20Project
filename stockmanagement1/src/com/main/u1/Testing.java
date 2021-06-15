/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.u1;
import java.util.TimerTask;
import javaConstants.Constants;
/**
 *
 * @author NIVEDITA BIRAJDAR
 */
public class Testing  extends TimerTask {
    public void run()
	{

                GMailServer sender = new GMailServer(Constants.setFrom, Constants.setPassword);

	            try {
			    sender.sendMail("Subject","This is Java4s",Constants.setFrom,Constants.emailTO);
			}
                   catch (Exception e) {
			     e.printStackTrace();
			}  

				System.out.println("Email Sent Succesfully...");

	        }
}
