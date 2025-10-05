/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp06_01;

/**
 *
 * @author Largo-PC
 */
public class Tp06_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventario inventario = new Inventario("Almacen Pepe");

        // 1. Crear productos
        Producto p1 = new Producto("A1", "Manzana", 200.0, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("E1", "Smartphone", 1500.0, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("R1", "Camiseta", 1200.0, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("H1", "Silla", 2500.0, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("A2", "Pan", 150.0, 100, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("--- LISTADO DE PRODUCTOS ---");
        inventario.listarProductos();

        System.out.println("\n--- BUSCAR PRODUCTO POR ID (R1) ---");
        Producto encontrado = inventario.buscarProductoPorId("R1");
        if (encontrado != null) encontrado.mostrarInfo();

        System.out.println("\n--- FILTRAR POR CATEGORIA (ALIMENTOS) ---");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        System.out.println("\n--- ELIMINAR PRODUCTO (E1) ---");
        inventario.eliminarProducto("E1");
        inventario.listarProductos();

        System.out.println("\n--- ACTUALIZAR STOCK (A1 -> 200) ---");
        inventario.actualizarStock("A1", 200);
        inventario.listarProductos();

        System.out.println("\n--- TOTAL DE STOCK DISPONIBLE ---");
        System.out.println("Total: " + inventario.obtenerTotalStock());

        System.out.println("\n--- PRODUCTO CON MAYOR STOCK ---");
        System.out.println(inventario.obtenerProductoConMayorStock());

        System.out.println("\n--- FILTRAR POR PRECIO (1000 a 3000) ---");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("\n--- CATEGORIAS DISPONIBLES ---");
        inventario.mostrarCategoriasDisponibles();
    }
    
}
