/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02_ejercicio_09;

import java.util.Scanner;

/**
 *
 * @author Largo-PC
 */
public class Tp02_ejercicio_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = Double.parseDouble(input.nextLine());
     
        
        String zona;
        while (true) {
            System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
            zona = input.nextLine();

            if (zona.equalsIgnoreCase("Nacional") || zona.equalsIgnoreCase("Internacional")) {
                break; // salida si es válido
            } else {
                System.out.println("Entrada inválida. Debe ser 'Nacional' o 'Internacional'. Intente de nuevo.");
            }
        }
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double precioFinal = calcularTotalCompra(precioProducto, peso, zona);
        
        System.out.println("El costo de envío es: " + costoEnvio );
        System.out.println("El precio final es: " + precioFinal );
        
    }
    
    // a) Método para calcular el costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio;
        if (zona.equalsIgnoreCase("Nacional")) {
            costoEnvio = peso * 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoEnvio = peso * 10.0;
        } else {
            costoEnvio = 0;
        }
        return costoEnvio;
    }

    // b) Método para calcular el total de la compra
    public static double calcularTotalCompra(double precioProducto, double peso, String zona) {
        double costoEnvio = calcularCostoEnvio(peso, zona);
        return precioProducto + costoEnvio;
    }
    
    
    
    
    
    
    
}
