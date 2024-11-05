/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejemplo5 {
   public static void main(String[] args) {
       //variables
       int n;
       String r;
       //entrada
       Scanner teclado=new Scanner(System.in );
       System.out.println("ingrese el numero: ");
       n=teclado.nextInt();
       //proceso
       if (n%2==0) {
           r="ES PAR";
       }else {
           r="ES IMPAR";
       }
       //salida
       System.out.println("");
       System.out.println("el numero es: "+r);
   } 
}
