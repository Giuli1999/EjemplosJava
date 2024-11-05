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
public class Ejemplo6 {
    public static void main (String[] args){
        //variables
        int n, ni, r;
        
        //entrada
        Scanner teclado=new Scanner(System.in );
        System.out.println("el número es: ");
        n=teclado.nextInt();
        
        //proceso
        r=n%10;
            n=n/10;
            ni=r*10;
           
            r=n%10;
            n=n/10;
            ni=(ni + r)*10;
            
            r=n%10;
            n=n/10;
            ni=(ni + r)*10;
            
            r=n%10;
            n=n/10;
            ni=(ni + r)*10;
            
            ni = ni + n;
            
        //salida
        System.out.println("");
        System.out.println("el inverso es: "+ni);
    }
}
