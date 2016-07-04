/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package drunkwalk;

/**
 *
 * @author Desktop
 */
public class DrunkWalk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double distance;
        double avgDist = 0.0;
        int total = 0;
        int intersections = 1000000;
        double maxDist = 0.0;
        double minDist = -1.0;
        
        System.out.println("(  x  ,  y  )");
        for (int i = 10; i < intersections; i = i+100){
            distance = drunkWalk(i);
            if (distance > maxDist){
                maxDist = distance;
            }
            if (minDist == -1.0) {
                minDist = distance;
            }
            if (distance < minDist){
                minDist = distance;
            }
            //average distance
            avgDist += distance;
            total++;
        }  
        avgDist = avgDist/total;
        System.out.println("\nOn average the distance = " + avgDist);
        System.out.println("-- Fartherst distance traveled = " + maxDist);
        System.out.println("-- Shortest distance traveled = " + minDist);
        
    }
    
    
    public static double drunkWalk(int intersections){
        
        //declare vars
        java.util.Random randNumGen = new java.util.Random();
        double x = 0.0;
        double y = 0.0;
        
        for (int i = 0; i < intersections; i++){
            int choice = Math.abs(randNumGen.nextInt()%4)+1;
            //System.out.println("choice: " + choice);
            switch (choice){
                case 1: y++; break;
                case 2: y--; break;
                case 3: x++; break;
                case 4: x--; break;
                default: break;    
            }
            //System.out.println("(" + x + "," + y + ")");
        }
        
        //return distance travelled
        System.out.print("(" + x + "," + y + ")\n");
        return Math.sqrt( Math.pow(x, 2.0) + Math.pow(y, 2.0) );
    }
    
}
