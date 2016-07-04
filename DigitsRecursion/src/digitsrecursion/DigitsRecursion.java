/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package digitsrecursion;

import java.util.Scanner;

/**
 *
 * @author Desktop
 */
public class DigitsRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //get user input
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a number: ");
        double n = in.nextInt();
        
        //call recursive function
        int digits = digitCounter(n);
        
        //output number of digits
        System.out.println("The number contains " + digits + " digits");
    }
    
    public static int digitCounter(double numberN){
        if (numberN < 10){
            return(1);
        }
        int digits = digitCounter(numberN/10);
        return (digits + 1);
    }
    
}
