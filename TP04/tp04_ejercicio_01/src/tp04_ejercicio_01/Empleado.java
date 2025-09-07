/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp04_ejercicio_01;

/**
 *
 * @author Largo-PC
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    //Constructor "completo"
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados ++;
    }
    
    /* 
    Constructor Sobrecargado donde dejo que el id del empleado
    sea el numero de empleados totales y el sueldo inicial lo defino en 1000
    No es necesario volver a contar aca porque ya lo hace el constructor original
    */
    public Empleado(String nombre, String puesto){
        this(totalEmpleados, nombre, puesto, 1000);
    }
    
    /*
    Redefino el constructor por defecto de JAVA
    que me deja crear la insntacia de la clase vacia
    */
    public Empleado(){
        this(totalEmpleados, "Sin nombre", "Sin puesto aun", 0);
    }

    //Generado con el inset condigo de NetBeans
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    /*
    Metodo estatico (no hace falta invocarlo desde una insntancia) para mostrar 
    la cantidad de empleados
    */
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    
    //Metodo que aumenta salario de empleado con porcentaje
    public void actualizarSalario(int porcentajeAumento){
        salario = salario + (porcentajeAumento * salario) / 100;
    }
    
    //Metodo Sobrecargado que aumenta salario de empleado con valor fijo
    public void actualizarSalario(double montoFijoAumento){
        salario = salario + montoFijoAumento;
    }
    
    
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }
    
}
