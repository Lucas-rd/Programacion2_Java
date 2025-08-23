/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02_ejercicio_06;

import java.util.Scanner;

/**
 *
 * @author Largo-PC
 */
public class Tp02_ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        int positivos = 0, negativos = 0, ceros = 0;
        
        for(int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero entero: ");
            num = Integer.parseInt(input.nextLine());
            
            if( num > 0 ) {
                positivos += 1;
            } else if( num < 0) {
                negativos += 1;
            } else {
                ceros += 1;
            }
        }
        
        System.out.println("Resultados:\n" + "Positivos: " + positivos + "\n" + "Negativos: " + negativos + "\n" + "Ceros: " + ceros );
                
    }
    
}
