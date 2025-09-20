/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05_ejercicio_05;

/**
 *
 * @author Largo-PC
 */
public class Propietario {
    private String nombre;
    private int dni;
    private Computadora computadora;

    public Propietario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setComputadora(Computadora computadora){
        this.computadora = computadora;
        if(this.computadora != null && computadora.getPropietario() != this){
            computadora.setPropietario(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    //Para no generar StackOverflow por auto llamado de Computadora a Porpietario y veceversa de forma infinita, en lugar de mostrar computadora en el metodo toString, solo muestro su marca y su numero de serie con los getters correspondientes de computadora
    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + ", computadora=" + computadora.getMarca() + ' ' + computadora.getNumeroSerie() + '}';
    }
    
    
    
}
