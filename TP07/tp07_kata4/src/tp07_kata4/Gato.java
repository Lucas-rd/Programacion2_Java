package tp07_kata4;

/**
 * Subclase que representa un gato.
 */
public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau miau!");
    }
    
    @Override
    public void describirAnimal() {
        System.out.println("Soy un Gato llamado " + this.getNombre());
    }
}