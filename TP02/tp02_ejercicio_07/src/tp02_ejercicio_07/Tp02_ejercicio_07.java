/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02_ejercicio_07;

import java.util.Scanner;

/**
 *
 * @author Largo-PC
 */
public class Tp02_ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nota;
        
        do {            
            System.out.println("Ingrese una nota (0-10): ");
            nota = Integer.parseInt(input.nextLine());
            
            if(nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        
        System.out.println("Nota guardada correctamente.");
       
    }
    
}
