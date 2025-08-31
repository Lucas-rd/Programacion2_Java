/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp03_ejercicio_02;

/**
 *
 * @author Largo-PC
 */
public class Tp03_ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota firu = new Mascota();
        
        firu.setNombre("Firulais");
        firu.setEspecie("Perro");
        firu.setEdad(3);
        //Luego de setear las propiedades de mi isntancia, muestro la info del objeto
        firu.mostrarInfo();
        
        //Luego de cumplir anios vuelvo a mostrar la info
        firu.cumplirAnios();
        firu.mostrarInfo();
    }
    
}
