/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp05_ejercicio_06;

/**
 *
 * @author Largo-PC
 */
public class Tp05_ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo instancia de cada objeto y luego muesto por consola distintos estadios
        Cliente miClient = new Cliente("Lucas", "1234567489");
        Mesa mesaN1 = new Mesa(1, 4);
        Reserva miReserva = new Reserva("12/05/2025", "20:30", mesaN1);
        
        System.out.println(miReserva);
        
        //le asigno en cliente con el setter por ser una asociacion unidireccional
        miReserva.setCliente(miClient);
        System.out.println(miReserva);
    }
    
}
