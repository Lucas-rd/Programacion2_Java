/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02_ejercicio_08;

import java.util.Scanner;

/**
 *
 * @author Largo-PC
 */
public class Tp02_ejercicio_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double precioBase, impuesto, descuento;
        
        System.out.println("Ingrese el precio base del producto: ");
        precioBase = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el impuesto del producto (Ejemplo: 10 para 10%): ");
        impuesto = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el descuento del producto (Ejemplo: 10 para 10%): ");
        descuento = Integer.parseInt(input.nextLine());
        
        double precioAMostrar = calcularPrecioFinal(precioBase, impuesto, descuento);
        
        System.out.println("El precio final del producto es: " + precioAMostrar);
        
        
    }
    
    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
        double precioFinal = precioBase + precioBase * (impuesto / 100) - precioBase * (descuento / 100);
        return precioFinal;
    }
    
    
    
}
