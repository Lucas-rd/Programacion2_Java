/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp06_02;

/**
 *
 * @author Largo-PC
 */
public class Tp06_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Crear biblioteca
        Biblioteca biblio = new Biblioteca("Biblioteca Central");

        // 2. Crear autores
        Autor autor1 = new Autor("AUTOR 1", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("AUTOR 2", "Julio Cortázar", "Argentino");
        Autor autor3 = new Autor("AUTOR 3", "Isabel Allende", "Chilena");

        // 3. Agregar libros
        biblio.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblio.agregarLibro("ISBN002", "El amor en los tiempos del cólera", 1985, autor1);
        biblio.agregarLibro("ISBN003", "Rayuela", 1963, autor2);
        biblio.agregarLibro("ISBN004", "La casa de los espíritus", 1982, autor3);
        biblio.agregarLibro("ISBN005", "Paula", 1994, autor3);
        biblio.agregarLibro("ISBN006", "Paula2", 1994, autor3);

        // 4. Listar libros
        System.out.println("--- LISTA DE LIBROS ---");
        biblio.listarLibros();

        // 5. Buscar libro
        System.out.println("\n--- BUSCAR POR ISBN ---");
        Libro encontrado = biblio.buscarLibroPorIsbn("ISBN003");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }

        // 6. Filtrar libros por año
        System.out.println("\n--- LIBROS PUBLICADOS EN 1982 ---");
        biblio.filtrarLibrosPorAnio(1982);

        // 7. Eliminar libro
        System.out.println("\n--- ELIMINAR LIBRO ISBN001 ---");
        biblio.eliminarLibro("ISBN001");
        biblio.listarLibros();

        // 8. Cantidad total
        System.out.println("\nCantidad total de libros: " + biblio.obtenerCantidadLibros());

        // 9. Autores disponibles
        System.out.println("\n--- AUTORES DISPONIBLES ---");
        biblio.mostrarAutoresDisponibles();
        
        //9. Autores mostrados de forma "unica", es decir, sin repetir:
        System.out.println("\n--- AUTORES UNICOS DISPONIBLES ---");
        biblio.mostrarAutoresUnicosDisponibles();
    }
    
}
