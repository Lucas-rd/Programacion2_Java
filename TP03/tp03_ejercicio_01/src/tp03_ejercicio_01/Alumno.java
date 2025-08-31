/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp03_ejercicio_01;

/**
 *
 * @author Largo-PC
 */
public class Alumno {
    private String nombre;
    private String apellido;
    
    //Seteamos por defecto que sea la materia de Programacion 2
    private String curso = "Programacion 2";
    private double calificacion;
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Curso: " + curso + "\n" + "Calificacion: " + calificacion);
    }
    
    public void subirCalificacion( double puntos){
        if(puntos > 0){
            calificacion += puntos;
        }
    }
    
    public void bajarCalificacion( double puntos){
        if(puntos > 0){
            calificacion -= puntos;
        }
    }
    
}
