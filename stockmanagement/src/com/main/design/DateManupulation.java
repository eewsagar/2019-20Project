/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.design;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author gunnnu
 */
public class DateManupulation {
    public static void main(String[] args) {
        
        SimpleDateFormat obj = new SimpleDateFormat("E MMM dd hh:mm:ss Z yyyy");
        SimpleDateFormat obj2 = new SimpleDateFormat("dd-mm-yyyy");
        String join_date = "Fri Jan 01 19:55:12 IST 2021";
        // In the try block, we will try to find the difference  
        try {
            System.out.println(join_date );
            // Use parse method to get date object of both dates  
            Date date1 = obj.parse(join_date);
            String date2 = obj2.format(date1);
           

//            long time_difference = date2.getTime() - date1.getTime();
//            // Calucalte time difference in days using TimeUnit class  
//            long days_difference = TimeUnit.MILLISECONDS.toDays(time_difference) % 365;

            System.out.print(
                    "Difference "
                    + "between two dates is: " + date1 +" " +date2);

        }catch(Exception e){
            System.out.println("exception " +e);
        }
    }
    
}
