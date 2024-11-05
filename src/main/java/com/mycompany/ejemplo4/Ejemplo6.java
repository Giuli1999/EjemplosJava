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
public class Ejemplo6 {
    public static void main(String[] args) {
        //variables
        int d, c=0, n;
        //entrada
        Scanner teclado= new Scanner(System.in );
        System.out.println("ingrese un número: ");
        n= teclado.nextInt();
        
        //proceso
       
        while(n>0){
            d = n/10;
        if (d % 2 == 0) {
            c=c+1;
        }
        n=n/10;
        }
        //salida
        System.out.println("la cantidad de digitos pares es: "+c);
    }
}
