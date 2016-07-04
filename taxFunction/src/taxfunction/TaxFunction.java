/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taxfunction;

import java.util.Scanner;

/**
 *
 * @author Hermes Frangoudis
 */
public class TaxFunction {
    
    //declare vars
	
    //tax function
    public static double calcFederalIncomeTax (double income) {
        
        //declare vars        
        final double[] incomeBrackets = new double[]{8350, 33950, 82250, 171550, 372950};
        final double[] taxrates = new double [] {0.10, 0.15, 0.25, 0.28, 0.33, .35};
        double remainingIncome = income;
        double totalTax = 0.0;
        int bracketIndex = 0;
        double upperBound = 0.0;
        double lowerBound;
        
        //check if income is greater than upper bound
        if (remainingIncome > incomeBrackets[incomeBrackets.length - 1]){
               totalTax = (remainingIncome -  incomeBrackets[(incomeBrackets.length - 1)]) * taxrates[taxrates.length - 1];
               remainingIncome = incomeBrackets[(incomeBrackets.length - 1)];
        }
        
        //loop through tax brackets and sum the tax
        while (remainingIncome > 0){
                    
            //loop vars
            lowerBound = upperBound;
            upperBound = incomeBrackets[bracketIndex];
            double taxRate = taxrates[bracketIndex];
            double taxableIncomeInBracket;
            taxableIncomeInBracket = upperBound - lowerBound; 
            
            //check if income is within current upper and lower bounds
            if (remainingIncome < taxableIncomeInBracket){
                taxableIncomeInBracket = remainingIncome;
            }
            
            //calculate taxable income for bracket and add to total tax
            totalTax += taxableIncomeInBracket * taxRate;
            
            //subtract remaining income
            remainingIncome -= taxableIncomeInBracket;
            
            //increment the brackets
            bracketIndex++;
        }
		return totalTax;
    }
	
	
	public static void main(String[] args) {

            Scanner in = new Scanner (System.in);
		
            //get user income
            System.out.print("Please enter income: $");
            int income = in.nextInt();
            double incomeTax;

            //initiate call to recursive tax function
            incomeTax = calcFederalIncomeTax (income);

            //Output tax to the user
            System.out.println("\nThe tax on $" + income + " will pay $" + incomeTax + " in taxes.");

	}
}
