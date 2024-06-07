/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espol.SeccionC.Bueno;

/**
 *
 * @author jmuni
 */
public interface Notificable {
    public void notificar(Pagable pago);
    //cada hijo (envioSMS, envioEmail) debe implementar su propio metodo
}
