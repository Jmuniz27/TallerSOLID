/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.SeccionB.Malo;

/**
 *
 * @author isabella
 */
public class DigitalProduct extends Product {
    
    public DigitalProduct(String name, double price){
        super(name,price,0,"digital");
    }
    
    @Override
    public double getWeight(){
        throw new UnsupportedOperationException("Digital products have no weight.");
    }
}
