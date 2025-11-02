/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp08_01;

/**
 *
 * @author Largo-PC
 */
public class Tp08_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Lucas", "lucas@lucas.com");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Auriculares", 15000));
        pedido.agregarProducto(new Producto("Mouse Gamer", 20000));

        System.out.println(pedido);

        // Pago con Tarjeta de crédito
        TarjetaCredito tarjeta = new TarjetaCredito("Lucas R.");
        double totalConDescuento = tarjeta.aplicarDescuento(pedido.calcularTotal());
        tarjeta.procesarPago(totalConDescuento);

        pedido.cambiarEstado("Pagado");
    }
    
}
