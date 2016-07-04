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
    String name; //Name of Product
    double wholesalePrice; //cost to market
    double retailPrice; //cost to consumer
    int quantityInStock; 
    Boolean perishable;
    int minLevel; //backorder minimum amount
    int maxCapacity; //max amount of product that can be stocked

    
    //Constuctor
    public Product(){
        
    }
    
    //Hashcode method is needed when implementing an indexed map
    @Override
    public int hashCode(){
        return name.hashCode();
    }
    
    
    //Equals method is needed for comparison of products in maps/trees
    @Override
    public boolean equals(Object p){
        if (p instanceof Product){
            Product productComparing = (Product)p;
            if((hashCode() == productComparing.hashCode()) && name.equals(productComparing.name)){
                return true;   
            }
        }
        return false;
    }
    
    
    /**
     * Reduce the stock when products are purchased
     * 
     * @param quantity the amount of stock customer wants to purchase
     * @return quantity that consumer is able to purchase 
     */
    int markBought(int quantity){
        if (quantityInStock > 0){
            
            if(quantityInStock < quantity){
                quantity = quantityInStock;
                quantityInStock = 0;
            }
            else {
                quantityInStock -= quantity;
            }
            return quantity;
        }
        return 0;
    }
    
    
    /**
     * Check if an item needs to be ordered
     * 
     * @return back order containing the product and quantity to order 
     */
    public BackOrder calcBackOrder(){
        
        BackOrder b = new BackOrder();
        b.unitQuantity = 0;
        b.product = this;
        
        if (quantityInStock <= minLevel){
            b.unitQuantity = maxCapacity - quantityInStock;
        }
             
        return b;
    } 
    
}
