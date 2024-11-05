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
public class Ejemplo2 {

    public static void main(String[] args) {
        //variables 
        int n1,n2,c,r;
        //entrada
        Scanner teclado=new Scanner(System.in ); 
        System.out.println("numero 1: ");
        n1 = teclado.nextInt();
        System.out.println("numero 2: ");
        n2 = teclado.nextInt();
        
        //proceso
        c=n1/n2;
        r=n1%n2;
        //salida
        System.out.println("cociente es igual: "+c);
        System.out.println("residuo es igual: "+r);
        
    }
}
