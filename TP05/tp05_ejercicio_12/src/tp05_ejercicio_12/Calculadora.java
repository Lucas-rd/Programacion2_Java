/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05_ejercicio_12;

/**
 *
 * @author Largo-PC
 */
public class Calculadora {
    private boolean estado;

    public Calculadora() {
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    public void calcular(Impuesto impuesto){
        if(estado == true){
            System.out.println("Calculando Impuesto: \n " + impuesto.getMonto());
        }
    }
}
