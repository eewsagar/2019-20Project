/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.u1;
import java.io.FileInputStream;
import java.util.Properties;
import javaConstants.Constants;
/**
 *
 * @author NIVEDITA BIRAJDAR
 */
public class ReadPropertiesFile {
    public  static void readConfig() throws Exception
	{
		try
		{

		    Properties pro = new Properties();
		    String path = System.getProperty("user.dir")+"/TimeScheduler.properties";
		    pro.load(new FileInputStream(path));	   

		    Constants.delay = pro.getProperty("delay");
		    Constants.timetoquery = pro.getProperty("timetoquery");
//		    Constants.setFrom = pro.getProperty("setFrom");
//		    Constants.setPassword = pro.getProperty("setPassword");
//		    Constants.emailTO = pro.getProperty("emailTO");	  		   

		}
		catch(Exception e)
		{
            throw new Exception(e);
		}

	}
}
