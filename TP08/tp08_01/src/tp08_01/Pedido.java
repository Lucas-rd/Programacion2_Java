/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08_01;

import java.util.ArrayList;

/**
 *
 * @author Largo-PC
 */
public class Pedido implements Pagable {
    private ArrayList<Producto> productos;
    private String estado;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
        this.cliente = cliente;
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    @Override
    public double calcularTotal(){
        double total = 0;
        for (Producto p : productos){
            total += p.calcularTotal();
        }
        return total;
    }
    
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificarCambioEstado(nuevoEstado);
    }

    @Override
    public String toString() {
        return "Pedido{" + "productos=" + productos + ", estado=" + estado + ", cliente=" + cliente + '}';
    }
    
}
