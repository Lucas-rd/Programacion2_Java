/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp05_ejercicio_13;

/**
 *
 * @author Largo-PC
 */
public class Tp05_ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo una instancia del usuario y la uso para generar el QR con el generador:
        Usuario yo = new Usuario("Lucas", "mailLucas@email.com");
        
        GeneradorQR generadorQR = new GeneradorQR();
        generadorQR.generarQR(yo, "123CodigoQR456");
    }
    
}
