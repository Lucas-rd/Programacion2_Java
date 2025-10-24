/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp07_kata3;

import java.util.ArrayList;

/**
 *
 * @author Largo-PC
 */
public class Tp07_kata3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        EmpleadoPlanta empleado1 = new EmpleadoPlanta("Laura", 250000);
        EmpleadoTemporal empleado2 = new EmpleadoTemporal("Carlos", 160, 1500);
        
        empleados.add(empleado1);
        empleados.add(empleado2);

        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.getNombre());
            System.out.println("Sueldo calculado: $" + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta Permanente");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Temporal");
            }
            System.out.println("---------------------------");
        }
    }
}
