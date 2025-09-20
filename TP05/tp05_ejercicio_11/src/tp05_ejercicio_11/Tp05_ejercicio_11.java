/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp05_ejercicio_11;

/**
 *
 * @author Largo-PC
 */
public class Tp05_ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Artista artistaCumbia = new Artista("Mala Fama", "cumbia");
        Cancion cancionFav = new Cancion("Yo uso visera");
        
        cancionFav.setArtista(artistaCumbia);
        
        Reproductor miWalkman = new Reproductor();
        System.out.println(miWalkman);
        
        //Intento escuchar la musica con el reproducto apado
        miWalkman.reproducir(cancionFav);
        
        //Lo prendo y reproduzco nuevamente:
        miWalkman.encender();
        miWalkman.reproducir(cancionFav);
    }
    
}
