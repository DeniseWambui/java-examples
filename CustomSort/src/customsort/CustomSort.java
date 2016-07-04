/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customsort;

/**
 *
 * @author Desktop
 */
public class CustomSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int k = 1; k < 100000; k = k * 2)
        System.out.println( k + ": " + profileSort(k) + " nano seconds");
    }
    
    
    public static long profileSort(int n){
        long startTime = System.nanoTime();
        int[] input = new int[n];
        boolean unsorted = true;
        java.util.Random randNumGen = new java.util.Random();
            

        for (int k = 0; k < input.length; k++){
           input[k] = randNumGen.nextInt(); 
           //System.out.print(input[k]+", "); 
        }
        
        
        while (unsorted && input.length != 0){
            unsorted = false;
            for(int i = 0; i < input.length-1; i++){
                if(input[i] > input[i+1]){
                    if(i+2 < input.length && input[i] > input[i+2]){
                        int temp = input[i];
                        input[i] = input[i+2];
                        input[i+2] = temp;
                        unsorted = true;  
                    }
                    else{
                        int temp = input[i];
                        input[i] = input[i+1];
                        input[i+1] = temp;
                        unsorted = true;  
                    }
                    
                }
            }
        }
        
        long endTime = System.nanoTime();
        
        return endTime - startTime;
    }
    
}
