/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02_ejercicio_05;

import java.util.Scanner;

/**
 *
 * @author Largo-PC
 */
public class Tp02_ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        int acum = 0;
        System.out.println("HOla antes del do");
        
        //Lo resolvi con un do-while ya que me parecio mas profesional en lugar de hacerlo con un while que tenga la primer iteracion fuera del ciclo.
        do {            
            System.out.println("Ingrese un numero entero (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
            if(num % 2 == 0) {
                acum += num;
            }
        } while (num != 0);
        System.out.println("La suma de los numeros pares es: " + acum);
    }
    
}
