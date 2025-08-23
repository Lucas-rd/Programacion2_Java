/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02_ejercicio_13;

/**
 *
 * @author Largo-PC
 */
public class Tp02_ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // a) Declarar e inicializar el array con los precios
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        // b) Mostrar los valores originales usando recursividad
        System.out.println("Precios originales:");
        imprimirRecursivo(precios, 0);

        // c) Modificar el precio de un producto específico (tercer producto, índice 2)
        precios[2] = 129.99;

        // d) Mostrar los valores modificados usando recursividad
        System.out.println("\nPrecios modificados:");
        imprimirRecursivo(precios, 0);
    }
    
     // Función recursiva para imprimir elementos del array
    public static void imprimirRecursivo(double[] arrayPrecios, int indice) {
        // Caso base: si el índice llegó al tamaño del array, se detiene
        if (indice == arrayPrecios.length) {
            return;
        }

        // Acción: imprimir el precio en la posición actual
        System.out.println("Precio: $" + arrayPrecios[indice]);

        // Paso recursivo: llamar a la función con el siguiente índice
        imprimirRecursivo(arrayPrecios, indice + 1);
    }
}
