/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.u1;
import java.util.Timer;
import javaConstants.Constants;
/**
 *
 * @author NIVEDITA BIRAJDAR
 */
public class DBScheduler {

    /**
     * @param args the command line arguments
     */
    public void callScheduler() throws Exception
		{

			System.out.println("Scheduler Starterd...");
			ReadPropertiesFile.readConfig();
			Timer timer = new Timer();

			timer.scheduleAtFixedRate(new Testing(), 
                                getTimePrecision(Constants.delay), 
                                getTimePrecision(Constants.timetoquery));

		}

		public long getTimePrecision(String value) throws Exception
		{
			long  l = 0;
			String val="";
			try
			{
				if(value.endsWith("d") || value.endsWith("D"))
				{
					val  = value.substring(0,value.length()-1);
					l = Long.parseLong(val) * 24 * 60 * 60 * 1000;
				}

				else if(value.endsWith("h") || value.endsWith("H"))
				{

				 val  = value.substring(0,value.length()-1);
				 l = Long.parseLong(val) * 60 * 60 * 1000;

				}
				else if(value.endsWith("m") || value.endsWith("M"))
				{
					 val  = value.substring(0,value.length()-1);
					 l = Long.parseLong(val) * 60 * 1000;
				}
				else if(value.endsWith("s") || value.endsWith("S"))
				{

					val  = value.substring(0,value.length()-1);
					l = Long.parseLong(val) * 1000;
				}
				else
				{

					l = Long.parseLong(value);
				}

			}
			catch(Exception e)
			{

	            throw new Exception(e);
			}

			return l;
		}
    public static void main(String args[])throws Exception {
        // TODO code application logic here
        DBScheduler dbs = new DBScheduler();
			dbs.callScheduler();
    }
}
