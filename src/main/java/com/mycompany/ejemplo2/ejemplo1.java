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
public class ejemplo1 {
    public static void main(String[] args) {
       metodo();
    } 
    
    public static void metodo (){
         //variables 
        int n1, n2, m=0;
        
        //entrada
        
        Scanner teclado=new Scanner(System.in );
        System.out.println(" numero 1: ");
        n1 = teclado.nextInt();
        System.out.println("numero 2: ");
        n2= teclado.nextInt();
        
        //proceso
        if (n1>n2) { 
            m=n1;
        }
        if (n2>n1) {
            m=n2; 
        }
        
        //salida
        
        System.out.println("");
        System.out.println("mayor: "+m);
    }
}
