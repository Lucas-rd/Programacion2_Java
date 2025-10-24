package tp07_kata4;

/**
 * Subclase que representa una vaca.
 */
public class Vaca extends Animal {
    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Muuu!");
    }
    
    @Override
    public void describirAnimal() {
        System.out.println("Soy una vaca llamada " + this.getNombre());
    }
}