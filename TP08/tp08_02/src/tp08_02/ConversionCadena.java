/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08_02;

import java.util.Scanner;

/**
 *
 * @author Largo-PC
 */
public class ConversionCadena {
    public static void ejecutar(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese un numero: ");
            String texto = sc.nextLine();
            int numero = Integer.parseInt(texto);
            System.out.println("Numero ingresado valido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: el texto ingresado no es un numero valido.");
        }
    }
}
