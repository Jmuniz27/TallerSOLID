/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.SeccionB.Malo;

/**
 *
 * @author isabella
 */
public class IvaCalculator {
    public double calculateIVA(Product p){
        double iva = 0;
        switch (p.getType()){
            case "book":
                iva=0;
                break;
            case "clothing":
                iva = p.getPrice() * 0.12;
                break;
            case "technology":
                iva = p.getPrice() * 0.15;
                break;
        }
        return iva;
    }
}
