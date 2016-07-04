/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package supermarket;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hwf5000
 */
public class SuperMarket {

    String name;
    List<Product> products = new ArrayList();
    
    double cashBalance;
    
    public static void main(String[] args) {
         SuperMarket s = new SuperMarket();
         s.addProduct("Banana", 0.39,0.19);
     }
    
    public List<Backorder> makeBackOrders(){
       
       List<Backorder> backProducts = new ArrayList();         
  
       
       for (Product p : products){
           if(p.quantityInStock < p.minLevel){
               Backorder backProd = p.calcBackOrder();
               backProducts.add(backProd);
           }
       }
       return backProducts;
    }
    
    public Product addProduct(String name, double price, double wholesalePrice){
        Product newProduct = new Product(name, price);
        //newProduct.name = name;
        //newProduct.retailPrice = price;
        newProduct.wholesalePrice = wholesalePrice;
        newProduct.quantityInStock = 0;
        products.add(newProduct);
        return newProduct;
    }
    
     
     
     
}
