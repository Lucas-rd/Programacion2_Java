package tp07_kata3;

/**
 * Clase abstracta que representa a un empleado.
 */
public abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSueldo();

    public String getNombre() {
        return nombre;
    }
}