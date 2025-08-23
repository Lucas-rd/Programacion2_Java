/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02_ejercicio_04;

import java.util.Scanner;

/**
 *
 * @author Largo-PC
 */
public class Tp02_ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int precio;
        double precio_descuento = 0;
        char categoria;
        String descuento_aplicado = "";
        
        System.out.println("Ingrese el precio de un producto: ");
        precio = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la categoria del producto(A, B, C): ");
        categoria = input.next().charAt(0);
        
        if(categoria == 'A' || categoria == 'a') {
            precio_descuento = precio * 0.90;
            descuento_aplicado = "10%";
        } else if(categoria == 'B' || categoria == 'b') {
            precio_descuento = precio * 0.85;
            descuento_aplicado = "15%";
        } else if(categoria == 'C' || categoria == 'c') {
            precio_descuento = precio * 0.80;
            descuento_aplicado = "20%";
        }
        
        System.out.println("Descuento aplicado: " + descuento_aplicado);
        System.out.println("Precio final: " + precio_descuento);
        
        
        
        
        
        
    }
    
}
