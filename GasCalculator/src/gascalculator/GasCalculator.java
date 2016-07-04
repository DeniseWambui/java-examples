/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gascalculator;

/**
 *
 * @author Hermes Frangoudis
 */

//required for input
import java.util.Scanner;


public class GasCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //declare vars
        int gasInTank, mpg, tankDist
                ;
        float gasPrice, hundyMileCost;
        Scanner in = new Scanner(System.in);
        
        //prompt user for: gas in the tank; miles per gallon; price of gas.
        System.out.print("Please enter the number of gallons of gas that are in your car's gas tank: ");
        
        gasInTank = in.nextInt(); //input for amount of gas in tank
        
        System.out.print("Please enter the fuel efficiency, in miles per gallon, of you car: ");
        
        mpg = in.nextInt(); //input for miles per gallon
        
        System.out.print("Please enter the price per gallon of gas: $");
        
        gasPrice = in.nextFloat(); //input for price of gas per gallon
        
        //calculate cost of gas to travel 100 miles
        hundyMileCost = (100/mpg) * gasPrice;
        
        //calculate distance can travel using gas in the tank
        tankDist = gasInTank * mpg;
        
        //output results to user
        System.out.println("\nIt will cost $" + hundyMileCost +" to travel 100 miles in this vehicle.");
        System.out.println("Based on the gas in the tank, you can travel about " + tankDist + " more miles before requiring more gas.");
    }
    
}
