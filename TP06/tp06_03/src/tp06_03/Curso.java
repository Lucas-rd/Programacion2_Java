/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp06_03;

/**
 *
 * @author Largo-PC
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    // ✅ Mantiene la bidireccionalidad de manera segura
    public void setProfesor(Profesor p) {
        if (this.profesor != null) {
            Profesor anterior = this.profesor;
            this.profesor = null;
            anterior.eliminarCurso(this); // rompe relación con el anterior
        }

        this.profesor = p;

        if (p != null && !p.getCursos().contains(this)) {
            p.agregarCurso(this); // agrega relación del nuevo lado
        }
    }

    public void mostrarInfo() {
        System.out.print("Curso: " + codigo + " - " + nombre);
        if (profesor != null) {
            System.out.println(" | Profesor: " + profesor.getNombre());
        } else {
            System.out.println(" | Profesor: [Sin asignar]");
        }
    }
}
