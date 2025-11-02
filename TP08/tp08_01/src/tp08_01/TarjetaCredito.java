/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08_01;

/**
 *
 * @author Largo-PC
 */
public class TarjetaCredito implements Pago, PagoConDescuento{
    private String titular;

    public TarjetaCredito(String titular) {
        this.titular = titular;
    }
    
    @Override
    public double aplicarDescuento(double monto){
        //Aplico un 10% de descuento al pago con Tarjeta
        return monto * 0.9;
    }
    
    @Override
    public void procesarPago(double monto){
        System.out.println("Pago procesado con Tarjeta de " + titular + " por $" + monto);
    }
    
}
