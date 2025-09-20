/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05_ejercicio_02;

/**
 *
 * @author Largo-PC
 */
public class Celular {
    private int imei;
    private String marca;
    private String modelo;
    private Bateria bateria; //agregacion 1 a 1
    private Usuario usuario; // Asociación bidireccional

    public Celular(int imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria; //En agregacion, la creacion de la instancia ya debe incluir el objeto contenido en el constructor
        
    }
    
    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if(usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + '}';
    }
}
