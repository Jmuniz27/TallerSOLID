/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.SeccionC.Bueno;

import ec.edu.espol.SeccionC.Malo.*;

/**
 *
 * @author jmuni
 */
public class Pago implements Pagable, Notificable{
    private Factura factura;    
    //otros atributos
    public void realizarCobro(double monto){
        //cargar monto
    }
    public void calcularImpuestosFactura(){
        //calculo los impuestos
    }

    @Override
    public void notificar(Pagable pago) {
        //enviar
    }
}
