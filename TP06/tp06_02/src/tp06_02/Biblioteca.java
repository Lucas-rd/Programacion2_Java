/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp06_02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Largo-PC
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevo = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevo);
    }

    public void listarLibros() {
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        Libro libroEncontrado = null;
        int i = 0;
        while (i < libros.size() && !libros.get(i).getIsbn().equals(isbn)) {
            i++;
        }
        if (i < libros.size()) {
            libroEncontrado = libros.get(i);
        }
        return libroEncontrado;
    }

    public boolean eliminarLibro(String isbn) {
        Libro encontrado = buscarLibroPorIsbn(isbn);
        if (encontrado != null) {
            libros.remove(encontrado);
            return true;
        }
        return false;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
            }
        }
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("Autores en la biblioteca:");
        for (Libro l : libros) {
            System.out.println("- " + l.getAutor());
        }
    }
    
    public void mostrarAutoresUnicosDisponibles(){
        System.out.println("Autores sin repetir en la biblioteca");
        Set<Autor> autoresUnicos = new HashSet<>();
        
        //for para guaardarme todos los autores en el hashSet
        for (Libro l : libros ) {
            autoresUnicos.add(l.getAutor());
        }
        
        //for para mostrar los autores de forma "unica"
        for (Autor aut : autoresUnicos) {
            System.out.println("- " + aut);
        }
    }
    
}
