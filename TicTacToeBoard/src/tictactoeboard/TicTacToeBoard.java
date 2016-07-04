/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tictactoeboard;

/**
 *
 * @author Hermes Frangoudis
 */

public class TicTacToeBoard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declare vars
        String combLine;
        
        //instantiate variables
        combLine = "+--+--+\n|  |  |";
        
        //create grid of columns
        for(int i=0; i < 3; i++){
            System.out.println(combLine);
        }
        
        //draw the bottom row to the grid
        System.out.println(combLine.substring(0,7));
    }
    
}