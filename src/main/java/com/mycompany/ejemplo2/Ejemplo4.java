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
public class Ejemplo4 {
    public static void main(String[] args) {
        //variables
        int n;
        String r;
        //entrada
        Scanner teclado= new Scanner(System.in );
        System.out.println("ingrese el número: ");
        n=teclado.nextInt();
        //proceso
        if (n%3==0 && n%5==0) {
            r="SI ES MULTIPLO DE 3 Y 5";
            
        }else {
           r="NO ES MULTIPLO DE 3 Y 5"; 
        }
        //salida
        System.out.println("");
        System.out.println("resultado: "+r);
        
    }
}
