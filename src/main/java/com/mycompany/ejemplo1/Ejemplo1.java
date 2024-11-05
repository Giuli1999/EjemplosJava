/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejemplo1 {

    public static void main(String[] args) {
        //variables
        int n1, n2, s;
        //entrada
        Scanner teclado=new Scanner(System.in);
        System.out.println("numero 1: ");
        n1=teclado.nextInt();
        System.out.println("numero 2: ");
        n2=teclado.nextInt();
        
        //proceso
        s=n1+n2;
        
        //salida
        System.out.println("la suma es: "+s); 
    }
}
