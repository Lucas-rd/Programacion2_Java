/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ejercicio_02;

import java.util.Scanner;

/**
 *
 * @author Largo-PC
 */
public class Tp2_ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] numeros = new int[3];
        
        //Cargo el array pidiendole al user que ingrese los valores
        for(int i = 0; i < numeros.length; i++ ) {
            System.out.print("Ingrese el numero" + i + 1 + ": ");
            numeros[i] = Integer.parseInt(input.nextLine());
        }
        
        //Inicializo mayor, diciendo que al primer posicion del array es la mas grande
        int mayor = numeros[0];
        
        //recorro el array para ver si hay un valor mas grande
        for(int i = 1; i < numeros.length; i++) {
            if(numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        
        
        //Imprimo el resultado
        System.out.println("El mayor de los numeros ingresados es: " + mayor);
        
        
        
        
        
        
        
    }
    
}
