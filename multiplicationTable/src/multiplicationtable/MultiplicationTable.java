/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multiplicationtable;

import java.util.Scanner;

/**
 *
 * @author Desktop
 */
public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Please eneter a number: ");
        int num = new Scanner (System.in).nextInt();
        
        //create multiplaction table
        for(int row =  0; row <= num; row++){ // output table by row
            if (row > 0){
                System.out.print(row + " \t"); //first number of each row
            }
            else {
                System.out.print("n\t"); //top left corner of table
            }
            
            for(int col =  1; col <= num; col++){ 
                if(row > 0){
                    System.out.print(col * row + "\t");
                }
                else {
                    System.out.print(col + "\t"); //table header
                }
            }
          System.out.print("\n"); //end of row  
        }
    }
    
}
