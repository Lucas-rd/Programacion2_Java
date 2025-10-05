/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp06_03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Largo-PC
 */
public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        if (!profesores.contains(p)) {
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        Profesor encontrado = null;
        int i = 0;
        while (i < profesores.size() && !profesores.get(i).getId().equals(id)) {
            i++;
        }
        if (i < profesores.size()) {
            encontrado = profesores.get(i);
        }
        return encontrado;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        Curso encontrado = null;
        int i = 0;
        while (i < cursos.size() && !cursos.get(i).getCodigo().equals(codigo)) {
            i++;
        }
        if (i < cursos.size()) {
            encontrado = cursos.get(i);
        }
        return encontrado;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c != null && p != null) {
            c.setProfesor(p);
        }
    }

    public void listarProfesores() {
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.listarCursos();
            System.out.println("----");
        }
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            String profesor = (c.getProfesor() != null) ? c.getProfesor().getId() : "Sin profesor";
            System.out.println(c.getCodigo() + " | " + c.getNombre() + " | Profesor: " + profesor);
        }
    }

    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            if (c.getProfesor() != null) {
                c.getProfesor().eliminarCurso(c); // sincroniza
            }
            cursos.remove(c);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            for (Curso c : new ArrayList<>(p.getCursos())) {
                c.setProfesor(null); // rompe la relación en los cursos
            }
            profesores.remove(p);
        }
    }
}
