/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejemplo4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejemplo4 {

    public static void main(String[] args) {
        //variables
        int i, n, s = 0;

        try {
            //entrada 
            Scanner teclado = new Scanner(System.in);
            System.out.println("numero: ");
            n = teclado.nextInt();
            //proceso
            i = 1;
            while (i <= n) {
                s = s + i;
                i = i + 1;
            }
            //salida
            System.out.println("la suma es: " + s);
        } //catch (InputMismatchException e) {
           // System.out.println("error debes ingresar un número entero ");
           // System.out.println("el log del error es: " + e);
        //} 
        catch (Exception e) {
            System.out.println("error es:   " + e);
        }

    }
}
