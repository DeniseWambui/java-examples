/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primenumbers;

/**
 *
 * @author Desktop
 */
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        boolean prime = primeTest(43201);
        
        prime = primeTest(47629);
    }

    public static boolean primeTest(int number){        
        if(!primeCheck(number)){
            System.out.println(number + " is not prime.");
            return true;
        }
        return false; 
    }
    
    public static boolean primeCheck (int num){
               
        if(num == 2 || num == 3 || num == 5 || num == 7){
            return true;
        }
        
        for(int i = 2; i < 11; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    
    
}
