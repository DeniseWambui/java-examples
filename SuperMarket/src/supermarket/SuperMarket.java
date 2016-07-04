/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package supermarket;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author hwf5000
 */
public class SuperMarket {

    Map<Integer, Product> products = new HashMap<Integer,Product>(); //indexed map of products
    List<Product> productList = new ArrayList<Product>(); //list of products
    Set<String> purchasedItems = new HashSet<String>();

    //Constuctor
    public SuperMarket(){

    }
    
    /**
     * Create a list of all items that are lower than their
     * minimum level
     * 
     * @return list of items that need to be re-ordered  
     */
    public List<BackOrder> makeBackOrders(){
       
       List<BackOrder> backProducts = new ArrayList<BackOrder> ();         

       for (Product product : productList){
           if(product.quantityInStock < product.minLevel){
               BackOrder backProd = product.calcBackOrder();
               backProducts.add(backProd);
           }
       }
       return backProducts;
    }
    
    
    /**
     * Add a product to the store inventory
     * 
     * @param name the name of the product
     * @param price the retail price of the product
     * @param wholesalePrice the wholesale cost of the product
     * @param quantityInStock the quantity in stock
     * @param perishable whether or not product is perishable
     * @param minLevel minimum stock before product needs to be re-ordered
     * @param maxCapacity maximum stock of product
     */
    public void addProduct(String name, double price, double wholesalePrice, int quantityInStock, boolean perishable, int minLevel, int maxCapacity){
        Product newProduct = new Product();
        newProduct.name = name;
        newProduct.retailPrice = price;
        newProduct.wholesalePrice = wholesalePrice;
        newProduct.quantityInStock = quantityInStock;
        newProduct.perishable = perishable;
        newProduct.minLevel = minLevel;
        newProduct.maxCapacity = maxCapacity;
        productList.add(newProduct); //list of products
        products.put(newProduct.hashCode(), newProduct); //indexed map of products
    }
    
    public void purchaseList(String productName){
        purchasedItems.add(productName);
    }
    
    
    //Main application
    public static void main(String[] args) {
         SuperMarket market = new SuperMarket();
         String perishableProducts[] = {"Banana", "Apple", "Ice Cream", "Chips", "Milk", "Bread", "Lettuce", "Chicken", "Steak"};
         String nonPerishables[] = {"Soap", "Shampoo", "napkins", "Paper Towels", "Laundry Detergent"};
         Random randNumGen = new Random();
         
         //Add perishable products to the store
         for (String prodName : perishableProducts){
            Float cost = randNumGen.nextFloat()/2;
            market.addProduct(prodName, cost*1.2,cost, Math.abs(randNumGen.nextInt()%200)+ 300, true, 10, 500);
         }
         
         //Add non perishable products to the store
         for (String prodName : nonPerishables){
            Float cost = randNumGen.nextFloat()/3;
            market.addProduct(prodName, cost*2.2,cost, Math.abs(randNumGen.nextInt()%100)+ 400, false, 25, 500);
         }
         
         //simulate 500 customers making random purhcases
         for (int customer = 1;  customer <= 150; customer++){
             //customer chooses 10 items to buy
             for(int itemsToBuy = 1; itemsToBuy < 5; itemsToBuy++){
                 market.purchaseList(perishableProducts[Math.abs(randNumGen.nextInt()% 9)]);
                 market.purchaseList(nonPerishables[Math.abs(randNumGen.nextInt()% 5)]);
             }
            System.out.println("Customer #" + customer + " has purchased:");
            for(String productName: market.purchasedItems){
                Product item = market.products.get(productName.hashCode());
                int numberBuying = item.markBought(Math.abs(randNumGen.nextInt()% 4)+1); //customer will attempt to purchase no more than 5 of any given product
                System.out.println("(" + numberBuying + ")" + item.name);
            }
            System.out.println("");
         }
         
         //display all items that need to be re-ordered
         System.out.println("\nProducts to Reorder (Name - Amount)");
         System.out.println("---------------------------------------");
         for (BackOrder productsToOrder : market.makeBackOrders()){
             System.out.println(productsToOrder);
         }
     }
    
}
