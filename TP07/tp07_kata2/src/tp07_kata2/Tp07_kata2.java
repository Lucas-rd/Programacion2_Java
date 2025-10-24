/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp07_kata2;

import java.util.ArrayList;

/**
 *
 * @author Largo-PC
 */
public class Tp07_kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo miCirculo = new Circulo("circulito", 5);
        Rectangulo miRectangulo = new Rectangulo("cuadradito", 4, 6);
        
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(miCirculo);
        figuras.add(miRectangulo);
        
        for (Figura figura : figuras) {
            System.out.println("Area del " + figura.getNombre() + ": " + figura.calcularArea());
        }
    }
    
}
