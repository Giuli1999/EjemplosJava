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
public class Ejemplo5 {
    public static void main(String[] args) {
        //variables
        int  c=0, n;
        //entrada
        Scanner teclado = new Scanner(System.in );
        System.out.println("ingresa el número: ");
        n= teclado.nextInt();
        
        //proceso
        while(n>0){
            n=n/10;
            c=c+1;
        }
        //salida
        System.out.println("la cantidad de digitos es: "+c);
    }
}
