/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp03_ejercicio_05;

/**
 *
 * @author Largo-PC
 */
public class Tp03_ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NaveEspacial miNave = new NaveEspacial();
        
        //Creacion y carga de nave
        miNave.setNombre("Scaloneta");
        miNave.despegar();
        miNave.mostrarEstado();
        miNave.avanzar(40);
        
        //Recarga de combustible y luego avanzo
        miNave.recargarCombustible(50);
        miNave.avanzar(40);
        
        //Muestro el estado final de mi nave
        miNave.mostrarEstado();
    }
    
}
