/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02_ejercicio_12;

/**
 *
 * @author Largo-PC
 */
public class Tp02_ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // a) Declarar e inicializar el array con los precios
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        // b) Mostrar los valores originales con for normal
        System.out.println("Precios originales:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: $" + precios[i]);
        }

        // c) Modificar el precio de un producto específico (tercer producto, índice 2)
        precios[2] = 129.99;

        //salto de linea para que la consola se vea mas prolija
        System.out.println("");
        
        // d) Mostrar los valores modificados con for normal
        System.out.println("Precios modificados:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: $" + precios[i]);
        }
    }
    
}
