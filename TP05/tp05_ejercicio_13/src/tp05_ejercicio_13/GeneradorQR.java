/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05_ejercicio_13;

/**
 *
 * @author Largo-PC
 */
public class GeneradorQR {
    
    public void generarQR(Usuario usuario, String valor){
        
        //primero creo una instancia de QR:
        CodigoQR miCodigoQR = new CodigoQR(valor);
        
        //Ahora a miCodigoQR le asigno un usuario con el setter:
        miCodigoQR.setUsuario(usuario);
        
        //y finalmente muestro por consola el codigo QR y el usuario;
        System.out.println("Se genero el codigo QR: " + miCodigoQR);
        
    }
}
