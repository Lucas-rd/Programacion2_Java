/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp05_ejercicio_03;

/**
 *
 * @author Largo-PC
 */
public class Tp05_ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creacion de la instancia autor
        Autor miAutor = new Autor("Garcia Marquez", "Colombia");
        Editorial miEditorial = new Editorial("Editorial falsa", "123Av.456");
        
        //Creo el libro que contiene por agregacion de forma obligada a la editorial
        Libro miLibro = new Libro("Cien años de soledad", "123", miEditorial);
        
        //Muestro el libro sin setear el autor (ya que es una relacion de Asociacion unidireccional)
        System.out.println(miLibro);
        
        //Le seteo un autor y vuelvo a mostrar
        miLibro.setAutor(miAutor);
        System.out.println(miLibro);
    }
    
}
