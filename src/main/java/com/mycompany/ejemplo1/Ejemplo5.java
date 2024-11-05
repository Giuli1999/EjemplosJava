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
public class Ejemplo5 {
    public static void main (String[] args){
       //variables 
       short n,r;
       int a;
       
       //entrada
       Scanner teclado= new Scanner (System.in ); 
       System.out.println("el radicando es: ");
        a= teclado.nextInt();
        System.out.println("el indice es: ");
        n= teclado.nextShort();
        
        //proceso
        
        r= (short) Math.pow((double)a, (1/(double)n));
        
        //salida
        System.out.println("");
        System.out.println("el radicando es: "+r);
        
       
    }
    
}
