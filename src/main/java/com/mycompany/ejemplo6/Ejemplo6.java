/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo6;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejemplo6 {

    public static void main(String[] args) {
      //variables
      int s=0, i;
      
      //declarando el arreglo 
      int n[]= new int[5];
      
      //entrada
      Scanner teclado=new Scanner(System.in );
        System.out.println("numero 1: ");
        n[0]= teclado.nextInt();
        System.out.println("numero 2: ");
        n[1] = teclado.nextInt();
        System.out.println("numero 3: ");
        n[2] = teclado.nextInt();
        System.out.println("numero 4: ");
        n[3] = teclado.nextInt();
        System.out.println("numero 5: ");
        n[4] = teclado.nextInt();
         
        //proceso
        for ( i = 0; i <= 4; i++) {
            s+=n[i];
        }
        //salida
        System.out.println("suma: "+s);
    }
}
