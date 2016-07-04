/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package supermarket;

/**
 *
 * @author hwf5000
 */
public class BackOrder {
    public Product product; //product
    public int unitQuantity; //quantity to order
    
    
    /**
     * Create string representation of BackOrder object
     * 
     * @return product and the quantity that needs to be ordered 
     */
    @Override
    public String toString(){
        return product.name + " - " + unitQuantity;
    }
}
