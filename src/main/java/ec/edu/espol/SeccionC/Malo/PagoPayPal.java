/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.SeccionC.Malo;

/**
 *
 * @author jmuni
 */
public class PagoPayPal extends Pago {
    private boolean loggedIn;

    @Override
    public void realizarCobro(double monto) {
       if(!loggedIn){
           return;
       }
       //cargar monto al medio de pago
    }
    
}
