/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp08_02;

/**
 *
 * @author Largo-PC
 */
public class Tp08_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== División segura ===");
        DivisionSegura.ejecutar();
        
        System.out.println("\n=== Conversión de cadena ===");
        ConversionCadena.ejecutar();

        System.out.println("\n=== Lectura de archivo ===");
        LecturaArchivo.ejecutar();
        
        System.out.println("\n=== Validación de edad ===");
        ValidadorEdad.ejecutar();

        System.out.println("\n=== Try-with-resources ===");
        LecturaArchivoTryWithResources.ejecutar();
        
    }
    
}
