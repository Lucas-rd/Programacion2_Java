/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp05_ejercicio_14;

/**
 *
 * @author Largo-PC
 */
public class Tp05_ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Proyecto miProyecto = new Proyecto("Mi nuevo proyecto TP05", 120.1);
        
        EditorVideo miEditor = new EditorVideo();
        
        //Uso el metodo interno del editor que tiene la relacion de uso y de creacion con las otras dos clases:
        miEditor.exportar(miProyecto, "MP4");
        
    }
    
}
