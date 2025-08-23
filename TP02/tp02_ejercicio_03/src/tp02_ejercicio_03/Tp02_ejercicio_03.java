/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02_ejercicio_03;

import java.util.Scanner;

/**
 *
 * @author Largo-PC
 */
public class Tp02_ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int edad;
        String etapa = "";
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        if(edad < 12) {
            etapa = "Niño";
        } else if( edad >= 12 && edad <= 17) {
            etapa = "Adolecente";
        } else if( edad >= 18 && edad <= 59) {
            etapa = "Adulto";
        } else if(edad >= 60) {
            etapa = "Adulto mayor";
        }
        
        System.out.println("Eres un " + etapa);
    }
}
