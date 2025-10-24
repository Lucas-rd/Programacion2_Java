package tp07_kata3;

/**
 * Empleado de planta con sueldo fijo.
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoFijo;

    public EmpleadoPlanta(String nombre, double sueldoFijo) {
        super(nombre);
        this.sueldoFijo = sueldoFijo;
    }

    @Override
    public double calcularSueldo() {
        return sueldoFijo;
    }
}