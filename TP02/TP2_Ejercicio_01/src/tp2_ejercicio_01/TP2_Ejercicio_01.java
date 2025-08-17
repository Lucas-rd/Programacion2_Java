/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ejercicio_01;

import java.util.Scanner;

/**
 *
 * @author Largo-PC
 */
public class TP2_Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int año_ingresado;
        
        System.out.println("Ingrese un año: ");
        año_ingresado = Integer.parseInt(input.nextLine());
        
        if ( (año_ingresado % 4 == 0 && año_ingresado % 100 != 0) || (año_ingresado % 400 == 0) ) {
            System.out.println("El año " + año_ingresado + " es bisiesto.");
        } else {
            System.out.println("El año " + año_ingresado + " no es bisiesto.");
        }        
    }
    
}
