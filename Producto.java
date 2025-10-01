/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author otero
 */
//Crear una clase Abstracta generica
public abstract class Producto<T> { //abstract no permite que lo principal crea objetos
    private String nombre;
    private float precio;
    private T infomacion;

    public Producto(String nombre, float precio, T infomacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.infomacion = infomacion;
    }
 
    public String getNombre() {
        return nombre;
    }


    public float getPrecio() {
        return precio;
    }

    public T getInfomacion() {
        return infomacion;
    }

    public abstract void mostrarDetalles();
    
    
}
