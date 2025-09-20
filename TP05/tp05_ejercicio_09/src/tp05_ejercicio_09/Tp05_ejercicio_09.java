/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp05_ejercicio_09;

/**
 *
 * @author Largo-PC
 */
public class Tp05_ejercicio_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente yoPaciente = new Paciente("Lucas", "Swiss Medical");
        Profesional medicoRoberto = new Profesional("Roberto", "Clinico");
        
        CitaMedica miCita = new CitaMedica("20/09/2025", "08:30");
        
        System.out.println(miCita);
        
        miCita.setPaciente(yoPaciente);
        miCita.setProfesional(medicoRoberto);
        
        System.out.println(miCita);
    }
    
}
