/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp05_ejercicio_02;

/**
 *
 * @author Largo-PC
 */
public class Tp05_ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo un usuario
        
        Usuario user1 = new Usuario("Lucas", 12345678);
        Bateria bateria1 = new Bateria("BateriaModelo1", "2600MHZ");
        Celular celu1 = new Celular(1234, "marca1", "modelPrueba", bateria1);
        
        //imprimimos el user antes de asignarle un celu:
        System.out.println(user1);
        
        //Le asignamos un celu y luego lo imprimimos nuevamente:
        user1.setCelular(celu1);
        System.out.println(user1);
        
        
        //Falta asignarle una bateria por "agregacion". Tanto Celular como Baeteria pueden exisitir por separado:
        celu1.setBateria(bateria1);
        System.out.println(celu1);
    }
    
}
