/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo4;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejemplo2 {
   public static void main(String[] args) {
       //variables
       int i, cp=0, ni, nf;
       
       //entrada
       Scanner teclado= new Scanner(System.in );
       System.out.println("ingrese el número inicial: ");
       ni= teclado.nextInt();
       System.out.println("ingrese el número final: ");
       nf= teclado.nextInt();
       
       //proceso
       i=ni+1;
       while (i<nf){
           if (i % 2 == 0) {
               cp= cp+1;
           }
           i++;
       }
       //salida
       System.out.println("la cantidad de números pares es: "+cp);
   } 
}
