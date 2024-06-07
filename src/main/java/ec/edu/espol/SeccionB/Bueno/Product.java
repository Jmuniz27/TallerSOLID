/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.SeccionB.Bueno;

/**
 *
 * @author isabella
 */
public abstract class Product {
    private String name;
    private double price;
    private String type;
    private double iva;
    
    public Product(String name, double price, String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    
    public double getIva(){
        return iva;
    }
    
    public String getType(){
        return type;
    }
}
