/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author otero
 */
public class libros extends Producto{

    public libros(String nombre, float precio, Object infomacion) {
        super(nombre, precio, infomacion);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Libro" +getNombre() + "Precio" + getPrecio() + "Informacion" + getInfomacion());
    }
    
}
