/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp06_03;

/**
 *
 * @author Largo-PC
 */
public class Tp06_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN");

        Profesor p1 = new Profesor("P1", "Juan Perez", "Matemática");
        Profesor p2 = new Profesor("P2", "Ana Gomez", "Programación");
        Profesor p3 = new Profesor("P3", "Luis Lopez", "Redes");

        Curso c1 = new Curso("C1", "Álgebra");
        Curso c2 = new Curso("C2", "POO");
        Curso c3 = new Curso("C3", "Sistemas Operativos");
        Curso c4 = new Curso("C4", "Redes I");
        Curso c5 = new Curso("C5", "Estructura de Datos");

        // Agregar
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // Asignar
        uni.asignarProfesorACurso("C1", "P1");
        uni.asignarProfesorACurso("C2", "P2");
        uni.asignarProfesorACurso("C3", "P2");
        uni.asignarProfesorACurso("C4", "P3");
        uni.asignarProfesorACurso("C5", "P1");

        System.out.println("--- Listado de cursos ---");
        uni.listarCursos();

        System.out.println("\n--- Listado de profesores ---");
        uni.listarProfesores();

        System.out.println("\n--- Cambio de profesor del curso C5 ---");
        uni.asignarProfesorACurso("C5", "P3");
        uni.listarCursos();

        System.out.println("\n--- Eliminar curso C3 ---");
        uni.eliminarCurso("C3");
        uni.listarProfesores();

        System.out.println("\n--- Eliminar profesor P1 ---");
        uni.eliminarProfesor("P1");
        uni.listarCursos();
    }
    
}
