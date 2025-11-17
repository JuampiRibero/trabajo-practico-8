/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg8;

/**
 *
 * @author juamp
 */
public class MercadoPago implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago realizado con MercadoPago: $" + monto);
    }
}
