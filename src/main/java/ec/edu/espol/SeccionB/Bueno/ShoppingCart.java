/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.SeccionB.Bueno;

import java.util.List;

/**
 *
 * @author isabella
 */
public class ShoppingCart {
    private List<Product> products;
    
    public void addProduct(Product product){
        products.add(product);
    }
    
    public void removeProduct(Product product){
        products.remove(product);
    }
    
    public double calculateTotalPrice(){
        double total = 0;
        return total;
       
    }
}
