/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package montyhallparadox;

/**
 *
 * @author Hermes Frangoudis
 */
public class MontyHallParadox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declare vars
        int helped = 0;
        int kept = 0;
        
        for (int i = 0; i < 1000; i++){
            java.util.Random randNumGen = new java.util.Random();
            int choice = randNumGen.nextInt()%3;
            helped += montyHallFunc(choice, true);
            kept += montyHallFunc(choice, false);
        }
        System.out.println("Out of 1,000 trials:");
        System.out.println("-- changing choices helped " + helped + " times");
        System.out.println("-- keeping 1st choice won " + kept + " times");
    }
    
    
    //conduct individual trial
    public static int montyHallFunc(int choice, boolean allowSwitch){
        
        //declare vars
        int nonWin;
        
        //assign prize to choice options
        java.util.Random randNumGen = new java.util.Random();
        int winner = randNumGen.nextInt()%3;
        
        //remove one non winning option
        for (nonWin = 0; nonWin < 3; nonWin++){
            if(nonWin != winner && (nonWin != choice)){
                break;
            }
        }
        
        if (allowSwitch){
            //make switch 
            for (int i=0; i < 3; i++){
                if(i != nonWin && i != choice){
                    choice = i;
                }
            }
            
            //if it helped return 1
            if (choice == winner){
                return 1;
            }            
        }
        else {
            if (choice == winner){
                return 1;
            }
        }
        //if no win regardless
        return 0;
        
    }
    
}
