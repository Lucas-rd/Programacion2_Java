/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05_ejercicio_02;

/**
 *
 * @author Largo-PC
 */
public class Usuario {
    private String nombre;
    private int DNI;
    private Celular celular;

    public Usuario(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }
    
    public void setCelular(Celular celular) {
        this.celular = celular;
        if(celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }

    public Celular getCelular() {
        return celular;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", DNI=" + DNI + ", celular=" + celular + '}';
    }
    
}
