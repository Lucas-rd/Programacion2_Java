/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp05_ejercicio_05;

/**
 *
 * @author Largo-PC
 */
public class Tp05_ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo instancia de cada objeto y luego muesto por consola distintos estadios
        Propietario miProp = new Propietario("Lucas", 123456789);
        Computadora miCompu = new Computadora("Intel", 123, "modeloPrueba" , "Chipset123");
        
        System.out.println(miCompu);
        
        miCompu.setPropietario(miProp);
        System.out.println(miCompu);
    }
    
}
