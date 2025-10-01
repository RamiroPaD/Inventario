/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Objetos;

/**
 *
 * @author otero
 */
public class MainProducto {

    public static void main(String[] args) {
        Producto<?>[] p1 = new Producto<?>[4];
        p1[0] = new libros("JavaIluminated",600.0f,"500 Paginas");
        p1[1] = new Electronicos("Lenovo",12.198f,"1 años de garantia");
        p1[2] = new libros("Patrones De Diseño",600.0f,"460 Paginas");
        p1[3] = new Electronicos("Smartphone Samsung Galaxi",12.198f,"1 años de garantia");
        
        for (Producto<?> p: p1) {
            p.mostrarDetalles();
        }
    }
}
