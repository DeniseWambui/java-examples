/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leapyearbool;

import java.util.Scanner;

/**
 *
 * @author Desktop
 */
public class LeapYearBool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //get user input
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        
        //call leap year function
        boolean leapCheck = isLeapYear(year);
        
        //output number of digits
        System.out.println(leapCheck);
    }
    
    public static boolean isLeapYear(int year){
        return(year%4 == 0 && (year%100 != 0 || year%400 == 0));
    }
}
