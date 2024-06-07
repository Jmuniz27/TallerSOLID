/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.SeccionB.Malo;

/**
 *
 * @author isabella
 */
public class Product {
    private String name;
    private double price;
    private double weight;
    private String type;
    
    public Product(String name, double price, double weight, String type){
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.type = type;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public String getType(){
        return type;
    }
}
