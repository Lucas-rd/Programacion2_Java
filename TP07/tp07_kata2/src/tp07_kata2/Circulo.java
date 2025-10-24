package tp07_kata2;

/**
 * Subclase que representa un círculo.
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }



    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}