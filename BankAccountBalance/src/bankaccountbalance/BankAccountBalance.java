/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankaccountbalance;

import java.util.Scanner;

/**
 *
 * @author Desktop
 */
public class BankAccountBalance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //get user input
        Scanner in = new Scanner (System.in);
        
        System.out.print("Enter a balance: $");
        float bankBalance = in.nextFloat();
        
        System.out.print("Enter an interest rate: ");
        float interestRate = in.nextFloat();
        
        System.out.print("Enter number of years: ");
        int years = in.nextInt();
        
        //call interest function
        float newBalance = interstCalc(bankBalance, interestRate, years);
        
        //output number of digits
        System.out.println("New balance $" + newBalance );
    }
    public static float interstCalc(float balance, float interest, int years){
        for(int i=0; i < years; i++){
            balance += (balance * interest);
        }
        return balance;
    }
}
