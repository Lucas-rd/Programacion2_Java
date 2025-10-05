/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp06_01;

import java.util.ArrayList;

/**
 *
 * @author Largo-PC
 */
public class Inventario {
    private String nombre;
    private ArrayList<Producto> productos;
    
    public Inventario(String nombre){
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto prod){
        this.productos.add(prod);
    }
    
    public void listarProductos(){
        for (Producto prod : productos) {
            prod.mostrarInfo();
        }
    }
    
    public Producto buscarProductoPorId(String id){
        Producto prodencontrado = null;
        int i = 0;
        while(i < productos.size() && !this.productos.get(i).getId().equals(id)){
            i++;
        } 
        if(i < productos.size()){
            prodencontrado = this.productos.get(i);
        }
        return prodencontrado;
    }
    
    public boolean eliminarProducto(String id) {
        Producto prodEncontrado = buscarProductoPorId(id);
        if (prodEncontrado != null) {
            productos.remove(prodEncontrado);
            return true;
        }
        return false;
    }
    
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto prodEncontrado = buscarProductoPorId(id);
        if (prodEncontrado != null) {
            prodEncontrado.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        for (Producto prod : productos) {
            if (prod.getCategoria() == categoria) {
                prod.mostrarInfo();
            }
        }
    }
    
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto prod : productos) {
            total += prod.getCantidad();
        }
        return total;
    }
    
     public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;

        Producto mayor = productos.get(0);
        for (Producto prod : productos) {
            if (prod.getCantidad() > mayor.getCantidad()) {
                mayor = prod;
            }
        }
        return mayor;
    }
    
    public void filtrarProductosPorPrecio(double min, double max) {
        for (Producto prod : productos) {
            if (prod.getPrecio() >= min && prod.getPrecio() <= max) {
                prod.mostrarInfo();
            }
        }
    }
    
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto cate : CategoriaProducto.values()) {
            System.out.println(cate + " → " + cate.getDescripcion());
        }
    }
     
     
}
