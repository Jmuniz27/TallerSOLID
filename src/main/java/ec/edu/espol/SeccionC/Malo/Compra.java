/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.SeccionC.Malo;

import java.util.List;

/**
 *
 * @author jmuni
 */
public class Compra {
    //clase dependiente viola el principio DIP
    private Pago pago;
    private PagoPayPal pagoPayPal;
    private List articulos;

    public Compra(Pago pago) {
        this.pago = pago;
    }

    public Compra(PagoPayPal pagoPayPal) {
        this.pagoPayPal = pagoPayPal;
    }
    
    public void agregarArticulo (Articulo articulo){
        //agregar un articulo a la compra
    }
    public void removerArticulo (Articulo articullo){
        //remover un articulo a la compra
    }
}
