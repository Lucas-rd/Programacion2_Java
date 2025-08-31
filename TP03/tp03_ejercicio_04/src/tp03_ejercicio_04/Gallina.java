/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp03_ejercicio_04;

/**
 *
 * @author Largo-PC
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad >= 0){
        this.edad = edad;
        }
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    public void mostrarEstado(){
        System.out.println("Gallina ID: " + idGallina + "\n" + edad + "\n" + huevosPuestos);
    }
    
    public void envejecer(){
        edad += 1;
    }
    
    public void ponerHuevo(int huevos){
        if(huevos > 0){
        huevosPuestos += huevos;
        }
    }
}
