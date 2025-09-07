/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp04_ejercicio_01;

/**
 *
 * @author Largo-PC
 */
public class Tp04_ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creacion empleado 1
        Empleado empleado1 = new Empleado(100, "Lucas", "Dev", 2000);
        System.out.println(empleado1);
        System.out.println(Empleado.mostrarTotalEmpleados());
        
        //Creacion empleado 2 con constructor sobrecargado
        Empleado empleado2 = new Empleado("Tomas", "UX/UI");
        System.out.println(empleado2);
        System.out.println(Empleado.mostrarTotalEmpleados());
        
        /*Aumentamos el salario del empleado 2 con metodo sobrecargado
        de porcentaje y mostramos el nuevo estado por consola*/
        empleado2.actualizarSalario(10);
        System.out.println(empleado2);
        
        /*Ahora aumento el salario del empleado 2 con metodo
        sobrecargado de montoFijo y muestro por consola*/
        empleado2.actualizarSalario(500.2);
        System.out.println(empleado2);
        
    }
    
}
