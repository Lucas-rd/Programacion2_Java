/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp05_ejercicio_01;

/**
 *
 * @author Largo-PC
 */
public class Tp05_ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Un caso de prueba:
        Titular individuo1 = new Titular ("Lucas", "Rodriguez", 123456789);
        Pasaporte pasaporte1 = new Pasaporte(1234, "01/01/2025", "110100001111010", ".PNG");
        
        System.out.println(individuo1);
        System.out.println(pasaporte1);
        
    }
    
}
