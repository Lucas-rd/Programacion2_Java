/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05_ejercicio_01;

/**
 *
 * @author Largo-PC
 */
public class Titular {
    private String nombre;
    private String apellido;
    private int DNI;
    private Pasaporte pasaporte;

    public Titular(String nombre, String apellido, int DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }
    
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if(pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    //Generamos el metodo toString para poder visualizar mejor la instancia creada.
    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", pasaporte=" + pasaporte + '}';
    }
    
    
    
}
