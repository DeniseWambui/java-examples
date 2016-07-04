/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package supermarket;


/**
 *
 * @author Hermes Frangoudis
 */
public class Product {
    
    //Properties (object variables)
    String name;
    double wholesalePrice;
    double retailPrice;
    int quantityInStock;
    Boolean perishable;
    //backorder varaiables
    int backOrderUnitSize;
    int minLevel;
    int maxCapacity;
    int advancedOrderDays;

    
    //Constuctor
    public Product(String n, double rP){
        name = n;
        retailPrice = rP;
    }
    
    int markbought(int quantity){
        return 0;
    }
    
    Backorder calcBackOrder(){
        
        Backorder b = new Backorder();
        b.unitQuantity = 0;
        b.product = this;
        
        if (quantityInStock <= minLevel){
            b.unitQuantity = maxCapacity - quantityInStock;
        }
                        
        return b;
    }
     
    
    
    
}
