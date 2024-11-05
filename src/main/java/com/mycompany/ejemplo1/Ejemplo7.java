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
public class Ejemplo7 {
    public static void main (String[] args){
        //variables
        short n,s;
        
        //entrada
        Scanner teclado=new Scanner(System.in );
        System.out.println("el numero es: ");
        n= teclado.nextShort();
        
        //proceso
        s=(short) ((n*(n+1))/2);
        
        //salida
        System.out.println("");
        System.out.println("la suma es: "+s);
    }
}
