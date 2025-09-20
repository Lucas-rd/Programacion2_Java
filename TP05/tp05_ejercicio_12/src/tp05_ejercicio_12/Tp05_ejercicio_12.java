/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp05_ejercicio_12;

/**
 *
 * @author Largo-PC
 */
public class Tp05_ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contribuyente yo = new Contribuyente("Lucas", "123456789");
        
        Impuesto miImpuesto = new Impuesto(123.5);
        miImpuesto.setContribuyente(yo);
        
        Calculadora calculadorDeImpuesto = new Calculadora();
        calculadorDeImpuesto.setEstado(true);
        
        calculadorDeImpuesto.calcular(miImpuesto);
    }
    
}
