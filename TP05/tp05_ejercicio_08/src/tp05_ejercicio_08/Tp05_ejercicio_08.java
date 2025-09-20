/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp05_ejercicio_08;

/**
 *
 * @author Largo-PC
 */
public class Tp05_ejercicio_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario yo = new Usuario("Lucas", "mail_ejemplo@email.com");
        Documento nuevoDocumento = new Documento("Titulo_ejemplo", "LOREM IPSUM", "#1234", "20/11/2015", yo );
        
        System.out.println(nuevoDocumento);
        
        
        
    }
    
}
