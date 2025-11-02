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
public class ValidadorEdad {
    public static void ejecutar(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese su edad: ");
            int edad = sc.nextInt();
            if(edad < 0 || edad > 120){
                throw new EdadInvalidaException("Edad fuera de rango 0-120");
            }
            System.out.println("Edad valida: " + edad);
            
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
