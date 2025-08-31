/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp03_ejercicio_05;

/**
 *
 * @author Largo-PC
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }
    
    //consideracion: el combustible esta expresado en unidades de distancia que rinde cada unidad de combustible
    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " avanzó " + distancia + " unidades.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }
    
    public void recargarCombustible(int cantidad) {
        if(combustible + cantidad > MAX_COMBUSTIBLE){
            combustible = MAX_COMBUSTIBLE;
            System.out.println("El tanque está lleno al máximo (" + MAX_COMBUSTIBLE + ").");
        } else {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
        }
    }
    
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible);
    }
    
    public void despegar() {
        System.out.println(nombre + " ha despegado.");
    }
    
    
}
