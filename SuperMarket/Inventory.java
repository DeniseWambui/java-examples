/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package supermarket;

import java.util.Date;

/**
 *
 * @author Hermes Frangoudis
 */
public class Inventory {
    Product [] p = new Product[2500];
    
    
    public void upDateInventry(int pID, int newStock, Date newExpiry){       
        //p[pID].updateStock(newStock);
    }
    
    
    public Product getItem(int pID){
        return p[pID];
    }
    

}
