/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02_ejercicio_11;

import java.util.Scanner;

/**
 *
 * @author Largo-PC
 */
public class Tp02_ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    final static double descuento = 0.1;
    
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Ingrese el precio del producto: ");
       double precioProducto = Double.parseDouble(input.nextLine());
       
       calcularDescuentoEspecial(precioProducto);
        
    }
    
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * descuento;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado );
        System.out.println("El precio final con descuento es: " + (precio - descuentoAplicado) );
    }
    
}
