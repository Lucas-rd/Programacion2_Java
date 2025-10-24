package tp07_kata4;

/**
 * Clase base que representa un animal genérico.
 */
public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void hacerSonido();

    public abstract void describirAnimal();
}