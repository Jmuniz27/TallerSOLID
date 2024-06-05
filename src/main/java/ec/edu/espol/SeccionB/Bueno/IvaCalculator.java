/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.SeccionB.Bueno;

/**
 *
 * @author isabella
 */
public class IvaCalculator {
    public double calculateIVA(Product p){
        return p.getPrice() * p.getIva();
    }
}
