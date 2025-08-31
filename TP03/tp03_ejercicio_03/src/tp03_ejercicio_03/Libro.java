/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp03_ejercicio_03;

/**
 *
 * @author Largo-PC
 */
public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if(añoPublicacion >= 0){
        this.añoPublicacion = añoPublicacion;            
        } else {
            System.out.println("Año de publicacion invalido");
        }    
    }
    public void mostrarInfoLibro(){
        System.out.println(titulo + "\n" + autor + "\n" + añoPublicacion);
    }
}
