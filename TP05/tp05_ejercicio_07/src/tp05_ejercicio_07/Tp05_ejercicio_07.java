/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp05_ejercicio_07;

/**
 *
 * @author Largo-PC
 */
public class Tp05_ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo las instancias de cada objeto para probarlos
        Motor miMotor1 = new Motor("Nafta", 123456);
        Conductor lucas = new Conductor("Lucas", "LICENCIA123");
        //le paso por agregacion miMotor1 para que se asigne en el constructor
        Vehiculo miCoche = new Vehiculo("AAA-123", "Chevrolet", miMotor1);
        
        System.out.println(miCoche);
        
        //Asigno a lucas como conductor de miCoche
        miCoche.setConductor(lucas);
        System.out.println(miCoche);
    }
    
}
