/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp03_ejercicio_01;

/**
 *
 * @author Largo-PC
 */
public class Tp03_ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instancio un objeto desde la clase Alumno
        Alumno estudiante = new Alumno();
        
        //Muestro los datos antes de configurar al estudiante
        estudiante.mostrarInfo();
        
        //Modificamos las notas y volvemos a mostrar info
        estudiante.subirCalificacion(9);
        estudiante.mostrarInfo();
        
        estudiante.bajarCalificacion(1);
        estudiante.mostrarInfo();
    }
    
}
