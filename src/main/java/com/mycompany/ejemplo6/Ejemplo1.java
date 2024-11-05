/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo6;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejemplo1 {
    public static void main(String[] args) {
        //variables
        int c, i, j;
        c=0;
        
        //arreglo
        int a[]=new int[4];
        int b[]=new int[4];
                
        //entrada
        Scanner teclado= new Scanner(System.in );
        System.out.println("arreglo a: ");
        System.out.println("=======");
        System.out.println("numero 1: ");
        a[0]=teclado.nextInt();
        System.out.println("numero 2: ");
        a[1]=teclado.nextInt();
        System.out.println("numero 3: ");
        a[2]=teclado.nextInt();
        System.out.println("numero 4: ");
        a[3]=teclado.nextInt();
        
        System.out.println("\n");
        System.out.println("arreglo b: ");
        System.out.println("=======");
        System.out.println("numero 1: ");
        b[0]=teclado.nextInt();
        System.out.println("numero 2: ");
        b[1]=teclado.nextInt();
        System.out.println("numero 3: ");
        b[2]=teclado.nextInt();
        System.out.println("numero 4: ");
        b[3]=teclado.nextInt();
        
        //proceso
        //length se utiliza para calcular el tamaño de la variable
        for ( i = 0; i <= a.length-1; i++) {
            for ( j = 0; j <= b.length-1; j++) {
                if (a[i] == b[j]) {
                    c+=1;
                }
            }
        }
        System.out.println("cantidad: "+c);
    }
}
