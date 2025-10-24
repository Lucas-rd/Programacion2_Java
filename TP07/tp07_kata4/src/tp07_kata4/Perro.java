package tp07_kata4;

/**
 * Subclase que representa un perro.
 */
public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau!");
    }
    
    @Override
    public void describirAnimal() {
        System.out.println("Soy un Perro llamado " + this.getNombre());
    }
}