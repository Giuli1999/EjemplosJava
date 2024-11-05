/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejemplo4 {
     public static void main(String[] args) {
         //variables
        short a,n;
        int p;
        
        //entrada
        Scanner teclado=new Scanner (System.in );
         System.out.println("el primer número entero positivo es: ");
         a= teclado.nextShort();
         System.out.println("el segundo número entero positivo es: ");
         n= teclado.nextShort();
         
         //proceso
         p= (int) Math.pow(a, n);
         
         
         //salida
         System.out.println("");
         System.out.println("La potencia es: "+p);
         
     }
}
