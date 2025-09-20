/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05_ejercicio_11;

/**
 *
 * @author Largo-PC
 */
public class Reproductor {
    private boolean estado;
    
    public void encender(){
        this.estado = true;
    }
    
    public void reproducir(Cancion cancion){
        if(this.estado == true){
            System.out.println("repoduciendo cancion: \n " + cancion.getTitulo() +"\n del artista: " + cancion.getArtista() );
        } else {
            System.out.println("El reproductor esta apagado");
        }
    }

    @Override
    public String toString() {
        return "Reproductor{" + "estado=" + estado + '}';
    }
}
