/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.SeccionB.Bueno;

/**
 *
 * @author isabella
 */
public class PhysicalProduct extends Product {
    private double weight;
    public PhysicalProduct(String name, double price, double weight){
        super(name,price,"physical");
        this.weight = weight;
    }
}
