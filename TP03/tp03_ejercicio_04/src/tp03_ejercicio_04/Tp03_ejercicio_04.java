/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp03_ejercicio_04;

/**
 *
 * @author Largo-PC
 */
public class Tp03_ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instancion primer Gallina
        Gallina miGallina1 = new Gallina();
        miGallina1.setIdGallina(1);
        miGallina1.setEdad(3);
        miGallina1.setHuevosPuestos(40);
        miGallina1.mostrarEstado();
        
        //instancio segunda Gallina
        Gallina miGallina2 = new Gallina();
        miGallina2.setIdGallina(1);
        miGallina2.setEdad(3);
        miGallina2.setHuevosPuestos(40);
        miGallina2.mostrarEstado();
        
        //Simulo acciones de primer Gallina
        miGallina1.ponerHuevo(15);
        miGallina1.envejecer();
        
        //Simulo acciones de segunda Gallina
        miGallina2.ponerHuevo(20);
        miGallina2.envejecer();
        
        //Mostramos resultados luego de simular acciones
        miGallina1.mostrarEstado();
        miGallina2.mostrarEstado();
    }
    
}
