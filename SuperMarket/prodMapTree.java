/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package supermarket;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author hwf5000
 */
public class prodMapTree {
    
    
    void test () 
        {
        Map<String,Product> prodMTlist = new TreeMap<String, Product>();

        Product p = new Product("Banana",1.2);

        prodMTlist.put(p.name, p);
    
    }
}
