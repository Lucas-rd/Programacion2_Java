/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp03_ejercicio_03;

/**
 *
 * @author Largo-PC
 */
public class Tp03_ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro miLibro = new Libro();
        
        miLibro.setAutor("Borges");
        miLibro.setTitulo("El tamaño de mi esperanza");
        miLibro.setAñoPublicacion(-1960);
        //mostramos info con año incorrecto
        miLibro.mostrarInfoLibro();
        
        //mostramos info con año correcto
        miLibro.setAñoPublicacion(1960);
        miLibro.mostrarInfoLibro();
    }
    
}
