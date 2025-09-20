/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05_ejercicio_14;

/**
 *
 * @author Largo-PC
 */
public class Render {
    private String formato;
    private Proyecto proyecto;
    
    public Render(String formato) {
        this.formato = formato;
    }

    //Relacion de Asociacion simple
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "Render{" + "formato=" + formato + ", proyecto=" + proyecto + '}';
    }
    
    
    
}
