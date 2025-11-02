/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08_01;

/**
 *
 * @author Largo-PC
 */
public class PayPal implements Pago, PagoConDescuento{
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public double aplicarDescuento(double monto) {
        // 5% de descuento
        return monto * 0.95;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago realizado por PayPal (" + email + ") por $" + monto);
    }
    
}
