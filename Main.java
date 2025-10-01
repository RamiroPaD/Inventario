/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;
import java.util.Scanner;
/**
 *
 * @author 12241
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numero = new int[n];

        for (int i = 0; i < n; i++) {
            numero[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int contador = 0;

        for (int i = 0; i < n; i++) {
            if (numero[i] == x) {
                contador++;
            }
        }

        System.out.println(contador);

        sc.close();
    }
}

