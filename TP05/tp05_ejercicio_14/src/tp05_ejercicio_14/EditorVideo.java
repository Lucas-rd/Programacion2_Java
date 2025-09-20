/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05_ejercicio_14;

/**
 *
 * @author Largo-PC
 */
public class EditorVideo {
    
    public void exportar(Proyecto proyecto, String formato){
        
        Render nuevoRender = new Render(formato);
        
        nuevoRender.setProyecto(proyecto);
        
        System.out.println("Se exporta el proyecto: " + nuevoRender);
    }
}
